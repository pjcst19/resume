/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.portfoliocore;

import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.ErrorLogger;
import edu.pitt.utilities.StringUtilities;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Naveen
 */
public class Research {

    private String researchID;
    private String researchtype;
    private String title;
    private String summary;
    private String journal;
    private String submissionDate;
    private String publishedDate;
    private String publishlink;
    private String created;
    private String modified;

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private DbUtilities db;

    public Research(String researchID) {
        setAllResearchProperties(StringUtilities.cleanMySqlInsert(researchID));
    }

    public Research(String researchtype, String title, String summary, String journal, String submissionDate, String publishedDate, String publishlink) {
        researchID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Research ";

        sql += "(researchID,title,summary,journal,submissionDate,publishedDate,researchtype,created,modified)";
        sql += " VALUES (";
        sql += "'" + this.researchID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(researchtype) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(title) + "', ";        
        sql += "'" + StringUtilities.cleanMySqlInsert(summary) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(journal) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(submissionDate) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(publishedDate) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(publishlink) + "',NULL,NULL);";
        System.out.println(sql);
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of the Research constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            setAllResearchProperties(researchID);
            db.closeMySQLConnection();
        }
    }

    /**
     * Creates a Research object from JSON
     *
     * @param research JSON object for an Education object
     */
    public Research(JSONObject research) {
        try {
            this.researchID = research.getString("researchID");
            setResearchFromJSON(research);
        } catch (JSONException ex) {
            Logger.getLogger(Research.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setAllResearchProperties(String researchID) {
        this.researchID = researchID;
        db = new DbUtilities();
        String sql = "SELECT * FROM rms.Research WHERE researchID = '" + researchID + "'";
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                this.researchtype = rs.getString("researchtype");
                this.title = rs.getString("title");
                this.summary = rs.getString("summary");
                this.journal = rs.getString("Journal");
                this.submissionDate = rs.getString("submissionDate");
                this.publishedDate = rs.getString("publishedDate");
                this.publishlink = rs.getString("publishlink");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Research(String researchID) constructor of Research class. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            this.researchID = researchID;
            db.closeMySQLConnection();
        }
    }

    public void setResearchType(String researchtype) {
        db = new DbUtilities();
        String sql = "UPDATE Research SET researchtype = '" + StringUtilities.cleanMySqlInsert(researchtype) + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setResearchType. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.researchtype = StringUtilities.cleanMySqlInsert(researchtype);
        setModified();
    }
    
    public void setTitle(String title) {
        db = new DbUtilities();
        String sql = "UPDATE Research SET title = '" + StringUtilities.cleanMySqlInsert(title) + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setTitle. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.title = StringUtilities.cleanMySqlInsert(title);
        setModified();
    }

    public void setSummary(String summary) {
        db = new DbUtilities();
        String sql = "UPDATE Research SET summary = '" + StringUtilities.cleanMySqlInsert(summary) + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setSummary. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.summary = StringUtilities.cleanMySqlInsert(summary);
        setModified();
    }

    public void setSubmissionDate(String submissionDate) {
        db = new DbUtilities();
        String sql = "UPDATE Research SET submissionDate = '" + StringUtilities.cleanMySqlInsert(submissionDate) + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setSubmissionDate. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.submissionDate = StringUtilities.cleanMySqlInsert(submissionDate);
        setModified();
    }

    public void setPublishedDate(String publishedDate) {
        db = new DbUtilities();
        String sql = "UPDATE Research SET publishedDate = '" + StringUtilities.cleanMySqlInsert(publishedDate) + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setPublishedDate. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.publishedDate = StringUtilities.cleanMySqlInsert(publishedDate);
        setModified();
    }

    public void setPublishlink(String publishlink) {
        db = new DbUtilities();
        String sql = "UPDATE Research SET publishlink = '" + StringUtilities.cleanMySqlInsert(publishlink) + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setPublishlink. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.publishlink = StringUtilities.cleanMySqlInsert(publishlink);
        setModified();
    }

    private void setModified() {
        this.modified = DATE_FORMAT.format(Calendar.getInstance().getTime());
        db = new DbUtilities();
        String sql = "UPDATE Research SET modified = '" + this.modified + "' WHERE researchID = '" + this.researchID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setModified. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
    }

    public String getResearchID() {
        return researchID;
    }

    public String getResearchType() {
        return researchtype;
    }
    
    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }
    
    public String getJournal() {
        return journal;
    }
    
    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
    /**
     * Creates a JSON Object representing a Research object
     *
     * @return JSON Object
     */
    public JSONObject getResearchAsJson() {

        JSONObject research = new JSONObject();

        try {
            research.put("researchID", this.researchID);
            research.put("researchtype", this.researchtype);
            research.put("title", this.title);
            research.put("summary", this.summary);
            research.put("submissionDate", this.submissionDate);
            research.put("publishedDate", this.publishedDate);
            research.put("publishlink", this.publishlink);
            research.put("created", this.created);
            research.put("modified", this.modified);
        } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within getResearchnAsJSON. " + ex.getMessage());
        }
        return research;
    }

    /**
     * Sets a research objects properties given JSON
     *
     * @param research JSON Object
     */
    public final void setResearchFromJSON(JSONObject research) {

        try {
            setResearchType(research.getString("researchtype"));
            setTitle(research.getString("title"));
            setSummary(research.getString("summary"));
            setSubmissionDate(research.getString("submissionDate"));
            setPublishedDate(research.getString("publishedDate"));
            setPublishlink(research.getString("publishlink"));
        } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within setResearchFromJSON. " + ex.getMessage());
        }
    }
}
