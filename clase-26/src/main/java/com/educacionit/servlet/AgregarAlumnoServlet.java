package com.educacionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class AgregarAlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AgregarAlumnoServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String legajo = request.getParameter("legajo");
			String nombre = request.getParameter("nombre");
			String edad = request.getParameter("edad");
			
			Alumno unAlumno = new Alumno(
					Integer.valueOf(legajo),
					nombre,
					Integer.valueOf(edad)
					);
			
			HttpSession session = request.getSession();
			
			// Obteneniendo la lista de alumnos de la session
			List<Alumno> alumnos = (List<Alumno>)session.getAttribute("listaAlumnos");
			alumnos.add(unAlumno);
			// Guardamos la lista de alumnos
			session.setAttribute("listaAlumnos", alumnos);
			
			request.setAttribute("mensaje", "El alumno " + unAlumno + " Se pudo crear de forma satisfactoria");
			
		} catch (Exception ex) {			
			request.setAttribute("mensaje", "Se ha producido un error agregando al alumno. Error: " + ex.getMessage());
		}
		
		request.getRequestDispatcher("alta_alumno.jsp").forward(request, response);
	}

}
