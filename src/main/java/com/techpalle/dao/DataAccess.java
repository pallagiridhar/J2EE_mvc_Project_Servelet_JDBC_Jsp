package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.techpalle.model.Student;

public class DataAccess {
	//4.
	public static ArrayList<Student> getStudent()
	{
		ArrayList<Student> al=new ArrayList<Student>();//empty array list
		//JDBC code
		Connection cn=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Giri@226");
		     st=cn.createStatement();
		    ResultSet rs= st.executeQuery("select * from student");
		       
		    if(rs !=null)
		    {
		        	while(rs.next() ==true)
		        	{
		        		//read each row from student table
		        		int sno=rs.getInt(1);
		        		String sname=rs.getString(2);
		        		String course=rs.getString(3);
		        		String gender=rs.getString(4);
		        		String email=rs.getString(5);
		        		
		        		//create student object
		        		Student obj=new Student(sno,sname,course,gender,email);
		        		
		        		//add student object to arraylist
		        		al.add(obj);
		        		System.out.println("hello...");
		        	}
		         }
		   }
		    
		    catch (ClassNotFoundException | SQLException e)
		    {
			e.printStackTrace();
		    }
		finally
		{
			try {
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return al;
	
			
		}
	
	//3.Now,we have to insertStudent
	public static void insertStudent(String sname,String course, String gender, String email)
	{
		//2.JDBC code to insert data into student
				Connection cn=null;
				//Statement st=null;
				PreparedStatement ps=null;
			   try 
			   {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Giri@226");
				 ps=cn.prepareStatement("insert into student(sname,course,gender,email) values (?,?,?,?)");
				 
				 ps.setString(1,sname);
				 ps.setString(2, course);
				ps.setString(3, gender);
				 ps.setString(4, email);
				 
				 ps.executeUpdate();
			   }
			   
				  
			   catch (ClassNotFoundException | SQLException e)
			   {
				e.printStackTrace();
			   }
			   try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				 try {
					cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	       
			   
	}
	
	
	public static boolean checkAdminLogin(String email,String pw)//1.to check the admin details correct or not
	{
	//2.JDBC code read all rows from admin table
		Connection cn=null;
		Statement st=null;
	   try 
	    {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Giri@226");
		 st=cn.createStatement();
		 ResultSet rs=st.executeQuery("select*from admin");
		 int count=0;
		 if(rs!=null)
		 {
			 while(rs.next()== true)
			 {
				String dbemail= rs.getString(2);
				String dbpass=rs.getString(3);
				if(dbemail.equals(email) && dbpass.equals(pw))
				{
					count++;
					break;
				}
			 }
		 }
		 if (count ==1)
		    return true;
		 else
			 return false;
		 
	     }
	   catch (ClassNotFoundException | SQLException e)
	   {
		e.printStackTrace();
	   }
	 
		return false;//admin login failure
	}

	}
