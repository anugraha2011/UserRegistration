package com.UserController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Helper.TaskList;
import com.UserEntity.Task;

@WebServlet(value = "/view-task")
public class ViewTaskServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Task> taskList=TaskList.getTaskList();
		req.setAttribute("task_list", taskList);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("viewtask.jsp");
		dispatcher.forward(req, resp);
	}

}
