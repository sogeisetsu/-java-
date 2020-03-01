package club.suyuesheng.test;

import club.suyuesheng.dbc.DatabaseConnection;
import club.suyuesheng.factory.ServiceFactory;
import club.suyuesheng.query.Login;
import club.suyuesheng.vo.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class AD {
    public static void main(String[] args) throws Exception {
        //获取连接
        Connection con = DatabaseConnection.getConnection();
        DatabaseConnection.close();
        JdbcTemplate tt = DatabaseConnection.getTemplate();
        String sql = "SELECT * FROM user WHERE id=1";
        Map<String,Object> map =tt.queryForMap(sql);
        System.out.println(map);
        sql="SELECT count(*) FROM user WHERE id=2";
        long c = tt.queryForObject(sql, Long.class);
        System.out.println(c);
        User cc = new User("12", "dd");
        System.out.println(Login.query(cc));
        System.out.println(ServiceFactory.getUserServiceInstance(DatabaseConnection.getTemplate()).Query(cc));
        User dd=ServiceFactory.getUserServiceInstance(DatabaseConnection.getTemplate()).text(cc);
        System.out.println(dd);
    }
    @Test
    public void testUserServiceImpldotext(){
        System.out.println("hello");
    }
    @Test
    public void testBeanUtils(){
        /*
         * BeanUtils工具类，简化数据封装
		* 用于封装JavaBean的
		1. JavaBean：标准的Java类
			1. 要求：
				1. 类必须被public修饰
				2. 必须提供空参的构造器
				3. 成员变量必须使用private修饰
				4. 提供公共setter和getter方法
			2. 功能：封装数据
         */
        String name = "123";
        String password ="1599004343";
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("passWord", password);
        System.out.println(map);
        User user = new User();
        try {
            BeanUtils.populate(user, map);
            System.out.println(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testBeanUtilsTwo(){
        User user = new User("李四", "1494994343");
        try {
            BeanUtils.setProperty(user, "name", "张三");//这里设置的属性值必须和User类命名匹配
            BeanUtils.setProperty(user, "passWord", "159989898");
            System.out.println(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
