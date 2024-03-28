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
import org.tehhub.service.AddHotelService;

@WebServlet("/AddHotel")
public class AddHotel extends HttpServlet {

	AddHotelModel ad=new AddHotelModel();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		AddHotelService addService=new AddHotelService();
		//boolean k=addService.isAddHotel(ad);
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='CSS/AddHotel.css\'>");
		out.println("</head>");
		out.println("<body>");
		RequestDispatcher r=request.getRequestDispatcher("Navbar.html");
		r.include(request, response);
		out.println("<div id='wrapper'>");
		out.println("	<div id='Hotel'>");
		out.println("<h1>Add Hotel</h1>");
		out.println("<form action='AddHotel' method='post'>");
		out.println("<div id='input-box'>");
		out.println("<input type='text' name='AddHotel' placeholder='AddHotel' required>");
		out.println("</div>");
		out.println("<input type ='submit' name='s' id='btn' value='AddHotel'");
		out.println("<div id ='addDeatail'>");
		//out.println("<a href='add'>addDeatails</a>");
		out.println("</div>");
		out.println("</form>");
		out.println("</div>");
		out.println("</div>");
		String AddHotel=request.getParameter("AddHotel");
		ad.setAddHotel(AddHotel);
		out.println("</body>");
		out.println("</html>");
		String btn=request.getParameter("s");
		if(btn!=null)
		{
			AddHotelModel ad=new AddHotelModel();
			AddHotelService addService1=new AddHotelService();
			ad.setAddHotel(request.getParameter("AddHotel"));
			addService1.isAddHotel(ad);
			RequestDispatcher rk=request.getRequestDispatcher("addDetail");
			rk.forward(request, response);
			
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
