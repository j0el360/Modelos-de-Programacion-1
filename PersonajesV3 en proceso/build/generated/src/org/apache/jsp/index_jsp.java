package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script>\n");
      out.write("        function dibujar(){\n");
      out.write("                    \n");
      out.write("                     var canvas = document.getElementById(\"micanvas\");\n");
      out.write("                     var lapiz = canvas.getContext(\"2d\");\n");
      out.write("                    var img = new Image();\n");
      out.write("                    img.src = \"Mazo.png\";\n");
      out.write("                   \n");
      out.write("                    lapiz.drawImage(img, 5, 5);\n");
      out.write("                    }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"dibujar()\">\n");
      out.write("       <canvas height=\"200px\" width=\"200px\" id=\"micanvas\"></canvas>\n");
      out.write("        <form method=\"POST\" action=\"servletRol\">\n");
      out.write("        <select name=\"personaje\">\n");
      out.write("            <option value=\"1\" name=\"Hechicero\">Hechicero</option>\n");
      out.write("            <option value=\"2\" name=\"Humano\">Humano</option>\n");
      out.write("            <option value=\"3\" name=\"Enano\">Enano</option>\n");
      out.write("            <option value=\"4\" name=\"Elfo\">Elfo</option>\n");
      out.write("        </select>\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        <input type=\"submit\" value=\"crear\" id=\"no\"/>\n");
      out.write("        </form>\n");
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
