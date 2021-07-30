<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Choose language</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
</head>

<div style="width:800px; margin:0 auto;">
</div>

<body ng-app="registration_form" ng-controller="AppCtrl">
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



    <div style="width:800px; margin:0 auto;">
        <div id="locales" align="center">
            <button type="button"
                    th:onclick="|window.location.href='/reg'|" id="regB"
                    th:text="#{registration.button}">
            </button>
            <button type="button"
                    th:onclick="|window.location.href='/login'|" id="loginB"
                    th:text="#{login.button}">
            </button>
        </div>
    </div>

    <script type="text/javascript" src="/js/main.js"></script>
</body>
</html>