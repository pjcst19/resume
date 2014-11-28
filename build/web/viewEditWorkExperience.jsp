<%-- 
    Document   : viewEditWorkExperience
    Created on : Nov 28, 2014, 12:17:28 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%
    String resumeID = "";
//    if (Security.checkHijackedSession(session, request)) {
//        response.sendRedirect("index.jsp");
//    } else {
    resumeID = request.getParameter("resumeID");
//    }
%>

<%@ include file="includes/header.jsp" %>

<script>
    var data;
    var finalJSON;
    $(document).ready(function () {
        ResumeModel = function () {
            var self = this;
            self.resumes = ko.observableArray();
            $.getJSON("rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a", function (json) {
                data = json;

                self.WorkExperienceList = ko.observableArray();
                $.each(data.WorkExperienceList, function (i, val) {
                    self.WorkExperienceList.push(new WorkExperienceModel(val.workExperienceID, val.businessName, val.position, val.startDate, val.endDate, val.created, val.modified, val.description, val.currentlyEmployed));
                });

                self.resumes.push({
                    resumeID: ko.observable(data.resumeID),
                    created: ko.observable(data.created),
                    modified: ko.observable(data.modified),
                    rating: ko.observable(data.rating),
                    WorkExperienceList: self.WorkExperienceList
                });
            });
        };


        function WorkExperienceModel(workExperienceID, businessName, position, startDate, endDate, created, modified, description, currentlyEmployed) {
            var self = this;
            return{
                workExperienceID: ko.observable(workExperienceID),
                businessName: ko.observable(businessName),
                position: ko.observable(position),
                startDate: ko.observable(startDate),
                endDate: ko.observable(endDate),
                created: ko.observable(created),
                modified: ko.observable(modified),
                description: ko.observable(description),
                currentlyEmployed: ko.observable(currentlyEmployed.toString()),
            };
        }

        ko.applyBindings(new ResumeModel());
    });</script>

<!--Presents a date picker for the Start and End Date fields-->
<script>
    $(function () {
        $(".datepicker").datepicker();
    });
</script>

<script>
    function SubmitWorkExperienceEdits() {
        finalJSON = ko.toJSON(ResumeModel);
        alert(finalJSON);
    }
    ;
</script>


<div class="panel-heading">
    <h3 class="panel-title"><strong>Edit Your Resume</strong></h3>
</div>

<div class="panel-body">

    <div id="page-header">
        <h2 class="form-signin-heading">Work Experience</h2><br>
        


        <form class="form-signin" method="post" data-bind="submit:SubmitWorkExperienceEdits">
            <% int i = 0;%>
            <div data-bind="foreach: resumes">
                <!--            Resume ID: <input data-bind="value: resumeID"><br/>-->

                 
                   
                     <% i+=1; %>

                <div data-bind="foreach: WorkExperienceList">
                    
                   <% i+=1;%>
                    
                    <form>
                        
                        <p> <%out.print(i);%> </p>

                        <label style="display:inline"> Business Name </label><br><input data-bind="value: businessName" type="text" class="form-control" id="txtBusinessName" name="txtBusinessName" placeholder="Employer" required autofocus=""><br>
                        <label style="display:inline"> Position </label><br><input data-bind="value: position" type="text" class="form-control" id="txtPosition" name="txtPosition" placeholder="Position" required><br>
                        <label style="display:inline"> Start Date </label><input data-bind="value: startDate" type="date" class="form-control datepicker" style="width:20%; display:inline">
                        <label style="display:inline"> End Date </label><input data-bind="value: endDate" type="date" class="form-control datepicker" style="width:20%; display:inline">

                        <!-- How do I deal with the Radio Button??-->
                        <label style="display:inline">Currently Employed? </label>
                        <input data-bind="checked: currentlyEmployed" type="radio"  id="rdoCurrentlyEmployed>" name="rdoCurrentlyEmployed<%out.print(i);%>" value="1" style="display:inline" required> Yes
                        <input data-bind="checked: currentlyEmployed" type="radio"  id="rdoCurrentlyEmployed" name="rdoCurrentlyEmployed<%out.print(i);%>" value="0" style="display:inline" required> No<br><br>

                        <label style="display:inline"> Description of Work </label><br>
                        <textarea data-bind="value: description" class="form-control" rows="6" id="txtWorkDescription" name="txtWorkDescription" placeholder="Description of Work Experience" required></textarea><br>

                    </form>
                        
                         

                </div>

            </div>

            <button class="btn btn-lg btn-primary" type="button" onclick="window.location.href='education.jsp'">Back</button>
            <button class="btn btn-lg btn-primary" type="submit">Next</button> <!--Where do we go from here? -->
        </form>
        <pre data-bind="text: ko.toJSON($root.resumes, null, 2)"></pre>

        <%@ include file="includes/footer.jsp" %>
