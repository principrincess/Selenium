package seleniumtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataToMySql {
    public static void main(String[] args) throws Exception {

        Connection con = null;
        String dbUrl = "jdbc:mysql://localhost/" + "selenium" + "?user=" + "root" + "password=" + "root" + "&useUnicode=true&characterEncoding=UTF-8";
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";

        Class.forName(driver).newInstance();
        con = DriverManager.getConnection(dbUrl, username, password);

        System.out.println("connection established successfully");

        PreparedStatement ps = con.prepareStatement("INSERT into credentials(username,password,dob,attempts,result) VALUES('demouser','demopassword','2019-10-28','1','pass')");
        ps.executeUpdate();
        con.close();
    }
}
