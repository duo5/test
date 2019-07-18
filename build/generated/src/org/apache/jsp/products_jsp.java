package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- SINGLE PRODUCT -->\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-7 col-sm-6\">\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <img src=\"img/single-product.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-5 col-sm-6\">\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <h4>Shoes Modern</h4>\n");
      out.write("                                <h5>$24</h5>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odit aperiam tempora ullam aliquid\n");
      out.write("                                    optio quae maiores necessitatibus, obcaecati ad, minima rem eos eius eum, dolores vel animi\n");
      out.write("                                    dolorum, saepe? Ullam.</p>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maxime impedit nulla in obcaecati\n");
      out.write("                                    quam, quae nostrum aut error, ratione delectus</p>\n");
      out.write("                                <button type=\"button\" class=\"btn button\"><i class=\"fa fa-shopping-cart\"></i>ADD TO CART</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sp-content\">\n");
      out.write("                        <h5>DESCRIPTION</h5>\n");
      out.write("                        <div class=\"sp-desc\">\n");
      out.write("                            <span>Shoes Modern</span>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda, dolorem illum ea veniam\n");
      out.write("                                architecto quo dignissimos qui totam hic ullam commodi, ducimus rerum sit iste asperiores omnis\n");
      out.write("                                nulla provident repellendus.</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- END SINGLE PRODUCT -->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
