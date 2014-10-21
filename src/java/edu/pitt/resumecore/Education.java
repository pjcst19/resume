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
public class Education {

    private String educationID;
    private String name;
    private String type;
    private String field;
    private double gpa;
    private String graduationDate;
    private String created;
    private String modified;

    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private DbUtilities db;

    public Education(String educationID) {
        setAllEducationProperties(educationID);
    }

    public Education(String name, String type, String field, Double gpa, String graduationDate) {
        educationID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Education ";
        sql += "(educationID,name,type,field,gpa,graduationDate,created,modified)";
        sql += " VALUES (";
        sql += "'" + educationID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(name) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(type) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(field) + "', ";
        sql += "'" + gpa.toString() + "', ";
        sql += "'" + graduationDate + "',NULL,NULL); ";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of the Education constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally{
            setAllEducationProperties(educationID);
        }

    }
    private void setAllEducationProperties(String educationID){
        db = new DbUtilities();
        String sql = "SELECT * FROM rms.Education WHERE educationID = '" + educationID + "'";
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                this.name = rs.getString("name");
                this.type = rs.getString("type");
                this.field = rs.getString("field");
                this.gpa = rs.getDouble("gpa");
                this.graduationDate = rs.getString("graduationDate");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Education(String educationID) constructor of Education class. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally{
            this.educationID = educationID;
        }
    }
    public void setName(String name) {
        String sql = "UPDATE Education SET name = '" + name + "' WHERE educationID = '" + this.educationID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setName. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.name = name;
    }

    public void setType(String type) {
        String sql = "UPDATE Education SET type = '" + type + "' WHERE educationID = '" + this.educationID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setType. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.type = type;
    }
    
    public void setField(String field) {
        String sql = "UPDATE Education SET field = '" + field + "' WHERE educationID = '" + this.educationID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setField. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.field = field;
    }
    
    public void setGPA(Double gpa) {
        String sql = "UPDATE Education SET gpa = '" + gpa.toString() + "' WHERE educationID = '" + this.educationID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setGPA. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.gpa = gpa;
    }
    
    public void setGraduationDate(String graduationDate) {
        String sql = "UPDATE Education SET graduationDate = '" + graduationDate + "' WHERE educationID = '" + this.educationID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setGraduationDate. " + ex.getMessage());
            ErrorLogger.log(sql);
        }
        this.graduationDate = graduationDate;
    }
    
    public String getEducationID(){
        return educationID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }
    
    public String getField(){
        return field;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public String getGraduationDate(){
        return graduationDate;
    }
    
    public JSONObject getEducationAsJson(){
        
        JSONObject education = new JSONObject();
        
        try {
            education.put("educationID", this.educationID);
            education.put("name", this.name);
            education.put("type", this.type);
            education.put("field", this.field);
            education.put("gpa", this.gpa);
            education.put("graduationDate", this.graduationDate);
            
        } catch (JSONException ex) {
            ErrorLogger.log("An error occurred within getEducationAsJSON. " + ex.getMessage());
        }
        return education;
    }
}
