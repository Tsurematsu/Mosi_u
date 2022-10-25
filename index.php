<?php
function encode ($valor, $pass) {$method = 'aes-256-cbc';$iv = base64_decode("C9fBxl1EWtYTL1/M8jfstw==");echo openssl_encrypt ($valor, $method, $pass.base64_encode("75913"), false, $iv);};
function decode ($valor, $pass) {$method = 'aes-256-cbc';$iv = base64_decode("C9fBxl1EWtYTL1/M8jfstw==");echo base64_encode(openssl_decrypt($valor, $method, $pass.base64_encode("75913"), false, $iv));};
function readFilePHP($nombre_fichero, $pass){$fichero_texto = fopen ($nombre_fichero, "r");$contenido_fichero = fread($fichero_texto, filesize($nombre_fichero));echo encode($contenido_fichero, $pass);}
function MysqlAll($Consulta, $pass){
    $keyloger = explode(",",explode(";",$Consulta)[0]);
    $TextConsult = explode(";",$Consulta)[1];

    // $conexion{} = mysqli_connect("localhost", "root", "", "test");
    
    $conexion = mysqli_connect("localhost", $keyloger[0], "", $keyloger[1]);

    if ($TextConsult=="") {
        $paramConsult = "SELECT * FROM prueba";
        $consulta = mysqli_query($conexion, $paramConsult);
        $resultado = "";
        while ($dato = mysqli_fetch_assoc($consulta)) {
            $paramConsult1 = "SHOW COLUMNS FROM prueba";
            $consult = mysqli_query($conexion, $paramConsult1);
            $res1="";
            while ($subDato = mysqli_fetch_assoc($consult)) {
                if ($res1 == "") {
                    $res1 = $subDato["Field"] . ":" . $dato[$subDato["Field"]];
                }else{
                    $res1 = $res1  . ", " . $subDato["Field"] . ":" .  $dato[$subDato["Field"]];
                }
            }
            if ($resultado == "") {
                $resultado = $res1;
            }else{
                $resultado = $resultado . ";" .  $res1;
            }
            
        }
        echo encode($resultado, $pass);
    }else{
        try {
            $paramConsult = $TextConsult;
            $consulta = mysqli_query($conexion, $paramConsult);
            while ($dato = mysqli_fetch_assoc($consulta)) {
                
            }
            
        } catch (\Throwable $th) {
            echo encode($th, $pass);
        }
    }
    
    
}

if (isset($_POST['funct'])) {
    $func = $_POST['funct']; 
    $func(isset($_POST['param'])? base64_decode($_POST['param']):"", isset($_POST['password'])?$_POST['password']:"_");
}else{
    $password = base64_encode(rand(4357, 9866).'_'.rand(4357, 9866).'_'.rand(4357, 9866));
    $numRand1 = base64_encode($password);$Ruta = basename(__FILE__);
    $RutaBase = str_replace("/","", $_SERVER['PHP_SELF']);
    echo '<script>let Ruta="'.$Ruta.'"; let RutaBase="'.$RutaBase.'";</script>';
?>

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
    //prueba de vscode web
    </script><script src="./js/ModuloLoad.js"></script>
    <?php echo '<script>ModuloLoad.rnmLoad("'.$numRand1.'")</script>'; ?>
    <!-- <link rel="stylesheet" href="./css/index.css"> -->
    <!-- Nota, este archivo es la piedra angular de la pagina web, ¡¡tener sumo cuidado!! -->

    <link rel="shotycut icon" href="PNG_Home/icon.png" type="image/x-icon">
</head>
<body id='contenido'>
    <script>
        let prm1 = "<?php encode('./3.usuario/user.html', $password) ?>"
        let DocSubBody = document.getElementById('contenido')
        ModuloLoad.load(prm1, DocSubBody).then(()=>{
            /* En esta parte se ejecuta la logica necesaria cuando finalize la carga de el documento */
        })
    </script>
</body>
</html>
<?php } ?>