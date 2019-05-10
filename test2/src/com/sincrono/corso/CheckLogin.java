package com.sincrono.corso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLogin
 */
@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//RequestDispatcher d=request.getRequestDispatcher("views/loginOK.jsp");
		//classe che permette di definire il percorso da prendere per                 
		// ottenere il reindirizzamento all'indirizzo corretto.
		// con questo metodo pur andando virtualmente a richiamare 
		//il percorso per la pagina restiamo comunque fisicamente
		//ancora all'interno della servlet.
		RequestDispatcher d=null;
		//per operare un molteplice reindirizzamento dovremo scomporre 
		//la formula di cui sopra in due partui: la creazione(qui sopra scritta)
		
	String u=request.getParameter("name");
		if (u.equals("pippo")) {
			
			d=request.getRequestDispatcher("views/loginOK.jsp");
			//e la sua inizializzazione con percorso diverso tra if e else.
		//response.sendRedirect("views/loginOK.jsp");
		//questo metodo response diversamente dal precedente ci sposta fisicamente
		//all'interno della cartella views dove è allocato il file oggetto
		//del percorso.
		}
		else {
			
			d=request.getRequestDispatcher("views/Error.jsp");
			
		//response.sendRedirect("views/Error.jsp");
		}
		
	d.forward(request, response);
			//comando per indirizzare l'utente all'indirizzo indicato 
			//nella dichiarazione RequestDispatcher.
	
		}
	
	
	
	
	}


