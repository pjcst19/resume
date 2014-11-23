package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.utilities.Security;

public final class viewResumePersonal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--Security-->\r\n");

    String resumeID = "";
    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    } else {
        resumeID = request.getParameter("resumeID");
    }

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <!--<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">-->\r\n");
      out.write("        \r\n");
      out.write("        <!--Stylesheet for Resume-->\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
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
      out.write("<script language=\"javascript\">\r\n");
      out.write("    //Gets resume as JSON from web service based on resumeID\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        getJsonFromWebService(\"rest/resumews?resumeID=");
out.print(resumeID);
      out.write("\");\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function gpaToDecimal(gpa) {\r\n");
      out.write("        var gpa = gpa;\r\n");
      out.write("        var gpaDecimal = gpa.toFixed(1);\r\n");
      out.write("        return gpaDecimal;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //Gets JSON from web service\r\n");
      out.write("    function getJsonFromWebService(targetUrl) {\r\n");
      out.write("        console.log(targetUrl);\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            url: targetUrl,\r\n");
      out.write("            contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (data, status, jqXHR) {\r\n");
      out.write("                getJSONForUser(data.userID);\r\n");
      out.write("                jsonToHtmlLayout(data);\r\n");
      out.write("                console.log(data);\r\n");
      out.write("                console.log(\"success\");\r\n");
      out.write("            },\r\n");
      out.write("            error: function (jqXHR, status) {\r\n");
      out.write("                console.log(status);\r\n");
      out.write("                console.log(\"Error\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //Gets user as JSON from web service\r\n");
      out.write("    function getJSONForUser(userID) {\r\n");
      out.write("        console.log(userID);\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            url: \"rest/userInfows?userID=\" + userID,\r\n");
      out.write("            contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (data, status, jqXHR) {\r\n");
      out.write("                userJSONToHTMLLayout(data);\r\n");
      out.write("                console.log(data);\r\n");
      out.write("                console.log(\"success\");\r\n");
      out.write("            },\r\n");
      out.write("            error: function (jqXHR, status) {\r\n");
      out.write("                console.log(status);\r\n");
      out.write("                console.log(\"Error\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function userJSONToHTMLLayout(data) {\r\n");
      out.write("        $userName = $('#userName');\r\n");
      out.write("        $emailPhoneInfo = $('#emailPhoneInfo');\r\n");
      out.write("\r\n");
      out.write("        $userName.append('<h1>' + data.firstName + \" \" + data.lastName + '</h1>');\r\n");
      out.write("        $emailPhoneInfo.append('<h4> <strong> Phone: </strong>' + data.phoneNumber + \"<strong>  Email: </strong>\" + data.email + '</h4>');\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    ;\r\n");
      out.write("\r\n");
      out.write("    //Builds HTML layout using user and resume information from JSON\r\n");
      out.write("    function jsonToHtmlLayout(data) {\r\n");
      out.write("        $resume = $('#resumeContainer');\r\n");
      out.write("        $contactInfo = $('#contactInfo');\r\n");
      out.write("        $education = $('#education');\r\n");
      out.write("        $workExperience = $('#workExperience');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < data['addresses'].length; i++) {\r\n");
      out.write("            $contactInfo.append('<h4>' + data['addresses'][i].addressLine1 + ' ' + data['addresses'][i].addressLine2 + ' ' + data['addresses'][i].city +\r\n");
      out.write("                    ', ' + data['addresses'][i].state + ' ' + data['addresses'][i].postalCode + '</h4>');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < data['EducationList'].length; i++) {\r\n");
      out.write("            var gpa = gpaToDecimal(data['EducationList'][i].gpa);\r\n");
      out.write("            $education.append('<div class=\"entry\" style=\"border-bottom: 5 px solid #fff234');\r\n");
      out.write("            $education.append('<h4>' + data['EducationList'][i].name + '</h4>');\r\n");
      out.write("            $education.append('<h5>' + data['EducationList'][i].graduationDate + '</h5>');\r\n");
      out.write("            $education.append('<h5>' + data['EducationList'][i].type + ', ' + data['EducationList'][i].field + '</h5>');\r\n");
      out.write("            //If the student has listed a minor\r\n");
      out.write("            if (data['EducationList'].minor !== null) {\r\n");
      out.write("                $education.append('<h5> Minor/Related Area: ' + data['EducationList'][i].minor + '</h5>');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $education.append('<h5> GPA:' + gpa + '</h5>');\r\n");
      out.write("            $education.append('</div>');\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < data['WorkExperienceList'].length; i++) {\r\n");
      out.write("            $workExperience.append('<div class=\"entry\"');\r\n");
      out.write("            $workExperience.append('<h4>' + data['WorkExperienceList'][i].businessName + '</h4>');\r\n");
      out.write("            $workExperience.append('<h5>' + data['WorkExperienceList'][i].position + '</h5>');\r\n");
      out.write("            $workExperience.append('<h5>' + data['WorkExperienceList'][i].startDate + ' - ' + data['WorkExperienceList'][i].endDate + '</h5>');\r\n");
      out.write("            $workExperience.append('<p>' + data['WorkExperienceList'][i].description + '</p>');\r\n");
      out.write("            $workExperience.append('</div>');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<section class=\"resume\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <header class=\"row-fluid\">\r\n");
      out.write("        <div class=\"title span7\" id=\"userName\">\r\n");
      out.write("            <!--            <h1>John Smith</h1>-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"title span7\" id=\"contactInfo\">\r\n");
      out.write("            <!--Address Information Appears Here-->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"title span7\" id=\"emailPhoneInfo\">\r\n");
      out.write("            <!--Phone and Email Information Appears Here-->\r\n");
      out.write("        </div>\t\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Education -->\r\n");
      out.write("    <article class=\"row-fluid\">\r\n");
      out.write("        <header class=\"span3\">\r\n");
      out.write("            <h2>Education</h2>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"span9 education\" id=\"education\">\r\n");
      out.write("            <!--Education Information Appears Here-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("    <!-- Work -->\r\n");
      out.write("    <article class=\"row-fluid\">\r\n");
      out.write("        <header class=\"span3\">\r\n");
      out.write("            <h2>Work Experience</h2>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"span9\" id=\"workExperience\">\r\n");
      out.write("            <!--Work Experience Information Appears Here -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <a href=\"#\">Download as PDF</a> | <a href=\"#\" onclick=\"javascript\r\n");
      out.write("                :window.print();\">Print</a>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("</section><!--End of container-->\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
