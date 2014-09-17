<%-- 
    Document   : personalInfo
    Created on : Apr 15, 2014, 9:02:43 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    Security security = new Security();
//    if (!security.checkHijackedSession(session, request)){
//	response.sendRedirect("index.jsp");
//}
%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

    <title>Resume Management System - Personal Information</title><!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/custom.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" type="text/css">
</head>

<body>
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span></button> <a class="navbar-brand" href="#">Student Resume System</a>
            </div>

            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.php">Home</a></li>
                    <li><a href="#">Create Resume</a></li>
                    <li><a href="#">Edit Resume</a></li>
                    <li><a href="#">View Resume</a></li>


                    
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>

    <div class="container theme-showcase" style="width:900px">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title"><strong>Create Your Resume</strong></h3>
            </div>

            <div class="panel-body">
                
                <div class="page-header">
                    <form class="frmPersonalInfo" method="post" action="processPersonalInfo">
                        <h2 class="form-signin-heading">Personal Information</h2><br>
                        <input type="text" class="form-control" id="txtFirstName" name="txtFirstName" placeholder="First Name" autofocus="" required><br>
                        <input type="text" class="form-control" id="txtLastName" name="txtLastName" placeholder="LastName" required><br>
                        <input type="text" class="form-control" id="txtAddressLine1" name="txtAddressLine1" placeholder="Street Address" required><br>
                        <input type="text" class="form-control" id="txtAddressLine2" name="txtAddressLine2" placeholder="Address"><br>
                        <input type="text" class="form-control" id="txtCity" name="txtCity" placeholder="City" required style="width:50%; display:inline">
                        <input type="text" class="form-control" id="txtState" name="txtState" placeholder="State" required style="width:49%; display:inline"><br><br>
                        <input type="text" class="form-control" id="txtProvince" name="txtProvince" placeholder="Province" style="width:40%; display:inline">
                        <input type="text" class="form-control" id="txtCountry" name="txtCountry" placeholder="Country" style="width:38%; display:inline">
                        <input type="text" class="form-control" id="txtPostalCode" name="txtPostalCode" placeholder="Postal Code" required style="width:20%; display:inline"><br><br>
                        <input type="tel" class="form-control" id="txtPhone" name="txtPhone" placeholder="Phone Number" required style="width:50%; display:inline">
                        <input type="email" class="form-control" id="txtEmail" name="txtEmail" placeholder="Email" required style="width:49%; display:inline"><br><br>

                        <button class="btn btn-lg btn-primary" type="submit" name="btnSubmitPersonalInfo" id="btnSubmitPersonalInfo">Next</button>
                    </form><br>
                    
                </div>
            </div><!-- /container -->
        </div>
    </div>
</body>
</html>
