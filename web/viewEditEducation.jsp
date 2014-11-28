<%-- 
    Document   : knocktest
    Created on : Nov 27, 2014, 10:45:33 AM
    Author     : jordansfeldman
--%>

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

                self.EducationList = ko.observableArray();
                $.each(data.EducationList, function (i, val) {
                    self.EducationList.push(new EducationModel(val.educationID, val.minor, val.field, val.graduationDate, val.created, val.modified, val.name, val.gpa, val.type));
                });

                self.resumes.push({
                    resumeID: ko.observable(data.resumeID),
                    created: ko.observable(data.created),
                    modified: ko.observable(data.modified),
                    rating: ko.observable(data.rating),
                    EducationList: self.EducationList
                });
            });
        };
        function EducationModel(educationID, minor, field, graduationDate, created, modified, name, gpa, type) {
            var self = this;
            return{
                educationID: ko.observable(educationID),
                minor: ko.observable(minor),
                field: ko.observable(field),
                graduationDate: ko.observable(graduationDate),
                created: ko.observable(created),
                modified: ko.observable(modified),
                name: ko.observable(name),
                gpa: ko.observable(gpa),
                type: ko.observable(type)
            };
        }

        ko.applyBindings(new ResumeModel());
    });</script>

<script>
    $(function () {
        $(".datepicker").datepicker();
    });
</script>


<div class="panel-heading">
            <h3 class="panel-title"><strong>Edit Your Resume</strong></h3>
        </div>

        <div class="panel-body">

            <div id="page-header">
                <h2 class="form-signin-heading">Education</h2><br>
                
    <div data-bind="foreach: resumes">
        <!--            Resume ID: <input data-bind="value: resumeID"><br/>-->
        <div data-bind="foreach: EducationList">

            <form class="form-signin" method="post" action="processEducation">


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

                <label> Major </label><input data-bind="value: field" type="text" class="form-control" id="txtMajorType" name="txtMajorType" placeholder="Major" required style="width:34%; display:inline">
                <label> Minor/Related Area </label><input data-bind="value: minor" type="text" class="form-control" id="txtMinorType" name="txtMinorType" placeholder="Minor or Related Area" style="width:34%; display:inline"><br><br>

                <label> GPA </label><input data-bind="value: gpa" type="number" class="form-control" id="txtGPA" name="txtGPA" placeholder="GPA" min="0" max="4" step="0.1" style="width:20%; display:inline" required>
                <label> Graduation Date </label><input data-bind="value: graduationDate" type="text" class="form-control datepicker" id="txtGraduationDate" name="txtGraduationDate" placeholder="Graduation Date" required style="width:20%; display:inline">


                <br><br>

            </form><br>
       
        </div>
    </div>
    <pre data-bind="text: ko.toJSON($root.resumes, null, 2)"></pre>


    <%@ include file="includes/header.jsp" %>