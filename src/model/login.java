package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String text = request.getParameter("text");
		String pass = request.getParameter("pass");
		
		if (text.equals("admin@admin.com") && pass.equals("1234")) {
			
			response.sendRedirect("index.xhtml");
			
		}
		
		
	}


}
