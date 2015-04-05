<%-- 
    Document   : research
    Created on : 
    Author     : Paul J Cattoll
--%>

<%@page import="edu.pitt.utilities.StringUtilities"%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>
<script src="../js/researchFunctions.js"></script>

<div id="mainContainer" class="container theme-showcase" style="width:900px">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title"><strong>Create Your Portfolio</strong></h3>
        </div>
        <div class="panel-body">
            <div class="page-header">
                <h2 class="form-signin-heading">Research</h2><br>
                <div id="resForm">
                </div>
                <div id="additionalResearch">
                </div><!--End of Div additionalResearch-->
                <br>
                <button class="btn btn-lg btn-default" type="button" id="btnResearch" onclick="window.location.href = 'portfolio.jsp'">Back</button>
                <button class="btn btn-lg btn-default" type="button" id="btnAddEducation">Add Research</button>
                <button class="btn btn-lg btn-default" type="submit" onclick="submitRes();" id="btnSubmit" name="btnSubmit">Next</button>
                <br>
            </div><!--End of div page-header-->
        </div><!-- /container -->
    </div>
</div>
<%@ include file="../includes/footer.jsp" %>