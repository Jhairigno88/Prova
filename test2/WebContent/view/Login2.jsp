<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Pagina di login 2</h1>
<hr>
	<form action="../CheckLogin2" method="post">
	
		<input type="text" name="user"><b>Inserisci username</b><br>
		<input type="password" name="password"><b>Inserisci password</b><br>
		<input type="submit" value="Invia">
		<input type="reset"  value="Azzera">
	
	</form>

	<%
	//tag inseribile solo in una pagina jsp, e indica che
	//all'interno di questo tag si può scrivere direttamente in 
	//javalanguage.
	
	String x=(String)request.getAttribute("ciccio");
	
	if (x!=null){
		out.println("<hr3>+x+</h3>");
	}
	
	//codificazione per far si che la pagina jsp possa aspettarsi di gestire
	//una stringa java.
	
	
	%>
	
</body>
</html>