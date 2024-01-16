package org.eclipse.jakarta.FirstWebApp.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet (name = "getPerson" , urlPatterns = "/getperson")
public class GetPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetPerson() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		https://stackoverflow.com/questions/15786129/converting-java-objects-to-json-with-jackson
		
		https://github.com/FasterXML/jackson-docs
		
		*/
				
//		String Fname = (String) request.getAttribute("Firstname");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String person_json = objectMapper.writeValueAsString(request.getSession().getAttribute("person"));
		response.setContentType("application/json");
		response.getWriter().print(person_json);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
