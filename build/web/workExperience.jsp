<%-- 
    Document   : workExperience
    Created on : Apr 15, 2014, 9:08:49 PM
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
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

    <title>Work Experience</title><!-- Bootstrap core CSS -->
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
                    <form class="form-signin" method="post" action="processWorkExperience">
                        <h2 class="form-signin-heading">Work Experience and Awards</h2><br>
                        

                        <label> Work Experience </label>
                        <input type="text" class="form-control" id="txtBusinessName" name="txtBusinessName" placeholder="Employer"autofocus=""><br>
                        <input type="text" class="form-control" id="txtPosition" name="txtPosition" placeholder="Position"><br>
                        <label style="display:inline"> Start Date</label><input type="date" class="form-control" id="txtStartDate" name="txtStartDate" style="width:30%; display:inline">
                        <label style="display:inline"> End Date</label><input type="date" class="form-control" id="txtEndDate" name="txtEndDate" style="width:30%; display:inline"><br><br>
                        <textarea class="form-control" rows="6" id="txtWorkDescription" name="txtWorkDescription" placeholder="Description of Work Experience"></textarea><br>
                        <label> Awards </label>
                        <input type="text" class="form-control" id="txtAwardName" name="txtAwardName" placeholder="Award/Recognition" style="width:49%; display:inline"><br><br>
                        <textarea class="form-control" rows="6" id="txtAwardDescription" name="txtAwardDescription" placeholder="Description of Award"></textarea><br>
                        
                        <br>

                       
                        <button class="btn btn-lg btn-primary" type="button" onclick="window.location.href='education.jsp'">Back</button>
                        <button class="btn btn-lg btn-primary" type="button" onclick="window.location.href='menu.jsp'">Next</button> <!--Where do we go from here? -->
                    </form><br>
                    
                </div>
            </div><!-- /container -->
        </div>
    </div>
</body>
</html>
