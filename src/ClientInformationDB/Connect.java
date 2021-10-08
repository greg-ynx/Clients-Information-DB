/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientInformationDB;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lyl-Lynx
 */
public class Connect {
    
    Connection connection;
    Statement statement;
    String SQL;
    String url;
    
    public Connect(String url){
        this.url = url;
    }

    public Connection connexionDatabase() {

      
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url);
        }
        catch (Exception e) 
        {
            System.err.println(e);//
        }
        System.out.println("cnx ok");
        return connection;
    }

 
   public Connection closeconnexion() {

        try {
            connection.close();
        } 
        catch (Exception e) {
            System.err.println(e);
        }
        return connection;
    }

    public ResultSet executionQuery(String sql) {
        connexionDatabase();
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {System.err.println(ex);//
        }
        return resultSet;
    }  
}  
 

