<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
    <title>Alta de Alumno</title>
</head>
<body>
    <h2>Session ID: <%=request.getSession().getId() %>
    </h2>
    <h2>Agregar Alumno</h2>
    
    <form action="AgregarAlumnoServlet" method="post">
    
        Legajo: <input type="text" name="legajo"><br>
        Nombre: <input type="text" name="nombre"><br>
        Edad: <input type="text" name="edad"><br>   
             
        <input type="submit" value="Agregar Alumno">
    </form>
        <c:if test="${not empty mensaje}">
	    	<h3>${mensaje}</h3>
		</c:if>
    
    <hr>
    <a href="index.jsp">Home</a>
</body>
</html>
    