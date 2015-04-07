<%-- 
    Document   : portfoilio
    Created on : 
    Author     : Paul J Carroll
--%>

<%@page import="edu.pitt.utilities.StringUtilities"%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<script src="../js/portfolioFunctions.js"></script>

<div id="mainContainer" class="container theme-showcase" style="width:900px">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title"><strong>Create Your Portfolio</strong></h3>
        </div>
        <div class="panel-body">
            <div class="page-header">
                <h2 class="form-signin-heading">Portfolio</h2><br>
                <div id="portForm">
                </div>
                <div id="additionalPortfolio">
                </div><!--End of Div additionalPortfolio-->
                <br>
                <button class="btn btn-lg btn-default" type="button" id="btnPortfolio" onclick="window.location.href = 'personalInfo.jsp'">Back</button>
                <button class="btn btn-lg btn-default" type="button" id="btnAddPortfolio">Add Portfolio</button>
                <button class="btn btn-lg btn-default" type="submit" onclick="submitPort();" id="btnSubmit" name="btnSubmit">Next</button>
                <br>
            </div><!--End of div page-header-->
        </div><!-- /container -->
    </div>
</div>
<%@ include file="../includes/footer.jsp" %>