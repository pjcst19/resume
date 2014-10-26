/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.resumecore;

import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.ErrorLogger;
import edu.pitt.utilities.StringUtilities;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

import org.json.JSONObject;

/**
 * Creates an Address object
 *
 * @author Jordan S. Feldman
 */
public class Address {

    private String addressID;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String province;
    private String postalCode;
    private String country;
    private String created;
    private String modified;

    private DbUtilities db;

    /**
     * Creates an Address object based upon information obtained from database
     * by providing addressID
     *
     * @param addressID
     */
    public Address(String addressID) {
        setAllAddressProperties(addressID);
    }

    /**
     * Creates an Address object based upon the parameters given and inserts it
     * into the database
     *
     * @param addressLine1
     * @param addressLine2
     * @param city
     * @param state
     * @param province
     * @param postalCode
     * @param country
     */
    public Address(String addressLine1, String addressLine2, String city, String state,
            String province, String postalCode, String country) {
        addressID = UUID.randomUUID().toString();
        db = new DbUtilities();
        String sql = "INSERT INTO rms.Address ";
        sql += "(addressId,addressLine1,addressLine2,city,state,";
        sql += "postalCode,country,created,modified) VALUES (";
        sql += "'" + addressID + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(addressLine1) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(addressLine2) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(city) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(state) + "', ";
//        sql += "'" + StringUtilities.cleanMySqlInsert(province) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(postalCode) + "', ";
        sql += "'" + StringUtilities.cleanMySqlInsert(country) + "',NULL,NULL);";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of the Address constructor. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            setAllAddressProperties(addressID);
        }

    }

    /**
     *
     * @param addressID ID of address to be looked up and properties set from
     */
    private void setAllAddressProperties(String addressID) {
        db = new DbUtilities();
        String sql = "SELECT * FROM rms.Address WHERE addressID = '" + addressID + "'";
        try {
            ResultSet rs = db.getResultSet(sql);
            if (rs.next()) {
                this.addressLine1 = rs.getString("addressLine1");
                this.addressLine2 = rs.getString("addressLine2");
                this.city = rs.getString("city");
                this.state = rs.getString("state");
                this.province = rs.getString("province");
                this.postalCode = rs.getString("postalCode");
                this.country = rs.getString("country");
                this.created = rs.getTimestamp("created").toString();
                this.modified = rs.getTimestamp("modified").toString();
            }
        } catch (SQLException ex) {
            ErrorLogger.log("An error has occurred in Address(String addressID) constructor of Address class. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
            this.addressID = addressID;
        }
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    public void setAddressLine1(String addressLine1) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET addressLine1 = '" + addressLine1 + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setAddressLine1. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.addressLine1 = addressLine1;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET addressLine2 = '" + addressLine2 + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setAddressLine2. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.addressLine2 = addressLine2;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET city = '" + city + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setCity. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.city = city;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET state = '" + state + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setState. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.state = state;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET Province = '" + province + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setProvince. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.province = province;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET postCode = '" + postalCode + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setPostalCode. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.postalCode = postalCode;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        db = new DbUtilities();
        String sql = "UPDATE Address SET country = '" + country + "' WHERE addressID = '" + this.addressID + "';";
        try {
            db.executeQuery(sql);
        } catch (Exception ex) {
            ErrorLogger.log("An error has occurred in with the insert query inside of setCountry. " + ex.getMessage());
            ErrorLogger.log(sql);
        } finally {
            db.closeMySQLConnection();
        }
        this.country = country;
    }

    /**
     * @return the addressID
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Creates and returns a properly formated JSON representation of Address
     *
     * @return A properly formated JSON representation of Address
     */
    public JSONObject getAddressAsJson() {

        JSONObject address = new JSONObject();

        try {
            address.put("addressID", this.addressID);
            address.put("addressLine1", this.addressLine1);
            address.put("addressLine2", this.addressLine2);
            address.put("city", this.city);
            address.put("state", this.state);
            address.put("province", this.province);
            address.put("postalCode", this.postalCode);
            address.put("country", this.country);
            address.put("created", this.created);
            address.put("modified", this.modified);
        } catch (JSONException ex) {
            ErrorLogger.log("An error has occurred with getAddressAsJSON. " + ex.getMessage());
        }
        return address;
    }
}
