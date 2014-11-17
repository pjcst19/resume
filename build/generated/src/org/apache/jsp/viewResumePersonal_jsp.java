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

    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    } else {

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        getJsonFromWebService(\"rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a\");\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(document).ready(function () {$('.phone').text(function(i, text) {\r\n");
      out.write("        return text.replace(/(\\d{3})(\\d{3})(\\d{4})/, '$1-$2-$3');\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#txtDate\").val($.datepicker.formatDate('dd M yy', new Date()));\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    function getJsonFromWebService(targetUrl) {\r\n");
      out.write("        console.log(targetUrl);\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            url: targetUrl,\r\n");
      out.write("            contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function (data, status, jqXHR) {\r\n");
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
      out.write("\r\n");
      out.write("    function jsonToHtmlLayout(data) {\r\n");
      out.write("        $resume = $('#resumeContainer');\r\n");
      out.write("        $userName = $('#userName');\r\n");
      out.write("        $contactInfo = $('#contactInfo');\r\n");
      out.write("        $education = $('#education');\r\n");
      out.write("        $workExperience = $('#workExperience');\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < data.length-1; i++) {\r\n");
      out.write("\r\n");
      out.write("            $userName.append('<h1><strong>' + data[i].firstName + \" \" + data[i].lastName + '</strong></h1>');\r\n");
      out.write("            for (var j = 0; j < data[i]['addresses'].length; j++) {\r\n");
      out.write("                $userName.append('<h3>' + data[i]['addresses'][j].addressLine1 + ' ' + data[i]['addresses'][j].addressLine2 + ' ' + data[i]['addresses'][j].city +\r\n");
      out.write("                        ', ' + data[i]['addresses'][j].state + ' ' +  data[i]['addresses'][j].province + ' ' + + data[i]['addresses'][j].postalCode + '</h3>');\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            $contactInfo.append('<h3><a id=\"pdf\" href=\"#\">Download PDF</a></h3>');\r\n");
      out.write("            $contactInfo.append('<h3>' + data[i].email + '</h3>');\r\n");
      out.write("            $contactInfo.append('<h3 class=\"phone\">' + data[i].phoneNumber + '</h3>');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//            $resume.append('<div class=\"col-md-4\">');\r\n");
      out.write("//            //*********************************************************\r\n");
      out.write("//\r\n");
      out.write("//\r\n");
      out.write("//            //*************************************************************************************\r\n");
      out.write("//            $resume.append('<div class=\"yui-gf\">');\r\n");
      out.write("//            $resume.append('<div class=\"yui-u first\">');\r\n");
      out.write("//            $resume.append('<h2> Education </h2>');\r\n");
      out.write("//            $resume.append('</div>');\r\n");
      out.write("//\r\n");
      out.write("//\r\n");
      out.write("//            $resume.append('<div class=\"yui-u\">');\r\n");
      out.write("//\r\n");
      out.write("//\r\n");
      out.write("//            console.log(data[1]['EducationList'][0].name);\r\n");
      out.write("\r\n");
      out.write("                            for (var j = 0; j < data[1]['EducationList'].length; j++){\r\n");
      out.write("                                $education.append('<div class=\"edu\">');\r\n");
      out.write("                                $education.append('<h2>' + data[1]['EducationList'][j].name  + '</h2><h4>' + data[1]['EducationList'][j].graduationDate + '</h4>');\r\n");
      out.write("                                $education.append('<h3>'+ data[1]['EducationList'][j].type + ', ' + data[1]['EducationList'][j].field + '</h3>');\r\n");
      out.write("                                //Need to handle major\r\n");
      out.write("                                $education.append('<h3><strong> GPA:' + data[1]['EducationList'][j].gpa + '</strong></h3>');\r\n");
      out.write("                                $education.append('</div>');\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//\r\n");
      out.write("//                            $resume.append('</div>');\r\n");
      out.write("//\r\n");
      out.write("//\r\n");
      out.write("//                            $resume.append('<div class=\"yui-u first\">');                       \r\n");
      out.write("//                            $resume.append('<h2> Work Experience </h2>');\r\n");
      out.write("//                            $resume.append('</div>');\r\n");
      out.write("//\r\n");
      out.write("//                            $resume.append('<div class=\"yui-u\">');   \r\n");
      out.write("\r\n");
      out.write("                            for (var j = 0; j<data[1].WorkExperienceList.length; j++){\r\n");
      out.write("                                $workExperience.append('<div class=\"job\">');\r\n");
      out.write("                                $workExperience.append('<h2>' + data[1].WorkExperienceList[j].businessName + '</h2>');\r\n");
      out.write("                                $workExperience.append('<h3>' + data[1].WorkExperienceList[j].position + '</h3>');\r\n");
      out.write("                                $workExperience.append('<h4>' + data[1].WorkExperienceList[j].startDate + ' - ' + data[1].WorkExperienceList[j].endDate + '</h4>');\r\n");
      out.write("                                $workExperience.append('</div>');\r\n");
      out.write("                            }\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("                            if(data[1].AwardList.length > 0){\r\n");
      out.write("                                $resume.append('<h3>Awards</h3>');\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            for (j=0; j<data[1].AwardList.length; j++){\r\n");
      out.write("                                $resume.append(data[1].AwardList[j].name + '<br>');\r\n");
      out.write("                                $resume.append(data[1].AwardList[j].description + '</div><br>');\r\n");
      out.write("//                            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $resume.append('</div>');\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--<div class=\"panel-default\" id=\"userName\">\r\n");
      out.write("                        <h3 class=\"panel-heading\"><strong>Resume</strong></h3>\r\n");
      out.write("</div>-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"panel-body\">\r\n");
      out.write("    <div class=\"panel-body\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"page-header\">\r\n");
      out.write("            <div id=\"resumeContainer\" col-lg-12\">\r\n");
      out.write("                 \r\n");
      out.write("                 <div id=\"doc2\" class=\"yui-t7\">\r\n");
      out.write("\t<div id=\"inner\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"hd\">\r\n");
      out.write("\t\t\t<div class=\"yui-gc\">\r\n");
      out.write("\t\t\t\t<div class=\"yui-u first\" id=\"userName\">\r\n");
      out.write("\t\t\t\t\t<!--User Name and Address Goes Here-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contact-info\" id =\"contactInfo\">\r\n");
      out.write("\t\t\t\t\t\t<!--User Phone and Email go Here-->\r\n");
      out.write("\t\t\t\t\t</div><!--// .contact-info -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!--// .yui-gc -->\r\n");
      out.write("\t\t</div><!--// hd -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"bd\">\r\n");
      out.write("\t\t\t<div id=\"yui-main\">\r\n");
      out.write("\t\t\t\t<div class=\"yui-b\">\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\" >\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Education</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <div class=\"yui-u\" id=\"education\">\r\n");
      out.write("                                                    \r\n");
      out.write("                                           </div>\r\n");
      out.write("\t\t\t\t\t\t<!--Education Information Goes Here-->\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf education-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"yui-gf\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Experience</h2>\r\n");
      out.write("\t\t\t\t\t\t</div><!--// .yui-u -->\r\n");
      out.write("                                                \r\n");
      out.write("                                           \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\" id=\"workExperience\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div><!--// .yui-u -->\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div><!--// .yui-b -->\r\n");
      out.write("\t\t\t</div><!--// yui-main -->\r\n");
      out.write("\t\t</div><!--// bd -->\r\n");
      out.write("\r\n");
      out.write("\t</div><!-- // inner -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div><!--// doc -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        ");
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
