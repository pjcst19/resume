<%-- 
    Document   : workExperience
    Created on : Apr 15, 2014, 9:08:49 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Security security = new Security();
    if (security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }
%>
<%@ include file="includes/header.jsp" %>
<script src="js/workExperienceFunctions.js"></script>


<div class="panel-heading">
    <h3 class="panel-title"><strong>Create Your Resume</strong></h3>
</div>

<div class="panel-body">

    <div id="page-header">

        <h2 class="form-signin-heading">Work Experience</h2><br>


        <div id="workExpForm">

        </div>

        <br>

        <div id="additionalWorkExp">

        </div>


        <button class="btn btn-lg btn-primary" type="button" onclick="window.location.href = 'education.jsp'">Back</button>
        <button class="btn btn-lg btn-primary" type="button" id="btnAddWorkExp">Add Work Experience</button>
        <button class="btn btn-lg btn-primary" type="submit" onclick="submitWork();">Next</button> <!--Where do we go from here? -->

    </div>
</div>


<%@ include file="includes/footer.jsp" %>
