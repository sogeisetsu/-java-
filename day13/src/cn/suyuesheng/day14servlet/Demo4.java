package cn.suyuesheng.day14servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现请求转发
 * @author 苏月晟
 */
@WebServlet("/day14/demo4")
public class Demo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("访问demo4");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //共享数据
        req.setAttribute("method", req.getMethod());
        System.out.println("开始请求转发，跳转到demo5");
        System.out.println("访问demo4");
        //实现资源跳转
        //   /day14/demo5  别忘了'/'!!!!!
        req.getRequestDispatcher("/day14/demo5").forward(req, resp);

    }
}
