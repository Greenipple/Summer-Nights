    $(document).ready(function(){

        $('#submit-btn').click(addUser);

        //document.getElementById("data-form").style.display="none";

        //$('#signup-btn').click(showForm);


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
        console.log('User added!')

    };

    function errorCallback() {
        alert('Error');
    };

    function showForm() {
        document.getElementById("data-form").style.display="block";
    }