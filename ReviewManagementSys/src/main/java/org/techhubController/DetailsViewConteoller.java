package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.DetailsViewModel;
import org.techhubModel.ViewHotelModel;
import org.tehhub.service.DetailsViewService;

@WebServlet("/DetailsView")
public class DetailsViewConteoller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		DetailsViewService del=new DetailsViewService();
		List<DetailsViewModel> b= del.isViewHotel();
		RequestDispatcher r=request.getRequestDispatcher("Navbar.html");
		r.include(request, response);
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Addkkk Hotel</title>");
		out.println("<link rel='stylesheet' type='text/css' href='CSS/DetailView.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='design'>");
		out.println("<div id='table-design'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Name</th>");
		out.println("<th>Address</th>");
		out.println("<th> city</th>");
		out.println("<th> Email</th>");
		out.println("<th> Contact</th>");
		
		out.println("<th>Update</th>");
		out.println("<th>Delete</th>");
		out.println("</tr>");
		for(DetailsViewModel h:b)
		{
			int d=h.getDid();
		out.println("<tr>");
		out.println("<td>"+h.getAddHotel()+" </td>");
		out.println("<td>"+h.getAddress()+" </td>");
		out.println("<td>"+h.getCity()+" </td>");
		out.println("<td>"+h.getEmail()+" </td>");
		out.println("<td>"+h.getContact()+" </td>");
		out.println("<td>Update</a></td>");
		out.println("<td><a href='deleteDetailView?did="+h.getDid()+"'>Delete</a></td>");
		
		out.println("</tr>");
		}
		out.println("</table>");
		out.println("</div>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
