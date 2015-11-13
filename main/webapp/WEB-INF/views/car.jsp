<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@page import="com.google.gson.Gson"%>
<!--     Gson car = new JSONObject(Car); -->
<%
	//     json.put("park", "PARK_CAR");
	//     json.put("link", "LINK_PARK");
	//     out.print(car);
	//     out.flush(park);
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Veículos</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</head>
<body>
	<h1>Cadastro de Veículos</h1>
	<form method="post" action="/park-gt/cars/insert">

		<div>
			<label for="title">Id</label> <input type="text" name="id" id="id" />
		</div>
		<div>
			<label for="nome">Nome</label> <input type="text" name="nome"
				id="nome" />

		</div>
		<div>
			<input type="submit" value="enviar" />
		</div>

	</form>
	<script type="text/javascript">
	
	$("#id").val()
		alert(1);
		$(document).ready(function() {
			alert(2);
			$.ajax({
				url : 'http://localhost:8080/park-gt/cars/insert',
				type : "POST",
				dataType : 'json',
				header : {
					"Content-Type" : "application/json"
				},
				data : {
					name : "abc",
					id : 123
				},
				success : function(json) {
					alert(json);
				},
				error : function(json) {
					alert(json);
				}
			});
		})
	</script>
</body>
</html>