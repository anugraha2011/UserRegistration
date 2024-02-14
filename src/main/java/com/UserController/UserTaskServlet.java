package com.UserController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Helper.EmployeeList;
import com.UserEntity.UserInfo;
@WebServlet(value = "/task-register")
public class UserTaskServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		List<UserInfo> empList=EmployeeList.getEmployeeList();
		req.setAttribute("emp_list", empList);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("task.jsp");
		dispatcher.forward(req, resp);
	}

}
