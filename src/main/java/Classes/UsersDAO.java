package Classes;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Classes.ConnectionScratch;


public class UsersDAO {
	
	Connection conexion;
	
	public UsersDAO() throws ClassNotFoundException
	{
		ConnectionScratch con=new ConnectionScratch();
		conexion=con.getConnection();
	}
	
	//validates the user from a list in the database
	public boolean Validate(Users user) throws SQLException {
		PreparedStatement prepstate;
		ResultSet results;
		String email = user.getEmail();
		String password = user.getPassword();
		
		if( email != null && password !=null ) {
			
			boolean validEmail;
			boolean validPass;
			prepstate = conexion.prepareStatement
					("SELECT * FROM users WHERE email = " + email + " and password =" + password);
			try{
				results = prepstate.executeQuery();
			}
			catch(SQLException exception) {
				System.out.println("Email not found");
				throw exception;
			}
			
			email = results.getString(email);
			password = results.getString(password);
			
			if()
			
		
			
		
		}
	
	}
}
	
	//
	//register;
	
	


