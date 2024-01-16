package org.eclipse.jakarta.FirstWebApp.Controller;
import jakarta.persistence.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.eclipse.jakarta.FirstWebApp.Model.Person;

@WebServlet (name = "SampServlet" , urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PersonServlet() {
        super();
    }
    
    Person person = new Person();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.sendRedirect(request.getContextPath() + "/index.html");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		response.setContentType("text/plain");
//		response.getWriter().append();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phone");
		
		person.setFirstname(firstname);
		person.setLastname(lastname);
		person.setEmail(email);
		person.setPhone(phoneNumber);
		
//	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");
//	    EntityManager em = emf.createEntityManager();
		
        new Persistence();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        
	    em.getTransaction().begin();
	   	em.persist(person);
	   	em.getTransaction().commit();
	   	System.out.println(person);
        em.close();
        emf.close();
//		request.setAttribute("Firstname", firstname);
//		request.setAttribute("Lastname", lastname);
//		request.setAttribute("Email", email);
//		request.setAttribute("Phone", phoneNumber);
		
		request.getSession().setAttribute("person", person);
		response.sendRedirect(request.getContextPath() + "/success.html");
		
//		getServletContext().getRequestDispatcher("/getperson").forward(request, response);		
//		request.getRequestDispatcher("/getperson").forward(request, response);
		
	}

}
