<html>
<head>
    <title>Inicio de sesi�n</title>
</head>
<body>
    <h2>Session ID: 
    <%= 
    	request.getSession().getId() 
    %>
    </h2>
    
    <form action="IniciarSesionServlet" method ="post">
    
    	Usuario: <input type="text" name="user">
    	Contrase�a: <input type="password" name ="psw">
    	
    	<input type="submit" value="Iniciar sesi�n">
    	    
    </form>
    	<c:if test="${not empty mensaje}">
	    	<h3>${mensaje}</h3>
		</c:if>
   
  
</body>
</html>