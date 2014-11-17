/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.rest;

<<<<<<< HEAD
=======
import edu.pitt.resumecore.Address;
>>>>>>> mandySprint5
import edu.pitt.resumecore.Resume;
import edu.pitt.resumecore.User;
import edu.pitt.utilities.DbUtilities;
import edu.pitt.utilities.Security;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author Mandy
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
        
        if(Security.checkHijackedSession(request.getSession(false), request)){
            response.sendRedirect("rest/index.jsp");
         }
        
         try (PrintWriter out = response.getWriter()) {
            
            String resumeID = "";
<<<<<<< HEAD
=======
            String userID = "";
>>>>>>> mandySprint5
            
            if(request.getParameter("resumeID") != null){
                resumeID = request.getParameter("resumeID");
                System.out.println(resumeID);
            }
            
            else{
                out.print("Resume ID is null");
            }
            
<<<<<<< HEAD
            JSONArray fullResume = new JSONArray();
           
            Resume userResume = new Resume(resumeID);
            
            out.print(userResume.getResumeAsJson().toString());
=======
            DbUtilities db = new DbUtilities();
            JSONArray userResume = new JSONArray();
            
            String sql ="SELECT fk_userID FROM Resume WHERE resumeID = '" + resumeID + "';";
           
            ResultSet rs = null;
            
            try {
                rs = db.getResultSet(sql);
            } catch (SQLException ex) {
                Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (rs.next()) {
                    User user = new User(rs.getString("fk_userID"));
                    userResume.put(user.getUserInfoAsJSON());
                    userID = rs.getString("fk_userID");
                }
            } catch (SQLException ex) {
                Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
            
       
              String sql2 = "SELECT fk_addressID FROM UserAddress WHERE fk_userID = '" + userID + "';";
            ResultSet rs2 = null;
           
            try {
                rs2 = db.getResultSet(sql2);
            } catch (SQLException ex) {
                Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while (rs.next()) {
                    Address address = new Address(rs.getString("fk_addressID"));
                    userResume.put(address.getAddressAsJson());
                }
            } catch (SQLException ex) {
                Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            Resume resume = new Resume(resumeID);
            userResume.put(resume.getResumeAsJson());
            out.print(userResume.toString());
            
>>>>>>> mandySprint5
            
        }
         
//         /*catch (SQLException ex) {
//            Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
//        } */
<<<<<<< HEAD
=======
         
//         /*catch (SQLException ex) {
//            Logger.getLogger(resumews.class.getName()).log(Level.SEVERE, null, ex);
//        } */
>>>>>>> mandySprint5
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
