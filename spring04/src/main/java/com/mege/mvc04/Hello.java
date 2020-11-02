package com.mege.mvc04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	String id = null;
	String pw = null;
	private static final long serialVersionUID = 1L;

	/*
	 * @Override public void init(ServletConfig config) throws ServletException {
	 * id=config.getInitParameter("id"); pw=config.getInitParameter("pw");
	 * 
	 * }
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		out.println("<h1> ID: " + id + "</h1>");
		out.println("<h1> PW: "+pw +"</h1>");
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		out.println("<h1> ID: " + id + "</h1>");
		out.println("<h1> PW: "+pw +"</h1>");
		out.close();
		
	}

}
