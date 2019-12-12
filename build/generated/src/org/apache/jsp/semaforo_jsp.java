package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class semaforo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 50px;height: 300px;background-color: black\"> \n");
      out.write("            \n");
      out.write("        <div id=\"verde\" style=\"border-radius: 150PX; width: 50px; height: 50px; background:black\" onclick=\"cambio1()\">>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <DIV id=\"amarillo\" style=\"border-radius: 150px; width: 50px; height: 50px; background: black \"onclick=\"cambio2()\">>\n");
      out.write("            \n");
      out.write("        </DIV>\n");
      out.write("        <div id=\"rojo\" style=\"border-radius: 150px; width: 50px;height: 50px;background: black\" onclick=\"cambio3()\">>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        <h1>Calculador</h1>\n");
      out.write("        <label>Numero 1</label>\n");
      out.write("        <input class=\"control-form\" id=\"n1\" type=\"number\">\n");
      out.write("        <label>Numero 2</label>\n");
      out.write("        <input class=\"control-form\" id=\"n2\" type=\"number\">\n");
      out.write("        <button id=\"tot\">Send</button>\n");
      out.write("        <input class=\"control-form\" id=\"result\">\n");
      out.write("        <script>\n");
      out.write("            function cambio1(){\n");
      out.write("                document.getElementById(\"verde\").style.backgroundColor = \"green\"; \n");
      out.write("                document.getElementById(\"amarillo\").style.backgroundColor = \"black\";\n");
      out.write("                document.getElementById(\"rojo\").style.backgroundColor = \"black\";\n");
      out.write("            };\n");
      out.write("            function cambio2(){\n");
      out.write("                document.getElementById(\"verde\").style.backgroundColor = \"black\"; \n");
      out.write("                document.getElementById(\"amarillo\").style.backgroundColor = \"yellow\";\n");
      out.write("                document.getElementById(\"rojo\").style.backgroundColor = \"black\";\n");
      out.write("            };\n");
      out.write("            function cambio3(){\n");
      out.write("                document.getElementById(\"verde\").style.backgroundColor = \"black\"; \n");
      out.write("                document.getElementById(\"amarillo\").style.backgroundColor = \"black\";\n");
      out.write("                document.getElementById(\"rojo\").style.backgroundColor = \"red\";\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function (){\n");
      out.write("              $(\"#tot\").click(function (){\n");
      out.write("                  $ n1=$(\"#n1\").values();\n");
      out.write("                  $ n2=$(\"#n2\").values();\n");
      out.write("                  $ tot=parseInt($n1)+parseInt(#n2);\n");
      out.write("                  $(\"#result\").text($tot);\n");
      out.write("              }) ; \n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        </script>\n");
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
