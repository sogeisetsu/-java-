package cn.suyuesheng.day13servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 通过注解的方式部署Servlet3.0
 * @author 苏月晟
 */
@WebServlet(urlPatterns = "/d13",loadOnStartup = 2)
//@WebServlet("/d13") 这样配置也可以
public class ServletDemo3 implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init  创建Servlet对象");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("开始  service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
