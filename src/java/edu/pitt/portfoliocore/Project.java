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
import java.util.Calendar;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Creates a Project object and maintains it with the DB
 *
 * @author Paul Carroll
 */
public class Project {

    private String projectID;
    private String name;
    private String description;
    private String startdate;
    private String enddate;
    private String projectmedia;
    private String created;
    private String modified;

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private DbUtilities db;

    public Project(String projectID) {
        setAllProjectProperties(projectID);
    }

    public Project(String name, String description, String projectmedia, String startdate, String enddate) {
        projectID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Project ";
        sql += "(projectID,name,description,projectmedia,startdate,enddate,created,modified)";
        sql += " VALUES (";
        sql += "'" + projectID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(name) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(description) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(projectmedia) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(startdate) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(enddate) + "', ";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of the Project constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setAllProjectProperties(projectID);
        }

    }

    /**
     * Creates an Project object from JSON
     *
     * @param project JSON object for an Education object
     */
    public Project(JSONObject project) {
        try {
            this.projectID = project.getString("projectID");
            setProjectFromJSON(project);
        } catch (JSONException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setAllProjectProperties(String projectID) {
        db = new DbUtilities();
        String sql = "SELECT * FROM rms.Project WHERE projectID = '" + StringUtilities.cleanMySqlInsert(projectID) + "'";
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                this.name = rs.getString("name");
                this.description = rs.getString("description");
                this.projectmedia = rs.getString("projectmedia");
                this.startdate = rs.getString("startdate");
                this.enddate = rs.getString("enddate");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Education(String projectID) constructor of Project class. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            this.projectID = projectID;
        }
    }

    public void setName(String name) {
        db = new DbUtilities();
        String sql = "UPDATE Project SET name = '" + StringUtilities.cleanMySqlInsert(name) + "' WHERE projectID = '" + this.projectID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setName. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.name = StringUtilities.cleanMySqlInsert(name);
        setModified();
    }

    public void setDescription(String description) {
        db = new DbUtilities();
        String sql = "UPDATE Project SET description = '" + StringUtilities.cleanMySqlInsert(description) + "' WHERE projectID = '" + this.projectID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setDescription. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.description = StringUtilities.cleanMySqlInsert(description);
        setModified();
    }

    public void setProjectMedia(String externallink) {
        db = new DbUtilities();
        String sql = "UPDATE Project SET externallink = '" + StringUtilities.cleanMySqlInsert(projectmedia) + "' WHERE projectID = '" + this.projectID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setProjectMedia. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.projectmedia = StringUtilities.cleanMySqlInsert(projectmedia);
        setModified();
    }
    
    public void setStartdate(String startdate) {
        db = new DbUtilities();
        String sql = "UPDATE Project SET startdate = '" + StringUtilities.cleanMySqlInsert(startdate) + "' WHERE projectID = '" + this.projectID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setStartdate. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.startdate = StringUtilities.cleanMySqlInsert(startdate);
        setModified();
    }

    public void setEnddate(String enddate) {
        db = new DbUtilities();
        String sql = "UPDATE Project SET enddate = '" + StringUtilities.cleanMySqlInsert(enddate) + "' WHERE projectID = '" + this.projectID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setField. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.enddate = StringUtilities.cleanMySqlInsert(enddate);
        setModified();
    }

   private void setModified() {
        this.modified = DATE_FORMAT.format(Calendar.getInstance().getTime());
        db = new DbUtilities();
        String sql = "UPDATE Project SET modified = '" + this.modified + "' WHERE projectID = '" + this.projectID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setModified. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
    }

    public String getProjecrID() {
        return projectID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

   public String getProjectMedia() {
        return projectmedia;
    }
   
   public String getStartdate() {
        return startdate;
    }
    
    public String getEnddate() {
        return enddate;
    }
    
    /**
     * Gets an Project object as JSON
     *
     * @return Project object JSON
     */
    public JSONObject getProjectAsJson() {

        JSONObject project = new JSONObject();

        try {
            project.put("projectID", this.projectID);
            project.put("name", this.name);
            project.put("description", this.description);
            project.put("projectmedia", this.projectmedia);
            project.put("startdate", this.startdate);
            project.put("enddate", this.enddate);            
            project.put("created", this.created);
            project.put("modified", this.modified);

        } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within getProjectAsJSON. " + ex.getMessage());
        }
        return project;
    }

    /**
     * Sets an Project object's properties given JSON
     *
     * @param project JSON Object
     */
    public final void setProjectFromJSON(JSONObject project) {

        try {
            setName(project.getString("name"));
            setDescription(project.getString("description"));
            setProjectMedia(project.getString("projectmedia"));
            setStartdate(project.getString("startdate"));
            setEnddate(project.getString("enddate"));
            } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within setProjectFromJSON. " + ex.getMessage());
        }
    }
}
