package assessment5;


import java.io.File;
import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.DriverManager;

import java.util.Properties;

public class DBConnection {
	private static Connection con = null;
	
	static 
	{
		
		try
		{
			
			Properties props = new Properties();
			props.load(new FileInputStream(new File("D:\\dbconfig.properties")));
			
	
			Class.forName(props.getProperty("driver")); 
		
			
			 con = DriverManager.getConnection(props.getProperty("url"),props.getProperty("dbusername") , props.getProperty("dbpassword"));
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConn()
	{
		
		
	return con;
	}
	
}

	



