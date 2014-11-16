<%-- 
    Document   : viewResumePersonal
    Created on : Apr 15, 2014, 7:37:39 PM
    Author     : jordanstevenfeldman
--%>
<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    } else {

    }
%>

<%@ include file="includes/header.jsp" %>



<script language="javascript">
    $(document).ready(function () {
        getJsonFromWebService("rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a");
    });
    
    $(document).ready(function () {$('.phone').text(function(i, text) {
        return text.replace(/(\d{3})(\d{3})(\d{4})/, '$1-$2-$3');
        });
    });
    
    $("#txtDate").val($.datepicker.formatDate('dd M yy', new Date()));
        
        
    function getJsonFromWebService(targetUrl) {
        console.log(targetUrl);
        jQuery.ajax({
            type: "GET",
            url: targetUrl,
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (data, status, jqXHR) {
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


    function jsonToHtmlLayout(data) {
        $resume = $('#resumeContainer');
        $userName = $('#userName');
        $contactInfo = $('#contactInfo');
        $education = $('#education');
        $workExperience = $('#workExperience');
        
        

        for (var i = 0; i < data.length-1; i++) {

            $userName.append('<h1><strong>' + data[i].firstName + " " + data[i].lastName + '</strong></h1>');
            for (var j = 0; j < data[i]['addresses'].length; j++) {
                $userName.append('<h3>' + data[i]['addresses'][j].addressLine1 + ' ' + data[i]['addresses'][j].addressLine2 + ' ' + data[i]['addresses'][j].city +
                        ', ' + data[i]['addresses'][j].state + ' ' +  data[i]['addresses'][j].province + ' ' + + data[i]['addresses'][j].postalCode + '</h3>');
            }
            
            $contactInfo.append('<h3><a id="pdf" href="#">Download PDF</a></h3>');
            $contactInfo.append('<h3>' + data[i].email + '</h3>');
            $contactInfo.append('<h3 class="phone">' + data[i].phoneNumber + '</h3>');




//            $resume.append('<div class="col-md-4">');
//            //*********************************************************
//
//
//            //*************************************************************************************
//            $resume.append('<div class="yui-gf">');
//            $resume.append('<div class="yui-u first">');
//            $resume.append('<h2> Education </h2>');
//            $resume.append('</div>');
//
//
//            $resume.append('<div class="yui-u">');
//
//
//            console.log(data[1]['EducationList'][0].name);

                            for (var j = 0; j < data[1]['EducationList'].length; j++){
                                $education.append('<div class="edu">');
                                $education.append('<h2>' + data[1]['EducationList'][j].name  + '</h2><h4>' + data[1]['EducationList'][j].graduationDate + '</h4>');
                                $education.append('<h3>'+ data[1]['EducationList'][j].type + ', ' + data[1]['EducationList'][j].field + '</h3>');
                                //Need to handle major
                                $education.append('<h3><strong> GPA:' + data[1]['EducationList'][j].gpa + '</strong></h3>');
                                $education.append('</div>');
                            }


//
//                            $resume.append('</div>');
//
//
//                            $resume.append('<div class="yui-u first">');                       
//                            $resume.append('<h2> Work Experience </h2>');
//                            $resume.append('</div>');
//
//                            $resume.append('<div class="yui-u">');   

                            for (var j = 0; j<data[1].WorkExperienceList.length; j++){
                                $workExperience.append('<div class="job">');
                                $workExperience.append('<h2>' + data[1].WorkExperienceList[j].businessName + '</h2>');
                                $workExperience.append('<h3>' + data[1].WorkExperienceList[j].position + '</h3>');
                                $workExperience.append('<h4>' + data[1].WorkExperienceList[j].startDate + ' - ' + data[1].WorkExperienceList[j].endDate + '</h4>');
                                $workExperience.append('</div>');
                            }
                            

                            if(data[1].AwardList.length > 0){
                                $resume.append('<h3>Awards</h3>');
                            }

                            for (j=0; j<data[1].AwardList.length; j++){
                                $resume.append(data[1].AwardList[j].name + '<br>');
                                $resume.append(data[1].AwardList[j].description + '</div><br>');
//                            }



        $resume.append('</div>');
    }
}
    }



</script>


<!--<div class="panel-default" id="userName">
                        <h3 class="panel-heading"><strong>Resume</strong></h3>
</div>-->

<div class="panel-body">
    <div class="panel-body">

        <div class="page-header">
            <div id="resumeContainer" col-lg-12">
                 
                 <div id="doc2" class="yui-t7">
	<div id="inner">
	
		<div id="hd">
			<div class="yui-gc">
				<div class="yui-u first" id="userName">
					<!--User Name and Address Goes Here-->
				</div>

				<div class="yui-u">
					<div class="contact-info" id ="contactInfo">
						<!--User Phone and Email go Here-->
					</div><!--// .contact-info -->
				</div>
			</div><!--// .yui-gc -->
		</div><!--// hd -->

		<div id="bd">
			<div id="yui-main">
				<div class="yui-b">

                                        <div class="yui-gf">
						<div class="yui-u first" >
							<h2>Education</h2>
						</div>
                                            
                                            <div class="yui-u" id="education">
                                                    
                                           </div>
						<!--Education Information Goes Here-->
					</div><!--// .yui-gf education-->

					<div class="yui-gf">
	
						<div class="yui-u first">
							<h2>Experience</h2>
						</div><!--// .yui-u -->
                                                
                                           

						<div class="yui-u" id="workExperience">

							

							

						</div><!--// .yui-u -->
					</div><!--// .yui-gf -->


					


				</div><!--// .yui-b -->
			</div><!--// yui-main -->
		</div><!--// bd -->

	</div><!-- // inner -->


</div><!--// doc -->



       
        
        
           
        



</body>
</html>

        <%@ include file="includes/footer.jsp" %>
