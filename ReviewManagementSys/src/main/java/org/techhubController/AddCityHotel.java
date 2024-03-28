package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.AddHotelDetailsModel;
import org.techhubModel.AddHotelModel;
import org.techhubModel.CityaAddModel;
import org.tehhub.service.AddHotelDetailsService;
import org.tehhub.service.CityService;


@WebServlet("/addcity")
public class AddCityHotel extends HttpServlet {
	AddHotelModel am=new AddHotelModel();
	CityaAddModel hs=new CityaAddModel();
	CityService cityS=new CityService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out= response.getWriter();
	out.println("<body>");
	out.println("<center>");
	out.println("<form name ='frm' action='' method='post'>");
	out.println("<input type='submit' name='s' value='AddHotel' style='width:300px;height:50px;background-color:lightgrey'><br>");
	out.println("<select name='HotelName' style='width:300px;height:50px;background-color:lightgrey'>");
	out.println("<option>Select Hotel</option>");
	
	List<AddHotelModel> list=cityS.isHotelFetch();
	for(AddHotelModel model:list)
	{
		out.println("<option value='"+model.getId()+"'>"+model.AddHotel+"</option>");
	}
	
	out.println("</select>");

	out.println("&nbsp;&nbsp");
	out.println("<select name='City Name' style='width:300px;height:50px;background-color:lightgrey'>");
	out.println("<option>Select City</option>");
	List<CityaAddModel> list1=cityS.isCityFetch();
	for(CityaAddModel m:list1)
	{
		out.println("<option value='"+m.getCid()+"'>"+m.getCname()+"</option>");
	}
	out.println("</select>");
	out.println("</form>");
	String btn=request.getParameter("s");
	if(btn!=null)
	{
		int  hid=Integer.parseInt(request.getParameter("HotelName"));
		System.out.println("hid=="+hid);
		
	}
	
	out.println("</center>");
	out.println("</body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
