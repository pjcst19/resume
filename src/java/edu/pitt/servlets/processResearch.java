package edu.pitt.servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import edu.pitt.portfoliocore.Portfolio;
import edu.pitt.portfoliocore.Research;
import edu.pitt.resumecore.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Processes creation of new Project object
 *
 * @author Paul J Carroll
 */
public class processResearch extends HttpServlet {

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

            User user = (User) session.getAttribute("authenticatedUser");
            Portfolio portfolio = new Portfolio(user.getUserID(), 0);
            String researchtype = "";
            String title = "";
            String summary = "";
            String journal = "";
            String submissiondate = "";
            String publisheddate = "";
            String publishlink = "";

            researchtype = request.getParameter("researchtype");
            title = request.getParameter("txtProjectNameType");
            summary = request.getParameter("txtSummaryType");
            journal = request.getParameter("txtJournalType");
            submissiondate = request.getParameter("txtSubmissionDateType");
            publisheddate = request.getParameter("txtPublishDateType");
            publishlink = request.getParameter("txtPublishLinkType");
            
            Research research = new Research(researchtype, title, summary, journal, submissiondate, publisheddate, publishlink);
            portfolio.addResearch(research);

            session.setAttribute("currentPortfolio", portfolio);

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
