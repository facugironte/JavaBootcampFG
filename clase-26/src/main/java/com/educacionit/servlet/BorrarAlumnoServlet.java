package com.educacionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class BorrarAlumnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BorrarAlumnoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Alumno> alumnos = (List<Alumno>) session.getAttribute("listaAlumnos");
		session.setAttribute("listaAlumnos", alumnos);
		request.getRequestDispatcher("baja_alumno.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String legajo=null;
		try {
			HttpSession session = request.getSession();
			List<Alumno> alumnos = (List<Alumno>) session.getAttribute("listaAlumnos");

			// Formulario
			legajo = request.getParameter("legajo");
			Integer unLegajo = Integer.valueOf(legajo);

			for (int i = 0; i < alumnos.size(); i++) {
				Alumno alumno = alumnos.get(i);
				if (alumno.getLegajo().equals(unLegajo)) {
					alumnos.remove(i);
					break;
				}
			}			
			request.setAttribute("mensaje", "El alumno con Legajo " + legajo + " se borro de forma exitosa");
			
		} catch (Exception ex) {
			request.setAttribute("mensaje", "Se produjo un error borrando al alumno con legajo: " + legajo + ". Error: " + ex.getMessage() );
		}
		
		response.sendRedirect("BorrarAlumnoServlet");
	}

}
