package com.tp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Liste")
public class Liste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Liste() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/liste.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] films = {"Inception", "The Dark Knight", "The Invisible Guest"};
		boolean formValid = true;
		request.setAttribute("films", films);
		request.setAttribute("formValid", formValid);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/liste.jsp").forward(request, response);
		
	}

}
