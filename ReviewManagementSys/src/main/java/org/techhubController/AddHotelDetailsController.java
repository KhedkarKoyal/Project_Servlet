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

import org.techhubModel.AddHotelDetailsModel;
import org.techhubModel.AddHotelModel;
import org.tehhub.service.AddHotelDetailsService;


@SuppressWarnings("serial")
@WebServlet("/addDetail")
public class AddHotelDetailsController extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		AddHotelDetailsModel am=new AddHotelDetailsModel();
		AddHotelDetailsService hs=new AddHotelDetailsService();
		List<AddHotelModel> list=hs.fetchHotels();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Addkkk Hotel</title>");
		out.println("<link rel='stylesheet' type='text/css' href='CSS/HotelDetails.css'>");
		out.println("</head>");
		RequestDispatcher r=request.getRequestDispatcher("Navbar.html");
		r.include(request, response);
		out.println("<body>");
		out.println("<section>");
		out.println("<div id='wrapper'>");
		out.println("<div id='Datails'>");
		out.println("<form name='frm' action='' method='post'>");
		out.println("<div id='Hotel'>");
		out.println("<h1>Add Details...</h1>");
		out.println("</div>");
		out.println("<input type='text' name='address' value='' placeholder='Address' required><br><br>");
		out.println("<input type='text' name='city' value=''  placeholder='City' required><br><br>");
		out.println("<input type='text' name='email' value=''   placeholder='Email' required><br><br>");
		out.println("<input type='text' name='contact' value=''  placeholder='Contact' required><br><br>");
		out.println("<div id='pk'>");
		out.println("<label>Hotel ID:</label><br>"); 
		out.println("<select id='h' name='hotelId' 'width='50px'>"); 
		for (AddHotelModel m : list) {
		    out.println("<option value='" + m.getId()+ "'>" + m.getAddHotel()+ "</option>");
		}
		out.println("</select><br>");
		out.println("</div>");
		out.println("<div id='btn'>");
		out.println("<button type='submit'><b>Add</b></button>");
		out.println("</div>");
		out.println("</section>");
		out.println("</form>");
		am.setAddress(request.getParameter("address"));
		am.setCity(request.getParameter("city"));
		am.setEmail(request.getParameter("email"));
		am.setContact(request.getParameter("contact"));
		am.setHotel(request.getParameter("hotelId"));
		boolean k=hs.isHotelDetail(am);
		if(k)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Navbar.html");
		}
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
