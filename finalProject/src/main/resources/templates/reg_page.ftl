<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration form's Main</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
</head>
<body ng-app="registration_form" ng-controller="AppCtrl">
<div class="container" style="margin-top: 60px">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <h5 th:text="#{language.title}"></h5>
        </div>

        <div>
            <select id="locales">
                <option value=""></option>
                <option value="en" th:text="#{eng.button}"></option>
                <option value="ua" th:text="#{ua.button}"></option>
            </select>
        </div>

        <div class="col-md-8 col-md-offset-2">
            <h3 id="resultMessage" th:if="${message != null}" th:text="${message}"></h3>
            <h2 class="page-header" th:text="#{registration.form.title}"></h2>
            <form style="margin-bottom: 30px" name="form" autocomplete="off"
                  novalidate ng-submit="form.$valid && sendForm(auth)" method="post" enctype="utf8"
                  th:action="@{/process_register}">
                <div class="form-group">
                    <label id="inputNameLabel" for="exampleInputName" th:text="#{first.name}"></label>
                    <input type="text"
                           class="form-control"
                           id="exampleInputName"
                           th:placeholder="#{first.name}"
                           required
                           ng-model="auth.names">
                </div>
                <div class="form-group">
                    <label id="inputLoginLabel" for="exampleInputLogin" th:text="#{login}"></label>
                    <input type="text"
                           class="form-control"
                           id="exampleInputLogin"
                           th:placeholder="#{login}"
                           required
                           ng-model="auth.login">
                </div>
                <div class="form-group">
                    <label id="inputPasswordLabel" for="exampleInputPassword" th:text="#{password}"></label>
                    <input type="password"
                           class="form-control"
                           id="exampleInputPassword"
                           th:placeholder="#{password}"
                           required
                           ng-model="auth.password">
                </div>
                <button id="sendForm" type="submit" class="btn btn-success" style="margin-top:30px" ng-disabled="form.$invalid"
                        th:text="#{submit}">
                </button>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="/js/main.js"></script>
</body>
</html>