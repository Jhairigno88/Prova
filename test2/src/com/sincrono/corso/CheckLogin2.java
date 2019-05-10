package com.sincrono.corso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckLogin")
public class CheckLogin2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher d=null;
		
	String u=request.getParameter("name");
	String messaggioDiErrore="Login Errata!";
	
	if (u.equals("pippo")) {
			
			d=request.getRequestDispatcher("views/loginOK.jsp");
		
		}
		else {
			d=request.getRequestDispatcher("views/Login2.jsp");
			
			request.setAttribute("ciccio", messaggioDiErrore);
			//d=request.getRequestDispatcher("views/Error.jsp");	
			//response.sendRedirect("views/Error.jsp");
		}
		
	d.forward(request, response);
			
		}
	
	
	
	
	}

