package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.AdminLoginModel;
import org.tehhub.service.AdminLoginService;

@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	AdminLoginModel model=new AdminLoginModel();
	model.setUsername(username);
	model.setPassword(password);
	
	AdminLoginService adService=new AdminLoginService ();
	boolean b=adService.isAdminLogin(model);
	if(b)
	{
		Cookie ck=new Cookie("username",username);
		response.addCookie(ck);
		RequestDispatcher r=request.getRequestDispatcher("Navbar.html");
		r.forward(request, response);
	}
	else {
		out.print("login fail");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
