package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tehhub.service.DeleteHotelService;
import org.tehhub.service.DetailsViewService;


@WebServlet("/deleteDetailView")
public class deleteDetailView extends HttpServlet {



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int did=Integer.parseInt(request.getParameter("did"));
		DetailsViewService delete=new DetailsViewService();
	
	
		boolean b=delete.isDetailDelete(did);
		if(b)
		{
			RequestDispatcher r=request.getRequestDispatcher("DetailsView");
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