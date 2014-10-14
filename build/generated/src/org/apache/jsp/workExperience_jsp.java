package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.utilities.Security;

public final class workExperience_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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


    //Security security = new Security();
    //if (security.checkHijackedSession(session, request)){
	//response.sendRedirect("index.jsp");
//}

     //if (Security.checkHijackedSession(session, request)) {
        //response.sendRedirect("index.jsp");
    //}


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../../docs-assets/ico/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>Work Experience</title><!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <script src=\"//code.jquery.com/ui/1.11.1/jquery-ui.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!--Presents a date picker for the Start and End Date fields-->\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $( \".datepicker\" ).datepicker();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("    <!--When \"Add Work Experience\" button is pressed, adds an additional form to allow the user to input multiple work entries-->\r\n");
      out.write("     <script type='text/javascript'>\r\n");
      out.write("        $(document).ready(function (){\r\n");
      out.write("            $('#btnAddWorkExp').click(function() {\r\n");
      out.write("            $('#additionalWorkExp').append($('<div>').load('workExpForm.html'));            \r\n");
      out.write("            return false;\r\n");
      out.write("            });\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!--Iterates through forms and submits data from each one individually to the database-->\r\n");
      out.write("    <script>\r\n");
      out.write("    function submitWork() {\r\n");
      out.write("        $('form').each(function() {\r\n");
      out.write("        var work = $(this);\r\n");
      out.write("        $.post(work.attr('action'), work.serialize());\r\n");
      out.write("        });\r\n");
      out.write("        window.location.href='workExperience.jsp';    \r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"sr-only\">Toggle navigation</span></button> <a class=\"navbar-brand\" href=\"#\">Student Resume System</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"index.php\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Create Resume</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Edit Resume</a></li>\r\n");
      out.write("                    <li><a href=\"#\">View Resume</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container theme-showcase\" style=\"width:900px\">\r\n");
      out.write("        <div class=\"panel panel-primary\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("                <h3 class=\"panel-title\"><strong>Create Your Resume</strong></h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"page-header\">\r\n");
      out.write("                    <form class=\"form-signin\" method=\"post\" action=\"processWorkExperience\">\r\n");
      out.write("                        <h2 class=\"form-signin-heading\">Work Experience</h2><br>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                        <label> Work Experience </label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtBusinessName\" name=\"txtBusinessName\" placeholder=\"Employer\" required autofocus=\"\"><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtPosition\" name=\"txtPosition\" placeholder=\"Position\" required><br>\r\n");
      out.write("                        <label style=\"display:inline\"> Start Date </label><input type=\"date\" class=\"form-control datepicker\" id=\"txtStartDate\" name=\"txtStartDate\" required style=\"width:20%; display:inline\">\r\n");
      out.write("                        <label style=\"display:inline\"> End Date </label><input type=\"date\" class=\"form-control datepicker\" id=\"txtEndDate\" name=\"txtEndDate\" required style=\"width:20%; display:inline\">\r\n");
      out.write("                        <label style=\"display:inline\">Currently Employed? </label>\r\n");
      out.write("                        <input type=\"radio\" class=\"form-control\" id=\"rdoCurrentlyEmployed\" name=\"rdoCurrentlyEmployed\" value=\"Yes\" style=\"width:5%; display:inline\"> Yes\r\n");
      out.write("                        <input type=\"radio\" class=\"form-control\" id=\"rdoCurrentlyEmployed\" name=\"rdoCurrentlyEmployed\" value=\"No\" style=\"width:5%; display:inline\" checked> No<br><br>\r\n");
      out.write("                        \r\n");
      out.write("                        <label style=\"display:inline\"> Description of Work </label><br>\r\n");
      out.write("                        <textarea class=\"form-control\" rows=\"6\" id=\"txtWorkDescription\" name=\"txtWorkDescription\" placeholder=\"Description of Work Experience\" required></textarea><br>\r\n");
      out.write("                        \r\n");
      out.write("                        <!--<label> Awards </label><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"datepicker\" name=\"txtAwardName\" placeholder=\"Award/Recognition\" style=\"width:49%; display:inline\"><br><br>\r\n");
      out.write("                        <textarea class=\"form-control\" rows=\"6\" id=\"datepicker\" name=\"txtAwardDescription\" placeholder=\"Description of Award\"></textarea><br>\r\n");
      out.write("                        -->\r\n");
      out.write("                       \r\n");
      out.write("                        <br>\r\n");
      out.write("                        \r\n");
      out.write("                        <div id=\"additionalWorkExp\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary\" type=\"button\" onclick=\"window.location.href='education.jsp'\">Back</button>\r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary\" type=\"button\" id=\"btnAddWorkExp\">Add Work Experience</button>\r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary\" type=\"submit\" onclick=\"submitWork();\">Next</button> <!--Where do we go from here? -->\r\n");
      out.write("                    </form><br>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!-- /container -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
