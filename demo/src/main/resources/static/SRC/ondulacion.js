(()=>{
    // console.log("hello");
    let reemplazo = document.getElementById("ondaConten");
    reemplazo.innerHTML = '<div id="ondulacion"><div></div><style>#ondulacion {margin-top: 250px;width: 100%;height: 250px;background-size: 100%;position: absolute;overflow: hidden;}#ondulacion div {position: absolute;background-image: url("/SRC/Ondulacion.svg");width: 200%;height: 800px;animation-name: animacion1;animation-duration: 5s;animation-iteration-count: infinite;animation-timing-function: linear;}@keyframes animacion1 {0% {left: -10px;} 100% {left: -100%;}}</style></div>';
})()
