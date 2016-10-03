<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>

<head>
    <meta charset="utf-8">
    <style>
        td select,
        td input {
            width: 150px;
        }

        label {
            display: block;
        }

        .error input,
        .error textarea {
            border: 1px solid red;
        }

        .error {
            color: red;
        }
    </style>
</head>

<body>


<form>
    <table>
        <tr>
            <td>First Name</td>
            <td>
                <input name="firstName" type="text">
            </td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td>
                <input name="lastName" type="text">
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input name="email" type="text">
            </td>
        </tr>
        <tr>
            <td>Ваш пароль</td>
            <td>
                <input name="password" type="password">
            </td>
        </tr>
        <tr>
            <td>Повторите пароль</td>
            <td>
                <input name="password2" type="password">
            </td>
        </tr>
        <tr>
            <td>Дата вашего рождения</td>
            <td>
                <input name="date" type="date">
            </td>
        </tr>

    </table>

    Other Information:
    <label>
        <textarea name="message" style="display:block;width:400px;height:80px"></textarea>
    </label>

    <input type="button" onclick="validate(this.form)" value="Проверить">
</form>

<script>
    function showError(container, errorMessage) {
        container.className = 'error';
        var msgElem = document.createElement('span');
        msgElem.className = "error-message";
        msgElem.innerHTML = errorMessage;
        container.appendChild(msgElem);
    }

    function resetError(container) {
        container.className = '';
        if (container.lastChild.className == "error-message") {
            container.removeChild(container.lastChild);
        }
    }

    function validate(form) {
        var elems = form.elements;

        resetError(elems.firstName.parentNode);
        if (!elems.firstName.value) {
            showError(elems.firstName.parentNode, ' Укажите ваше имя');
        }
        resetError(elems.lastName.parentNode);
        if (!elems.lastName.value) {
            showError(elems.lastName.parentNode, ' Укажите вашу фамилию');
        }

        resetError(elems.password.parentNode);
        if (!elems.password.value) {
            showError(elems.password.parentNode, ' Укажите пароль.');
        } else if (elems.password.value != elems.password2.value) {
            showError(elems.password.parentNode, ' Пароли не совпадают.');
        }

        var txt=elems.email.value;
        var dog = txt.indexOf("@");
        resetError(elems.email.parentNode);
        if (txt == "") {
            showError(elems.email.parentNode, 'Введите email');
        }
        else if (txt.indexOf(".") == -1) {
            showError(elems.email.parentNode, 'Неверный email(забыли ".")');
        }
        else if((txt.indexOf(",")>=0)||(txt.indexOf(";")>=0)||(txt.indexOf(" ")>=0)){
            showError(elems.email.parentNode,'Неверный email');
        }
        else if (dog == -1) {
            showError(elems.email.parentNode, 'Неверный email(забыли @)');
        }
        else if ((dog < 1) || (dog > txt.length - 5)) {
            showError(elems.email.parentNode, 'Неверный email');
        }
        else if ((txt.charAt(dog - 1) == '.') || (txt.charAt(dog + 1) == '.')) {
            showError(elems.email.parentNode, 'Неверный email');
        }

    }
</script>


</body>

</html>