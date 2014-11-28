package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class knocktest_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            $(document).ready(function () {\n");
      out.write("                var rawData = [\n");
      out.write("                    {\n");
      out.write("                        \"attribute\": {\n");
      out.write("                            \"id\": 6,\n");
      out.write("                            \"name\": \"Some attribute name\",\n");
      out.write("                            \"typeID\": 5\n");
      out.write("                        },\n");
      out.write("                        \"type\": {\n");
      out.write("                            \"id\": 5,\n");
      out.write("                            \"typeName\": \"list\"\n");
      out.write("                        },\n");
      out.write("                        \"attributeValues\": [{\n");
      out.write("                                \"id\": 10,\n");
      out.write("                                \"attributeID\": 6,\n");
      out.write("                                \"value\": \"Some attribute value\",\n");
      out.write("                                \"chosen\": false\n");
      out.write("                            }, {\n");
      out.write("                                \"id\": 11,\n");
      out.write("                                \"attributeID\": 6,\n");
      out.write("                                \"value\": \"Another attribute value\",\n");
      out.write("                                \"chosen\": false\n");
      out.write("                            }, {\n");
      out.write("                                \"id\": 12,\n");
      out.write("                                \"attributeID\": 6,\n");
      out.write("                                \"value\": \"Third attribute value\",\n");
      out.write("                                \"chosen\": false\n");
      out.write("                            }]\n");
      out.write("                    }\n");
      out.write("                ];\n");
      out.write("\n");
      out.write("                function AttributeValueViewModel(data) {\n");
      out.write("                    var self = this;\n");
      out.write("                    self.attribute = ko.observable(data.attribute);\n");
      out.write("                    self.type = ko.observable(data.type);\n");
      out.write("                    self.attributeValues = ko.observableArray(data.attributeValues);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function attributeViewModel() {\n");
      out.write("                    var self = this;\n");
      out.write("                    self.attributes = ko.observableArray([]);\n");
      out.write("                    self.addList = function (list) {\n");
      out.write("                        ko.utils.arrayForEach(list, function (item) {\n");
      out.write("                            self.attributes.push(new AttributeValueViewModel(item));\n");
      out.write("                        });\n");
      out.write("                    };\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var avm = new attributeViewModel();\n");
      out.write("                ko.applyBindings(avm);\n");
      out.write("                avm.addList(rawData);\n");
      out.write("            });</script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul data-bind=\"foreach: attributes\">\n");
      out.write("            <li>\n");
      out.write("                <h2 data-bind=\"text: attribute().name\"></h2>\n");
      out.write("                <ul data-bind=\"foreach: attributeValues\">\n");
      out.write("                    <li data-bind=\"text: value\"></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <hr>\n");
      out.write("        <pre data-bind=\"text: ko.toJSON($root, null, 2)\"></pre>\n");
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
