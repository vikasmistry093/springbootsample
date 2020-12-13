<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="imports.jsp"></jsp:include>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="container-fluid">

		<div class="product-row">
			<div class="col-sm-6">
				<div class="product-main">
					<div class="fakeimg">
						<img alt="advertisement" class="product-img"
							src="/images/Product info.jpg" />
					</div>
				</div>

			</div>

			<div class="col-sm-6">
				<div class="product-main">
					<h2>TITLE HEADING</h2>
					<h5>Title description, Dec 7, 2017</h5>
					<p>Some text..</p>
					<p>Sunt in culpa qui officia deserunt mollit anim id est
						laborum consectetur adipiscing elit, sed do eiusmod tempor
						incididunt ut labore et dolore magna aliqua. Ut enim ad minim
						veniam, quis nostrud exercitation ullamco.</p>
				</div>

				<p>
					<a href="#"><button class="buy-button">Pill Button</button></a>
				</p>

			</div>


		</div>
	</div>
</body>
</html>
