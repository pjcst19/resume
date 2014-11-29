<%-- 
    Document   : knocktest
    Created on : Nov 27, 2014, 10:45:33 AM
    Author     : jordansfeldman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
        <script src="js/knockout-3.2.0.js"></script>
        <script src="js/knockout.mapping.js"></script>
        <script>
            var data;
            var finalJSON;
            $(document).ready(function () {
                ResumeModel = function () {
                    var self = this;
                    self.resumes = ko.observableArray();
                    $.getJSON("rest/resumews?resumeID=ffb38a80-02a4-451c-82dc-7ceb7ca8d3c2", function (json) {
                        data = json;
                        
                        self.EducationList = ko.observableArray();
                        $.each(data.EducationList, function (i, val) {
                            self.EducationList.push(new EducationModel(val.educationID, val.major, val.minor, val.field, val.graduationDate, val.created, val.modified, val.name, val.gpa, val.type));
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
                function EducationModel(educationID, major, minor, field, graduationDate, created, modified, name, gpa, type) {
                    var self = this;
                    return{
                        educationID: ko.observable(educationID),
                        major: ko.observable(major),
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
        <title>JSP Page</title>
    </head>
    <body>
        <div data-bind="foreach: resumes">
            Resume ID: <input data-bind="value: resumeID"><br/>
            <div data-bind="foreach: EducationList">
                Education ID: <input data-bind="value: educationID"><br/>
                Name: <input data-bind="value: name"><br/>
                Major: <input data-bind="value: major"><br/>
                Minor: <input data-bind="value: minor"><br/>
                Field: <input data-bind="value: field"><br/>
                Type: <input data-bind="value: type"><br/>
                GPA: <input data-bind="value: gpa"><br/>
                Graduation Date: <input data-bind="value: graduationDate"><br/>
            </div>
        </div>
        <pre data-bind="text: ko.toJSON($root.resumes, null, 2)"></pre>
    </body>
</html>
