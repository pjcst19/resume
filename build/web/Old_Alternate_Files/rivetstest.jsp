<%-- 
    Document   : rivetstest
    Created on : Nov 25, 2014, 1:16:29 PM
    Author     : Mandy
--%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="includes/header.jsp" %>

<!--Security-->
<%
    String resumeID = "00b4443b-4903-489e-b486-2869bb5c317a";
//    if (Security.checkHijackedSession(session, request)) {
//        response.sendRedirect("index.jsp");
//    } else {
//        resumeID = request.getParameter("resumeID");
////    }
%>

<script language="javascript">
    var resumeData;
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
                resumeData = data;
                jsonToHtmlLayout();
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
    function jsonToHtmlLayout() {
        $education = $('#education');
        //$length = data['EducationList'].length;
        $length = resumeData.EducationList.length;
        //
//
        for (var i = 0; i < $length; i++) {
            resumeData.EducationList[i].minor;
            //what does the action have to be?
           $education.append('<form class="form-signin" method="post" action="processResume">');
           $education.append('<label> University</label>');
//           $education.append('<input type="text" rv-value="data[\'EducationList\'][i].name" class="form-control" rv-placeholder="data[\'EducationList\'][i].name" required autofocus=""><br>');
//           $education.append('<input data-text="resumeData.EducationList[i].major" class="form-control" id="txtMajorType" name="txtMajorType" placeholder="Major" required style="width:34%; display:inline">');
           $education.append('<input data-bind="value: resumeData.EducationList[i].minor" class="form-control" style="width:34%; display:inline"><br><br>');
//           $education.append('<input data-value="data[\'EducationList\'][i].gpa" type="number" class="form-control" id="txtGPA" name="txtGPA" placeholder="GPA" min="0" max="4" step="0.1" style="width:20%; display:inline" required>');
//           $education.append('<input data-value="data[\'EducationList\'][i].graduationDate" type="text" class="form-control datepicker" id="txtGraduationDate" name="txtGraduationDate" placeholder="Graduation Date" required style="width:20%; display:inline">');
           $education.append('</form><br>');
       }

//    <select class="form-control" id="txtDegreeType" name="txtDegreeType" required style="width:30%; display:inline">
//        <option rv-value="Associates">Associates</option>
//        <option rv-value="Bachelors">Bachelors</option>
//        <option rv-value="Masters">Masters</option>
//        <option rv-value="Doctorate">Doctorate</option>
//        <option rv-value="Certificate">Certificate</option>
//        <option rv-value="Diploma">Diploma</option>                              
//    </select>
//
//    <input rv-value=" class="form-control" id="txtMajorType" name="txtMajorType" placeholder="Major" required style="width:34%; display:inline">
//    <input rv-value= class="form-control" id="txtMinorType" name="txtMinorType" placeholder="Minor or Related Area" style="width:34%; display:inline"><br><br>
//
//    <input type="number" class="form-control" id="txtGPA" name="txtGPA" placeholder="GPA" min="0" max="4" step="0.1" style="width:20%; display:inline" required>
//    <input type="text" class="form-control datepicker" id="txtGraduationDate" name="txtGraduationDate" placeholder="Graduation Date" required style="width:20%; display:inline">
//
//
//    <br><br>
                            
  }
</script>

 <!--Submits all forms on page -->
    <script>
        function post_form_data(data) {
            $.ajax({
                type: 'POST',
                url: 'processResume',
                data: data,
                async: false
                //success: ,
                //error:
            });
        }//end of post_form_data
        
        
        //When Next button is clicked, all forms on page are submitted for processing
        function submitEduEdit(){
        //$('btnSubmit').on('click', function () {
            $('form').each(function () {
                post_form_data($(this).serialize());
            });
            window.location.href='viewPersonalResume.jsp?resumeID=<%out.print(resumeID);%>';
            
        };
    </script>

<div id="education">                        
                        
</div>
    
    <button class="btn btn-lg btn-primary" type="button" id="btnEducation" onclick="window.location.href='listResumes.jsp?userID=<%out.print(resumeID);%>'">Back</button>
    <button class="btn btn-lg btn-primary" type="submit" onclick="submitEduEdit();" id="btnSubmit" name="btnSubmit">Next</button>





<%@ include file="includes/header.jsp" %>