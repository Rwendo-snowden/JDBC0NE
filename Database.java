import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    public static void main (String[] args){
        String host="jdbc:mysql://localhost/";
        String usern="root";
        String psw="";
        
        Connection conn=null;

        //
        try{
           // Class.forName("com.mysql.Jdbc.Driver");

            conn=DriverManager.getConnection(host, usern, psw);
            System.err.println("xampp connected sucessFully");

        Statement stmt=conn.createStatement();
        stmt.executeUpdate("CREATE DATABASE CYBER");
        System.err.println("Database created successfully");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }


 }