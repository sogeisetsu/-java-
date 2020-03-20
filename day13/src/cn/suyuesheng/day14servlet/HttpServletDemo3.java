package cn.suyuesheng.day14servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/gp")
public class HttpServletDemo3  extends HttpServlet {
    //获取请求参数的通用方法

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码问题
        req.setCharacterEncoding("utf-8");
        //第一种
        String one = req.getParameter("userimp");
        System.out.println(one);
        System.out.println("-------------------------");
        //two
        String[] two = req.getParameterValues("userimp");
        System.out.println(Arrays.toString(two));
        System.out.println(">--------------------------");
        //there
        Enumeration<String> three = req.getParameterNames();
        String str = null;
        while (three.hasMoreElements()){
            str=three.nextElement();
            System.out.println(str);
        }
        System.out.println("-----------------------------");
        //four
        Map<String,String[]> map = req.getParameterMap();
        Set<Map.Entry<String,String[]>> mapset=map.entrySet();
        Iterator<Map.Entry<String,String[]>> mapit = mapset.iterator();
        Map.Entry<String,String[]> st = null;
        while (mapit.hasNext()){
            st=mapit.next();
            System.out.println(st.getKey());
            System.out.println(Arrays.toString(st.getValue()));
            System.out.println("-----------");
        }
        System.out.println("-------------------------------");
    }
}
