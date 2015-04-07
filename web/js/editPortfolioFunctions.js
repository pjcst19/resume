var data;
var finalJSON;
$(document).ready(function () {
    PortfolioModel = function () {
        var self = this;
        self.portfolios = ko.observableArray();
        $.getJSON("../rest/portfolioews?portfolioID=" + portfolioID, function (json) {
            data = json;

            self.ProjectList = ko.observableArray();
            $.each(data.ProjectList, function (i, val) {
                self.ProjectList.push(new ProjectModel(val.projectID, val.name, val.description, val.startDate, val.endDate, val.media, val.created, val.modified));
            });

            self.ResearchList = ko.observableArray();
            $.each(data.ResearchList, function (i, val) {
                self.ResearchList.push(new ResearchModel(val.researchID, val.researchtype, val.title, val.submissonDate, val.publishedDate, val.publishlink, val.created, val.modified));
            });

            self.portfolios.push({
                portfolioID: ko.observable(data.portfolioID),
                created: ko.observable(data.created),
                modified: ko.observable(data.modified),
                rating: ko.observable(data.rating),
                userID: ko.observable(data.userID),
                ProjectList: self.ProjectList,
                ResearcheList: self.ResearchList
            });
        });
    };
    
   
    function ProjectModel(projectID, name, description, startDate, endDate, media, created, modified) {
        var self = this;
        return{
            educationID: ko.observable(educationID),
            name: ko.observable(name),
            description: ko.observable(description),
            startDate: ko.observable(startDate),
            endDate: koobservable(endDate),
            media: ko.observable(media),
            created: ko.observable(created),
            modified: ko.observable(modified)
        };
    }

    function ResearchModel(researchID, researchtype, title, summary, submissionDate, publishDate, publishlink, created, modified) {
        var self = this;
        return{
            reserachID: ko.observable(researchID),
            researchtype: ko.observable(researchtype),
            title: ko.observable(title),
            summary: ko.observable(summary),
            submissionDate: ko.observable(submissionDate),
            publishedDate: ko.observable(publishedDate),
            publishlink: ko.observable(publishlink),
            created: ko.observable(created),
            modified: ko.observable(modified)
        };
    }

    ko.applyBindings(new PortfolioModel());
});