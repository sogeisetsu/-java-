package cn.suyuesheng.day14servlet;


import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;

//几个路径定义规则
@WebServlet({"/day14","*.do"})
public class HttpServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">============================");
        System.out.println("get from HttpServletDemo2");
        System.out.println(req);
        System.out.println(req.getMethod());
        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println("获取get方式的请求参数: "+req.getQueryString());
        System.out.println(req.getRequestURL().toString());
        System.out.println(req.getRequestURI());
        System.out.println("协议和版本："+req.getProtocol());
        System.out.println("获取客户机ip地址："+req.getRemoteAddr());
        System.out.println(">=============================");
        System.out.println("请求头-----------------------");
        Enumeration<String> headers = req.getHeaderNames();
        while(headers.hasMoreElements()){
            String name = headers.nextElement();
            String value = req.getHeader(name);
            System.out.println(name+"-----"+value);
        }
        System.out.println("请求头结束-------------------");
        System.out.println("检测来自哪里>-----------------------------");
        System.out.println("防盗链演示");
        String referer = req.getHeader("referer");
        if(referer!=null)
        {if(referer.contains("BiaoDan")){
            System.out.println("正经来的");
        }else{
            System.out.println("假的");
        }
        System.out.println("检测来自哪里>-----------------------------");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">=============================");
        System.out.println("post from HttpServletDemo2");
        System.out.println(req);
        //返回发出此请求的HTTP方法的名称，例如GET，POST或PUT。
        System.out.println("请求的http方法名称"+req.getMethod());
        System.out.println("请求的虚拟目录"+req.getContextPath());
        System.out.println("Servlet路径"+req.getServletPath());
        System.out.println("get方式获取请求参数"+req.getQueryString());
        System.out.println("获取url"+req.getRequestURL());
        System.out.println("协议和版本信息"+req.getProtocol());
        System.out.println("客户机ip地址："+req.getRemoteAddr());
        System.out.println("user-agent:-----"+req.getHeader("user-agent"));
        System.out.println(">=============================");
        System.out.println("请求体");
        //只有post有请求体
//        BufferedReader ti = req.getReader();
//        String str = null;
//        String[] tis= null;
//        while((str=ti.readLine())!=null){
//            System.out.println("请求体为"+str);
//            tis=str.split("&");
//        }
//        System.out.println(">---------------------");
//        String name=null;
//        String value = null;
//        for(String tt:tis){
//            String[] tiss = tt.split("=");
//            name = tiss[0];
//            value=tiss[1];
//            System.out.println(name+"-----"+value);
//        }
        /*不能在过滤器中读取一次二进制流（字符流），
        又在另外一个Servlet中读取一次，
        即一个InputSteam(BufferedReader)对象在被读取完成后，
        将无法再次被读取。*/
        System.out.println("实验获取请求体的方法时请把另一个注释掉");
        //使用另一种方法获取请求体
        System.out.println("使用另一种方法获取请求体：----------------------");
        ServletInputStream inputStream = req.getInputStream();
        String st = null;
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()){
            st=scanner.next();
            System.out.println("用getInputStream()方法获取的头：--  "+st);
        }
    }
}
