<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String errorMessage = "";
    if (session.getAttribute("errorMessage") != null && session != null) {
        errorMessage = "<div class=\"alert alert-warning\" role=\"alert\">" + session.getAttribute("errorMessage") + "</div>";
    }
%>
<%@ include file="includes/header.jsp" %>

<div class="panel-heading">
    <h3 class="panel-title"><strong>Login</strong></h3>
</div><div class="panel-body"><div class="page-header">
        <form class="form-signin" method="post" action="login">
            <h2 class="form-signin-heading">Login</h2><br>
            <% out.print(errorMessage);%>
            <input type="text" name="txtEmailAddress" id="txtEmailAddress" class="form-control" placeholder="Email address" required="required" autofocus>
            <br>
            <input type="password" name="txtPassword" id="txtPassword" class="form-control" placeholder="Password" required="required">
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> Remember me
            </label>
            <hr>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button></form><br> </div>
            
<%@ include file="includes/footer.jsp" %>