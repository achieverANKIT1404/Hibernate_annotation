

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Customer;


@WebServlet("/add")
public class Servlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		
		Customer cus = new Customer( fname, lname, address);
		
		request.getRequestDispatcher("index.html").include(request, response);
		out.print("<p style='color:green; text-align:center;'>Data Inserted Successfully</p>");
		
		System.out.println("Data Inserted Successfully");
		
		session.save(cus);
		tx.commit();
		session.close();

	}

}
