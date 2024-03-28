package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.UpdateHotelModel;
import org.tehhub.service.UpdateHotelService;


@WebServlet("/Update")
public class UpdateHotelController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 int id=Integer.parseInt(request.getParameter("hid"));
		 String name=request.getParameter("hotelname");
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' type='text/css' href='CSS/ViewHotel.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div id='wrapper'>");
		out.println("<div id='add'>");
		out.println("<form name='frm1' action='final1' method='post'>");
		out.println("<input type='text' name='hid' value="+id+">");
		out.println("<input type='text' name='name' value="+name+"><br><br>");
		
		out.println("<input type ='submit' >");
		out.println("</form>");
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
