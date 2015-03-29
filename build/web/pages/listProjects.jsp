<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp" %>

<div id="mainContainer" class="container theme-showcase" style="width:900px">
    <div class="panel panel-default">
        <div class="panel-heading"><strong>View All Projects</strong></div>
        <table class="table" id ="tblUserList" border="1" cellpadding="5" cellspacing="0">
            <tr>
                <th>Portfolio ID</th>
                <th>Project Name</th>
                <th>Project ID</th>
                <th>Created</th>
                <th>Modified</th>
                <th>View Project</th>
                <th>Edit Project</th>
            </tr>
        </table>
    </div>
    <script>
        $(document).ready(function () {
            getJsonFromWebService("../rest/userlistws?userID=<% out.print(request.getParameter("userID"));%>");
        });
        
        function getJsonFromWebService(targetUrl) {
            jQuery.ajax({
                type: "GET",
                url: targetUrl,
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data, status, jqXHR) {
                    jsonToHtmlTable(data);
                },
                error: function (jqXHR, status) {
                    console.log(status);
                }
            });
        }

        function jsonToHtmlTable(data) {
            $table = $('#tblUserList');
            for (var i = 0; i < data.length; i++) {
                for (var j = 0; j < data[i]['projects'].length; j++) {
                    var $row = $('<tr />');
                    $row.append('<td>' + data[i].PortfolioID + '</td>');
                    $row.append('<td>' + data[i]['projects'][j].projectID + '</td>');
                    $row.append('<td>' + data[i].ProjectName + '</td>');                    
                    $row.append('<td>' + data[i]['projects'][j].created + '</td>');
                    $row.append('<td>' + data[i]['projects'][j].modified + '</td>');                    
                    $row.append('<td><a href="viewProjectPersonal.jsp?projectID=' + data[i]['projects'][j].projectID + '">View</a></td>');
                    $row.append('<td><a href="viewEditProject.jsp?projectID=' + data[i]['projects'][j].projectID + '">Edit</a></td>');
                    $row.append('</tr>');
                    $table.append($row);
                }
            }
        }
    </script>
    <%@ include file="../includes/footer.jsp" %>