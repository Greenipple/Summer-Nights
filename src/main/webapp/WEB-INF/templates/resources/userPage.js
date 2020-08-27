
var user;

$(document).ready(function(){

    $('#submit-btn').click(tryLogin);




});

function tryLogin() {
    $.ajax({
        url: 'https://summer-nights.herokuapp.com/api/login',
        type: 'POST',
        data: JSON.stringify({
            userName: $('#username').val(),
            password: $('#password').val(),
        }),
        async: true,
        contentType: 'application/json',
        success: login,
        error: errorCallback
    });

}

function login(requestUser) {
    user = requestUser
    $('#login-form').hide()
    $('#welcome-user').append(user.userName)
}

function getUser() {
    $.ajax({
        url: 'https://summer-nights.herokuapp.com/api/user/' + id,
        type: 'GET',
        async: true,
        success: refreshUser,
        error: errorCallback
    });
}

function refreshUser(requestUser) {
    user = requestUser
}

function errorCallback() {
    alert('Error');
};