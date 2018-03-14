/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system.management;

/**
 *
 * @author user
 */
import java.sql.*;

/**
 *
 * @author user
 */
public class DBConnect {
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    public DBConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
            stmt=con.createStatement();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    /*public void getData()
    {
        try
        {
        String Query="select * from admin";
        rs=stmt.executeQuery(Query);
        while(rs.next())
        {
            String id=rs.getString("admin_id");
            String name=rs.getString("admin_user");
            String password=rs.getString("admin_password");
            System.out.println("id" + id+ "NAME"+ name + "password"+ password);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }*/
    
}
