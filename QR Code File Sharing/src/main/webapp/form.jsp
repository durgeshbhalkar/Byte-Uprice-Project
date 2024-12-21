<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="p-4 rounded shadow mx-auto my-3 bg-primary" style="max-width: 400px; width: 100% ">
<form action="code" method="get">
<div class="my-1" >
<label for="data" class="form-label fw-bold" >Data: </label>
<input type="text" id="data" class="form-control" name="data" placeholder="Enter your text here">
</div>
<div class="my-1">
<label for="filename" class="form-label fw-bold" >File Name: </label>
<input type="text" id="filename" class="form-control" name="filename" placeholder="Enter your file name">
</div>
<button type="submit" class="btn btn-warning btn-block my-2"> Get QR</button>
</form>
</div>
</body>
</html>