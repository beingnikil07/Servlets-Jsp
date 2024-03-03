package com.nik;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstApplication extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res )throws IOException{
		String str1=req.getParameter("first name");
		String str2=req.getParameter("last name");
		String str3="Hello "+ str1 +" welcome to servlets";
		PrintWriter out=res.getWriter();
		out.println(str3);
	}
}
