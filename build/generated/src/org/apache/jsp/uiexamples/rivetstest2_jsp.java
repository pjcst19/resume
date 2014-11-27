package org.apache.jsp.uiexamples;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rivetstest2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/rivets.min.js\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("        <script src=\"js/rivetsConf.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            var soccerTeam = [{\"number\": 1, \"name\": \"Gianluigi\", \"surname\": \"Buffon\"},\n");
      out.write("                {\"number\": 19, \"name\": \"Gianluca\", \"surname\": \"Zambrotta\"},\n");
      out.write("                {\"number\": 5, \"name\": \"Fabio\", \"surname\": \"Cannavaro\", \"captain\": true},\n");
      out.write("                {\"number\": 9, \"name\": \"Luca\", \"surname\": \"Toni\"}];\n");
      out.write("\n");
      out.write("// get the DOM elements\n");
      out.write("            var playersList = document.getElementById('playersList');\n");
      out.write("\n");
      out.write("// pass the data to the DOM element\n");
      out.write("            rivets.bind(playersList, {players: soccerTeam});\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul id=\"playersList\">\n");
      out.write("            <li rv-each-player=\"players\">\n");
      out.write("                <dl>\n");
      out.write("                    <dt>Name:</dt><dd>{ player.name }</dd>\n");
      out.write("                    <dt>Surname:</dt><dd>{ player.surname }</dd>\n");
      out.write("                    <dt>Shirt Number:</dt><dd>{ player.number }</dd>\n");
      out.write("                    <!-- This element will be rendered only if this property will be set -->\n");
      out.write("                    <dd rv-if=\"player.captain\"><b> Captain! </b></dd>\n");
      out.write("                </dl>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
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
