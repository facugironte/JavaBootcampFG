<%@page session="true"%>
<%@page errorPage="error.jsp"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  Especifica el prefijo que se utilizará para acceder a las etiquetas de la biblioteca importada. En este caso, el prefijo "c" se utilizará para acceder a las etiquetas de JSTL Core en el archivo JSP. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- fmt: Este prefijo se utiliza para formatear y presentar datos, como fechas, números y mensajes. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!-- fn: Este prefijo se utiliza para acceder a las funciones de utilidad proporcionadas por JSTL, como operaciones de cadena, colección y manipulación de fechas. -->

<html>
<head>
    <title>Inicio de sesión</title>
</head>
<body>
    <h2>Session ID: 
    <%= 
    	request.getSession().getId() 
    %>
    </h2>
    
   	<c:if test="${not empty mensaje}">
    	<h3>${mensaje}</h3>
	</c:if>
	
	<h3>Empleados: </h3>
	
	<table border = "1">
		<tr>
			<th>Legajo</th>
			<th>Nombre</th>
			<th>Cargo</th>
		</tr>
		
		<c:forEach items="${lista_empleados}" var="empleado">
            <tr>
                <td>${empleado.legajo}</td>
                <td>${empleado.nombre}</td>
                <td>${empleado.cargo}</td>
            </tr>
            
        </c:forEach>

		
	
	</table>
	
	<h3><a href="LimpiarSessionServlet">Cerrar Session</a></h3>
   
  
</body>
</html>