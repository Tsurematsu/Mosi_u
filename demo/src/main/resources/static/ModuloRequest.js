

async function LoginUser(usuario, password) {
    return await callScript('../../Login', 
    { 
        'user' : document.getElementById(usuario).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function RegistUser(nombre, apellido, correo, telefono, contraseña, confirContraseña, universidad, fechaNacmiento, genero) {
    return await callScript('../../Regist', 
    { 
        'user' : document.getElementById(usuario).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function RegistCard(usuario, password) {
    return await callScript('../../Login', 
    { 
        'user' : document.getElementById(usuario).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function UpdateAdmin(usuario, password) {
    return await callScript('../../Login', 
    { 
        'user' : document.getElementById(usuario).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function callScript(ruta, params) {
    let resultado;
    await $.ajax({
        url: ruta,
        data: params,
        type: "GET",
        success: function(result) {
            ValorAbsoluto = result.split("<h1")[1];
            ValorAbsoluto = ValorAbsoluto.split('">')[1];
            ValorAbsoluto = ValorAbsoluto.split("</h1>")[0];
            // alert(ValorAbsoluto);
            resultado=ValorAbsoluto;
        }
    });
    return await resultado;
}