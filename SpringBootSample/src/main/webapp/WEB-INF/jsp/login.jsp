<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="imports.jsp"></jsp:include>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container-fluid">
		<table>
			<tr>
				<td>
					<h2>Login</h2>

					<div class="login">
						<label for="uname"><b>Username</b></label> <input type="text"
							placeholder="Enter Username" name="uname" required> <br>
						<label for="psw"><b>Password</b></label> <input type="password"
							placeholder="Enter Password" name="psw" required> <br>
						<button type="submit">Login</button>
					</div>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>