<%@page import="com.UserEntity.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task Form</title>
<style>
        table {
            margin-top: 0%;
            width: 50%;
            border: 2px solid black;
        }
        
        th, td {
            padding: 8px;
            text-align: center;
            border-bottom: 1px solid grey;
        }
        
        th {
            background-color: #ad9b9b;
        }
        </style>

</head>
<body>
	 <center>
   	 <h2 style="margin-top: 5%;">Task Status</h2>

		<table>
			<thead>
			<tr>
				<th>Task</th>
				<th>Task Status</th>
			</tr>
		</thead>
		<tbody>
		<% List<Task> taskList=(List<Task>)request.getAttribute("task_list") ;
    	for(Task task:taskList){  %>
			<tr>
				<td><%=task.getTask_description() %></td>
				<td><%=task.getStatus() %></td>
			</tr>
			<%
    	}
			%>
		</tbody>
	</table>
</center>
</body>
</html>