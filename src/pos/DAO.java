/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos;

import java.sql.*;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

public class DAO {
        String className="com.mysql.jdbc.Driver";
    private static final String HOST="localhost";
    private static final String  MYSQLPORT="8000";
    private static final String DB_NAME="Sales pro";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static Connection connection;    
    public Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection(
        String.format("jdbc:mysql://%s/%s",HOST,DB_NAME),
        USERNAME,
        PASSWORD);
        }
        

    catch(SQLException se){
        printSQLException(se);
    }
        return null;
        
    }

        
        
    
    
     
    private static void printSQLException(SQLException se) {
        for(Throwable e:se){
            if (se instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQL State:"+((SQLException)e).getSQLState());
                System.err.println("SQL Error code:"+((SQLException)e).getErrorCode());
                System.err.println("SQL Message:"+se.getMessage());
                
                Throwable t=se.getCause();
                while(t!=null){
                  System.err.println("SQL Error Cause:"+t);
                  t=t.getCause();
                }
                
            }
        }
        
    }
}
