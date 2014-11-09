<%-- 
    Document   : viewResumePersonal
    Created on : Apr 15, 2014, 7:37:39 PM
    Author     : jordanstevenfeldman
--%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }
    else{
        
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

        <title>Resume Management System</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/custom.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" type="text/css">
        

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <!--        <script language="javascript">
                    $(document).ready(function() {
                        getJsonFromWebService("rest/userlistws?userID=<% out.print(request.getParameter("userID"));%>");
                    });
                    function getJsonFromWebService(targetUrl) {
                        jQuery.ajax({
                            type: "GET",
                            url: targetUrl,
                            contentType: "application/json; charset=utf-8",
                            dataType: "json",
                            success: function(data, status, jqXHR) {
                                jsonToHtmlTable(data);
                            },
                            error: function(jqXHR, status) {
                                console.log(status);
                            }
                        });
                    }
        
        
                    function jsonToHtmlTable(data) {
                        $table = $('#tblUserList');
                        $table.empty();
        
                        $table.append("<tr><th>Last Name</th><th>First Name</th><th>Resume Name</th></tr>");
                        for (var i = 0; i < data.length; i++) {
                            var $row = $('<tr />');
                            $row.append('<td>' + data[i].lastName + '</td>');
                            $row.append('<td>' + data[i].firstName + '</td>');
                            $row.append('<td><a href="viewResume.jsp?resumeID=' + data[i].userID + '">View</a></td>');
                            $row.append('</tr>');
                            $table.append($row);
                        }
                    }
                </script>-->
        
                <script language="javascript">
                    $(document).ready(function() {
//                        getJsonFromWebService("rest/resumews?resumeID=<% //out.print(request.getParameter("resumeID"));%>");
                         getJsonFromWebService("rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a");
                    });
                    function getJsonFromWebService(targetUrl) {
                        console.log(targetUrl);
                        jQuery.ajax({
                            type: "GET",
                            url: targetUrl,
                            contentType: "application/json; charset=utf-8",
                            dataType: "json",
                            success: function(data, status, jqXHR) {
                                jsonToHtmlLayout(data);
                                console.log(data);
                                console.log("success");
                            },
                            error: function(jqXHR, status) {
                                console.log(status);
                                console.log("Error")
                            }
                        });
                    }
        
        
                    function jsonToHtmlLayout(data) {
                        $resume = $('#resumeContainer');
                        $userName = $('#userName');

                        $userName.append('<h3 class="panel-heading"><strong>' + data.firstName + " " + data.lastName + '</strong></h3>');

                        $resume.append('<div class="col-md-4">');
    //                    $resume.append('<label>' + data.resumeID + '</label><br>');
                        $resume.append('<h3> Education </h3><hr>');
                        
                        for ($i=0; $i<data.EducationList.length; $i++){
                            $resume.append(data.EducationList[$i].name + ', ' + data.EducationList[$i].type + ', ' + data.EducationList[$i].field + '<br>');
                            $resume.append('GPA:' + data.EducationList[$i].gpa + '<br>');
                            $resume.append(data.EducationList[$i].graduationDate + '<br><br>');
                            
                        }
                        
                        $resume.append('<h3> Work Experience </h3><hr>');
                        for ($i=0; $i<data.WorkExperienceList.length; $i++){
                            $resume.append(data.WorkExperienceList[$i].businessName + '<br>');
                            $resume.append(data.WorkExperienceList[$i].position);
                            $resume.append(data.WorkExperienceList[$i].startDate + ' - ' + data.WorkExperienceList[$i].endDate + '<br>');
                            $resume.append(data.WorkExperienceList[$i].description + '<br>');
                        }
                            
                        if(data.AwardList.length > 0){
                            $resume.append('<h3>Awards</h3>');
                        }
                        
                        for ($i=0; $i<data.AwardList.length; $i++){
                            $resume.append(data.AwardList[$i].name + '<br>');
                            $resume.append(data.AwardList[$i].description + '</div><br>');
                        }
                            
                    
                        
                        $resume.append('</div>');
                                              
                    }
                </script>
        
        
        
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span></button> <a class="navbar-brand" href="#">Resume Management System</a>
                </div>

                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.php">Home</a></li>

                        <li><a href="#about">Help</a></li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <ul class="nav pull-right">
                                <a class="btn btn-default navbar-btn" href="logout">Logout</a>
                            </ul>
                        </li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>
        
    

        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-default" id="userName">
<!--                    <h3 class="panel-heading"><strong>Resume</strong></h3>-->
                </div>

                <div class="panel-body">
                    <div class="panel-body">

                        <div class="page-header">
                            <div id="resumeContainer" col-lg-12">
   

                               





                            </div>
                        </div><!-- /container -->
                    </div>
                </div>

            </div>
    </body>
</html>