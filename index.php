<?php
function encode ($valor, $pass) {$method = 'aes-256-cbc';$iv = base64_decode("C9fBxl1EWtYTL1/M8jfstw==");echo openssl_encrypt ($valor, $method, $pass.base64_encode("75913"), false, $iv);};
function decode ($valor, $pass) {$method = 'aes-256-cbc';$iv = base64_decode("C9fBxl1EWtYTL1/M8jfstw==");echo base64_encode(openssl_decrypt($valor, $method, $pass.base64_encode("75913"), false, $iv));};
function readFilePHP($nombre_fichero, $pass){$fichero_texto = fopen ($nombre_fichero, "r");$contenido_fichero = fread($fichero_texto, filesize($nombre_fichero));echo encode($contenido_fichero, $pass);}
if (isset($_POST['funct'])) {$func = $_POST['funct']; $func(isset($_POST['param'])? base64_decode($_POST['param']):"", isset($_POST['password'])?$_POST['password']:"_");}else{$password = base64_encode(rand(4357, 9866).'_'.rand(4357, 9866).'_'.rand(4357, 9866));$numRand1 = base64_encode($password);$Ruta = basename(__FILE__);$RutaBase = str_replace("/","", $_SERVER['PHP_SELF']);echo '<script>let Ruta="'.$Ruta.'"; let RutaBase="'.$RutaBase.'";</script>';?>
//comentario 1
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Moosi_U</title>
    <link rel="icon" href="favicon.png">
    <script src="./Imports/jquery-3.6.0.min.js">
    // <script src="https://code.jquery.com/jquery-3.6.0.min.js">
    </script><script src="./js/ModuloLoad.js"></script>
    <?php echo '<script>ModuloLoad.rnmLoad("'.$numRand1.'")</script>'; ?>
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>
    <div id='subBody'><div id='contenido'>
    <script>
            let prm1 = "<?php encode('./html/Home.html', $password) ?>"
            let DocSubBody = document.getElementById('contenido')
            ModuloLoad.load(prm1, DocSubBody).then(()=>{
                /* En esta parte se ejecuta la logica necesaria cuando finalize la carga de el documento */
            })
        </script>
    </div></div>
</body>
</html>
<?php } ?>