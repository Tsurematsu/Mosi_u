

Recorrido((e) => {
    e.addEventListener("click", () => {
        Recorrido((o) => {
            o.style.backgroundColor = "transparent";
        });
        e.style.backgroundColor = "#e389ffcc";
    });
    // document.body.addEventListener("mosu");
});

function Recorrido(funcion) {
    let listDoc = document.getElementsByClassName("Entradas");
    for (let i = 0; i < listDoc.length; i++) {
        let subI = listDoc[i].getElementsByTagName("li");
        for (let f = 0; f < subI.length; f++) {
            funcion(subI[f]);
        }
    }
}

let WelcomeUser = false;
let ifDesktop = /android|iphone|kindle|ipad/i;
if (ifDesktop.test(navigator.userAgent)) {
    let lista = document.getElementsByTagName("input");
    for (let i = 0; i < lista.length; i++) {
        lista[i].style.maxWidth = "146px";
    }
}

async function cambio(e, tipo = null) {
    if (tipo == null) {
        document.body.focus();
        await setTimeout(() => {
            e.setAttribute("type", "text");
            e.disabled = true;
            setTimeout(() => {
                e.disabled = false;
            }, 500);
        }, 9000);
    } else {
        e.setAttribute("type", tipo);
    }
}

let doc = document.getElementById("Panel_welcome");
if (WelcomeUser == true) {
    setInterval(() => {
        doc.style.opacity = "0";
        setInterval(() => {
            doc.style.display = "none";
            setInterval(() => {
                document.getElementById("Panel_content").style.display = "block";
                setTimeout(() => {
                    document.getElementById("Panel_content").style.opacity =
                    "1";
                }, 100);
            }, 10);
        }, 200);
    }, 1000);
} else {
    doc.style.display = "none";
    document.getElementById("Panel_content").style.display = "block";
    setTimeout(() => {
        document.getElementById("Panel_content").style.opacity = "1";
    }, 50);
}