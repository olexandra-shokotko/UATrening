
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login form's Main</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js"></script>
</head>
<body ng-app="login_form" ng-controller="AppCtrl">
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
            <h2 class="page-header" th:text="#{login.form.title}"></h2>
            <form style="margin-bottom: 30px" name="form" autocomplete="off" novalidate ng-submit="form.$valid && sendForm(auth)">
                <div class="form-group">
                    <label for="exampleInputEmail1" th:text="#{email}"></label>
                    <input type="email"
                           class="form-control"
                           id="exampleInputEmail1"
                           th:placeholder="#{email}"
                           required
                           ng-model="auth.email">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1" th:text="#{password}"></label>
                    <input type="password"
                           class="form-control"
                           id="exampleInputPassword1"
                           th:placeholder="#{password}"
                           required
                           ng-model="auth.password">
                </div>
                <button type="submit" class="btn btn-default" style="margin-top:30px" ng-disabled="form.$invalid">
                    Submit
                </button>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="/js/main.js"></script>
<script type="text/javascript" src="/js/login.js"></script>
</body>
</html>