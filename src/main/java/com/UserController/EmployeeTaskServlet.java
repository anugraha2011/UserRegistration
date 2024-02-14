package com.UserController;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Helper.TaskList;
import com.UserEntity.Task;
@WebServlet(value = "/employeeDashboard")
public class EmployeeTaskServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		
		List<Task> taskList=TaskList.getTaskListOfEmployee(username, password);
		Collections.sort(taskList);
		req.setAttribute("task_list", taskList);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("employee.jsp");
		dispatcher.forward(req, resp);
	}

}
