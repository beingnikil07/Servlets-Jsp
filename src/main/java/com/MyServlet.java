package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/aaa")
public class MyServlet extends HttpServlet{
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
			System.out.println("Hello");
		}
}


// It will work with tomcat version 10 or above ,just replace javax to jakarta and all things remains same 