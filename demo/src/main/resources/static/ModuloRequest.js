

async function Login(correo, password) {
    return await callScript('../../Login', 
    { 
        'correo' : document.getElementById(correo).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function GetLoger() {return await callScript('../../GetLoger', {});}

async function Regist(nombre, apellido, correo, telefono, contraseña, confirContraseña, universidad, fechaNacmiento, genero) {

    return await callScript('../../Regist', 
    { 
        'nombre' : document.getElementById(nombre).value, 
        'apellido' : document.getElementById(apellido).value, 
        'correo' : document.getElementById(correo).value, 
        'telefono' : document.getElementById(telefono).value, 
        'contraseña' : document.getElementById(contraseña).value, 
        'confirContraseña' : document.getElementById(confirContraseña).value, 
        'universidad' : document.getElementById(universidad).value, 
        'fechaNacmiento' : document.getElementById(fechaNacmiento).value, 
        'genero' : "", 
        // 'genero' : document.getElementById(genero).value, 
    });
}

async function RegistCard(usuario, password) {
    return await callScript('../../RegistCard', 
    { 
        'user' : document.getElementById(usuario).value, 
        'pasword':document.getElementById(password).value 
    });
}

async function GetDrivers(Ciudad1, Ciudad2, tipoPlan, tipoVuelo) {
    // alert(Ciudad1 + " " + Ciudad2);
    return await callScript('../../GetDrivers', 
    { 
        'Ciudad1' :Ciudad1, 
        'Ciudad2':Ciudad2,
        'tipoPlan':tipoPlan, 
        'tipoVuelo':tipoVuelo,
    });

}
async function GetCiudad() {
    return await callScript('../../GetCiudad', {});
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
            // alert(resultado)
        }
    });
    return await resultado;
}
