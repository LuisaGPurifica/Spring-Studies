<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>User Registration</title>
<script>
	$(document).ready(function() {
		$("#id").change(function() {

			$.ajax({

				url : 'validateId',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {

					$("#errMsg").text(responseText);

					if (responseText != "") {
						$("#id").focus();
					}

				}

			})

		});
	});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
		ID: <input type="text" name="id" id="id" /><span id="errMsg"></span> 
		Name: <input type="text" name="name" />
		E-mail: <input type="text" name="email" />
		<input type="submit" name="register" />
		</pre>
	</form>
	<br />${result}
</body>
</html>