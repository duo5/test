package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.ItemModel;
import model.CartModel;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SHOP GAME GIÁ RẺ</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cssOFsite.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"js/jsOFsite.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        ");
   CartModel cart = (CartModel) session.getAttribute("cart");
            if (cart == null) {
                cart = new CartModel();
                session.setAttribute("cart", cart);
            } 
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <main>  \n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <h4>Cart<span style=\"padding-right: 10px;background-color: \"><img src=\"https://cdn4.iconfinder.com/data/icons/Primo_Icons/PNG/48x48/shopping_cart.png\"></span></h4>\n");
      out.write("                    <div class=\"col1\">\n");
      out.write("                        <table >\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Image</th>\n");
      out.write("                                <th>ProductName</th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Price</th>\n");
      out.write("                                <th>TotalPrice</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
for(Map.Entry<Integer,ItemModel> entry:cart.getListProduct().entrySet()){
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><img src=\"");
      out.print(entry.getValue().getProduct().getProductImage());
      out.write("\" style=\"margin-left: 5px;width: 100px;height: 90px;\"></td>\n");
      out.write("                                <td><a href=\"#\">");
      out.print(entry.getValue().getProduct().getProductName());
      out.write("</a></td>\n");
      out.write("                                <td>");
      out.print(entry.getValue().getQuantity() );
      out.write("</td>\n");
      out.write("                                <td>$");
      out.print(entry.getValue().getProduct().getProductPrice() );
      out.write("</td>\n");
      out.write("                                <td>$");
      out.print(cart.total());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        <h2 style=\"padding-bottom: 20px;\">What do you want to do?</h2>\n");
      out.write("                        <p style=\"padding-bottom: 20px;\">Choose if you want to use discount codes, gift cards, reward points or shipping cost estimates.</p>\n");
      out.write("                        <div class=\"sale\">\n");
      out.write("                            <h5>Apply your discount code:<span style=\"margin-left: 20px;\"><input style=\"width: 400px;height: 30px;\" type=\"text\" name=\"salecode\"></span><span><button type=\"button\" class=\"btn btn-warning\">Use This Code</button></span></h5>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"ads\">\n");
      out.write("                            <img style=\"width: 700px; height: 150px;\" src=\"http://2.bp.blogspot.com/-we3XdK_iBp0/UH7aGfiaEqI/AAAAAAAAAAs/3lp9bAO8n5Y/s1600/banner+dia+oc.JPG\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"v\">\n");
      out.write("                            <button style=\"float: left;margin-left: 20px;margin-top: 20px;\" type=\"button\" class=\"btn btn-warning\">Continnue</button>\n");
      out.write("                            <button style=\"margin-left: 650px;margin-top: 20px;margin-bottom: 10px;\" type=\"button\" class=\"btn btn-warning\">Payment</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </main>\n");
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
