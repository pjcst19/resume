<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (Security.checkHijackedSession(session, request)) {
        System.out.println("Here");
        response.sendRedirect("index.jsp");
    }
%>
<%@ include file="includes/header.jsp" %>
                    <div class="panel-heading"><strong>Search</strong></div>
                    <div class="col-xs-12">
                        <br>
                        <div class="input-group">
                            <div class="row">
                                <div class="col-xs-2">
                                    Search by:
                                </div>
                                <div class="col-xs-4">
                                    <select id="searchOption" class="form-control">
                                        <option value="lastName" selected>Last Name</option>
                                        <option value="login">Login</option>
                                        <option value="email">Email</option>
                                    </select>
                                </div>
                                <div class="col-xs-5">
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
                            <th>Login </td>
                            <th>Email</td>
                            <th>Access Type</th>
                            <th>Status</th>
                            <th id="searchCol"></th>
                            <th>View/Edit</th>
                        </tr>
                    </table>
                </div>
            </div>
      
             <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <script language="javascript">
            var $restPath = "rest/userws?lastName=";
            var $searchField = "lastName";
            $dataTitle = "Last Name";
            var xhr;
            var $option;
            $(document).ready(function() {   
                getJsonFromWebService($restPath);
                
                 $("#searchCol").text( $dataTitle);
                
                $('#searchOption').on('change', function() {
                    $(".data").remove();
                    $option = $("#searchOption :selected").text();

                    if($option === "Last Name"){
                        $restPath = "rest/userws?lastName=";
                        $searchField = "lastName";
                        $dataTitle = "Last Name";
                        
                    }
                    else if($option === "Login"){
                        $restPath = "rest/userws?login=";
                        $searchField = "login";
                        $dataTitle = "Login";
                    }
                    else if($option === "Email"){
                        $restPath = "rest/userws?email=";
                        $searchField = "email";
                        $dataTitle = "Email";
                    }
                    
                    $("#searchCol").text( $dataTitle);
                    getJsonFromWebService($restPath+$('#txtSearchbox').val());
                });
     
                $('#txtSearchbox').keyup(function() {
                    if ($("#txtSearchbox").val().length > 0) {
                         $(".data").remove();
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
                
               $tableData = $('#tblUserList');
               $('.data').empty();
                for (var i = 0; i < data.length; i++) {
                    var roles = "";
                    if(data[i].Employer === "true"){
                        roles += " Employer";
                    }
                    if(data[i].Staff === "true"){
                        roles += " Staff";
                    }
                    if(data[i].Student === "true"){
                        roles += " Student";
                        
                    }
                    
                    var status;
                    if(data[i].enabled === 0){
                        status = "Disabled";
                    }
                    else{
                        status = "Enabled";
                    }
                    
                    var $row = $('<tr class ="data">');
                    $row.append('<td>' +  data[i].lastName + '</td>');
                    $row.append('<td>' +  data[i].firstName + '</td>');
                    $row.append('<td>' + data[i].login + '</td>');
                    $row.append('<td>' + data[i].email + '</td>');
                    $row.append('<td>' + roles + '</td>');
                    $row.append('<td>' + status + '</td>');
                    $row.append('<td>' + data[i][$searchField]+ '</td>');
                    $row.append('<td><a href="viewEditUser.jsp?userID=' + data[i].userID + '">View/Edit</a></td>');
                    $row.append('</tr>');
                    $tableData.append($row);
                }
            }
            
            function abortAjax(xhr) {
                if(xhr && xhr.readystate !==  4){
                    xhr.abort();
                }
            }
        </script>
        
        <%@ include file="includes/footer.jsp" %>