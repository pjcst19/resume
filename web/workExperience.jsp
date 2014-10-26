<%-- 
    Document   : workExperience
    Created on : Apr 15, 2014, 9:08:49 PM
    Author     : Mandy
--%>

<%@page import="edu.pitt.utilities.Security"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    //Security security = new Security();
    //if (security.checkHijackedSession(session, request)){
	//response.sendRedirect("index.jsp");
//}

     //if (Security.checkHijackedSession(session, request)) {
        //response.sendRedirect("index.jsp");
    //}

%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

    <title>Work Experience</title><!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/custom.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" type="text/css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/jquery-1.10.2.js"></script>
    <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
    
    <!--Presents a date picker for the Start and End Date fields-->
    <script>
        $(function() {
            $( ".datepicker" ).datepicker();
        });
    </script>
    
        <!--Loads the WorkExperience Form-->
    <script>
        $(document).ready(function(){
            $("#workExpForm").load("workExpForm.html");
          });
    </script>
    
    <!--When "Add Work Experience" button is pressed, adds an additional form to allow the user to input multiple work entries-->
     <script type='text/javascript'>
        $(document).ready(function (){
            $('#btnAddWorkExp').click(function() {
            $('#additionalWorkExp').append($('<div>').load('workExpForm.html'));            
            return false;
            });
    });
    </script>
    
    
    <!--Submits all forms on page -->
    <script>
        function post_form_data(data) {
            $.ajax({
                type: 'POST',
                url: 'processWorkExperience',
                data: data,
                async: false
                //success: ,
                //error:
            });
        }//end of post_form_data
        
        
        //When Next button is clicked, all forms on page are submitted for processing
        function submitEdu(){
        //$('btnSubmit').on('click', function () {
            $('form').each(function () {
                post_form_data($(this).serialize());
            });
            window.location.href='menu.jsp';
            
        };
    </script>
    
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
                
                <div id="page-header">
                    
                    <h2 class="form-signin-heading">Work Experience</h2><br>

                    
                        <div id="workExpForm">

                        </div>
                       
                        <br>
                        
                        <div id="additionalWorkExp">
                            
                        </div>

                       
                        <button class="btn btn-lg btn-primary" type="button" onclick="window.location.href='education.jsp'">Back</button>
                        <button class="btn btn-lg btn-primary" type="button" id="btnAddWorkExp">Add Work Experience</button>
                        <button class="btn btn-lg btn-primary" type="submit" onclick="submitEdu();">Next</button> <!--Where do we go from here? -->
                    
                </div>
            </div><!-- /container -->
        </div>
    </div>
</body>
</html>
