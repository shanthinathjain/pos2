<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit FOOD</title>
</head>
<body>

<h1>Food List</h1>

<form:form action="modifyFood.html" method="post">

		<label>id</label>
		<form:input path="id" readonly="true" />
		<br />
		<br />

		<label>FoodId</label>
		<form:input path="foodId" />
		<br />
		<br />

		<label>Food Name</label>
		<form:input path="name" />
		<br />
		<br />

		<label>FoodType</label>
		<form:input path="type" />
		<br />
		<br />

		<label>Food Size</label>
		<form:input path="foodSize" />
		<br />
		<br />

		<label>Quantity</label>
		<form:input path="quantity" />
		<br />
		<br />

		<label>Price</label>
		<form:input path="price" />
		<br />
		<br />

		<input type="submit" value="modify" />
	
	</form:form>
	
		</tbody>
	</table>
	
</body>
</html>