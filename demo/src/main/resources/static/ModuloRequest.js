

function CallStript(usuario, password) {
    var miAjax = new Request({
        "url": "recibo-post.php",
        "onSuccess": function(respuesta){
           $("contenedorajax").set("html", respuesta);
        }
     }).send({"data": "provincia=malaga&ciudad=marbella"});
}