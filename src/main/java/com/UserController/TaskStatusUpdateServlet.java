package com.UserController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UserDao.TaskDao;
@WebServlet(value = "/taskStatusUpdate")
public class TaskStatusUpdateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int task_id=Integer.parseInt(req.getParameter("task_id"));
		
		TaskDao.updateTaskStatus(task_id);
		
		resp.sendRedirect("success.jsp");
		}

}
