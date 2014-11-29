<%-- 
    Document   : viewEditResume
    Created on : Nov 28, 2014, 4:46:44 PM
    Author     : Mandy
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
<%@ include file="js/editResumeFunctions.js.jsp" %>

<!--<script src="js/editResumeFunctions.js" type="text/javascript"></script>-->
<script src="js/koDatePickerBinding.js"></script>
<script>

    function submitJSON(data) {
        $.ajax({
            type: 'POST',
            url: 'rest/processResume',
            data: {'resume': data},
            async: false
                    //success: ,
                    //error:
        });
    }
</script>


<div class="panel-heading">
    <h3 class="panel-title"><strong>Edit Your Resume</strong></h3>
</div>

<div class="panel-body">

    <div id="page-header">
        <h2 class="form-signin-heading">Education</h2><br>
    </div>

    <div data-bind="foreach: resumes">
        <!--            Resume ID: <input data-bind="value: resumeID"><br/>-->
        <div data-bind="foreach: EducationList">

            <label> University</label>
            <input data-bind="value: name" type="text" class="form-control" id="txtSchoolName" name="txtSchoolName" required autofocus=""><br>

            <select data-bind="value: type" class="form-control" id="txtDegreeType" name="txtDegreeType" required style="width:15%; display:inline">
                <option value="Associates">Associates</option>
                <option value="Bachelors">Bachelors</option>
                <option value="Masters">Masters</option>
                <option value="Doctorate">Doctorate</option>
                <option value="Certificate">Certificate</option>
                <option value="MA">Diploma</option>                              
            </select>

            <label> Major </label><input data-bind="value: field" type="text" class="form-control" id="txtMajorType" name="txtMajorType" placeholder="Major" required style="width:31%; display:inline">
            <label> Minor/Related Area </label><input data-bind="value: minor" type="text" class="form-control" id="txtMinorType" name="txtMinorType" placeholder="Minor or Related Area" style="width:31%; display:inline"><br><br>

            <label> GPA </label><input data-bind="value: gpa" type="number" class="form-control" id="txtGPA" name="txtGPA" placeholder="GPA" min="0" max="4" step="0.1" style="width:20%; display:inline" required>
            <label> Graduation Date </label><input data-bind="datepicker: graduationDate" type="text" class="form-control datepicker" id="txtGraduationDate" name="txtGraduationDate" placeholder="Graduation Date" required style="width:20%; display:inline">


            <br><br>

            <br>

        </div>

        <div id="page-header">
            <h2 class="form-signin-heading">Work Experience</h2><br>
        </div>

        <div data-bind="foreach: WorkExperienceList">

            <form>
                <label style="display:inline"> Business Name </label><br><input data-bind="value: businessName" type="text" class="form-control" id="txtBusinessName" name="txtBusinessName" placeholder="Employer" required autofocus=""><br>
                <label style="display:inline"> Position </label><br><input data-bind="value: position" type="text" class="form-control" id="txtPosition" name="txtPosition" placeholder="Position" required><br>
                <label style="display:inline"> Start Date </label><input data-bind="datepicker: startDate,  datepickerOptions: { maxDate: '+1M +1D'}" type="date" class="form-control datepicker" style="width:20%; display:inline">
                <label style="display:inline"> End Date </label><input data-bind="datepicker: endDate, datepickerOptions: { maxDate: '+1M +1D'}" type="date" class="form-control datepicker" style="width:20%; display:inline">

                <!-- How do I deal with the Radio Button??-->
                <label style="display:inline">Currently Employed? </label>
                <input data-bind="checked: currentlyEmployed" type="radio"  id="rdoCurrentlyEmployed>" name="rdoCurrentlyEmployed" value="1" style="display:inline" required> Yes
                <input data-bind="checked: currentlyEmployed" type="radio"  id="rdoCurrentlyEmployed" name="rdoCurrentlyEmployed" value="0" style="display:inline" required> No<br><br>

                <label style="display:inline"> Description of Work </label><br>
                <textarea data-bind="value: description" class="form-control" rows="6" id="txtWorkDescription" name="txtWorkDescription" placeholder="Description of Work Experience" required></textarea><br>
            </form>

        </div>




    </div>
    <pre data-bind="text: ko.toJSON($root.resumes, null, 2)"></pre>
    <button data-bind="click:  this.submitJSON(ko.toJSON($root.resumes, null, 2))">Submit</button>


    <%@ include file="includes/footer.jsp" %>