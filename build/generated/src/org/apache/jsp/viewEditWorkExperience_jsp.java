package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewEditWorkExperience_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/knockout-3.2.0.js\"></script>\n");
      out.write("        <script src=\"js/knockout.mapping.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var data;\n");
      out.write("            var finalJSON;\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                ResumeModel = function () {\n");
      out.write("                    var self = this;\n");
      out.write("                    self.resumes = ko.observableArray();\n");
      out.write("                    $.getJSON(\"rest/resumews?resumeID=00b4443b-4903-489e-b486-2869bb5c317a\", function (json) {\n");
      out.write("                        data = json;\n");
      out.write("                        \n");
      out.write("                        self.WorkExperienceList = ko.observableArray();\n");
      out.write("                        $.each(data.WorkExperienceList, function (i, val) {\n");
      out.write("                            self.WorkExperienceList.push(new WorkExperienceModel(val.workExperienceID, val.businessName, val.position, val.startDate, val.endDate, val.created, val.modified, val.description, val.currentlyEmployed));\n");
      out.write("                        });\n");
      out.write("                        \n");
      out.write("                        self.resumes.push({\n");
      out.write("                            resumeID: ko.observable(data.resumeID),\n");
      out.write("                            created: ko.observable(data.created),\n");
      out.write("                            modified: ko.observable(data.modified),\n");
      out.write("                            rating: ko.observable(data.rating),\n");
      out.write("                            WorkExperienceList: self.WorkExperienceList\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                };\n");
      out.write("           \n");
      out.write("\n");
      out.write("                function WorkExperienceModel(workExperienceID, businessName, position, startDate, endDate, created, modified, description, currentlyEmployed) {\n");
      out.write("                    var self = this;\n");
      out.write("                    return{\n");
      out.write("                        workExperienceID: ko.observable(workExperienceID),\n");
      out.write("                        businessName: ko.observable(businessName),\n");
      out.write("                        position: ko.observable(position),\n");
      out.write("                        startDate: ko.observable(startDate),\n");
      out.write("                        endDate: ko.observable(endDate),\n");
      out.write("                        created: ko.observable(created),\n");
      out.write("                        modified: ko.observable(modified),\n");
      out.write("                        description: ko.observable(description),\n");
      out.write("                        currentlyEmployed: ko.observable(currentlyEmployed), \n");
      out.write("                    };\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ko.applyBindings(new ResumeModel());\n");
      out.write("            });</script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div data-bind=\"foreach: resumes\">\n");
      out.write("            Resume ID: <input data-bind=\"value: resumeID\"><br/>\n");
      out.write("            <div data-bind=\"foreach: WorkExperienceList\">\n");
      out.write("                Business Name: <input data-bind=\"value: businessName\"><br/>\n");
      out.write("                Position: <input data-bind=\"value: position\"><br/>\n");
      out.write("                Start Date: <input data-bind=\"value: startDate\"><br/>\n");
      out.write("                End Date: <input data-bind=\"value: endDate\"><br/>\n");
      out.write("                Description: <input data-bind=\"value: description\"><br/>\n");
      out.write("                currentlyEmployed: <input data-bind=\"value: currentlyEmployed\"><br/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <pre data-bind=\"text: ko.toJSON($root.resumes, null, 2)\"></pre>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
