package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.utilities.Security;
import edu.pitt.resumecore.User;

public final class viewEditResume_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/pages/../includes/header.jsp");
    _jspx_dependants.add("/pages/../includes/footer.jsp");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    User user = (User) session.getAttribute("authenticatedUser");

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
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!--Stylesheet for Resume-->\r\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"../stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"../stylesheet\" href=\"//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("\r\n");
      out.write("        <!--jquery scripts -->\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--Scripts for Data Binding -->\r\n");
      out.write("        <script src=\"../js/knockout-3.2.0.js\"></script>\r\n");
      out.write("        <script src=\"../js/knockout.mapping.js\"></script>\r\n");
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
      out.write("\r\n");
      out.write("                    <!--Main Navigation-->\r\n");
      out.write("                    <ul class=\"nav navbar-nav\" id=\"mainNavigation\">\r\n");
      out.write("                        <li><a href='menu.jsp'>Home</a></li>\r\n");
      out.write("                        <li><a href='personalInfo.jsp'>Create Resume</a></li>\r\n");
      out.write("                        <li><a href='listResumes.jsp?userID=");
 out.print(user.getUserID());
      out.write("'>View/Edit Resumes</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--Logout Button-->\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <ul class=\"nav pull-right\">\r\n");
      out.write("                                <li> <a class=\"btn btn-default navbar-btn\" href=\"../logout\">Logout</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("            </div><!--/.container-->\r\n");
      out.write("        </div><!--navbar-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var resumeID = \"");
out.print(request.getParameter("resumeID"));
      out.write("\";\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"../js/editResumeFunctions.js\"></script>\r\n");
      out.write("<script src=\"../js/koDatePickerBinding.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function submitJSON(data) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: 'POST',\r\n");
      out.write("            url: '../process/processResume',\r\n");
      out.write("            data: {'resume': data},\r\n");
      out.write("            async: false\r\n");
      out.write("                    //success: ,\r\n");
      out.write("                    //error:\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"mainContainer\" class=\"container theme-showcase\" style=\"width:900px\">\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("        <div class=\"panel-heading\">\r\n");
      out.write("            <h3 class=\"panel-title\"><strong>Edit Your Resume</strong></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("            <div id=\"page-header\">\r\n");
      out.write("                <h2 class=\"form-signin-heading resumeHeader\">Education</h2><br>\r\n");
      out.write("                <button class=\"expandButton\" type=\"button\" id=\"editEduButton\"><span class=\"glyphicon glyphicon-chevron-down\" aria-hidden=\"true\" ></span></button><br><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div data-bind=\"foreach: resumes\">\r\n");
      out.write("                <div id=\"editEduList\">\r\n");
      out.write("                    <div data-bind=\"foreach: EducationList\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label> University</label>\r\n");
      out.write("                            <input data-bind=\"value: name\" type=\"text\" class=\"form-control\" id=\"txtSchoolName\" name=\"txtSchoolName\" required autofocus=\"\"><br>\r\n");
      out.write("                            <div style=\"float:left; margin-right:7px;\">\r\n");
      out.write("                                <label style=\"display:block\"> Degree Type </label>\r\n");
      out.write("                                <select style=\"display:inline\" data-bind=\"value: type\" class=\"form-control\" id=\"txtDegreeType\" name=\"txtDegreeType\" required >\r\n");
      out.write("                                    <option value=\"Associates\">Associates</option>\r\n");
      out.write("                                    <option value=\"Bachelors\">Bachelors</option>\r\n");
      out.write("                                    <option value=\"Masters\">Masters</option>\r\n");
      out.write("                                    <option value=\"Doctorate\">Doctorate</option>\r\n");
      out.write("                                    <option value=\"Certificate\">Certificate</option>\r\n");
      out.write("                                    <option value=\"MA\">Diploma</option>                              \r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"float:left; margin-right:8px;\">\r\n");
      out.write("                                <label style=\"display:block\"> Major </label><input style=\"display:block\" data-bind=\"value: field\" type=\"text\" class=\"form-control\" id=\"txtMajorType\" name=\"txtMajorType\" placeholder=\"Major\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"float:left; margin-right:8px;\">\r\n");
      out.write("                                <label style=\"display:block\"> Minor/Related Area </label><input style=\"display:block\" data-bind=\"value: minor\" type=\"text\" class=\"form-control\" id=\"txtMinorType\" name=\"txtMinorType\" placeholder=\"Minor or Related Area\"><br><br>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"float:left;  margin-right:7px;\">\r\n");
      out.write("                                <label style=\"display:block\"> GPA </label><input style=\"display:block\" data-bind=\"value: gpa\" type=\"number\" class=\"form-control\" id=\"txtGPA\" name=\"txtGPA\" placeholder=\"GPA\" min=\"0\" max=\"4\" step=\"0.1\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"float:left; margin-right:8px;\">\r\n");
      out.write("                                <label style=\"display:block\"> Graduation Date </label><input style=\"display:block\" data-bind=\"datepicker: graduationDate\" type=\"text\" class=\"form-control datepicker\" id=\"txtGraduationDate\" name=\"txtGraduationDate\" placeholder=\"Graduation Date\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div style=\"clear:both\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                    </div><!--End editeduList-->\r\n");
      out.write("                </div><!--End Education Data Bind-->\r\n");
      out.write("                <div id=\"page-header\">\r\n");
      out.write("                    <h2 class=\"form-signin-heading resumeHeader\">Work Experience</h2><br>\r\n");
      out.write("                    <button class=\"expandButton\" id=\"editWorkButton\"><span class=\"glyphicon glyphicon-chevron-down\" aria-hidden=\"true\" ></span></button><br><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"editWorkList\">\r\n");
      out.write("                    <div data-bind=\"foreach: WorkExperienceList\">\r\n");
      out.write("                        <div style=\"margin-bottom:0px\">\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <label style=\"display:inline\"> Business Name </label><br><input data-bind=\"value: businessName\" type=\"text\" class=\"form-control\" id=\"txtBusinessName\" name=\"txtBusinessName\" placeholder=\"Employer\" required autofocus=\"\"><br>\r\n");
      out.write("                                <label style=\"display:inline\"> Position </label><br><input data-bind=\"value: position\" type=\"text\" class=\"form-control\" id=\"txtPosition\" name=\"txtPosition\" placeholder=\"Position\" required><br>\r\n");
      out.write("                                <label style=\"display:inline\"> Start Date </label><input data-bind=\"datepicker: startDate,  datepickerOptions: { maxDate: '+1M +1D'}\" type=\"date\" class=\"form-control datepicker\" style=\"width:20%; display:inline\">\r\n");
      out.write("                                <label style=\"display:inline\"> End Date </label><input data-bind=\"datepicker: endDate, datepickerOptions: { maxDate: '+1M +1D'}\" type=\"date\" class=\"form-control datepicker\" style=\"width:20%; display:inline\">\r\n");
      out.write("                                <!-- How do I deal with the Radio Button??-->\r\n");
      out.write("                                <label style=\"display:inline\">Currently Employed? </label>\r\n");
      out.write("                                <input data-bind=\"checked: currentlyEmployed\" type=\"radio\"  id=\"rdoCurrentlyEmployed\" name=\"rdoCurrentlyEmployed\" value=\"1\" style=\"display:inline\" required> Yes\r\n");
      out.write("                                <input data-bind=\"checked: currentlyEmployed\" type=\"radio\"  id=\"rdoCurrentlyEmployed\" name=\"rdoCurrentlyEmployed\" value=\"0\" style=\"display:inline\" required> No<br><br>\r\n");
      out.write("                                <label style=\"display:inline\"> Description of Work </label><br>\r\n");
      out.write("                                <textarea data-bind=\"value: description\" class=\"form-control\" rows=\"6\" id=\"txtWorkDescription\" name=\"txtWorkDescription\" placeholder=\"Description of Work Experience\" required></textarea><br>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div><!--End editWorkList -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Displays the JSON - for Testing purposes-->\r\n");
      out.write("    <!--    <pre data-bind=\"text: ko.toJSON($root.resumes, null, 2)\"></pre>-->\r\n");
      out.write("    <button class=\"btn\" data-bind=\"click:  this.submitJSON(ko.toJSON($root.resumes, null, 2))\" onclick=\"window.location.href = 'menu.jsp'\" style=\"margin: 5px;\">Submit</button>\r\n");
      out.write("\r\n");
      out.write("    <!--Allows the user to show/hide each section of the resume when editing-->\r\n");
      out.write("    <script>\r\n");
      out.write("            \r\n");
      out.write("        $(document).on('click', '#editEduButton', function(){\r\n");
      out.write("            $(\"#editEduList\").toggle();\r\n");
      out.write("        });\r\n");
      out.write("            \r\n");
      out.write("        $(document).on('click', '#editWorkButton', function(){\r\n");
      out.write("            $(\"#editWorkList\").toggle();\r\n");
      out.write("        });\r\n");
      out.write("          \r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core JavaScript\r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
