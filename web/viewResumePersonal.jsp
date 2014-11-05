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
                    $resume.append('<label>' + data.resumeID + '</label><br>');
//                    $resume.append('Degree Type:<div id="degreeType">' + data.type + '</div><br>');
//                    $resume.append('Major:<div id="major">' + data.field + '</div><br>');
//                    $resume.append('GPA:<div id="gpa">' + data.gpa + '</div><br>');
//                    $resume.append('Graduation Date: <div id="gradDate">' + data.graduationDate + '</div><br>')
                    $resume.append('</div>');
                    

//                                        <label>Student</label><br>
//                                        Name:<div id="firstName"></div><br>
//                                        Address:<div id="addressLine1"></div><br>
//                                        City:<div id="city"></div><br>
//                                        State:<div id="state"></div><br>
//                                        Province:<div id="province"></div><br>
//                                        Country:<div id="country"></div><br>
//                                        Postal Code:<div id="postalCode"></div><br>
//
//                                        Phone Number:<div id="phoneNumber"></div><br>
//                                        Email: <div id="email"></div><br>
//                                </div>
//
//                                <div class="col-md-4">
//
//                                         
//
//                                        <label>Awards</label><br>
//                                        Award Name:<div id="awardName"></div><br>
//                                        Award Description:<div id="description"></div>
//
//                                        <br>
//                                </div>
//
//                                <div class="col-md-4">
//
//                                        <label></label><br>
//                                        Employer:<div id="employer"></div><br>
//                                        Start Date:<div id="startDate"></div><br>
//                                        End Date:<div id="endDate"></div><br>
//                                        Position:<div id="position"></div><br>
//                                        Position Description:<div id="description"></div><br>
//
//                                        <br>
//
//
//
//                                </div>
        
//                    $resume.append(data.name);
//                    $resume.append(data.type);
//                    $resume.append(data.field);
//                    $resume.append(data.gpa);
//                    $resume.append(data.graduationDate);
//                   
                            
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