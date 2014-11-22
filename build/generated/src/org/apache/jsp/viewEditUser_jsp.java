package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.utilities.Security;

public final class viewEditUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }

    String userID = request.getParameter("userID");
    session.setAttribute("selectedUserID", userID);
    System.out.println(session.getAttribute("selectedUserID"));


      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>RMS </title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        \r\n");
      out.write("        <!--Stylesheet for Resume-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css\" media=\"all\" />\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"sr-only\">Toggle navigation</span></button> <a class=\"navbar-brand\" href=\"#\">Resume Management System</a>\r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"dropdown\"><ul class=\"nav navbar-nav\">\r\n");
      out.write("                                <li class=\"\"><a href=\"register.jsp\">Create Account</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"mainContainer\" class=\"container theme-showcase\" style=\"width:900px\">\r\n");
      out.write("            <div class=\"panel panel-primary\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"panel-heading\">\r\n");
      out.write("    <h3 class=\"panel-title\"><strong>View/Edit</strong></h3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-header\">\r\n");
      out.write("        <form class=\"frmPersonalInfo\" method=\"post\" action=\"processEditUser\">\r\n");
      out.write("            <h2 class=\"form-signin-heading\">User Information</h2>\r\n");
      out.write("            <h4>To modify a field please indicate the change on the right side.</h4><br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtFirstNameDis\" name=\"txtFirstNameDis\" placeholder=\"First Name\" disabled><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtLastNameDis\" name=\"txtLastNameDis\" placeholder=\"Last Name\" disabled><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtLoginDis\" name=\"txtLoginDis\" placeholder=\"Login\" disabled ><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtEmailDis\" name=\"txtEmailDis\" placeholder=\"Email\" disabled><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtPasswordDis\" name=\"txtPasswordDis\" placeholder=\"Password\" disabled ><br>\r\n");
      out.write("                    Access Roles:<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chkEmployer\" id=\"chkEmployerDis\" value=\"employer\" disabled> Employer<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chkStaff\" id=\"chkStaffDis\"  value=\"Staff\" disabled> Staff<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chkStudent\" id=\"chkStudentDis\"  value=\"Student\" disabled> Student<br>\r\n");
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("\r\n");
      out.write("                    User Status:<br>\r\n");
      out.write("                    <input type=\"radio\" id=\"radStatusEnabledDis\" name=\"radStatusDis\" value=\"enabled\" disabled> Enabled<br>\r\n");
      out.write("                    <input type=\"radio\" id=\"radStatusDisabledDis\" name=\"radStatusDis\" value=\"disabled\" disabled> Disabled\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"col-xs-2\">\r\n");
      out.write("                </div>    \r\n");
      out.write("                <div class=\"col-xs-4\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtFirstName\" name=\"txtFirstName\" placeholder=\"First Name\"><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtLastName\" name=\"txtLastName\" placeholder=\"Last Name\"><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtLogin\" name=\"txtLogin\" placeholder=\"Login\"><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtEmail\" name=\"txtEmail\" placeholder=\"Email\" ><br>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtPassword\" name=\"txtPassword\" placeholder=\"Password\"><br>\r\n");
      out.write("                    Access Roles:<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chkEmployer\" id=\"chkEmployer\" value=\"employer\"> Employer<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chkStaff\" id=\"chkStaff\"  value=\"Staff\"> Staff<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chkStudent\" id=\"chkStudent\"  value=\"Student\"> Student<br>\r\n");
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("\r\n");
      out.write("                    User Status:<br>\r\n");
      out.write("                    <input type=\"radio\" id=\"radStatusEnabled\" name=\"radStatus\" value=\"enabled\"> Enabled<br>\r\n");
      out.write("                    <input type=\"radio\" id=\"radStatusDisabled\" name=\"radStatus\" value=\"disabled\"> Disabled\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button class=\"btn btn-lg btn-primary\" type=\"submit\" name=\"btnSubmitPersonalInfo\" id=\"btnSubmitPersonalInfo\">Submit Change</button>\r\n");
      out.write("        </form><br>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("        var $restPath = \"rest/viewEditUser?userID=");
out.print(userID);
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("\r\n");
      out.write("            getJsonFromWebService($restPath);\r\n");
      out.write("\r\n");
      out.write("            function getJsonFromWebService(targetUrl) {\r\n");
      out.write("                console.log(targetUrl);\r\n");
      out.write("                xhr = jQuery.ajax({\r\n");
      out.write("                    type: \"GET\",\r\n");
      out.write("                    url: targetUrl,\r\n");
      out.write("                    contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("                    dataType: \"json\",\r\n");
      out.write("                    success: function (data, status, jqXHR) {\r\n");
      out.write("                        console.log(data);\r\n");
      out.write("                        fillDisabledFields(data);\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function (jqXHR, status) {\r\n");
      out.write("                        console.log(status);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function fillDisabledFields(data) {\r\n");
      out.write("                $(\"#txtFirstNameDis\").val(data[0].firstName);\r\n");
      out.write("                $(\"#txtLastNameDis\").val(data[0].lastName);\r\n");
      out.write("                $(\"#txtLoginDis\").val(data[0].login);\r\n");
      out.write("                $(\"#txtEmailDis\").val(data[0].email);\r\n");
      out.write("                $(\"#txtPasswordDis\").val(\"***encrypted***\");\r\n");
      out.write("\r\n");
      out.write("                if(data[0].userType === \"Employer\"){\r\n");
      out.write("                    $(\"#chkEmployerDis\").prop('checked', true);\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                 if(data[0].userType === \"Staff\"){\r\n");
      out.write("                    $(\"#chkStaffrDis\").prop('checked', true);\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                 if(data[0].userType === \"Student\"){\r\n");
      out.write("                    $(\"#chkStudentDis\").prop('checked', true);\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                if(data[0].enabled === false){\r\n");
      out.write("                    $(\"#radStatusDisabledDis\").prop('checked', true);\r\n");
      out.write("                }\r\n");
      out.write("                else{\r\n");
      out.write("                    $(\"#radStatusEnabledDis\").prop('checked', true);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script> \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div><!-- /container -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JavaScript\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
