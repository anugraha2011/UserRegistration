<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<style>
        body {
          font-family: Arial, sans-serif;
          background-color: #f0f0f0;
          margin: 0;
          padding: 0;
          display: flex;
          justify-content: center;
          align-items: center;
          height: 100vh;
        }
        .login-container {
          background-color: #fff;
          padding: 10px;
          border-radius: 5px;
          box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
          width: 30%;
        }
        .login-container h2 {
          text-align: center;
          width: 20%;
          margin-bottom: 20px;
        }
        .input-group {
          width: 57%;
          margin-bottom: 20px;
          
        }
     
        h2{
          margin-left: 170px;
        }
        
        .input-group input {
          width: 100%;
          padding: 10px;
          margin-left: 80px;
        
          
          border: 2px solid grey;
          border-radius: 3px;
        }
        .input-group input:focus {
          outline: none;
          border-color: #007bff;
        }
        .btn {
          width: 60%;
          padding: 10px;
          margin-left: 80px;
          margin-bottom: 30px;
          background-color: #007bff;
          color: #fff;
          border: none;
          border-radius: 3px;
          cursor: pointer;
        }
        .btn:hover {
          background-color: #0056b3;
        }
      </style>

</head>
<body>
	 <div class="login-container">
        <h2>Login</h2>
        <form action="login" method="post">
          <div class="input-group">
            <input type="text" id="username" name="user_name" placeholder="Username" required>
          </div>
          <div class="input-group">
            <input type="password" id="password" name="user_password" placeholder="Password" required>
          </div>
          <button type="submit" class="btn">Login</button>
        </form>
      </div>
</body>
</html>