/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2016-10-11 10:41:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("\t\t<title>登陆</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\t@charset \"utf-8\";\r\n");
      out.write("\t\t\t*{margin: 0; padding: 0; font-family: \"microsoft yahei\";}\r\n");
      out.write("\t\t\tbody,html{width: 100%;background-color: #F0F0F0;}\r\n");
      out.write("\t\t\t.head{\r\n");
      out.write("\t\t\t\theight: 50px;\r\n");
      out.write("\t\t\t\tline-height: 50px;\r\n");
      out.write("\t\t\t\ttext-align:center;\r\n");
      out.write("\t\t\t\tbackground-color: #F7F7F8;\r\n");
      out.write("\t\t\t\tfont-size: 18px;\r\n");
      out.write("\t\t\t\tborder-bottom: 1px solid #C8C8C8;\r\n");
      out.write("\t\t\t\tcolor: #000;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.userInfo{\r\n");
      out.write("\t\t\t\tmargin: 20px 0;\r\n");
      out.write("\t\t\t\tbackground-color: #fff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.userInfo .mlogin{\r\n");
      out.write("\t\t\t\tdisplay: -webkit-box;\r\n");
      out.write("\t\t\t    display: -webkit-flex;\r\n");
      out.write("\t\t\t    -webkit-box-align: center;\r\n");
      out.write("\t\t\t    -webkit-align-items: center;\r\n");
      out.write("\t\t\t    border-bottom: 1px solid #DDD;\r\n");
      out.write("\t\t\t    padding: 10px 15px;\r\n");
      out.write("\t\t\t    color: #6C6C6C;\r\n");
      out.write("\t\t\t    text-align: left;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.userInfo .mlogin .label{width: 5em;}\r\n");
      out.write("\t\t\t.field-control{\r\n");
      out.write("\t\t\t\t-webkit-box-flex: 1;\r\n");
      out.write("   \t\t\t\t-webkit-flex: 1;\r\n");
      out.write("   \t\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tinput{\r\n");
      out.write("\t\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\t\t-webkit-appearance: none;\r\n");
      out.write("\t\t\t    width: 100%;\r\n");
      out.write("\t\t\t    padding: 0;\r\n");
      out.write("\t\t\t    border: 0;\r\n");
      out.write("\t\t\t    background-color: transparent;\r\n");
      out.write("\t\t\t    -webkit-user-select: text;\r\n");
      out.write("    \t\t\tcursor: auto;\r\n");
      out.write("    \t\t\ttext-rendering: auto;\r\n");
      out.write("\t\t\t    color: initial;\r\n");
      out.write("\t\t\t    letter-spacing: normal;\r\n");
      out.write("\t\t\t    word-spacing: normal;\r\n");
      out.write("\t\t\t    text-transform: none;\r\n");
      out.write("\t\t\t    text-indent: 0px;\r\n");
      out.write("\t\t\t    text-shadow: none;\r\n");
      out.write("\t\t\t    display: inline-block;\r\n");
      out.write("\t\t\t    text-align: start;\r\n");
      out.write("\t\t\t    outline: #000;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.submit{\r\n");
      out.write("\t\t\t\twidth: 94%;\r\n");
      out.write("\t\t\t\tmargin: 0 3%;\r\n");
      out.write("\t\t\t    height: 40px;\r\n");
      out.write("\t\t\t    line-height: 40px;\r\n");
      out.write("\t\t\t    border: 1px solid #f40;\r\n");
      out.write("\t\t\t    border-radius: 5px;\r\n");
      out.write("\t\t\t    color: #fff;\r\n");
      out.write("\t\t\t    background-color: #f40;\r\n");
      out.write("\t\t\t    text-align: center;\r\n");
      out.write("\t\t\t    font-size: 18px;\r\n");
      out.write("\t\t\t    display: block;\r\n");
      out.write("\t\t\t    text-decoration: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"head\">智能社账户登陆</div>\r\n");
      out.write("\t\t<form action=\"login\" method=\"get\">\r\n");
      out.write("\t\t<div class=\"userInfo\">\r\n");
      out.write("\t\t\t<div class=\"mlogin\">\r\n");
      out.write("\t\t\t\t<div class=\"label\">登陆</div>\r\n");
      out.write("\t\t\t\t<div class=\"field-control\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-required\" name=\"username\" placeholder=\"手机号/邮箱/会员名\" value=\"\" id=\"username\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"mlogin\">\r\n");
      out.write("\t            <div class=\"label\">登录密码</div>\r\n");
      out.write("\t            <div class=\"field-control\">\r\n");
      out.write("\t                <input type=\"password\" class=\"input-required\" name=\"password\" placeholder=\"请输入密码\" value=\"\" id=\"password\">\r\n");
      out.write("\t            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <input type=\"submit\" value=\"提交\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("        <a href=\"");
      out.print(request.getContextPath() );
      out.write("/htmls/123.html\" >测试</a>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
