<%-- 
    Document   : viewResumePersonal
    Created on : Apr 15, 2014, 7:37:39 PM
    Author     : jordanstevenfeldman
--%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Security-->
<%
    String resumeID = "";
    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    } else {
        resumeID = request.getParameter("resumeID");
    }
%>

<%@ include file="includes/header.jsp" %>

<script language="javascript">
    //Gets resume as JSON from web service based on resumeID
    $(document).ready(function () {
        getJsonFromWebService("rest/resumews?resumeID=<%out.print(resumeID);%>");
    });



    //Gets JSON from web service
    function getJsonFromWebService(targetUrl) {
        console.log(targetUrl);
        jQuery.ajax({
            type: "GET",
            url: targetUrl,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data, status, jqXHR) {
                getJSONForUser(data.userID);
                jsonToHtmlLayout(data);
                console.log(data);
                console.log("success");
            },
            error: function (jqXHR, status) {
                console.log(status);
                console.log("Error");
            }
        });
    }

    //Gets user as JSON from web service
    function getJSONForUser(userID) {
        console.log(userID);
        jQuery.ajax({
            type: "GET",
            url: "rest/userInfows?userID=" + userID,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data, status, jqXHR) {
                console.log(data);
                console.log("success");
            },
            error: function (jqXHR, status) {
                console.log(status);
                console.log("Error");
            }
        });
    }

    //Builds HTML layout using user and resume information from JSON
    function jsonToHtmlLayout(data) {
            $resume = $('#resumeContainer');
            $userName = $('#userName');
            $contactInfo = $('#contactInfo');
            $education = $('#education');
            $workExperience = $('#workExperience');
            $userName.append('<h1>' + data.firstName + " " + data.lastName + '</h1>');
            
            
            $contactInfo.append('<h3>' + data['addresses'].addressLine1 + ' ' + data['addresses'].addressLine2 + ' ' + data['addresses'].city +
                        ', ' + data['addresses'].state + ' ' +  data['addresses'].province + ' ' +  data['addresses'].postalCode + '</h3>');
                
            
            
            for (var i = 0; i < data['EducationList'].length; i++){
                $education.append('<h4>' + data['EducationList'][i].name + '</h4>');
                $education.append('<h5>' + data['EducationList'][i].graduationDate + '</h5>');
                $education.append('<h5>' + data['EducationList'][i].type + ', ' + data['EducationList'][i].field + '</h5>');
                //If the student has listed a minor
                if (data['EducationList'].minor !== null){
                    $education.append('<h5> Minor/Related Area: ' + data['EducationList'][i].minor + '</h5>');
                }

                $education.append('<h5> GPA:' + data['EducationList'][i].gpa + '</h5>');
                
            }
            
            
            for (var i = 0; i < data['WorkExperienceList'].length; i++){
                $workExperience.append('<h4>' + data['WorkExperienceList'][i].businessName + '</h4>');
                $workExperience.append('<h5>' + data['WorkExperienceList'][i].position + '</h5>');
                $workExperience.append('<h5>' + data['WorkExperienceList'][i].startDate + ' - ' + data['WorkExperienceList'][i].endDate + '</h5>');
                $workExperience.append('<p>' + data['WorkExperienceList'][i].description + '</p>');
            }


    }

</script>

<section class="resume">

    <!-- Header -->
    <header class="row">
        <div class="title span7" id="userName">
            <!--            <h1>John Smith</h1>-->
        </div>
        <div class="span4" id="contactInfo">
            Stationsplein, 1012 AB
            Amsterdam, The Netherlands
            info@email.com
            +4 8 15 16 23 42

        </div>	
    </header>


    <!-- Education -->
    <article class="row-fluid">
        <header class="span3">
            <h3>Education</h3>
        </header>
        <div class="span9" id="education">
            <!--Education Information Appears Here-->
        </div>
    </article>

    <!-- Work -->
    <article class="row">
        <header class="span3">
            <h3>Work Experience</h3>
        </header>
        <div class="span9" id="workExperience">
            <!--Work Experience Information Appears Here -->
        </div>
    </article>


    <!-- Footer -->
    <footer>
        <a href="#">Download as PDF</a> | <a href="#" onclick="javascript
                    :window.print();">Print</a>

    </footer>

</section><!--End of container-->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
<script src="assets/js/main.js"></script>




<%@ include file="includes/footer.jsp" %>
