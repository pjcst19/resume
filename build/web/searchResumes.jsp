<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //if (Security.checkHijackedSession(session, request)) {
   //     System.out.println("Here");
   //     response.sendRedirect("index.jsp");
   // }
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
            var $restPath = "rest/userlistws?lastName=";
            var xhr;
            $(document).ready(function() {                
                $('#searchOption').on('change', function() {
                    $option = $("#searchOption :selected").text();

                    if($option === "Last Name"){
                        $restPath = "rest/userlistws?lastName=";
                    }
                    else if($option === "Field"){
                        $restPath = "rest/userlistws?field=";
                    }
                    else if($option === "GPA is greater than"){
                        $restPath = "rest/userlistws?gpa=";
                    }
                    else if($option === "Job Description"){
                        $restPath = "rest/userlistws?jobDescription=";
                    }
                });
     
                $('#txtSearchbox').keyup(function() {
                    if ($("#txtSearchbox").val().length > 0) {
                        abortAjax(xhr);
                        $searchTxt = $('#txtSearchbox').val();
                        $tempFullPath = $restPath + $searchTxt;
                        getJsonFromWebService($tempFullPath);
                        $tempFullPath = "";
                    }
                });
            });
            function getJsonFromWebService(targetUrl) {
                console.log(targetUrl);
                xhr = jQuery.ajax({
                    type: "GET",
                    url: targetUrl,
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    success: function(data, status, jqXHR) {
                        addToAutoComplete(data);
                        jsonToHtmlSelect(data);
                        jsonToHtmlTable(data);
                    },
                    
                    error: function(jqXHR, status) {
                        console.log(status);
                    }
                });
            }

            function addToAutoComplete(data) {
                $lookup = $('#divUserLookup');
                $lookup.empty();
                $temp = "";
                for (var i = 0; i < data.length; i++) {
                    $temp += '<a href=javascript:addValueToTextBox("' + data[i].lastName + '");>' + data[i].lastName + '</a><br/>';
                }
                $lookup.append($temp);
            }

            function addValueToTextBox(data) {
                $textBox = $('#txtUserList');
                $textBox.empty();
                $textBox.val(data);
            }

            function jsonToHtmlTable(data) {
                $table = $('#tblUserList');
                $table.empty();

                $table.append("<tr><th>Last Name</th><th>First Name</th><th>Resume(s)</th></tr>");
                for (var i = 0; i < data.length; i++) {
                    var $row = $('<tr />');
                    $row.append('<td>' + data[i].lastName + '</td>');
                    $row.append('<td>' + data[i].firstName + '</td>');
                    $row.append('<td><a href="viewResumePersonal.jsp?resumeID=' + data[i].userID + '">View</a></td>');
                    $row.append('</tr>');
                    $table.append($row);
                }
            }

            function jsonToHtmlSelect(data) {
                $select = $('#cboUserList');
                $select.empty();

                for (var i = 0; i < data.length; i++) {
                    $select.append('<option value="' + data[i].userID + '">' + data[i].lastName + ', ' + data[i].firstName + '</option>');
                }
            }
            function abortAjax(xhr) {
                if(xhr && xhr.readystate != 4){
                    xhr.abort();
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
                    <div class="panel-heading"><strong>Search</strong></div>
                    <div class="col-xs-12">
                        <br>
                        <div class="input-group">
                            <div class="row">
                                <div class="col-xs-2">
                                    Search by:
                                </div>
                                <div class="col-xs-3">
                                    <select id="searchOption" class="form-control">
                                        <option value="lastName" selected>Last Name</option>
                                        <option value="major">Field</option>
                                        <option value="gpa">GPA is greater than</option>
                                        <option value="jobDescription">Job Description</option>
                                    </select>
                                </div>
                                <div class="col-xs-6">
                                    <input type="text" id="txtSearchbox" name="txtSearchbox" class="form-control" placeholder="Enter search terms here">
                                </div>
                                <div class="col-xs-1">
                                    <button class="btn btn-default" type="button">Search</button>
                                </div>
                                <br>
                            </div>
                        </div><!-- /input-group -->
                    </div><!-- /.col-lg-6 -->
                    <br>
                    <br>
                    <hr>
                    <table class="table" id ="tblUserList" border="1" cellpadding="5" cellspacing="0">
                        <tr>
                            <th>Last Name</th>
                            <th>First Name</th>
                            <th>Field</th>
                            <th>Resume(s)</th>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>