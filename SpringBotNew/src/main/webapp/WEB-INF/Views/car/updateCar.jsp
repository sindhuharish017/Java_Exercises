<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<form action="/car/updateCar/${car.id }" method="post">
	<input type="hidden" name="id" value="${car.id}"> 
		<table>
			<tr>
				<td>Make</td>
				<td><input type="text" name="make" value="${car.make}"/></td>
			</tr>
			<tr>
				<td>Model</td>
				<td><input type="text" name="model" value="${car.model}" /></td>
			</tr>

			<tr>
				<td>Year</td>
				<td><input type="text" name="yearManufactured" value="${car.yearManufactured}" /></td>
			</tr>

			<tr>
				<td>Color</td>
				<td><input type="text" name="color" value="${car.color}" /></td>
			</tr>

			<tr>
				<td>Kms Run</td>
				<td><input type="text" name="kms" value="${car.kms}" /></td>
			</tr>

			<tr>
				<td>Price</td>
				<td><input type="text" name="price" value="${car.price}" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="update"></td>

				<td><input type="submit" name="submit" value="Cancel"></td>
			</tr>
		</table>
	</form>

</body>
</html>