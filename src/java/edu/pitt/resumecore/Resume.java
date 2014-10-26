/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.resumecore;

import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.ErrorLogger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Creates a Resume object
 *
 * @author jordanstevenfeldman
 */
public class Resume {

    private String resumeID;
    private int rating;
    private String created;
    private String modified;
    private ArrayList<Education> educationList = new ArrayList<Education>();
    ;
    private ArrayList<Award> awardList = new ArrayList<Award>();
    ;
    private ArrayList<WorkExperience> workExperienceList = new ArrayList<WorkExperience>();
    ;

    private DbUtilities db;

    /**
     * Creates a Resume object based upon information obtained from database by
     * providing resumeID
     *
     * @param resumeID
     */
    public Resume(String resumeID) {
        setAllResumeProperties(resumeID);
    }

    /**
     * Creates a Resume object based upon the parameters given and inserts it
     * into the database
     *
     * @param userID
     * @param rating
     */
    public Resume(String userID, int rating) {
        resumeID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Resume ";
        sql += "(resumeID,fk_userID,rating,created,modified)";
        sql += " VALUES (";
        sql += "'" + resumeID + "', ";
        sql += "'" + userID + "', ";
        sql += "'" + rating + "',NULL,NULL);";
        System.out.println(sql);
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in the insert query inside of the Resume constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setAllResumeProperties(resumeID);
        }

    }

    private void setAllResumeProperties(String resumeID) {
        String sql1 = "SELECT * FROM rms.Resume WHERE resumeID = '" + resumeID + "'";
        System.out.println(sql1);
        db = new DbUtilities();
        try {
            ResultSet rs = db.getResultSet(sql1);
            if (rs.next()) {
                this.rating = rs.getInt("rating");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Resume(String resumeID) constructor of Resume class. " + ex.getMessage());
            ErrorLogger.log(sql1);
        } finally {
            this.resumeID = resumeID;
        }

        String sql2 = "SELECT * FROM rms.ResumeAward WHERE fk_resumeID = '" + this.resumeID + "'";
        try {
            ResultSet rs2 = this.getDb().getResultSet(sql2);
            while (rs2.next()) {
                this.awardList.add(new Award(rs2.getString("fk_awardID")));
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occured in setAllResumeProperties() method of Resume class. " + ex.getMessage());
            ErrorLogger.log(sql2);
            System.out.println(sql2);
        }

        String sql3 = "SELECT * FROM rms.ResumeEducation WHERE fk_resumeID = '" + this.resumeID + "'";
        try {
            ResultSet rs3 = this.getDb().getResultSet(sql3);
            while (rs3.next()) {
                this.educationList.add(new Education(rs3.getString("fk_educationID")));
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occured in setAllResumeProperties() method of Resume class. " + ex.getMessage());
            ErrorLogger.log(sql3);

        }

        String sql4 = "SELECT * FROM rms.ResumeWorkExperience WHERE fk_resumeID = '" + this.resumeID + "'";
        try {
            ResultSet rs4 = this.getDb().getResultSet(sql4);
            while (rs4.next()) {
                this.workExperienceList.add(new WorkExperience(rs4.getString("fk_workExperienceID")));
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occured in setAllResumeProperties() method of Resume class. " + ex.getMessage());
            ErrorLogger.log(sql4);
        }
        db.closeMySQLConnection();
    }

    public void addEducation(Education education) {
        db = new DbUtilities();
        educationList.add(education);
        String sql = "INSERT INTO rms.ResumeEducation (fk_resumeID,fk_educationID) VALUES";
        sql += "('" + this.resumeID + "', '" + education.getEducationID() + "')";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of addEducation. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
    }

    public void addAward(Award award) {
        db = new DbUtilities();
        awardList.add(award);
        String sql = "INSERT INTO rms.ResumeAward (fk_resumeID,fk_awardID) VALUES";
        sql += "('" + this.resumeID + "', '" + award.getAwardID() + "')";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of addAward. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
    }

    public void addWorkExperience(WorkExperience workExperience) {
        db = new DbUtilities();
        workExperienceList.add(workExperience);
        String sql = "INSERT INTO rms.ResumeWorkExperience (fk_resumeID,fk_workExperienceID) VALUES";
        sql += "('" + this.resumeID + "', '" + workExperience.getWorkExperienceID() + "')";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of addWorkExperience. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        db = new DbUtilities();
        String sql = "UPDATE Resume SET rating = '" + rating + "' WHERE resumeID = '" + this.resumeID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setRating. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.rating = rating;
    }

    public DbUtilities getDb() {
        return db;
    }

    /**
     * @return the resumeID
     */
    public String getResumeID() {
        return this.resumeID;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * Creates and returns a properly formated JSON representation of Resume
     *
     * @return A properly formated JSON representation of Resume
     */
    public JSONObject getResumeAsJson() {
        JSONObject resume = new JSONObject();
        JSONArray resumeEducationList = new JSONArray();
        JSONArray resumeAwardList = new JSONArray();
        JSONArray resumeWorkExperienceList = new JSONArray();

        try {
            resume.put("resumeID", this.resumeID);
            resume.put("rating", this.rating);
            resume.put("created", this.created);
            resume.put("modified", this.modified);

            if (this.educationList != null) {
                for (Education education : this.educationList) {
                    resumeEducationList.put(education.getEducationAsJson());
                }
                resume.put("EducationList", resumeEducationList);
            } else {
                resume.put("EducationList", "");
            }

            if (this.awardList != null) {
                for (Award award : this.awardList) {
                    resumeAwardList.put(award.getAwardAsJson());
                }
                resume.put("AwardList", resumeAwardList);
            } else {
                resume.put("AwardList", "");
            }

            if (this.workExperienceList != null) {
                for (WorkExperience workExperience : this.workExperienceList) {
                    resumeWorkExperienceList.put(workExperience.getWorkExperienceAsJson());
                }
                resume.put("WorkExperienceList", resumeWorkExperienceList);
            } else {
                resume.put("WorkExperienceList", "");
            }
        } catch (JSONException ex) {
            ErrorLogger.log("An error has occurred within getResumeAsJSON. " + ex.getMessage());
        }
        return resume;
    }

}
