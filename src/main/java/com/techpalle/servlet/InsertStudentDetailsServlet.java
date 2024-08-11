package com.techpalle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;


@WebServlet("/insertstudent")
public class InsertStudentDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String sn=request.getParameter("sname");
		String cr=request.getParameter("course");
		String c=request.getParameter("rdGender");
		String e=request.getParameter("tbEmail");
		
		/*PrintWriter pw=response.getWriter();
		pw.println("name is: "+sn);
		pw.println("course is: "+cr);*/
	DataAccess.insertStudent(sn, cr,c,e);
		
	}

}
