package com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Empleado;

public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InicioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		session.setAttribute("usuario", "facundo");
		session.setAttribute("psw", "123456");
		
		List<Empleado> lista_empleados = new ArrayList<Empleado>();
		
		lista_empleados.add(new Empleado(1, "Facundo Gironte", "Oficina"));
		lista_empleados.add(new Empleado(2, "Juan Pérez", "Depósito"));
		lista_empleados.add(new Empleado(3, "Walter Áviles", "Oficina"));
		
		session.setAttribute("lista_empleados", lista_empleados);

		request.getRequestDispatcher("inicio_sesion.jsp").forward(request, response);
	}


}

