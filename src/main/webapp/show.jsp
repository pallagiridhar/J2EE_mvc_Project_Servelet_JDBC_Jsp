<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techpalle.model.Student" %>
 <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Details...</h1>
<%
 ArrayList<Student> al=(ArrayList<Student>)request.getAttribute("students");
%>
<table>
   <%
     for(Student s:al)
     {
    %>
       <tr>
          <td><%=s.getSno() %></td> 
          <td><%=s.getSname() %></td> 
          <td><%=s.getCourse() %></td>
          <td><%=s.getGender() %></td>
          <td><%=s.getEmail() %></td>
        </tr>
    <% 	 
     }
   %>

</table>

</body>
</html>