<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manager Dashboard</title>
   <style>
        body {
            font-family: Arial, sans-serif;
            margin-top: 15%;
    }
    
    .dashboard {
        border: 2px solid #000;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 55%;
        display: block;
        width: 30%;
        margin: auto;
        padding: 10px;
        padding-bottom: 40px;
    }
    
    .option {
        margin: 10px;
    }
    
    .assign-task,
    .view-status,
    .login-page {
        display: block;
        padding: 10px 20px;
        background-color: #0a65c7;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        text-align: center;
        font-weight: bold;
        transition: background-color 0.3s;
    }

    .assign-task:hover,
    .view-status:hover,
    .login-page:hover {
        background-color: #4486cd;
    }
    </style>
</head>
<body>
	 <div class="dashboard">
        <div class="dash">
        <h1 style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; margin-left: 18%;" >Manager Dashboard</h1>
    </div>
      
        <div class="option" >
            <a href="task-register" class="assign-task">Assign Task</a>
        </div>
     
        <div class="option">
            <a href="view-task" class="view-status">View Task Status</a>
        </div>
        
        <div class="option">
            <a href="logout.jsp" class="login-page">Logout</a>
        </div>
     
    </div>
</body>
</html>