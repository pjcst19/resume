<%--
    Document   : personalInfo
    Created on : Apr 15, 2014, 9:02:43 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    if (Security.checkHijackedSession(session, request)) {
                response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

    <title>Resume Management System - Personal Information</title><!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/custom.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" type="text/css">
</head>

<body>
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span></button> <a class="navbar-brand" href="#">Student Resume System</a>
            </div>

            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.php">Home</a></li>
                    <li><a href="#">Create Resume</a></li>
                    <li><a href="#">Edit Resume</a></li>
                    <li><a href="#">View Resume</a></li>


                    
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>

    <div class="container theme-showcase" style="width:900px">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title"><strong>Create Your Resume</strong></h3>
            </div>

            <div class="panel-body">
                
                <div class="page-header">
                    <form class="frmPersonalInfo" method="post" action="processPersonalInfo">
                        <h2 class="form-signin-heading">Personal Information</h2><br>
                        <input type="text" class="form-control" id="txtFirstName" name="txtFirstName" placeholder="First Name" autofocus="" required><br>
                        <input type="text" class="form-control" id="txtLastName" name="txtLastName" placeholder="Last Name" required><br>
                        <input type="text" class="form-control" id="txtAddressLine1" name="txtAddressLine1" placeholder="Street Address" required><br>
                        <input type="text" class="form-control" id="txtAddressLine2" name="txtAddressLine2" placeholder="Address"><br>
                        <input type="text" class="form-control" id="txtCity" name="txtCity" placeholder="City" required style="width:50%; display:inline">
                                 
                        <select class="form-control" id="txtState" name="txtState" required style="width:49%; display:inline">
                            <option value="">State</option>
                            <option value="AL">Alabama</option>
                            <option value="AK">Alaska</option>
                            <option value="AZ">Arizona</option>
                            <option value="AR">Arkansas</option>
                            <option value="CA">California</option>
                            <option value="CO">Colorado</option>
                            <option value="CT">Connecticut</option>
                            <option value="DE">Delaware</option>
                            <option value="DC">District Of Columbia</option>
                            <option value="FL">Florida</option>
                            <option value="GA">Georgia</option>
                            <option value="HI">Hawaii</option>
                            <option value="ID">Idaho</option>
                            <option value="IL">Illinois</option>
                            <option value="IN">Indiana</option>
                            <option value="IA">Iowa</option>
                            <option value="KS">Kansas</option>
                            <option value="KY">Kentucky</option>
                            <option value="LA">Louisiana</option>
                            <option value="ME">Maine</option>
                            <option value="MD">Maryland</option>
                            <option value="MA">Massachusetts</option>
                            <option value="MI">Michigan</option>
                            <option value="MN">Minnesota</option>
                            <option value="MS">Mississippi</option>
                            <option value="MO">Missouri</option>
                            <option value="MT">Montana</option>
                            <option value="NE">Nebraska</option>
                            <option value="NV">Nevada</option>
                            <option value="NH">New Hampshire</option>
                            <option value="NJ">New Jersey</option>
                            <option value="NM">New Mexico</option>
                            <option value="NY">New York</option>
                            <option value="NC">North Carolina</option>
                            <option value="ND">North Dakota</option>
                            <option value="OH">Ohio</option>
                            <option value="OK">Oklahoma</option>
                            <option value="OR">Oregon</option>
                            <option value="PA">Pennsylvania</option>
                            <option value="RI">Rhode Island</option>
                            <option value="SC">South Carolina</option>
                            <option value="SD">South Dakota</option>
                            <option value="TN">Tennessee</option>
                            <option value="TX">Texas</option>
                            <option value="UT">Utah</option>
                            <option value="VT">Vermont</option>
                            <option value="VA">Virginia</option>
                            <option value="WA">Washington</option>
                            <option value="WV">West Virginia</option>
                            <option value="WI">Wisconsin</option>
                            <option value="WY">Wyoming</option>
                            <option value="AS">American Samoa</option>
                            <option value="GU">Guam</option>
                            <option value="MP">Northern Mariana Islands</option>
                            <option value="PR">Puerto Rico</option>
                            <option value="UM">United States Minor Outlying Islands</option>
                            <option value="VI">Virgin Islands</option>
                        </select><br><br>
                        
                                             
                        
                        <input type="text" class="form-control" id="txtProvince" name="txtProvince" placeholder="Province" style="width:40%; display:inline">
                        <input type="text" class="form-control" id="txtCountry" name="txtCountry" placeholder="Country" style="width:38%; display:inline">
                        <input type="text" class="form-control" id="txtPostalCode" name="txtPostalCode" placeholder="Postal Code" required style="width:20%; display:inline"><br><br>
                        <input type="tel" class="form-control" id="txtPhone" name="txtPhone" placeholder="Phone Number" required style="width:50%; display:inline">
                        <input type="email" class="form-control" id="txtEmail" name="txtEmail" placeholder="Email" required style="width:49%; display:inline"><br><br>
                        
                        <label> Are You Legally Eligible to Work in the US?</label>
                            <input type="radio" id="radUSEligibleTrue" name="radUSEligible" value="true" required> Yes
                            <input type="radio" id="radUSEligibleFalse" name="radUSEligible" value="false" required> No<br><br>
                            
                        <label> Can you provide evidence of your legal eligibility to work in the US? </label>
                            <input type="radio" id="radWkEvidenceTrue" name="radWkEvidence" value="true" required> Yes
                            <input type="radio" id="radWkEvidenceFalse" name="radWkEvidence" value="false" required> No<br><br>

                        <button class="btn btn-lg btn-primary" type="submit" name="btnSubmitPersonalInfo" id="btnSubmitPersonalInfo">Next</button>
                    </form><br>
                    
                </div>
            </div><!-- /container -->
        </div>
    </div>
</body>
</html>
