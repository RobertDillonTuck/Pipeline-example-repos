package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.BankUser;
import com.revature.service.AppService;

@WebServlet("login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Create new bank user and populate it
		BankUser clientUser = new BankUser();
		
		clientUser.setUsername(req.getParameter("username"));
		clientUser.setPassword(req.getParameter("password"));
		
		//Validate user
		clientUser = new AppService().validateUser(clientUser);
		
		//Redirect
		if(clientUser != null){
			HttpSession ses = req.getSession();
			ses.setAttribute("user", clientUser);
			
			req.getRequestDispatcher("app.html").forward(req, resp);
		}else{
			req.getRequestDispatcher("login.html").forward(req, resp);

		}
	}
}
