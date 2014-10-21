package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import edu.pitt.utilities.Security;

public final class personalInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");


   /* Security security = new Security();
    if (security.checkHijackedSession(session, request)){
	response.sendRedirect("index.jsp");
}

    if (Security.checkHijackedSession(session, request)) {
        response.sendRedirect("index.jsp");
    }*/


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../../docs-assets/ico/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>Resume Management System - Personal Information</title><!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/custom.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"sr-only\">Toggle navigation</span></button> <a class=\"navbar-brand\" href=\"#\">Student Resume System</a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"index.php\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Create Resume</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Edit Resume</a></li>\r\n");
      out.write("                    <li><a href=\"#\">View Resume</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container theme-showcase\" style=\"width:900px\">\r\n");
      out.write("        <div class=\"panel panel-primary\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("                <h3 class=\"panel-title\"><strong>Create Your Resume</strong></h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"page-header\">\r\n");
      out.write("                    <form class=\"frmPersonalInfo\" method=\"post\" action=\"processPersonalInfo\">\r\n");
      out.write("                        <h2 class=\"form-signin-heading\">Personal Information</h2><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtFirstName\" name=\"txtFirstName\" placeholder=\"First Name\" autofocus=\"\" required><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtLastName\" name=\"txtLastName\" placeholder=\"LastName\" required><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtAddressLine1\" name=\"txtAddressLine1\" placeholder=\"Street Address\" required><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtAddressLine2\" name=\"txtAddressLine2\" placeholder=\"Address\"><br>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtCity\" name=\"txtCity\" placeholder=\"City\" required style=\"width:50%; display:inline\">\r\n");
      out.write("                                 \r\n");
      out.write("                        <select class=\"form-control\" id=\"txtState\" name=\"txtState\" required style=\"width:49%; display:inline\">\r\n");
      out.write("                            <option value=\"\">State</option>\r\n");
      out.write("                            <option value=\"AL\">Alabama</option>\r\n");
      out.write("                            <option value=\"AK\">Alaska</option>\r\n");
      out.write("                            <option value=\"AZ\">Arizona</option>\r\n");
      out.write("                            <option value=\"AR\">Arkansas</option>\r\n");
      out.write("                            <option value=\"CA\">California</option>\r\n");
      out.write("                            <option value=\"CO\">Colorado</option>\r\n");
      out.write("                            <option value=\"CT\">Connecticut</option>\r\n");
      out.write("                            <option value=\"DE\">Delaware</option>\r\n");
      out.write("                            <option value=\"DC\">District Of Columbia</option>\r\n");
      out.write("                            <option value=\"FL\">Florida</option>\r\n");
      out.write("                            <option value=\"GA\">Georgia</option>\r\n");
      out.write("                            <option value=\"HI\">Hawaii</option>\r\n");
      out.write("                            <option value=\"ID\">Idaho</option>\r\n");
      out.write("                            <option value=\"IL\">Illinois</option>\r\n");
      out.write("                            <option value=\"IN\">Indiana</option>\r\n");
      out.write("                            <option value=\"IA\">Iowa</option>\r\n");
      out.write("                            <option value=\"KS\">Kansas</option>\r\n");
      out.write("                            <option value=\"KY\">Kentucky</option>\r\n");
      out.write("                            <option value=\"LA\">Louisiana</option>\r\n");
      out.write("                            <option value=\"ME\">Maine</option>\r\n");
      out.write("                            <option value=\"MD\">Maryland</option>\r\n");
      out.write("                            <option value=\"MA\">Massachusetts</option>\r\n");
      out.write("                            <option value=\"MI\">Michigan</option>\r\n");
      out.write("                            <option value=\"MN\">Minnesota</option>\r\n");
      out.write("                            <option value=\"MS\">Mississippi</option>\r\n");
      out.write("                            <option value=\"MO\">Missouri</option>\r\n");
      out.write("                            <option value=\"MT\">Montana</option>\r\n");
      out.write("                            <option value=\"NE\">Nebraska</option>\r\n");
      out.write("                            <option value=\"NV\">Nevada</option>\r\n");
      out.write("                            <option value=\"NH\">New Hampshire</option>\r\n");
      out.write("                            <option value=\"NJ\">New Jersey</option>\r\n");
      out.write("                            <option value=\"NM\">New Mexico</option>\r\n");
      out.write("                            <option value=\"NY\">New York</option>\r\n");
      out.write("                            <option value=\"NC\">North Carolina</option>\r\n");
      out.write("                            <option value=\"ND\">North Dakota</option>\r\n");
      out.write("                            <option value=\"OH\">Ohio</option>\r\n");
      out.write("                            <option value=\"OK\">Oklahoma</option>\r\n");
      out.write("                            <option value=\"OR\">Oregon</option>\r\n");
      out.write("                            <option value=\"PA\">Pennsylvania</option>\r\n");
      out.write("                            <option value=\"RI\">Rhode Island</option>\r\n");
      out.write("                            <option value=\"SC\">South Carolina</option>\r\n");
      out.write("                            <option value=\"SD\">South Dakota</option>\r\n");
      out.write("                            <option value=\"TN\">Tennessee</option>\r\n");
      out.write("                            <option value=\"TX\">Texas</option>\r\n");
      out.write("                            <option value=\"UT\">Utah</option>\r\n");
      out.write("                            <option value=\"VT\">Vermont</option>\r\n");
      out.write("                            <option value=\"VA\">Virginia</option>\r\n");
      out.write("                            <option value=\"WA\">Washington</option>\r\n");
      out.write("                            <option value=\"WV\">West Virginia</option>\r\n");
      out.write("                            <option value=\"WI\">Wisconsin</option>\r\n");
      out.write("                            <option value=\"WY\">Wyoming</option>\r\n");
      out.write("                            <option value=\"AS\">American Samoa</option>\r\n");
      out.write("                            <option value=\"GU\">Guam</option>\r\n");
      out.write("                            <option value=\"MP\">Northern Mariana Islands</option>\r\n");
      out.write("                            <option value=\"PR\">Puerto Rico</option>\r\n");
      out.write("                            <option value=\"UM\">United States Minor Outlying Islands</option>\r\n");
      out.write("                            <option value=\"VI\">Virgin Islands</option>\r\n");
      out.write("                        </select><br><br>\r\n");
      out.write("                        \r\n");
      out.write("                                             \r\n");
      out.write("                        \r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtProvince\" name=\"txtProvince\" placeholder=\"Province\" style=\"width:40%; display:inline\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtCountry\" name=\"txtCountry\" placeholder=\"Country\" style=\"width:38%; display:inline\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtPostalCode\" name=\"txtPostalCode\" placeholder=\"Postal Code\" required style=\"width:20%; display:inline\"><br><br>\r\n");
      out.write("                        <input type=\"tel\" class=\"form-control\" id=\"txtPhone\" name=\"txtPhone\" placeholder=\"Phone Number\" required style=\"width:50%; display:inline\">\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"txtEmail\" name=\"txtEmail\" placeholder=\"Email\" required style=\"width:49%; display:inline\"><br><br>\r\n");
      out.write("                        \r\n");
      out.write("                        <label> Are You Legally Eligible to Work in the US?</label>\r\n");
      out.write("                            <input type=\"radio\" id=\"rdoUSEligible\" name=\"rdoUSEligible\" value=\"1\" checked=\"checked\" required=\"required\"> Yes\r\n");
      out.write("                            <input type=\"radio\" id=\"rdoUSEligible\" name=\"rdoUSEligible\" value=\"0\" checked=\"checked\" required=\"required\"> No<br><br>\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary\" type=\"submit\" name=\"btnSubmitPersonalInfo\" id=\"btnSubmitPersonalInfo\">Next</button>\r\n");
      out.write("                    </form><br>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!-- /container -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
