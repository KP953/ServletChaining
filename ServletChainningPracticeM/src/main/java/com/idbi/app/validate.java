package com.idbi.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class validate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		
		String username=req.getParameter("un");
		String password=req.getParameter("ps");
		
		if(password.equals("sai"))
		{
			RequestDispatcher rd= req.getRequestDispatcher("welcome");
			rd.forward(req, resp);
;
			}
		else
		{
			PrintWriter out =resp.getWriter();
			out.println("<html><body><h1> invalid username or password</h1></body></html>");
			RequestDispatcher rd=req.getRequestDispatcher("index1.html");
			rd.include(req, resp);
		}
	}

}
