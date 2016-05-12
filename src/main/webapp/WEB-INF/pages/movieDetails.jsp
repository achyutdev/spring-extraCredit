<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Main Page</title>
</head>
<body>
	<form action="../books/${book.id}" method="post">
	<table>
		<tr>
			<td>Title:</td>
			<td><input type="text" name="title" value="${movie.title}"/> </td>
		</tr>
		<tr>
			<td>Rating :</td>
			<td><input type="text" name="ISBN" value="${movie.rating}"/> </td>
		</tr>
		<tr>
			<td>releaseDate:</td>
			<td><input type="text" name="author" value="${movie.releaseDate}"/> </td>
		</tr>
		<tr>
			<td>genre:</td>
			<td><input type="text" name="price" value="${movie.genre}"/> </td>
		</tr>
	</table>
	<input type="submit" value="update"/>
	</form>
	<form action="delete?bookId=${movie.id}" method="post">
		<button type="submit">Delete</button>
	</form>
</body>
</html>