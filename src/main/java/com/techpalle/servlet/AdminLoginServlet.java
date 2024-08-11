package com.techpalle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;


@WebServlet("/login")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String e=request.getParameter("email");
		String p=request.getParameter("pass");
		
		PrintWriter pw=response.getWriter();
		pw.println("email is:" +e);
		pw.println("password is:"+p);
	//verification is over
		
  //JDBC code to verify whether admin details are correct or not
		boolean result=DataAccess.checkAdminLogin(e, p);
		
		if(result == true)
			//if admin details correct,now open the "welcome page"
			response.sendRedirect("welcome.jsp");
			//pw.println("LOGIN SUCCESS");
			
		else
			pw.println("LOGIN FAIL");
		
	}

}
