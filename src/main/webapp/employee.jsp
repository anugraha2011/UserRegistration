<%@page import="com.UserEntity.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Dashboard</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    .task {
        margin-bottom: 20px;
        border: 1px solid #ccc;
        padding: 10px;
        border-radius: 5px;
        background-color: #f9f9f9;
    }
    .task input[type="checkbox"] {
        margin-right: 10px;
    }
    .task .description {
        font-size: 16px;
        margin-bottom: 5px;
    }
    .task .status {
        font-weight: bold;
    }
    .task input[type="checkbox"]:checked + label .status {
        color: green;
    }
    .submit-button {
        display: block;
        margin-top: 20px;
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
</style>
</head>
<body>
	<div class="container">
      <h1>Employee Dashboard</h1>
      <div class="task">
      	<form action="taskStatusUpdate">
      		<% List<Task> taskList=(List<Task>)request.getAttribute("task_list");
      		for(Task tasks:taskList){ %>
      		<div class="description">Task: <%=tasks.getTask_description() %></div>
      		<label for="task" class="status"><%=tasks.getStatus() %></label>
      		<button type="submit" class="submit-button" name="task_id" value="<%= tasks.getId() %>">Completed</button><br>
      		<%
      		}
      		%>
      	</form>
      </div>
      </div>
</body>
</html>