package org.techhubController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techhubModel.userLoginModel;
import org.tehhub.service.UserService;


@WebServlet("/UserLogin")
public class UserLoginController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	userLoginModel login=new userLoginModel();
	login.setUsername(username);
	login.setPassword(password);
	UserService userSer=new UserService();
	boolean k=userSer.userLogin(login);
	if(k)
	{
		System.out.println("done");
		out.println("done");
		RequestDispatcher r=request.getRequestDispatcher("home.html");
		r.forward(request, response);
		
	}else {
		System.out.println("fail");
		out.println("fail....");
	}
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
