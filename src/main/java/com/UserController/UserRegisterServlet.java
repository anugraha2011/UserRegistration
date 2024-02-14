package com.UserController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UserDao.UserDao;
import com.UserEntity.UserInfo;
@WebServlet(value = "/registration")
public class UserRegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_name=req.getParameter("user_name");
		String user_email=req.getParameter("user_email");
		String password=req.getParameter("password");
		String role=req.getParameter("role");
		String designation=req.getParameter("designation");
		double salary=Double.parseDouble(req.getParameter("salary"));
		
		UserInfo user=new UserInfo();
		user.setUsername(user_name);
		user.setEmail(user_email);
		user.setPassword(password);
		user.setRole(role);
		user.setDesignation(designation);
		user.setSalary(salary);
		
		UserDao.saveUser(user);
		resp.sendRedirect("login.jsp");
		
	}

}
