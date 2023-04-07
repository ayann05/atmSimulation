/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksimulation;

import java.sql.*;


/**
 *
 * @author ayanb
 */

//Steps included in JDBC Connectivity are :
//-> Register the Driver
//        Class.forName(com.mysql.cj.jdbc.Driver);
//-> Create connection
//           Connection c;
//           c=DriverManager.getConnection("jdbc:mysql://localhost:3306"); to run on by default local host that is bening created by mysql
//           now to run it on desired sql database then 
//           c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
//-> Create Statement
//            Statement s;
//            s = c.createStatement();
//-> Execute Query
//-> Close Connection


public class conn {
    
    Connection c;
    Statement s;
    
    public conn()
    {
        try {
            //registering the driver explicitly
//            Class.forName(com.mysql.cj.jdbc.Driver);
            
//            c = DriverManager.getConnection("jdbc:mysql://localhost:3306");
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
            
            
            //create statement
            s = c.createStatement();
            
            //import a library
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
