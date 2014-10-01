/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.resumecore;

import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.ErrorLogger;
import edu.pitt.utilities.StringUtilities;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Naveen
 */
public class Award {

    private String awardID;
    private String name;
    private String description;
    private String created;
    private String modified;

    private DbUtilities db;

    public Award(String awardID) {
        setAllAwardProperties(awardID);
    }
    
    public Award(String name, String description){
        awardID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Award ";
        sql += "(awardID,name,description,created,modified)";
        sql += " VALUES (";
        sql += "'" + this.awardID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(name) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(description) + "',NULL,NULL)";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of the Award constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        }finally{
            setAllAwardProperties(awardID);
        }
    }
    private void setAllAwardProperties(String awardID){
        db = new DbUtilities();
        String sql = "SELECT * FROM rms.Award WHERE awardID = '" + awardID + "'";
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                this.name = rs.getString("name");
                this.description = rs.getString("description");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Award(String awardID) constructor of Award class. " + ex.getMessage());
            ErrorLogger.log(sql);
        }finally{
            this.awardID = awardID;
        }
    }
    public void setName(String name){
        String sql = "UPDATE Award SET name = '" + name + "' WHERE awardID = '" + this.awardID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setName. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.name = name;
    }
    
    public void setDescription(String description){
        String sql = "UPDATE Award SET description = '" + description + "' WHERE awardID = '" + this.awardID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setDescription. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.description = description;
    }
    
    public String getAwardID(){
        return awardID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public JSONObject getAwardAsJson(){
        
        JSONObject award = new JSONObject();
        
        try {
            award.put("awardID", this.awardID);
            award.put("name", this.name);
            award.put("description", this.description);
            award.put("created", this.created);
            award.put("modified", this.modified);
        } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within getAwardAsJSON. " + ex.getMessage());
        }
        return award;
    }

}
