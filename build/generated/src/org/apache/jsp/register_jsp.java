package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cssRegister.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/cssOFsite.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <main>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row main\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title text-center\">\n");
      out.write("                                <h1 class=\"title\">Company Name</h1>\n");
      out.write("                                <h1 class=\"title\" style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                                <hr />\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"main-login main-center\">\n");
      out.write("                            <form class=\"form-horizontal\" method=\"post\" action=\"#\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"name\" class=\"cols-sm-2 control-label\">Your Name</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                            <span><input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\"  placeholder=\"Enter your Name\"/></span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <span id=\"user-result-name\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\" class=\"cols-sm-2 control-label\">Your Email</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope\"></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Enter your Email\"/>\n");
      out.write("                                        \n");
      out.write("                                        </div>\n");
      out.write("                                        <span id=\"user-result-email\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"username\" class=\"cols-sm-2 control-label\">Username</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\"  placeholder=\"Enter your Username\"/>\n");
      out.write("                                           \n");
      out.write("                                        </div>\n");
      out.write("                                        <span id=\"user-result-username\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\"  placeholder=\"Enter your Password\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <span id=\"user-result-password\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"confirm\" class=\"cols-sm-2 control-label\">Confirm Password</label>\n");
      out.write("                                    <div class=\"cols-sm-10\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"confirm\" id=\"confirm\"  placeholder=\"Confirm your Password\"/>\n");
      out.write("                                           \n");
      out.write("                                        </div>\n");
      out.write("                                        <span id=\"user-result-confirm\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group \">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary btn-lg btn-block login-button\">Register</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"login-register\">\n");
      out.write("                                    <a href=\"login.jsp\">Login</a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#name\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var full_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_fullname_ajax(full_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\"#email\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var email = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_email_ajax(email);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                  $(\"#username\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var username = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_username_ajax(username);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                $(\"#password\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var password = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_password_ajax(password);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("                function check_fullname_ajax(fullname) {\n");
      out.write("                    $(\"#user-result-name\").html('<img src=\"img/ajax-loader.gif\"/>');\n");
      out.write("                    $.post('checkFullName', {'fullname': fullname}, function (data) {\n");
      out.write("                        $(\"#user-result-name\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("                    function check_email_ajax(email) {\n");
      out.write("                    $(\"#user-result-email\").html('<img src=\"img/ajax-loader.gif\"/>');\n");
      out.write("                    $.post('checkEmailController', {'email': email}, function (data) {\n");
      out.write("                        $(\"#user-result-email\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("                function check_username_ajax(username) {\n");
      out.write("                    $(\"#user-result-username\").html('<img src=\"img/ajax-loader.gif\"/>');\n");
      out.write("                    $.post('checkUserName', {'user': username}, function (data) {\n");
      out.write("                        $(\"#user-result-username\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("                function check_password_ajax(password) {\n");
      out.write("                    $(\"#user-result-password\").html('<img src=\"img/ajax-loader.gif\"/>');\n");
      out.write("                    $.post('checkpassword', {'Password': password}, function (data) {\n");
      out.write("                        $(\"#user-result-password\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
