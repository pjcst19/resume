package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.resumecore.User;

public final class listResearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
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
      out.write("<div id=\"mainContainer\" class=\"container theme-showcase\" style=\"width:900px\">\r\n");
      out.write("    <div class=\"panel panel-default\">\r\n");
      out.write("        <div class=\"panel-heading\"><strong>View All Research Papers</strong></div>\r\n");
      out.write("        <table class=\"table\" id =\"tblUserList\" border=\"1\" cellpadding=\"5\" cellspacing=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Portfolio ID</th>\r\n");
      out.write("                <th>Project ID</th>\r\n");
      out.write("                <th>Paper Title</th>\r\n");
      out.write("                <th>Created</th>\r\n");
      out.write("                <th>Modified</th>\r\n");
      out.write("                <th>View Paper</th>\r\n");
      out.write("                <th>Edit Paper</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            getJsonFromWebService(\"../rest/userlistws?userID=");
 out.print(request.getParameter("userID"));
      out.write("\");\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        function getJsonFromWebService(targetUrl) {\r\n");
      out.write("            jQuery.ajax({\r\n");
      out.write("                type: \"GET\",\r\n");
      out.write("                url: targetUrl,\r\n");
      out.write("                contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (data, status, jqXHR) {\r\n");
      out.write("                    jsonToHtmlTable(data);\r\n");
      out.write("                },\r\n");
      out.write("                error: function (jqXHR, status) {\r\n");
      out.write("                    console.log(status);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function jsonToHtmlTable(data) {\r\n");
      out.write("            $table = $('#tblUserList');\r\n");
      out.write("            for (var i = 0; i < data.length; i++) {\r\n");
      out.write("                for (var j = 0; j < data[i]['research'].length; j++) {\r\n");
      out.write("                    var $row = $('<tr />');\r\n");
      out.write("                    $row.append('<td>' + data[i].PortfolioID + '</td>');\r\n");
      out.write("                    $row.append('<td>' + data[i]['research'][j].projectID + '</td>');\r\n");
      out.write("                    $row.append('<td>' + data[i].PaperTitle + '</td>');                    \r\n");
      out.write("                    $row.append('<td>' + data[i]['research'][j].created + '</td>');\r\n");
      out.write("                    $row.append('<td>' + data[i]['research'][j].modified + '</td>');                    \r\n");
      out.write("                    $row.append('<td><a href=\"viewResearchPersonal.jsp?researchID=' + data[i]['research'][j].researchID + '\">View</a></td>');\r\n");
      out.write("                    $row.append('<td><a href=\"viewEditResearch.jsp?researchID=' + data[i]['ressearch'][j].researchID + '\">Edit</a></td>');\r\n");
      out.write("                    $row.append('</tr>');\r\n");
      out.write("                    $table.append($row);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
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
