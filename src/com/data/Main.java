package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
	
	//DTO[] dto=new DTO[30];
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
		 Statement stmt = conn.createStatement();
  		ResultSet rs = stmt.executeQuery("select * from table1");
  		while (rs.next()) {
     			int id1 = rs.getInt("id");
     			String name1 = rs.getString("name");
     			int phone1 = rs.getInt("phone");
     			String address1 = rs.getString("address");
     		DTO dto= new DTO(id1,name1,phone1,address1);
     			 dto.printvalues(id1, name1, phone1, address1);
	}}}