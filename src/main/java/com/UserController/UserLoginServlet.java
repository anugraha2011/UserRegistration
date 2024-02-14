package com.UserController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Service.LoginService;
@WebServlet(value = "/login")
public class UserLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		PrintWriter pw = resp.getWriter();

		if (LoginService.loginValidation(user_name, password).equalsIgnoreCase("Manager")) {
			resp.sendRedirect("manager.jsp");
		} else if (LoginService.loginValidation(user_name, password).equalsIgnoreCase("Employee")) {

			req.setAttribute("user_name", user_name);
			req.setAttribute("user_password", password);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("employeeDashboard");
			dispatcher.forward(req, resp);
		} else {
			pw.print("<h2>Username or password is wrong</h2>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}

	}

}
