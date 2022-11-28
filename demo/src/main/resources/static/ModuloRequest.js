

function CallStript(usuario, password) {
    $.ajax({
        url: 'Login',
        data: { 'user' : usuario, 'pasword':password },
        type: "GET",
        success: function(result) {
            alert(result);
        }
    });
    
}