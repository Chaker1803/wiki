<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
<title>Insert title here</title>
</head>
<body>
	<div>
		<form method="post" action="/wiki/Accueil">
			<div class="form-group">
				<label for="id">Email:</label> <input type="id"
					class="form-control" id="id" name="id"
					placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="mdp">Password:</label> <input type="password"
					class="form-control" id="mdp" name="mdp"
					placeholder="Enter password">
			</div>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</body>
</html>

