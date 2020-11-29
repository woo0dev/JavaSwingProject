/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.io.*;
import java.util.*;


/**
 *
 * @author tksml
 */
public class DB_MAN {
    String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";          //MS-SQL JDBC Driver
    String strURL = "jdbc:sqlserver://10.40.41.55:1433;DatabaseName=Automobile_A";  //MS-SQL JDBC Url
    String strUser = "sa";                                                      //User ID
    String strPWD = "inha1958";                                                 //Password
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException{
        try{
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL,strUser,strPWD);
            DB_stmt = DB_con.createStatement();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
    }
    
    public void dbClose() throws IOException{
        try{
            DB_con.close();
            DB_stmt.close();
        }catch (Exception e){
            System.out.println("SQLException: "+ e.getMessage());
        }
        
    }
}
