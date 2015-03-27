create function countTable()
returns countTable
	select(
	select Count(*)
	From //Name of database//)
	as //variable name for database//
	
create function increaseTable()
	{
	//variable for database// =++}return //variable for database//
	
	//Test code
	package com.acme.hrSchema;
import java.sql.*;
public class EmployeeTable
{
   public  static  ResultSet   read()
        throws SQLException
    {
        Connection          conn = DriverManager.getConnection
            ( "jdbc:mysql://localhost/hr?user=root&password=mysql-passwd" );
        PreparedStatement   ps = conn.prepareStatement( 
           "select * from hrSchema.EmployeeTable" );
        return ps.executeQuery();
    }
}
connect 'jdbc:derby:myDatabase;create=true';
create function employeeTable()
returns table
(
    employeeID int,
    firstName  varchar( 50 ),
    lastName   varchar( 50 ),
    birthday   date
)
language java
parameter style DERBY_JDBC_RESULT_SET
no sql
external name 'com.acme.hrSchema.EmployeeTable.read';