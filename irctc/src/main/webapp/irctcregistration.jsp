<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
form {
	background-color: blue;
	background-size: cover;
	padding: 80px 450px 80px 450px;
	border: 4px solid black;
}

div {
	padding: 8px 80px;
}

h2 {
	color: blue;
}

legend {
	
}

fieldset {
	background-color: red;
	border: 3px solid black;
	border-radius: 7%;
}
</style>
</head>
<body>
	<form action="savePassenger">
		<fieldset>
			<legend>
				<h3> IRCTC Registration Form :</h3>
			</legend>
			<div>
				<label for="Name">Enter Name</label> <input type="text"
					name="customerName">
			</div>
			<div>
				<label for="contactNumber">IRCTC ID</label> <input type="tel"
					name="irctcId">
			</div>
			<div>
				<label for="password">Password</label> <input type="password"
					name="password">
			</div>
			<div>
				<label for="email">Email</label> <input type="email" name="email">
			</div>
			<div>
				<label for="irctcid">Contact Number</label> <input type="tel"
					name="phone">
			</div>	
			<div>
				<label for="fromstation">From  TO</label> <input type="text"
					name="fromStation">
			</div>
			<div>
				<label for="tostation">To</label> <input type="text"
					name="toStation">
			</div>
			<div>
				<input type="submit" value="Search & Submit">
			</div>
		</fieldset>
	</form>
</body>
</html>