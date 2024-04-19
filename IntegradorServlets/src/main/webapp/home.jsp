<%@page session="true"%>
<%@page errorPage="error.jsp"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  Especifica el prefijo que se utilizará para acceder a las etiquetas de la biblioteca importada. En este caso, el prefijo "c" se utilizará para acceder a las etiquetas de JSTL Core en el archivo JSP. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- fmt: Este prefijo se utiliza para formatear y presentar datos, como fechas, números y mensajes. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!-- fn: Este prefijo se utiliza para acceder a las funciones de utilidad proporcionadas por JSTL, como operaciones de cadena, colección y manipulación de fechas. -->


<!DOCTYPE html>
<html>
<head>
    <title>Peliculas</title>
</head>
<body>
    <h2>Session ID: 
    <%= 
    	request.getSession().getId() 
    %>
    </h2>
    

</body>
</html>