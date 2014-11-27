package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class anotherRivetsTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/rivets.min.js\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("        <script src=\"js/rivetsConf.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            ///====== Skip This Part, this is configuration =============\n");
      out.write("\n");
      out.write("\n");
      out.write("            rivets.config.handler = function (context, ev, binding) {\n");
      out.write("                if (binding.model instanceof binding.model.____) {\n");
      out.write("                    return this.call(binding.model, ev, context); // Event Target !!\n");
      out.write("                } else {\n");
      out.write("                    return this.call(context, ev, binding.view.models);\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            rivets.binders.input = {\n");
      out.write("                publishes: true,\n");
      out.write("                routine: rivets.binders.value.routine,\n");
      out.write("                bind: function (el) {\n");
      out.write("                    el.addEventListener('input', this.publish);\n");
      out.write("                },\n");
      out.write("                unbind: function (el) {\n");
      out.write("                    el.removeEventListener('input', this.publish);\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("//================ Acutal Code Start from Here =============\n");
      out.write("            rivets.formatters.rupee = function (val) {\n");
      out.write("                return \"₹ \" + val;\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var Person = function () {\n");
      out.write("                this.name = \"Narendra\",\n");
      out.write("                        this.job = {};\n");
      out.write("                this.job.task = \"Engineer\";\n");
      out.write("                this.____ = Person;\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            Person.prototype = {\n");
      out.write("                show: function () {\n");
      out.write("                    this.display();\n");
      out.write("                },\n");
      out.write("                change: function () {\n");
      out.write("                    this.name = \"Deepak\";\n");
      out.write("                    this.job.task = \"Playing\";\n");
      out.write("                },\n");
      out.write("                display: function () {\n");
      out.write("                    alert(JSON.stringify(this));\n");
      out.write("                },\n");
      out.write("                total: function () {\n");
      out.write("                    return window.parseInt(this.price) * window.parseInt(this.quantity);\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var person = new Person();\n");
      out.write("            rivets.bind(document.querySelector(\"#asdasd\"), {\n");
      out.write("                scope: person\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"asdasd\">\n");
      out.write("            <input rv-value=\"showbutton\" type=\"checkbox\">\n");
      out.write("            <label>Hide button</label>\n");
      out.write("            <div rv-hide=\"showbutton\">\n");
      out.write("                <button rv-on-click=\"scope.change\">Change Model Data</button>\n");
      out.write("                <button rv-on-click=\"scope.show\">Show Model Data</button>\n");
      out.write("            </div>\n");
      out.write("            <h3>\n");
      out.write("                <span>Name : { scope.name } & Task: { scope.job.task}</span>\n");
      out.write("            </h3>\n");
      out.write("\n");
      out.write("            <input rv-input=\"scope.name\">\n");
      out.write("            <input rv-input=\"scope.job.task\">\n");
      out.write("            <p><b>Computed Properties !</b>\n");
      out.write("            </p>\n");
      out.write("            <label>Price</label>\n");
      out.write("            <input rv-input=\"scope.price \">\n");
      out.write("            <label>Quantity</label>\n");
      out.write("            <input rv-input=\"scope.quantity\">\n");
      out.write("            <label>Total =</label>\t<span rv-text=\"scope.total < quantity price | rupee\"></span>\n");
      out.write("\n");
      out.write("        </div>\n");
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
