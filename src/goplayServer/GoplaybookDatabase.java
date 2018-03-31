package goplayServer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class GoplaybookDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{ 
	
				Class.forName("org.postgresql.Driver"); 
				String dbName = "goplaybookdb3912"; 
				String userName = "goplaybookuser543"; 
				String password = "goplaybookuser54324x7"; 
				String hostname = "goplaybookdb.cqyqdrjnqz1o.ap-south-1.rds.amazonaws.com"; 
				String port ="5432"; 
				String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
				
				System.out.println("heloo everything is successfull "+jdbcUrl);
				//Logger.trace("Getting remote connection with connection string from environment variables."); 
				Connection con = DriverManager.getConnection(jdbcUrl); 
				//LOGGER.info("Remote connection successful.");
				System.out.println("hello world");
				
	}
				public static String getStatus(String jdbcUrl) throws IOException {
			        String result = "";
			            URL siteURL = new URL(jdbcUrl);
			            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
			            connection.setRequestMethod("GET");
			            connection.connect();
			 
			            int code = connection.getResponseCode();
			            System.out.println(code);
			            if (code == 200) {
			            	result = "Server is Working";
			            }
						return result;
		
			    
//				try
//				{
//					
//				}catch(Exception e) {}
//				
//				finally {
//					con.close();
//				}

			}
}
