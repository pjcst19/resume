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
                                <div class="col-xs-3">
                                    <select id="searchOption" class="form-control">
                                        <option value="lastName" selected>Last Name</option>
                                        <option value="field">Major/Minor</option>
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
                            <th>Created</td>
                            <th>Modified</td>
                            <th>Resume ID</td>
                            <th id="searchCol"></th>
                            <th>Resume(s)</th>
                        </tr>
                    </table>
                </div>
            
                <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <script language="javascript">
            var $restPath = "rest/searchws?lastName=";
            var $searchField = "lastName";
            $dataTitle = "Last Name";
            var xhr;
            var $option;
            $(document).ready(function() {   
                
                 $("#searchCol").text( $dataTitle);
                
                $('#searchOption').on('change', function() {
                    $(".data").remove();
                    $option = $("#searchOption :selected").text();

                    if($option === "Last Name"){
                        $restPath = "rest/searchws?lastName=";
                        $searchField = "lastName";
                        $dataTitle = "Last Name";
                        
                    }
                    else if($option === "Major/Minor"){
                        $restPath = "rest/searchws?field=";
                        $searchField = "field";
                        $dataTitle = "Major/Minor";
                    }
                    else if($option === "GPA is greater than"){
                        $restPath = "rest/searchws?gpa=";
                        $searchField = "gpa";
                        $dataTitle = "GPA";
                    }
                    else if($option === "Job Description"){
                        $restPath = "rest/searchws?description=";
                        $searchField = "description";
                        $dataTitle = "Job Description";
                    }
                    
                    $("#searchCol").text( $dataTitle);
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
                
               $tableData = $('#tblUserList');
               $('.data').empty();
                for (var i = 0; i < data.length; i++) {
                    var $row = $('<tr class ="data">');
                    $row.append('<td>' +  data[i].lastName + '</td>');
                    $row.append('<td>' +  data[i].firstName + '</td>');
                    $row.append('<td>' + data[i].created + '</td>');
                    $row.append('<td>' + data[i].modified + '</td>');
                    $row.append('<td>' + data[i].resumeID + '</td>');
                    $row.append('<td>' + data[i][$searchField]+ '</td>');
                    $row.append('<td><a href="viewResumePersonal.jsp?resumeID=' + data[i].resumeID + '">View</a></td>');
                    $row.append('</tr>');
                    $tableData.append($row);
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
                if(xhr && xhr.readystate !==  4){
                    xhr.abort();
                }
            }
        </script>
        
        <%@ include file="includes/footer.jsp" %>