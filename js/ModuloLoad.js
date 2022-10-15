var ModuloLoad = new function () {
    let security0 = true;let numerCC;
    let cachePage=[[],[],[]];
    let fileScript=Ruta;
    let SelectPage="";
    //Las funciones publicas empiezan aqui 
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX




    //Accseso inicial de la pagina (Ranura Numerica de Memoria en Carga) Advertencia, esta no debe ser manipulable por el programador
    this.rnmLoad = function(rnm){if (security0 ==true){security0=false;numerCC=rnm;}}

    //Esta obtiene la pagina actual seleccionada por el usuario, en formado encriptado
    this.tempPage = function () {return SelectPage;};

    //Carga la pagina que se le indique esta debe estar encriptada, tambien se debe indicar
    //el lugar en donde esta se cargara en el documento 
    this.load =async function (page, Documento = document.getElementsByTagName("body")[0]){
        SelectPage = page;
        let selectFile;
        let ejecuteScripts;
        let existPage=existList(cachePage[0],page);
        if(existPage){
            selectFile=cachePage[1][existPage-1];
            ejecuteScripts=cachePage[2][existPage-1];
        }else{
            let namePage = await decode(page);
            let litNPage = namePage.replaceAll(".html", "");
            selectFile=await encodeInText(await readFilePhp(namePage))

            
            //selectFile=await encodeInText(await readFile(namePage))

            let ifoTitle = indicators(selectFile, "<title>", "<title>".replace("t","/t"))
            selectFile = selectFile.replaceAll(ifoTitle[0][0], "");
            let titulo=ifoTitle.length>0?ifoTitle[1][0]:null;


            let JS_Global_Scrypt_List=[];
            let scriptsDeaful0 = indicators(selectFile, "<script Global>", "</script>")
            for (let i = 0; i < scriptsDeaful0[0].length; i++) {
                selectFile = selectFile.replaceAll(scriptsDeaful0[0][i], "");
                let editedscurityPage = 'if (ModuloLoad.tempPage()=="' + page + '") { ' + scriptsDeaful0[1][i] + ' }'
                JS_Global_Scrypt_List.push(function() {
                    ghostScript(editedscurityPage, "JS_" + litNPage, Documento);
                })
            }
            
            let JS_Scrypt_List=[];
            let scriptsDeaful = indicators(selectFile, "<script>", "<script>".replace("s","/s"))
            for (let i = 0; i < scriptsDeaful[0].length; i++) {
                selectFile = selectFile.replaceAll(scriptsDeaful[0][i], "");
                let editedscurityPage = 'if (ModuloLoad.tempPage()=="' + page + '") { ' + scriptsDeaful[1][i] + ' }'
                JS_Scrypt_List.push(function() {
                    ghostScriptEval(editedscurityPage, "JS_" + litNPage);
                })
            }
            
            let JS_SRC_Scrypt_List=[];
            let importacionSrcScrypt = indicators(selectFile, '<script src="', '"></>')
            for (let i = 0; i < importacionSrcScrypt[0].length; i++) {
                selectFile = selectFile.replaceAll(importacionSrcScrypt[0][i],"");
                JS_SRC_Scrypt_List.push(function () {
                    ImportJsScrypt(importacionSrcScrypt[1][i], "JS_SRC_" + litNPage)
                })
            }

            let CSS_Scrypt_List=[];
            let importacionCss = indicators(selectFile, '<link rel="stylesheet" href="', '">')
            for (let i = 0; i < importacionCss[0].length; i++) {
                selectFile = selectFile.replaceAll(importacionCss[0][i],"");
                CSS_Scrypt_List.push(function () {
                    ImportCssScrypt(importacionCss[1][i], "CSS_", Documento);
                })
            }

            let SpecialParrafos=indicators(selectFile, '<text>','</text>');
            for (let i = 0; i < SpecialParrafos.length; i++) {
                if (!SpecialParrafos[1][i]=='') {
                    let nameTemp = 'Temp_Text' + Math.floor(Math.random() * 2080)
                    selectFile = selectFile.replaceAll(SpecialParrafos[0][i],nameTemp);
                    let poseced=SpecialParrafos[1][i].replaceAll('\r','\r<br>');
                    poseced=SpecialParrafos[1][i].replaceAll('\n','\n<br>');
                    selectFile = selectFile.replaceAll(nameTemp,poseced);
                }
                
            }

            ejecuteScripts = ()=>{
                if (titulo!=null) {document.title = titulo;}
                JS_Global_Scrypt_List.forEach(js_scrypt => {js_scrypt();});
                CSS_Scrypt_List.forEach(Csscrypt => {Csscrypt();});
                JS_SRC_Scrypt_List.forEach(js_src_scrypt => {js_src_scrypt();});
                JS_Scrypt_List.forEach(js_scrypt => {js_scrypt();});
            }
            cachePage[0].push(page);
            cachePage[1].push(selectFile);
            cachePage[2].push(function() {ejecuteScripts();});
        }
        Documento.innerHTML=selectFile
        ejecuteScripts();
    }





    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    async function readFilePhp(ruta){return decode(await callScript('readFilePHP', ruta, Dec(numerCC)))}
    async function encode(str) {return callScript("encode", str, Dec(numerCC));}
    async function decode(str) {return Dec(await callScript("decode", str, Dec(numerCC)));}
    
    async function readFile(ruta) {let resultado="";await $.ajax({url : ruta,dataType: "text",success : function (data){resultado = data;}});return resultado;}
    async function callScript(Funct, Param="", Password="_") {let result="";await $.ajax({method: "POST",url: fileScript,data: {funct:Funct, param:Enc(Param), password:Password},success: function(data) {result = data;},});return result;}
    async function encodeInText(inWord){let outWord =  inWord;let inText = indicators(inWord, "encode(",")");for (let i = 0; i < inText[0].length; i++) {outWord=outWord.replaceAll(inText[0][i],await encode(inText[1][i]))}return outWord}
    
    function Enc( str ) {return window.btoa(unescape(encodeURIComponent( str )));}
    function Dec( str ) {return decodeURIComponent(escape(window.atob( str )));}
    function delScript(idScript){var DCT = document.getElementById(idScript); DCT.parentNode.removeChild(DCT);};
    function indicators(word, open, close) {let inWord= word.split(open);let ListKeys=[[],[]];let count=0;inWord.forEach(element1 => {if (count >0) {let contenido= element1.split(close)[0];ListKeys[1].push(contenido);ListKeys[0].push(open + contenido + close);}else{count++}});return ListKeys}
    function existList(lista, elemento){let existe=0;for (let i = 0; i < lista.length; i++) {if (existe==0) {if(lista[i]==elemento){existe=i+1/*lista[i];*/}}};return existe;}
    
    function ghostScript(textCode, nameId="gost", docLocate=document.getElementsByTagName('body')[0]){
        let script = document.createElement('script', sedondID=null);
        let scriptid=Enc(Math.floor(Math.random() * 2080)).replaceAll('.', '').replaceAll('/', '').replaceAll('-', '').replaceAll('=', '');
        scriptid += "_" +  nameId.replaceAll('.', '').replaceAll('/', '').replaceAll('-', '').replaceAll('=', '');
        script.id = scriptid;
        script.innerHTML = textCode;
        docLocate.appendChild(script);
        delScript(script.id);
        if (sedondID!=null) {delScript(sedondID);}
    };

    function ghostScriptEval(textCode, nameId="gost") {
        let scriptid=Enc(Math.floor(Math.random() * 2080)).replaceAll('.', '').replaceAll('/', '').replaceAll('-', '').replaceAll('=', '');
        scriptid += "_" +  nameId.replaceAll('.', '').replaceAll('/', '').replaceAll('-', '').replaceAll('=', '');
        eval('function '+ scriptid +'() {'+ textCode + '};');
        // eval('let '+ scriptid +' = new function (){this.main=(()=>{'+ textCode + '});};');
        eval(scriptid + '();');
    }

    function ImportJsScrypt(srcText, nameId="gostSRC", docLocate=document.getElementsByTagName('head')[0]){
        let script = document.createElement('script', sedondID=null);
        script.id = nameId + "_" + Math.floor(Math.random() * 2080);
        script.src = srcText;
        docLocate.appendChild(script);
        delScript(script.id);
        if (sedondID!=null) {delScript(sedondID);}
    };

    function ImportCssScrypt(linktext, nameId="TempStyle_", docLocate=document.getElementsByTagName('body')[0]){
        var link = document.createElement('link');
        link.id = nameId + '_' + Math.floor(Math.random() * 2080)
        link.rel = 'stylesheet'; 
        link.type = 'text/css';
        link.href = linktext;
        docLocate.appendChild(link);
    };
    
}

//funcion que obtiene el nombre del elemento por su etiqueta
getTagName = (name, num=0)=>{return document.getElementsByTagName(name)[num];}
