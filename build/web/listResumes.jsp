<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    } else {

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
        <script language="javascript">
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
                $lastName = data[0].lastName;
                $firstName = data[0].firstName;
           
                for (var i = 0; i < data[0]['resumes'].length; i++) {
                    var $row = $('<tr />');
                    $row.append('<td>' + $lastName + '</td>');
                    $row.append('<td>' + $firstName + '</td>');
                    $row.append('<td>' + data[0]['resumes'][i].resumeID + '</td>');
                    $row.append('<td><a href="viewResumePersonal.jsp?resumeID=' + data[0]['resumes'][i].resumeID + '">View</a></td>');
                    $row.append('</tr>');
                    $table.append($row);
                }
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
                        <li class="active"><a href="menu.jsp">Home</a></li>

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

        <div>
            <div class="container">
                <div class="panel panel-default">
                    <div class="panel-heading"><strong>View All Resumes</strong></div>
                    <table class="table" id ="tblUserList" border="1" cellpadding="5" cellspacing="0">
                            <tr>
                                <th>Last Name</th>
                                <th>First Name</th>
                                <th>Resume ID</th>
                                <th>View Resume</th>
                            </tr>
                    </table>
                </div>
            </div>
        </div>

    </div>

</body>
</html>