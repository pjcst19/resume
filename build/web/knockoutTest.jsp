<%-- 
    Document   : knockoutTest
    Created on : Nov 26, 2014, 8:36:23 PM
    Author     : Mandy
--%>

<%-- 
    Document   : rivetstest
    Created on : Nov 25, 2014, 1:16:29 PM
    Author     : Mandy
--%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="includes/header.jsp" %>


<%

    String userID = "ed04c3b1-c3e5-11e3-a2b0-040106a8dc01";

%>


<script language="javascript">
    var userData;
    //Gets resume as JSON from web service based on resumeID
    $(document).ready(function () {
        getJsonFromWebService("rest/userInfows?usereID=<%out.print(userID);%>");
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
                userData = data;
                jsonToHtmlLayout();
                console.log(userData);
                console.log("success");
            },
            error: function (jqXHR, status) {
                console.log(status);
                console.log("Error");
            }
        });
    }




</script>

//Knockout Code
<script language="javascript">
    //Knockout Code
    function User(data) {
        this.firstName = ko.observable(userData.firstName);
        this.lastName = ko.observable(userData.lastName);
//        this.major = ko.observable(data.EducationList[i].major);
    }

    function UserViewModel() {
        // Data
        var self = this;
        self.user = ko.observableArray([]);

        //Hard Coded for testing
        $.getJSON("rest/userInfows?=ed04c3b1-c3e5-11e3-a2b0-040106a8dc01", function (allData) {
            var mappedUser = $.map(allData, function (item) {
                return new User(item);

            });
            self.user(mappedUser);
        });
    }

    ko.applyBindings(new UserViewModel());


</script>


<div id="user">
    <ul data-bind="foreach: user, visible: user().length > 0">
        <li>
            <input data-bind="value: firstName" />
        </li> 
    </ul>

</div>






<%@ include file="includes/header.jsp" %>