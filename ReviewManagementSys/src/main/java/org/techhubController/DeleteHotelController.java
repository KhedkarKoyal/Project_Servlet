package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.DeteteHotelModel;
import org.tehhub.service.DeleteHotelService;

@WebServlet("/Del")
public class DeleteHotelController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("hid"));
		DeleteHotelService delete=new DeleteHotelService();
		boolean b=delete.isHotelDelete(id);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("View");
			r.forward(request, response);
		}
		else{
			out.println("Error");
		}	
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
