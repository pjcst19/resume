package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewEditEducation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var data;\r\n");
      out.write("    var finalJSON;\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        ResumeModel = function () {\r\n");
      out.write("            var self = this;\r\n");
      out.write("            self.resumes = ko.observableArray();\r\n");
      out.write("            $.getJSON(\"rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a\", function (json) {\r\n");
      out.write("                data = json;\r\n");
      out.write("\r\n");
      out.write("                self.EducationList = ko.observableArray();\r\n");
      out.write("                $.each(data.EducationList, function (i, val) {\r\n");
      out.write("                    self.EducationList.push(new EducationModel(val.educationID, val.major, val.minor, val.field, val.graduationDate, val.created, val.modified, val.name, val.gpa, val.type));\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                self.resumes.push({\r\n");
      out.write("                    resumeID: ko.observable(data.resumeID),\r\n");
      out.write("                    created: ko.observable(data.created),\r\n");
      out.write("                    modified: ko.observable(data.modified),\r\n");
      out.write("                    rating: ko.observable(data.rating),\r\n");
      out.write("                    EducationList: self.EducationList\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        };\r\n");
      out.write("        function EducationModel(educationID, major, minor, field, graduationDate, created, modified, name, gpa, type) {\r\n");
      out.write("            var self = this;\r\n");
      out.write("            return{\r\n");
      out.write("                educationID: ko.observable(educationID),\r\n");
      out.write("                major: ko.observable(major),\r\n");
      out.write("                minor: ko.observable(minor),\r\n");
      out.write("                field: ko.observable(field),\r\n");
      out.write("                graduationDate: ko.observable(graduationDate),\r\n");
      out.write("                created: ko.observable(created),\r\n");
      out.write("                modified: ko.observable(modified),\r\n");
      out.write("                name: ko.observable(name),\r\n");
      out.write("                gpa: ko.observable(gpa),\r\n");
      out.write("                type: ko.observable(type)\r\n");
      out.write("            };\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ko.applyBindings(new ResumeModel());\r\n");
      out.write("    });</script>\r\n");
      out.write("<title>JSP Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div data-bind=\"foreach: resumes\">\r\n");
      out.write("        <!--            Resume ID: <input data-bind=\"value: resumeID\"><br/>-->\r\n");
      out.write("        <div data-bind=\"foreach: EducationList\">\r\n");
      out.write("\r\n");
      out.write("            <form class=\"form-signin\" method=\"post\" action=\"processEducation\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <label> University</label>\r\n");
      out.write("                <input data-bind=\"value: name\" type=\"text\" class=\"form-control\" id=\"txtSchoolName\" name=\"txtSchoolName\" required autofocus=\"\"><br>\r\n");
      out.write("\r\n");
      out.write("                <!--How do I deal with this-->\r\n");
      out.write("                <select class=\"form-control\" id=\"txtDegreeType\" name=\"txtDegreeType\" required style=\"width:30%; display:inline\">\r\n");
      out.write("                    <option value=\"Associates\">Associates</option>\r\n");
      out.write("                    <option value=\"Bachelors\">Bachelors</option>\r\n");
      out.write("                    <option value=\"Masters\">Masters</option>\r\n");
      out.write("                    <option value=\"Doctorate\">Doctorate</option>\r\n");
      out.write("                    <option value=\"Certificate\">Certificate</option>\r\n");
      out.write("                    <option value=\"MA\">Diploma</option>                              \r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("                <input data-bind=\"value: major\" type=\"text\" class=\"form-control\" id=\"txtMajorType\" name=\"txtMajorType\" placeholder=\"Major\" required style=\"width:34%; display:inline\">\r\n");
      out.write("                <input data-bind=\"value: minor\" type=\"text\" class=\"form-control\" id=\"txtMinorType\" name=\"txtMinorType\" placeholder=\"Minor or Related Area\" style=\"width:34%; display:inline\"><br><br>\r\n");
      out.write("\r\n");
      out.write("                <input data-bind=\"value: gpa\" type=\"number\" class=\"form-control\" id=\"txtGPA\" name=\"txtGPA\" placeholder=\"GPA\" min=\"0\" max=\"4\" step=\"0.1\" style=\"width:20%; display:inline\" required>\r\n");
      out.write("                <input data-bind=\"value: graduationDate\" type=\"text\" class=\"form-control datepicker\" id=\"txtGraduationDate\" name=\"txtGraduationDate\" placeholder=\"Graduation Date\" required style=\"width:20%; display:inline\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <br><br>\r\n");
      out.write("\r\n");
      out.write("            </form><br>\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <pre data-bind=\"text: ko.toJSON($root.resumes, null, 2)\"></pre>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
