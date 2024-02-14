<%@page import="com.UserEntity.UserInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task Form</title>
<style>
        body {
            font-family: Arial, sans-serif;
        }

        .task-form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 2px solid #000;
            border-radius: 5px;
        }

        .task-form label {
            font-weight: bold;
            margin-bottom: 5px;
            display: block;
        }

        .task-form input[type="text"],
        .task-form select {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 2px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        .task-form input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        .task-form input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
	<div class="task-form" style="margin-top: 13%;">
        <h2 style="margin-left: 35%;">Create Task</h2>
        <form action="task-persist">
            <div>
                <label for="task-description">Task Description:</label>
                <input type="text" id="task-description" name="task-description" placeholder="Enter task description" required>
            </div>
            <div>
                <label for="employee-list">Employees:</label>
                <select name="employee" id="employee-list">
                <option value="">Employee List</option>
                
                <%
                List<UserInfo> employee=(List<UserInfo>)request.getAttribute("emp_list") ;
                	for(UserInfo user:employee){ 
               	%>
                	<option value="<%=user.getId()%>"><%=user.getUsername() %></option>
                	
                	<%
                	} 
                	%>
                </select>
            </div>
            
            <div>
                <label for="task-status">Task Status:</label>
                <input type="text" name="task-status" value="Assigned" readonly>
            </div>
            <div style="margin-left: 40%;">
                <input type="submit" value="Assign">
            </div>
        </form>
    </div>
</body>
</html>