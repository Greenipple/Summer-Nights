
var user;

$(document).ready(function(){

    $('#submit-btn').click(tryLogin);

    $('#like').click(like);

    $('#dislike').click(dislike);

    document.getElementById("welcome-user").style.display="block";

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
    $('#logo2').hide()
    $('#sidemenu').show()
    $('#welcome-user').append(user.userName)
}

function like() {
    var currentSong = $('.ytp-title-link').text();

    console.log(currentSong);
    console.log($('.ytp-title-link').text());

    $('.ytp-next-button').trigger('click');
}

function dislike() {
    $('.ytp-next-button').trigger('click');
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