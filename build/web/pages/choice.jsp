<%--
    Document   : personalInfo
    Created on : Apr 15, 2014, 9:02:43 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>

<div id="mainContainer" class="container theme-showcase" style="width:900px">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title"><strong>Create Your Resume - Portfolio</strong></h3>
        </div>
        <div class="panel-body">
            <div class="page-header" align="center">
                <button class="btn btn-lg btn-default" type="button" id="btnProject" onclick="window.location.href = '../pages/education.jsp'">Proceed to Resume</button><br><br>
                <button class="btn btn-lg btn-default" type="button" id="btnAddProject" onclick="window.location.href = '../pages/project.jsp'">Proceed to Portfolio</button>

            </div>
        </div>
    </div>
</div>
<%@ include file="../includes/footer.jsp" %>
