<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Login</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/custom.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" type="text/css">
    </head>


    <body>

        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span></button> <a class="navbar-brand" href="#">Resume Management System</a>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown"><ul class="nav navbar-nav">
                                <li class=""><a href="register.html">Create Account</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </div>


        <div class="container theme-showcase">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><strong>Login</strong></h3>
                </div><div class="panel-body"><div class="page-header">
                        <form class="form-signin" method="post" action="login">
                            <h2 class="form-signin-heading">Login</h2><br>
                            <input type="email" name="txtEmailAddress" id="txtEmailAddress" class="form-control" placeholder="Email address" required="required" autofocus>
                            <br>
                            <input type="password" name="txtPassword" id="txtPassword" class="form-control" placeholder="Password" required="required">
                            <label class="checkbox">
                                <input type="checkbox" value="remember-me"> Remember me
                            </label>
                            <hr>
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button></form><br> </div>
                </div><!-- /container -->
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
    </body>
</html>