package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.AddHotelModel;
import org.techhubModel.CityaAddModel;
import org.tehhub.service.AddHotelService;
import org.tehhub.service.CityService;

@WebServlet("/CityAdd")
public class CityAddController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='' method='post'>");
		
		out.println("<section>");
		out.println("<div id='form_box'>");
		out.println("<h2>Login</h2>");
		out.println("<div id='input-box'>");
		out.println("<input type='text' name='cname' placeholder='Username'>");
		out.println("</div>");
		out.println("<input type ='submit' name='p'  value='AddCity'");	
		out.println("</div>");
		out.println("</section>");
		out.println("</form>");
		CityaAddModel m = new CityaAddModel();
		CityService city = new CityService();
		String  name=request.getParameter("cname");
		m.setCname(name);
		boolean k=city.AddCity(m);
		if(k)
		{
			
		}
		else
		{
			

		}
	
		out.println("</body>");
		out.println("</html>");
		
		
		
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
