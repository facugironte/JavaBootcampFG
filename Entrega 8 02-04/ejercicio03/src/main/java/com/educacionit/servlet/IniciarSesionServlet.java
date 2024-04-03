package com.educacionit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class IniciarSesionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IniciarSesionServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String usuario = request.getParameter("usuario");
			String psw = request.getParameter("psw");

			HttpSession session = request.getSession();
			
			boolean userOk = false;
			boolean pswOk = false;
			
			if(session.getAttribute("usuario") == usuario) {
				userOk = true;				
			}
			if(session.getAttribute("psw") == psw) {
				pswOk = true;				
			}
			
			if(userOk && pswOk) {
				request.getRequestDispatcher("sesion_iniciada.jsp").forward(request, response);
			} else {
				request.setAttribute("mensaje", "Usuario o contraseña incorrectas");
				request.getRequestDispatcher("inicio_sesion.jsp").forward(request, response);
			}
			
			
		} catch (Exception ex) {			
			request.setAttribute("mensaje", "Se ha producido un error iniciando sesión. Error: " + ex.getMessage());
			request.getRequestDispatcher("inicio_sesion.jsp").forward(request, response);
		}
		
		
	}

}