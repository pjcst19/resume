<%-- 
    Document   : education
    Created on : Apr 15, 2014, 9:07:58 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.StringUtilities"%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Security security = new Security();
    
    if (!security.checkHijackedSession(session, request)){
	response.sendRedirect("index.jsp");
}
%>


<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

    <title>Education</title><!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/custom.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" type="text/css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
    <script>
        $(function() {
            $( "#datepicker" ).datepicker();
        });
    </script>
    
   
    
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
                    <form class="form-signin" method="post" action="processEducation">
                        <h2 class="form-signin-heading">Education</h2><br>

                        <label> University</label>
                        <input type="text" class="form-control" id="txtSchoolName" name="txtSchoolName" placeholder="University" required autofocus=""><br>
                        <input type="text" class="form-control" id="txtDegreeType" name="txtDegreeType" placeholder="Type of Degree" required style="width:29%; display:inline">
                        <input type="text" class="form-control" id="txtMajorType" name="txtMajorType" placeholder="Major" required style="width:29%; display:inline">
                        <input type="number" class="form-control" id="txtGPA" name="txtGPA" placeholder="GPA" min="0" max="4" step="0.1" style="width:20%; display:inline">
                        <input type="text" class="form-control" id="datepicker" name="txtGradDate" placeholder="Graduation Date" required="" style="width:20%; display:inline">
                        
                        <br><br>
                   
                        <br>
                        <button class="btn btn-lg btn-primary" type="btnEducation" id="btnEducation" onclick="window.location.href='objectives.jsp'">Back</button>
                        <button class="btn btn-lg btn-primary" type="btnSubmit" id="btnSubmit">Next</button>
                    </form><br>
                    
                </div>
            </div><!-- /container -->
        </div>
    </div>
</body>
</html>
