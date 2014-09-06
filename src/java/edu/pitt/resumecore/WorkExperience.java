/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.resumecore;

import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.ErrorLogger;
import edu.pitt.utilities.StringUtilities;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Naveen
 */
public class WorkExperience {

    private String workExperienceID;
    private String businessName;
    private String position;
    private String startDate;
    private String endDate;
    private String description;

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private DbUtilities db;

    public WorkExperience(String workExperienceID) {
        this.workExperienceID = workExperienceID;
        db = new DbUtilities();
        String sql = "SELECT * FROM rms.WorkExperience WHERE workExperienceID = '" + workExperienceID + "'";
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                this.businessName = rs.getString("businessName");
                this.position = rs.getString("position");
                this.startDate = rs.getString("startDate");
                this.endDate = rs.getString("endDate");
                this.description = rs.getString("description");
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in WorkExperience(String workExperienceID) constructor of WorkExperience class. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
    }
    
    public WorkExperience(String businessName, String position, String startDate, String endDate, String description){
        this.workExperienceID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.WorkExperience ";
        sql += "(workExperienceID,businessName,position,startDate,endDate,description)";
        sql += " VALUES "; 
        sql += "'" + this.workExperienceID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(businessName) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(position) + "', ";
        sql += "'" + startDate + "', ";
        sql += "'" + endDate + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(description) + "')";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of the WorkExperience constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        
        this.businessName = businessName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }
    
    public void setBusinessName(String businessName){
        String sql = "UPDATE WorkExperience SET businessName = '" + businessName + "' WHERE workExperienceID = '" + this.workExperienceID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setBusinessName. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.businessName = businessName;
    }
    
    public void setPosition(String position){
        String sql = "UPDATE WorkExperience SET position = '" + position + "' WHERE workExperienceID = '" + this.workExperienceID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setPosition. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.position = position;
    }
    
    public void setStartDate(String startDate){
        String sql = "UPDATE WorkExperience SET startDate = '" + startDate + "' WHERE workExperienceID = '" + this.workExperienceID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setStartDate. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.startDate = startDate;
    }
    
    public void setEndDate(String endDate){
        String sql = "UPDATE WorkExperience SET endDate = '" + endDate + "' WHERE workExperienceID = '" + this.workExperienceID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setEndDate. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.endDate = endDate;
    }
    
    public void setDescription(String description){
        String sql = "UPDATE WorkExperience SET description = '" + description + "' WHERE workExperienceID = '" + this.workExperienceID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setDescription. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.description = description;
    }
    
    public String getWorkExperienceID(){
        return workExperienceID;
    }
    
    public String getBusinessName(){
        return businessName;
    }
    
    public String getPosition(){
        return position;
    }
    
    public String getStartDate(){
        return startDate;
    }
    
    public String getEndDate(){
        return endDate;
    }
    
    public String getDescription(){
        return description;
    }
    
    public JSONObject getWorkExperienceAsJson(){
        
        JSONObject workExperience = new JSONObject();
        
        try {
            workExperience.put("workExperienceID", this.workExperienceID);
            workExperience.put("businessName", this.businessName);
            workExperience.put("position", this.position);
            workExperience.put("startDate", this.startDate);
            workExperience.put("endDate", this.endDate);
            workExperience.put("description", this.description);
        } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within getWorkExperiencenAsJSON. " + ex.getMessage());
        }
        return workExperience;
    }
}
