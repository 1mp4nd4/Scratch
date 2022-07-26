package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionScratch
{
	public String driver="com.mysql.jdbc.Driver";
	
	public Connection getConnection() throws ClassNotFoundException
	{
		Connection conexion=null;
		try
		{
			Class.forName(driver);
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto22025","root","B8000ftq");
		}
		catch(SQLException e)
		{
			System.out.println("Error de Conexion");
			
		}		
		return conexion;
	}
}
	