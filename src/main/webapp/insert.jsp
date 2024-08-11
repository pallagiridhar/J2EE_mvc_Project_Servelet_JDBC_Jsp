<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student Details</title>
<style>

body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-image: url('images/admin3.jpg'); 
    background-size: cover; 
    background-position: center;
    background-repeat: no-repeat;
    color: #333; 
}
h1 {
    text-align: center;
    color: #fff; 
    margin-top: 50px;
    font-size: 2.5em;
}

form {
    max-width: 600px;
    margin: 20px auto;
    padding: 30px;
    background-color: rgba(255, 255, 255, 0.8); 
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}
input[type="text"], input[type="email"] {
    width: calc(100% - 22px); 
    padding: 12px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 6px;
    box-sizing: border-box;
    font-size: 16px;
}
.rdGender {
    margin-right: 8px;
}
label {
    display: block;
    margin: 12px 0 6px;
    font-weight: bold;
    color: #444;
}
input[type="submit"] {
    background-color: #4CAF50;
    color: white; 
    border: none;
    padding: 15px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 18px;
    margin-top: 20px;
    cursor: pointer;
    border-radius: 6px;
    transition: background-color 0.3s, transform 0.3s;
}

input[type="submit"]:hover {
    background-color: #45a049; 
    transform: scale(1.05); 
}
</style>
</head>
<body>
<h1>Insert Student Details Here</h1>
<form action="insertstudent" method="post">
    <label for="sname">Student Name:</label>
    <input type="text" id="sname" name="sname" placeholder="Enter name..." />

    <label for="course">Course:</label>
    <input type="text" id="course" name="course" placeholder="Enter course..." />

    <label>Gender:</label>
     <label for="male">Male</label>
    <input type="radio" id="male" class="rdGender" name="rdGender" value="Male" />
    <label for="female">Female</label>
    <input type="radio" id="female" class="rdGender" name="rdGender" value="Female" />
   

    <label for="tbEmail">Student Email:</label>
    <input type="email" id="tbEmail" name="tbEmail" placeholder="Enter email..." />

    <input type="submit" value="Insert Student" />
</form>
</body>
</html>

