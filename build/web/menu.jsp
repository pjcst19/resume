<%@page import="edu.pitt.resumecore.User"%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
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
    </head>

    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span></button> <a class="navbar-brand" href="#">Resume Management System</a>
                </div>

                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.jsp">Home</a></li>

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

        <div class="container theme-showcase">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><strong>Menu</strong></h3>
                </div>

                <div class="panel-body">
                    <ul>
                        <%
                            User user = (User) session.getAttribute("authenticatedUser");
                            if(user.getRoles().contains("student")){
                                out.print("<li><a href='listResumes.jsp?userID=" + user.getUserID() + "'>Your Resumes</a></li>");
                                //Need to change this back to personalInfo.jsp
                                out.print("<li><a href='personalInfo.jsp'>Enter a new Resume</a></li>");
                            }
                            else if(user.getRoles().contains("staff")){
                                out.print("<li><a href='listResumes.jsp'>List all Resumes</a></li>");
                                out.print("<li><a href='searchResumes.jsp'>Search through Resumes</a></li>");
                                out.print("<li><a href='listUsers.jsp'>List Users</a></li>");
                                out.print("<li><a href='addUser.jsp'>Add User</a></li>");
                            }
                            else if(user.getRoles().contains("employer")){
                                out.print("<li><a href='listResumes.jsp'>View all Resumes</a></li>");
                                out.print("<li><a href='searchResumes.jsp'>Search through Resume</a></li>");
                            }
                        %>
                    </ul>
                </div>
            </div>

        </div>
    </body>
</html>
