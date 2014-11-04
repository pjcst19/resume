<%-- 
    Document   : viewEditUser
    Author     : Jordan
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }

    String userID = request.getParameter("userID");
    session.setAttribute("selectedUserID", userID);
    System.out.println(session.getAttribute("selectedUserID"));

%>
<%@ include file="includes/header.jsp" %>

<div class="panel-heading">
    <h3 class="panel-title"><strong>View/Edit</strong></h3>
</div>

<div class="panel-body">

    <div class="page-header">
        <form class="frmPersonalInfo" method="post" action="processEditUser">
            <h2 class="form-signin-heading">User Information</h2>
            <h4>To modify a field please indicate the change on the right side.</h4><br>
            <div class="row">
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="txtFirstName" name="txtFirstName" placeholder="First Name" ><br>
                    <input type="text" class="form-control" id="txtLastName" name="txtLastName" placeholder="Last Name" ><br>
                    <input type="text" class="form-control" id="txtLogin" name="txtLogin" placeholder="Login"  ><br>
                    <input type="text" class="form-control" id="txtEmail" name="txtEmail" placeholder="Email" ><br>
                    <input type="text" class="form-control" id="txtPassword" name="txtPassword" placeholder="Password"  ><br>
                    Access Roles:<br>
                    <input type="checkbox" name="chkEmployer" id="chkEmployer" value="employer" > Employer<br>
                    <input type="checkbox" name="chkStaff" id="chkStaff"  value="Staff" > Staff<br>
                    <input type="checkbox" name="chkStudent" id="chkStudent"  value="Student" > Student<br>

                    <br>

                    User Status:<br>
                    <input type="radio" id="radStatusEnabled" name="radStatus" value="enabled" > Enabled<br>
                    <input type="radio" id="radStatusabled" name="radStatus" value=disabled"" > Disabled
                    <br>
                </div> 
            </div>
            <br>
            <button class="btn btn-lg btn-primary" type="submit" name="btnSubmitPersonalInfo" id="btnSubmitPersonalInfo">Submit Change</button>
        </form><br>

    </div>
    <script language="javascript">
        var $restPath = "rest/viewEditUser?userID=<%out.print(userID);%>";

        $(document).ready(function () {

            getJsonFromWebService($restPath);

            function getJsonFromWebService(targetUrl) {
                console.log(targetUrl);
                xhr = jQuery.ajax({
                    type: "GET",
                    url: targetUrl,
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    success: function (data, status, jqXHR) {
                        console.log(data);
                        fillabledFields(data);
                    },
                    error: function (jqXHR, status) {
                        console.log(status);
                    }
                });
            }

            function fillabledFields(data) {
                $("#txtFirstName").val(data[0].firstName);
                $("#txtLastName").val(data[0].lastName);
                $("#txtLogin").val(data[0].login);
                $("#txtEmail").val(data[0].email);
                $("#txtPassword").val("***encrypted***");

                if(data[0].userType === "Employer"){
                    $("#chkEmployer").prop('checked', true);
                }
                
                 if(data[0].userType === "Staff"){
                    $("#chkStaffr").prop('checked', true);
                }
                
                 if(data[0].userType === "Student"){
                    $("#chkStudent").prop('checked', true);
                }
                
                if(data[0].enabled === false){
                    $("#radStatusabled").prop('checked', true);
                }
                else{
                    $("#radStatusEnabled").prop('checked', true);
                }


            }
        });
    </script> 
    <%@ include file="includes/footer.jsp" %>
