<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<style>
/* Basic reset */
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-image: url('images/admin2.jpg'); /* Background image for the entire page */
    background-size: cover; /* Cover the entire page */
    background-position: center;
    background-repeat: no-repeat;
}

/* Header styling */
.header {
    background: rgba(0, 0, 0, 0.5); /* Semi-transparent background for text readability */
    color: white;
    text-align: center;
    padding: 50px 0;
}

/* Header text styling */
.header h1 {
    margin: 0;
    font-size: 2.5em;
}

/* Form container styling */
form {
    text-align: center;
    margin: 20px;
}

/* Button styling */
input[type="submit"] {
    background-color: #4CAF50; /* Green background */
    color: white; /* White text */
    border: none;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 10px;
    cursor: pointer;
    border-radius: 5px;
    transition: background-color 0.3s;
}

input[type="submit"]:hover {
    background-color: #45a049; /* Darker green on hover */
}
</style>
</head>
<body>
  <div class="header">
    <h1>Welcome admin...</h1>
  </div>
  
  <form action="insert">
    <input type="submit" value="Insert Student" />
  </form>
  
  <form action="show">
    <input type="submit" value="Show Student" />
  </form>
  
</body>
</html>
