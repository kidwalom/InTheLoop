import java.sql.*;
import java.util.*;


public class DatabaseInterface {


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://l72.20.3.182:3306/homedatabase";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args){
        //Setup variables
        Connection conn = null;
        Statement stmnt = null;


        //Register JDBC driver
        Class.forname("com.mysql.jdbc.Driver");

        //Create the connection to the database.
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        addEntryToTable(conn,"test","test_category",25,25);

    }

    public static void addEntryToTable( Connection conn,String[] eventname, String[] category, int population, float timestamp){

        //Execute the  entry in the approrpriate statement


        String query = "INSERT INTO  event_default_category(Event_Name,Population,timestamp)" + "(?,?,?)";


        //Create prepared statements for the string query.

        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, eventname);
        preparedStatement.setString(2,  population);
        preparedStatement.setString(3, timestamp);
        preparedStatement.executeUpdate();

       //Determine Table name

    }
}