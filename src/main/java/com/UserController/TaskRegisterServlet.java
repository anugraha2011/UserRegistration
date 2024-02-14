package com.UserController;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UserDao.TaskDao;
@WebServlet(value = "/task-persist")
public class TaskRegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String task_description=req.getParameter("task-description");
		int emp_id=Integer.parseInt(req.getParameter("employee"));
		String task_status=req.getParameter("task-status");
		
		TaskDao.saveTask(task_description, emp_id,task_status);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("manager.jsp");
		dispatcher.forward(req, resp);
		
	}

}
