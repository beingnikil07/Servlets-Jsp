package com.nik;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstApplication extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res ){
		String str1=req.getParameter("first name");
		String str2=req.getParameter("last name");
		String str3="Hello"+str1+" welcome to servlets";
		System.out.print(str3);
	}
}
