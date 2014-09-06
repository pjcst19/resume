/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.servlets;

import edu.pitt.resumecore.Address;
import edu.pitt.resumecore.Resume;
import edu.pitt.resumecore.User;
import edu.pitt.utilities.Security;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mandy
 */
@WebServlet(name = "processPersonalInfo", urlPatterns = {"/processPersonalInfo"})
public class processPersonalInfo extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);

//            Security security = new Security();
//            if (security.checkHijackedSession(session, request)) {
//                response.sendRedirect("index.jsp");
//            }

            User user = (User) session.getAttribute("authenticatedUser");
            String firstName = "";
            String lastName = "";
            String addressLine1 = "";
            String addressLine2 = "";
            String city = "";
            String state = "";
            String province = "";
            String country = "";
            String postalCode = "";
            String phoneNumber = "";
            String email = "";

//            if (!request.getParameter("txtfirstName").equals("") && !request.getParameter("txtLastName").equals("")) {

                firstName = request.getParameter("txtFirstName");
                lastName = request.getParameter("txtLastName");
                addressLine1 = request.getParameter("txtAddressLine1");
                addressLine2 = request.getParameter("txtAddressLine2");
                city = request.getParameter("txtCity");
                state = request.getParameter("txtState");
                province = request.getParameter("txtProvince");
                country = request.getParameter("txtCountry");
                postalCode = request.getParameter("txtPostalCode");
                phoneNumber = request.getParameter("txtPhone");
                email = request.getParameter("txtEmail");

                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setPhoneNumber(phoneNumber);
                user.setEmail(email);

                Address address = new Address(addressLine1, addressLine2, city, state, province, postalCode, country);
                user.addAddress(address);

                response.sendRedirect("education.jsp");

//            } else {
//                out.println("You must enter your First and Last Name!");
//            }

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
