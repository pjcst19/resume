package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.utilities.Security;

public final class viewResumePersonalBackUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }
    else{
        
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../../docs-assets/ico/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("        <title>Resume Management System</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\r\n");
      out.write("        <!--        <script language=\"javascript\">\r\n");
      out.write("                    $(document).ready(function() {\r\n");
      out.write("                        getJsonFromWebService(\"rest/userlistws?userID=");
 out.print(request.getParameter("userID"));
      out.write("\");\r\n");
      out.write("                    });\r\n");
      out.write("                    function getJsonFromWebService(targetUrl) {\r\n");
      out.write("                        jQuery.ajax({\r\n");
      out.write("                            type: \"GET\",\r\n");
      out.write("                            url: targetUrl,\r\n");
      out.write("                            contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("                            dataType: \"json\",\r\n");
      out.write("                            success: function(data, status, jqXHR) {\r\n");
      out.write("                                jsonToHtmlTable(data);\r\n");
      out.write("                            },\r\n");
      out.write("                            error: function(jqXHR, status) {\r\n");
      out.write("                                console.log(status);\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                    function jsonToHtmlTable(data) {\r\n");
      out.write("                        $table = $('#tblUserList');\r\n");
      out.write("                        $table.empty();\r\n");
      out.write("        \r\n");
      out.write("                        $table.append(\"<tr><th>Last Name</th><th>First Name</th><th>Resume Name</th></tr>\");\r\n");
      out.write("                        for (var i = 0; i < data.length; i++) {\r\n");
      out.write("                            var $row = $('<tr />');\r\n");
      out.write("                            $row.append('<td>' + data[i].lastName + '</td>');\r\n");
      out.write("                            $row.append('<td>' + data[i].firstName + '</td>');\r\n");
      out.write("                            $row.append('<td><a href=\"viewResume.jsp?resumeID=' + data[i].userID + '\">View</a></td>');\r\n");
      out.write("                            $row.append('</tr>');\r\n");
      out.write("                            $table.append($row);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                </script>-->\r\n");
      out.write("        \r\n");
      out.write("                <script language=\"javascript\">\r\n");
      out.write("                    $(document).ready(function() {\r\n");
      out.write("//                        getJsonFromWebService(\"rest/resumews?resumeID=");
 //out.print(request.getParameter("resumeID"));
      out.write("\");\r\n");
      out.write("                         getJsonFromWebService(\"rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a\");\r\n");
      out.write("                    });\r\n");
      out.write("                    function getJsonFromWebService(targetUrl) {\r\n");
      out.write("                        console.log(targetUrl);\r\n");
      out.write("                        jQuery.ajax({\r\n");
      out.write("                            type: \"GET\",\r\n");
      out.write("                            url: targetUrl,\r\n");
      out.write("                            contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("                            dataType: \"json\",\r\n");
      out.write("                            success: function(data, status, jqXHR) {\r\n");
      out.write("                                jsonToHtmlLayout(data);\r\n");
      out.write("                                console.log(data);\r\n");
      out.write("                                console.log(\"success\");\r\n");
      out.write("                            },\r\n");
      out.write("                            error: function(jqXHR, status) {\r\n");
      out.write("                                console.log(status);\r\n");
      out.write("                                console.log(\"Error\")\r\n");
      out.write("                            }\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                    function jsonToHtmlLayout(data) {\r\n");
      out.write("                        $resume = $('#resumeContainer');\r\n");
      out.write("                        $userName = $('#userName');\r\n");
      out.write("\r\n");
      out.write("                        $userName.append('<h3 class=\"panel-heading\"><strong>' + data.firstName + \" \" + data.lastName + '</strong></h3>');\r\n");
      out.write("\r\n");
      out.write("                        $resume.append('<div class=\"col-md-4\">');\r\n");
      out.write("    //                    $resume.append('<label>' + data.resumeID + '</label><br>');\r\n");
      out.write("                        $resume.append('<h3> Education </h3><hr>');\r\n");
      out.write("                        \r\n");
      out.write("                        for ($i=0; $i<data.EducationList.length; $i++){\r\n");
      out.write("                            $resume.append(data.EducationList[$i].name + ', ' + data.EducationList[$i].type + ', ' + data.EducationList[$i].field + '<br>');\r\n");
      out.write("                            $resume.append('GPA:' + data.EducationList[$i].gpa + '<br>');\r\n");
      out.write("                            $resume.append(data.EducationList[$i].graduationDate + '<br><br>');\r\n");
      out.write("                            \r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        $resume.append('<h3> Work Experience </h3><hr>');\r\n");
      out.write("                        for ($i=0; $i<data.WorkExperienceList.length; $i++){\r\n");
      out.write("                            $resume.append(data.WorkExperienceList[$i].businessName + '<br>');\r\n");
      out.write("                            $resume.append(data.WorkExperienceList[$i].position);\r\n");
      out.write("                            $resume.append(data.WorkExperienceList[$i].startDate + ' - ' + data.WorkExperienceList[$i].endDate + '<br>');\r\n");
      out.write("                            $resume.append(data.WorkExperienceList[$i].description + '<br>');\r\n");
      out.write("                        }\r\n");
      out.write("                            \r\n");
      out.write("                        if(data.AwardList.length > 0){\r\n");
      out.write("                            $resume.append('<h3>Awards</h3>');\r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        for ($i=0; $i<data.AwardList.length; $i++){\r\n");
      out.write("                            $resume.append(data.AwardList[$i].name + '<br>');\r\n");
      out.write("                            $resume.append(data.AwardList[$i].description + '</div><br>');\r\n");
      out.write("                        }\r\n");
      out.write("                            \r\n");
      out.write("                    \r\n");
      out.write("                        \r\n");
      out.write("                        $resume.append('</div>');\r\n");
      out.write("                                              \r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"sr-only\">Toggle navigation</span></button> <a class=\"navbar-brand\" href=\"#\">Resume Management System</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"index.php\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("                        <li><a href=\"#about\">Help</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <ul class=\"nav pull-right\">\r\n");
      out.write("                                <a class=\"btn btn-default navbar-btn\" href=\"logout\">Logout</a>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-default\" id=\"userName\">\r\n");
      out.write("<!--                    <h3 class=\"panel-heading\"><strong>Resume</strong></h3>-->\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"page-header\">\r\n");
      out.write("                            <div id=\"resumeContainer\" col-lg-12\">\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("                               \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div><!-- /container -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
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
