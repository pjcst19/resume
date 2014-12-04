<%-- 
    Document   : editResumeFunctions.js
    Created on : Nov 28, 2014, 10:18:13 PM
    Author     : jordansfeldman
--%>
<script>
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
    var data;
    var finalJSON;
    $(document).ready(function () {
        ResumeModel = function () {
            var self = this;
            self.resumes = ko.observableArray();
            $.getJSON("rest/resumews?resumeID=<%out.print(resumeID);%>", function (json) {
                data = json;

                self.EducationList = ko.observableArray();
                $.each(data.EducationList, function (i, val) {
                    self.EducationList.push(new EducationModel(val.educationID, val.minor, val.field, val.graduationDate, val.created, val.modified, val.name, val.gpa, val.type));
                });
                
                self.WorkExperienceList = ko.observableArray();
                $.each(data.WorkExperienceList, function (i, val) {
                    self.WorkExperienceList.push(new WorkExperienceModel(val.workExperienceID, val.businessName, val.position, val.startDate, val.endDate, val.created, val.modified, val.description, val.currentlyEmployed));
                });

                self.resumes.push({
                    resumeID: ko.observable(data.resumeID),
                    created: ko.observable(data.created),
                    modified: ko.observable(data.modified),
                    rating: ko.observable(data.rating),
                    userID: ko.observable(data.userID),
                    EducationList: self.EducationList,
                    WorkExperienceList: self.WorkExperienceList
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
                currentlyEmployed: ko.observable(currentlyEmployed.toString())
            };
        }

        ko.applyBindings(new ResumeModel());
    });
    </script>
    
    <!--Allows the user to show/hide each section of the resume when editing-->
<script>
    $(document).ready(function () {
        $("#editEduButton").click(function () {
            $("#editEduList").toggle();
        });
    });

    $(document).ready(function () {
        $("#editWorkButton").click(function () {
            $("#editWorkList").toggle();
        });
    });
    
</script>