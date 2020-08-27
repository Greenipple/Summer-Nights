    $(document).ready(function(){

        $('#signup').click(addUser);

        document.getElementById("data-form").style.display="none";

        $('#signup-btn').click(showForm);


    });

    function addUser() {
        $.ajax({
            url: 'https://summer-nights.herokuapp.com/api/signup',
            type: 'POST',
            data: JSON.stringify({
                userName: $('#username').val(),
                email: $('#email').val(),
                password: $('#password').val(),
                age:$('#age').val(),
            }),
            async: true,
            contentType: 'application/json',
            success: added,
            error: errorCallback
        });
    };

    function added() {
        var alertContainer = $('#alerts');
        var alert = '<div class="alert alert-success alert-dismissible" role="alert">' +
            '<strong>Sign in successful. Welcome to summernight.</strong>' +
            '<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button></div>'

        alertContainer.append(alert);
        console.log('User added!');

    };

    function errorCallback() {
        alert('Error');
    };

    function showForm() {
        document.getElementById("data-form").style.display="block";
    }