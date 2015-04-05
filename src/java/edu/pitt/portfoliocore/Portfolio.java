 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.portfoliocore;

import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.ErrorLogger;
import edu.pitt.utilities.StringUtilities;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Creates a Portfolio object
 *
 * @author Paul J Carroll
 * String Utilities.cleanMySqlInsert(
 */
public class Portfolio {

    private String portfolioID;
    private int rating;
    private String created;
    private String modified;
    private String userID;
    private ArrayList<Project> projectList = new ArrayList<>();
    private ArrayList<Research> researchList = new ArrayList<>();

    private DbUtilities db;

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates a Portfolio object based upon information obtained from database by
     * providing portfolioID
     *
     * @param portfolioID
     */
    public Portfolio(String portfolioID) {
        setAllPortfolioProperties(portfolioID);
    }

    /**
     * Creates a Resume object based upon the parameters given and inserts it
     * into the database
     *
     * @param userID
     * @param rating
     */
    public Portfolio(String userID, int rating) {
        this.portfolioID = UUID.randomUUID().toString();
        this.userID = StringUtilities.cleanMySqlInsert(userID);
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Portfolio ";
        sql += "(portfolioID,fk_userID,rating,created,modified)";
        sql += " VALUES (";
        sql += "'" + this.portfolioID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(this.userID) + "', ";
        sql += "'" + this.rating + "',NULL,NULL);";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in the insert query inside of the Portfolio constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setAllPortfolioProperties(portfolioID);
        }

    }

    /**
     * Creates an Portfolio object from JSON
     *
     * @param portfolio JSON object for an Portfolio object
     */
    public Portfolio(JSONObject portfolio) {
        try {
//          setAllPortfolioProperties(portfolio.getString("portfolioID")); 
            this.portfolioID = portfolio.getString("portfolioID");
            //setPortfolioromJSON(portfolio);
        } catch (JSONException ex) {
            Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setAllPortfolioProperties(String portfolioID) {
        String sql1 = "SELECT * FROM rms.Portfolio R LEFT JOIN rms.ResumeAddress ON portfolioID = fk_portfolioID LEFT JOIN rms.Address ON fk_addressID = addressID WHERE R.portfolioID = '" + StringUtilities.cleanMySqlInsert(portfolioID) + "'";
        System.out.println(sql1);
        db = new DbUtilities();
        try {
            ResultSet rs = db.getResultSet(sql1);
            while (rs.next()) {
                this.portfolioID = rs.getString("portfolioID");
                this.rating = rs.getInt("rating");
                this.userID = rs.getString("fk_userID");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Portfolio(String portfolioID) constructor of Portfolio class. " + ex.getMessage());
            ErrorLogger.log(sql1);
        } finally {
        }

        String sql3 = "SELECT * FROM rms.Project WHERE fk_portfolioID = '" + this.portfolioID + "'";
        try {
            ResultSet rs3 = db.getResultSet(sql3);
            while (rs3.next()) {
                this.projectList.add(new Project(rs3.getString("fk_projectID")));
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occured in setAllPortfolioProperties() method of portfolio class. " + ex.getMessage());
            ErrorLogger.log(sql3);

        }

        String sql4 = "SELECT * FROM rms.Research WHERE fk_portfolioID = '" + this.portfolioID + "'";
        try {
            ResultSet rs4 = db.getResultSet(sql4);
            while (rs4.next()) {
                this.researchList.add(new Research(rs4.getString("fk_researchID")));
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occured in setAllPortfolioProperties() method of Resume class. " + ex.getMessage());
            ErrorLogger.log(sql4);
        }
        db.closeMySQLConnection();
    }

    public void addProject(Project project) {
        db = new DbUtilities();
        projectList.add(project);
        String sql = "INSERT INTO rms.Project (fk_portfolioID,fk_projectID) VALUES";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of addProject. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setModified();
        }
    }

    public void addResearch(Research research) {
        db = new DbUtilities();
        researchList.add(research);
        String sql = "INSERT INTO rms.Research (fk_portfolioID,fk_researchID) VALUES";
        sql += "('" + this.portfolioID + "', '" + research.getResearchID() + "')";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of addResearch. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setModified();
        }
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        db = new DbUtilities();
        String sql = "UPDATE Portfolio SET rating = '" + rating + "' WHERE portfolioID = '" + this.portfolioID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setRating. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setModified();
        }
        this.rating = rating;
    }

    private void setModified() {
        this.modified = DATE_FORMAT.format(Calendar.getInstance().getTime());
        db = new DbUtilities();
        String sql = "UPDATE Portfolio SET modified = '" + this.modified + "' WHERE portfolioID = '" + this.portfolioID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setModified. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
    }

    /**
     * @return the portfolioID
     */
    public String getPortfolioID() {
        return this.portfolioID;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        db = new DbUtilities();
        String sql = "UPDATE Portfolio SET fk_userID = '" + StringUtilities.cleanMySqlInsert(userID) + "' WHERE portfolioID = '" + this.portfolioID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setUserID. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            this.userID = StringUtilities.cleanMySqlInsert(userID);
            db.closeMySQLConnection();
        }
    }

    /**
     * Creates and returns a properly formated JSON representation of Portfolio
     *
     * @return A properly formated JSON representation of Portfolio
     */
    public JSONObject getPortfolioAsJson() {
        JSONObject resume = new JSONObject();
        JSONArray resumeProjectList = new JSONArray();
        JSONArray resumeResearchList = new JSONArray();

        try {
            resume.put("portfolioID", this.portfolioID);
            resume.put("userID", this.userID);
            resume.put("created", this.created);
            resume.put("modified", this.modified);

            if (this.projectList != null) {
                for (Project project : this.projectList) {
                    //resumeProjectList.put(project.getProjectAsJson());
                }
                resume.put("ProjectList", resumeProjectList);
            } else {
                resume.put("ProjectList", "");
            }

            if (this.researchList != null) {
                for (Research research : this.researchList) {
                    resumeResearchList.put(research.getResearchAsJson());
                }
                resume.put("ResearchList", resumeResearchList);
            } else {
                resume.put("ResearchList", "");
            }
        } catch (JSONException ex) {
            ErrorLogger.log("An error has occurred within getPortfolioAsJSON. " + ex.getMessage());
        }
        return resume;
    }

    /**
     * Sets properties of a Resume given JSON
     *
     * @param portfolio A properly formated JSON representation of Portfolio
     */
    public final void setPortfolioFromJSON(JSONObject portfolio) {
        try {
            setUserID(portfolio.getString("userID"));
            setRating(portfolio.getInt("rating"));

            if (portfolio.has("ProjectList")) {
                JSONArray ProjectList = portfolio.getJSONArray("ProjectList");

                int projectListLength = ProjectList.length();

                for (int i = 0; i < projectListLength; i++) {
                    Project project = new Project(ProjectList.getJSONObject(i));
                }
            }

            if (portfolio.has("ResearchList")) {
                JSONArray ResearchList = portfolio.getJSONArray("ResearchList");

                int researchLength = ResearchList.length();

                for (int i = 0; i < researchLength; i++) {
                    Research research = new Research(ResearchList.getJSONObject(i));
                }
            }

        } catch (JSONException ex) {
//            ErrorLogger.log("An error has occurred within getPortfolioAsJSON. " + ex.getMessage());
            Logger.getLogger(Portfolio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
