package com.sincrono.corso;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimaServlet")//questa annotation sostituisce la 
							//marcatura esplicita all'interno della web.xml;
public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//in ambiente webapplication enterprise, per il trasferimento di dati sui 
	//protocolli si necesita sempre di un identificativo univoco(...)

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{//essendo una servlet con metodo get, per eseguirla potremo anche usare
	// il comando run as ottenibile dal menù apparso dopo aver cliccato tast DXmouse
	//trucchetto non possibile con metodi toPost.
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//istruzione concatenata con il metodo append che stampa una frase 
		// statica e utilizza la classe request con il metodo GETCONTEXTPATH
		// che indica il percorso del nostro dominio(ovvero progetto)
	}

}
