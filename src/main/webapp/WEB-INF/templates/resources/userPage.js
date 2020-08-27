$(document).ready(function(){

    var id = 1;


    $.ajax({
        url: 'https://summer-nights.herokuapp.com/api/user/' + id,
        type: 'GET',
        async: true,
        success: showName,
        error: errorCallback
    });
});

function showName(user) {
    $('#username').val(user.userName);
}

function errorCallback() {
    alert('Error');
};