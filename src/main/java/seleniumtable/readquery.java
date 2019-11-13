package seleniumtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class readquery {
    public static void main(String[] args) throws Exception{

        Connection con = null;
        String dbUrl ="jdbc:mysql://localhost/" + "selenium" + "?user=" + "root" + "password=" + "root" + "&useUnicode=true&characterEncoding=UTF-8";
        String driver = "com.mysql.cj.jdbc.Driver";
        String username="root";
        String password="root";

        Class.forName(driver).newInstance();
        con = DriverManager.getConnection(dbUrl,username,password);

        System.out.println("connection established successfully");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from credentials");

        while(rs.next()){
            System.out.println("usernmame:" + rs.getString("username")+"--"+ "password:" + rs.getString("password") +"--" + "dob:" + rs.getString("dob") +"--" + "attempts:" + rs.getString("attempts") +"--" + "result:" + rs.getString("result"));
        }
        rs.close();
    }
}
