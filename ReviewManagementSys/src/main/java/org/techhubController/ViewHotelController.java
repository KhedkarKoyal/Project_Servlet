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

import org.techhubModel.ViewHotelModel;
import org.tehhub.service.ViewHotelService;

@WebServlet("/View")
public class ViewHotelController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			RequestDispatcher r=request.getRequestDispatcher("Navbar.html");
			r.include(request, response);
			
			ViewHotelService vs=new ViewHotelService();
			List<ViewHotelModel> b=vs.isViewHotel();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Addkkk Hotel</title>");
			out.println("<link rel='stylesheet' type='text/css' href='CSS/ViewHotel.css'>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div id='design'>");
			out.println("<div id='table-design'>");
			out.println("<table>");
			out.println("<tr>");
			
			out.println("<th> Hotal</th>");
			out.println("<th>Update</th>");
			out.println("<th>Delete</th>");
			out.println("</tr>");
			for(ViewHotelModel h:b)
			{
			out.println("<tr>");
			out.println("<td>"+h.getAddHotel()+" </td>");
			out.println("<td><a href='Update?hid="+h.getId()+"&hotelname="+h.getAddHotel()+"'>Update</a></td>");
			out.println("<td><a href='Del?hid="+h.getId()+"'>Delete</a></td>");
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
