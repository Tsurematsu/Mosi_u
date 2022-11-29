

async function LoginUser(usuario, password) {
    return await callScript('../../Login', 
    { 
        'user' : document.getElementById(usuario).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function GetLoger() {
    return await callScript('../../GetLoger', {});
}

async function RegistUser(nombre, apellido, correo, telefono, contraseña, confirContraseña, universidad, fechaNacmiento, genero) {
    return await callScript('../../Regist', 
    { 
        'nombre' : document.getElementById(usuario).value, 
        'apellido' : document.getElementById(apellido).value, 
        'correo' : document.getElementById(correo).value, 
        'telefono' : document.getElementById(telefono).value, 
        'contraseña' : document.getElementById(contraseña).value, 
        'confirContraseña' : document.getElementById(confirContraseña).value, 
        'universidad' : document.getElementById(universidad).value, 
        'fechaNacmiento' : document.getElementById(fechaNacmiento).value, 
        'genero' : document.getElementById(genero).value, 
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