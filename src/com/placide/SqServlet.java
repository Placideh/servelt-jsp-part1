package com.placide;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)  throws IOException{
		PrintWriter out=response.getWriter();
		//this is for requestDisptcher
		/*
		 * int k=(int)request.getAttribute("key"); 
		 * int result=k*k;
		 * 
		 * 
		 * out.println("square root is:"+result);
		 */
		
		/*
		 * // sendRedirect by using url Rewriting
		 * 
		 * int k=Integer.parseInt(request.getParameter("key"));
		 *  int result=k*k;
		 * 
 * 			out.println("square root is:"+result);
		 */
		
		/*
		 * //using session
		 * 
		 * HttpSession session =request.getSession();
		 * 
		 *int  k=(int)session.getAttribute("key");
		 *  int result=k*k;
		 * out.println("result :"+result);
		 */
		//using cookies
		int k=0;
		Cookie[] cookie=request.getCookies();
		for(Cookie c:cookie) {
			if(c.getName().equals("key")) {
				k=Integer.parseInt(c.getValue());
			}
		}
		int result=k*k;
		out.println("result of the square is :"+result);
		
	}

}
