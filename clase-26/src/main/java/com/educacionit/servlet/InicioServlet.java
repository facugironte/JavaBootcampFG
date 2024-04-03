package com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Alumno;

public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InicioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		List<Alumno> alumnos = (List<Alumno>)session.getAttribute("listaAlumnos");
		
		if (alumnos == null) {
			alumnos = new ArrayList<Alumno>();
			session.setAttribute("listaAlumnos", alumnos);
		}
		
		// Forward hacia el listado de Alumnos
		request.getRequestDispatcher("listado_alumnos.jsp").forward(request, response);
	}


}
