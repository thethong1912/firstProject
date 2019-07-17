/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltai.conn;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Win 10
 */
public class MyConnection implements Serializable{
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conn;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProductManage","sa","luongtai1999");
        return conn;
    }
}
