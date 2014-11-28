package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewEditResumeAddress_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/header.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
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
      out.write("        <title>Resume Management System </title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <!--<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">-->\r\n");
      out.write("        \r\n");
      out.write("        <!--Stylesheet for Resume-->\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.1/jquery-ui.js\"></script>\r\n");
      out.write("        <script src=\"js/knockout-3.2.0.js\"></script>\r\n");
      out.write("        <script src=\"js/knockout.mapping.js\"></script>\r\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/editResumeFunctions.js\" type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        $(\".datepicker\").datepicker();\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel-heading\">\n");
      out.write("            <h3 class=\"panel-title\"><strong>Edit Your Resume</strong></h3>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("            <div id=\"page-header\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("    <div data-bind=\"foreach: resumes\">\n");
      out.write("        <!--            Resume ID: <input data-bind=\"value: resumeID\"><br/>-->\n");
      out.write("        \n");
      out.write("        <div data-bind=\"foreach: AddressList\">\n");
      out.write("        \n");
      out.write("        <!--**************************************************-->\n");
      out.write("                 <form class=\"form-signin\" method=\"post\" action=\"processEducation\">\n");
      out.write("                \n");
      out.write("             \n");
      out.write("                <label> Address</label>\n");
      out.write("                <input data-bind=\"value: name\" type=\"text\" class=\"form-control\" id=\"txtSchoolName\" name=\"txtSchoolName\" required autofocus=\"\"><br>\n");
      out.write("\n");
      out.write("                <select data-bind=\"value: type\" class=\"form-control\" id=\"txtDegreeType\" name=\"txtDegreeType\" required style=\"width:15%; display:inline\">\n");
      out.write("                    <option value=\"Associates\">Associates</option>\n");
      out.write("                    <option value=\"Bachelors\">Bachelors</option>\n");
      out.write("                    <option value=\"Masters\">Masters</option>\n");
      out.write("                    <option value=\"Doctorate\">Doctorate</option>\n");
      out.write("                    <option value=\"Certificate\">Certificate</option>\n");
      out.write("                    <option value=\"MA\">Diploma</option>                              \n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <label> Major </label><input data-bind=\"value: field\" type=\"text\" class=\"form-control\" id=\"txtMajorType\" name=\"txtMajorType\" placeholder=\"Major\" required style=\"width:34%; display:inline\">\n");
      out.write("                <label> Minor/Related Area </label><input data-bind=\"value: minor\" type=\"text\" class=\"form-control\" id=\"txtMinorType\" name=\"txtMinorType\" placeholder=\"Minor or Related Area\" style=\"width:34%; display:inline\"><br><br>\n");
      out.write("\n");
      out.write("                <label> GPA </label><input data-bind=\"value: gpa\" type=\"number\" class=\"form-control\" id=\"txtGPA\" name=\"txtGPA\" placeholder=\"GPA\" min=\"0\" max=\"4\" step=\"0.1\" style=\"width:20%; display:inline\" required>\n");
      out.write("                <label> Graduation Date </label><input data-bind=\"value: graduationDate\" type=\"text\" class=\"form-control datepicker\" id=\"txtGraduationDate\" name=\"txtGraduationDate\" placeholder=\"Graduation Date\" required style=\"width:20%; display:inline\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("            </form><br>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("                \n");
      out.write("       <!--**************************************************-->\n");
      out.write("       \n");
      out.write("       <h2 class=\"form-signin-heading\">Education</h2><br>\n");
      out.write("       \n");
      out.write("       <div data-bind=\"foreach: EducationList\">\n");
      out.write("\n");
      out.write("            <form class=\"form-signin\" method=\"post\" action=\"processEducation\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                <label> University</label>\n");
      out.write("                <input data-bind=\"value: name\" type=\"text\" class=\"form-control\" id=\"txtSchoolName\" name=\"txtSchoolName\" required autofocus=\"\"><br>\n");
      out.write("\n");
      out.write("                <select data-bind=\"value: type\" class=\"form-control\" id=\"txtDegreeType\" name=\"txtDegreeType\" required style=\"width:15%; display:inline\">\n");
      out.write("                    <option value=\"Associates\">Associates</option>\n");
      out.write("                    <option value=\"Bachelors\">Bachelors</option>\n");
      out.write("                    <option value=\"Masters\">Masters</option>\n");
      out.write("                    <option value=\"Doctorate\">Doctorate</option>\n");
      out.write("                    <option value=\"Certificate\">Certificate</option>\n");
      out.write("                    <option value=\"MA\">Diploma</option>                              \n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <label> Major </label><input data-bind=\"value: field\" type=\"text\" class=\"form-control\" id=\"txtMajorType\" name=\"txtMajorType\" placeholder=\"Major\" required style=\"width:34%; display:inline\">\n");
      out.write("                <label> Minor/Related Area </label><input data-bind=\"value: minor\" type=\"text\" class=\"form-control\" id=\"txtMinorType\" name=\"txtMinorType\" placeholder=\"Minor or Related Area\" style=\"width:34%; display:inline\"><br><br>\n");
      out.write("\n");
      out.write("                <label> GPA </label><input data-bind=\"value: gpa\" type=\"number\" class=\"form-control\" id=\"txtGPA\" name=\"txtGPA\" placeholder=\"GPA\" min=\"0\" max=\"4\" step=\"0.1\" style=\"width:20%; display:inline\" required>\n");
      out.write("                <label> Graduation Date </label><input data-bind=\"value: graduationDate\" type=\"text\" class=\"form-control datepicker\" id=\"txtGraduationDate\" name=\"txtGraduationDate\" placeholder=\"Graduation Date\" required style=\"width:20%; display:inline\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("            </form><br>\n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <h2 class=\"form-signin-heading\">Work Experience</h2><br>\n");
      out.write("        \n");
      out.write("        <div data-bind=\"foreach: WorkExperienceList\">\n");
      out.write("                    \n");
      out.write("                    <form>\n");
      out.write("    \n");
      out.write("                        <label style=\"display:inline\"> Business Name </label><br><input data-bind=\"value: businessName\" type=\"text\" class=\"form-control\" id=\"txtBusinessName\" name=\"txtBusinessName\" placeholder=\"Employer\" required autofocus=\"\"><br>\n");
      out.write("                        <label style=\"display:inline\"> Position </label><br><input data-bind=\"value: position\" type=\"text\" class=\"form-control\" id=\"txtPosition\" name=\"txtPosition\" placeholder=\"Position\" required><br>\n");
      out.write("                        <label style=\"display:inline\"> Start Date </label><input data-bind=\"value: startDate\" type=\"date\" class=\"form-control datepicker\" style=\"width:20%; display:inline\">\n");
      out.write("                        <label style=\"display:inline\"> End Date </label><input data-bind=\"value: endDate\" type=\"date\" class=\"form-control datepicker\" style=\"width:20%; display:inline\">\n");
      out.write("\n");
      out.write("                        <!-- How do I deal with the Radio Button??-->\n");
      out.write("                        <label style=\"display:inline\">Currently Employed? </label>\n");
      out.write("                        <input data-bind=\"checked: currentlyEmployed\" type=\"radio\"  id=\"rdoCurrentlyEmployed>\" name=\"rdoCurrentlyEmployed\" value=\"1\" style=\"display:inline\" required> Yes\n");
      out.write("                        <input data-bind=\"checked: currentlyEmployed\" type=\"radio\"  id=\"rdoCurrentlyEmployed\" name=\"rdoCurrentlyEmployed\" value=\"0\" style=\"display:inline\" required> No<br><br>\n");
      out.write("\n");
      out.write("                        <label style=\"display:inline\"> Description of Work </label><br>\n");
      out.write("                        <textarea data-bind=\"value: description\" class=\"form-control\" rows=\"6\" id=\"txtWorkDescription\" name=\"txtWorkDescription\" placeholder=\"Description of Work Experience\" required></textarea><br>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                        \n");
      out.write("                         \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("    </div>\n");
      out.write("    <pre data-bind=\"text: ko.toJSON($root.resumes, null, 2)\"></pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
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
      out.write("        <title>Resume Management System </title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <!--<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">-->\r\n");
      out.write("        \r\n");
      out.write("        <!--Stylesheet for Resume-->\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.1/jquery-ui.js\"></script>\r\n");
      out.write("        <script src=\"js/knockout-3.2.0.js\"></script>\r\n");
      out.write("        <script src=\"js/knockout.mapping.js\"></script>\r\n");
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
