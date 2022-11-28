let aprovado = document.querySelector('.aprovado');
let nav_principal = document.querySelector('.nav_principal');
let princi = document.querySelector('.princi');

aprovado.onclick=function(){
    nav_principal.classList.toggle('activar')
    princi.classList.toggle('activar')
}

let lista = document.querySelectorAll('.nav_principal li');
function activoLink(){
    lista.forEach((item)=> 
    item.classList.remove('encima'));
    this.classList.add('encima');
    
}

lista.forEach((item)=>
item.addEventListener('mouseover',activoLink));