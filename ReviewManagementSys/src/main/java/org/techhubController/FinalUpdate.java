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

@WebServlet("/final1")
public class FinalUpdate extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		UpdateHotelService service=new UpdateHotelService();
		PrintWriter out=response.getWriter();
		int hid=Integer.parseInt(request.getParameter("hid"));
		String AddHotel=request.getParameter("name");
		UpdateHotelModel model=new UpdateHotelModel();
		model.setHid(hid);
		model.setHotel(AddHotel);
		
		boolean b= service.isUpdate(model);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("View");
			r.include(request, response);
		}else
		{
			out.println("Some problem is there......");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
