<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Registration Success</title>
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container text-center">
    <h3>You have signed up successfully!</h3>
    <h4><a th:href="@{/login}">Click here to Login</a></h4>
</div>

</body>
</html>