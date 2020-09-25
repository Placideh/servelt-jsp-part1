package com.placide;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;

		/*
		 * //request dispatcher and redirect RequestDispatcher
		 * //		PrintWriter out=res.getWriter();
			//		out.println("result is:"+k);
		 * 		req.setAttribute("key", k);
		 * rd=req.getRequestDispatcher("sq");* //here we add a url
		 *  rd.forward(req,res);

		 */
		/*
		 * //send Redirect using url rewriting 
		 * res.sendRedirect("sq?key="+k);
		 */
		
		/*
		 * //send using Session
		 *  HttpSession session=req.getSession();
		 * session.setAttribute("key", k); 
		 * res.sendRedirect("sq");
		 */
		
		//sending data using cookies
		Cookie cookie=new Cookie("key",k+"");//we can not pass a value as an integer has to be a string 
		res.addCookie(cookie);//once getting the cookies we need to add to the response object 
		
		res.sendRedirect("sq");
		
		
	}
	

}
