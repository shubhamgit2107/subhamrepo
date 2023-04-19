package ecom_Flashcart_genericUtility_externalfileutility;
/**
 * 
 * @author shubh
 * this class is for database connectivity
 * this contains
 * launch browser
 * get connection
 * create statement
 * execute query/update query
 * validate the query
 * close
 * the connection. 
 */


import java.rmi.AccessException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	Connection connection=null;
	Statement stat=null;
	String column_values;
	
	 /**
	  * @param url
	  * @param user
	  * @param password
	  * @author shubh
	  * this class is for database connectivity
	  * this contains
	  * launch browser
	  * create statement
	  *
	  */
	 public DataBaseUtility  (String url,String user,String password) throws SQLException
	 {
	
		 Driver dbDriver= new Driver();
		 DriverManager.registerDriver(dbDriver);
		connection=DriverManager.getConnection( url,user,password);
		 stat = connection.createStatement();
	 }
	 /**
	  * @param selectquery
	  * @param col_name
	  * 
	  * @author shubh
	  * this class is for database connectivity
	  * this contains
	  * execute query
	  * 
	  *	 /**
		  * @param selectquery
		  * @param col_name
		  * @param expectedData
		  * @author shubh
		  * this class is for database connectivity
		  * this contains
		  * validate query
		  * update query
		  *
		  */
	  
	 public ArrayList<String> getDataFromDataBase(String selectquery, String col_name) throws SQLException
	 {
		
	ArrayList<String> list= new ArrayList();
	ResultSet result = stat.executeQuery(selectquery);
	while(result.next())
	{
		 
		list.add(result.getString(col_name));
	}
	return list;
	 }
	 public boolean validateDataBase(String selectquery, String col_name,String expectedData)
	 {
	
		 ArrayList<String> list = null;
		try {
			list = getDataFromDataBase(selectquery, col_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 boolean flag=false;
		 for(String actualdata:list)
		 {
			 if(actualdata.equalsIgnoreCase(expectedData))
			 {
				 flag=true;
				 break;
			 }
		 }
		 return flag;
		 
		 
		 
		 
	 }
	  
	 /**
	  * 
	  * @author shubh
	  * this class is for database connectivity
	  * this contains
	  * validate query
	  * 
	  *
	  */
	 public int updateQuery(String nonselectquery) throws SQLException
	 {
		int result = stat.executeUpdate(nonselectquery);
		 if(result==1)
		 {
			 System.out.println("table updated");
			 
		 }
		 else
		 {
			 System.out.println("table not updated"); 
		 }
		 return result;
	 }
	 public void closeConnection() 
	 {
		 /**
		  * 
		  * @author shubh
		  * this class is for database connectivity
		  * this contains
		  * close connection
		  * 
		  *
		  */
		 try {
			 
		 
		 connection.close();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		
		 System.out.println("connection close");
		 }
		 
	 }
	 
	 
		 
		 
	

}







