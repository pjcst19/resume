/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.pitt.rest;

import edu.pitt.resumecore.Resume;
import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.Security;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author Mandy Kendall
 */
@WebServlet(name = "resumews", urlPatterns = {"/rest/resumews"})
public class resumews extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        DbUtilities db = null;
        if(Security.checkHijackedSession(request.getSession(false), request)){
            response.sendRedirect("./index.jsp");
         }
        try (PrintWriter out = response.getWriter()) {
            String resumeID = "";
            String field = "";
            String gpa = "";
            String jobDescription = "";
            
            if(request.getParameter("resumeID") != null){
                resumeID = request.getParameter("resumeID").toString();
                
            }
             if(request.getParameter("field") != null){
                field = request.getParameter("field").toString();
            }
            if(request.getParameter("gpa") != null){
                gpa = request.getParameter("gpa").toString();
            }
            if(request.getParameter("jobDescription") != null){
                jobDescription = request.getParameter("jobDescription").toString();
            }
            
            db = new DbUtilities();
            String sql = "";
            
            if(!resumeID.equals("")){
                  
                sql += "SELECT * FROM rms.Resume ";
                sql += "WHERE resumeID = '" + resumeID + "';";
                
                System.out.println(sql);
            }
            else if(!field.equals("")){
                sql = "SELECT fk_userID AS userID, FROM rms.Education JOIN rms.ResumeEducation ON educationID = fk_educationID JOIN rms.Resume ON resumeID = fk_resumeID ";
                sql += String.format("WHERE field COLLATE UTF8_GENERAL_CI LIKE '%s%%'", field);
                
                System.out.println(sql);

            }
            else if(!gpa.equals("")){
                
            }
            else if(!jobDescription.equals("")){
                
            }
            
            JSONArray resumeInfo = new JSONArray();
            ResultSet rs = db.getResultSet(sql);
            while(rs.next()){
                Resume resume = new Resume(rs.getString("resumeID"));
                resumeInfo.put(resume.getResumeAsJson());
            }
            out.print(resumeInfo.toString());
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.closeMySQLConnection();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
