package app.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.demo.db.DataBase;

import org.springframework.ui.Model;

@Controller("/")
public class controler {
    static String resultado="";

    @GetMapping(path = "/Login")
    public static String Login(Model Modelo,  
    @RequestParam(name = "correo", required = false, defaultValue = "nothing") String usuario, 
    @RequestParam(name = "pasword", required = false, defaultValue = "nothing") String password){
        resultado=DataBase.TablaUsuarios.Login(usuario, password);
        Modelo.addAttribute("results", resultado);
        return "nodo";
        
    }

    @GetMapping(path = "/Regist")
    public static String Regist(Model Modelo,  
    @RequestParam(name = "nombre", required = false, defaultValue = "nothing") String usuario, 
    @RequestParam(name = "apellido", required = false, defaultValue = "nothing") String apellido, 
    @RequestParam(name = "correo", required = false, defaultValue = "nothing") String correo, 
    @RequestParam(name = "telefono", required = false, defaultValue = "nothing") String telefono,
    @RequestParam(name = "contraseña", required = false, defaultValue = "nothing") String contraseña,
    @RequestParam(name = "confirContraseña", required = false, defaultValue = "nothing") String confirContraseña,
    @RequestParam(name = "universidad", required = false, defaultValue = "nothing") String universidad,
    @RequestParam(name = "fechaNacmiento", required = false, defaultValue = "nothing") String fechaNacmiento,
    @RequestParam(name = "genero", required = false, defaultValue = "nothing") String genero){
        resultado=DataBase.TablaUsuarios.Regist(usuario, apellido, correo, telefono, contraseña, confirContraseña, universidad, fechaNacmiento, genero);
        Modelo.addAttribute("results", resultado);
        return "nodo";
    }


    @GetMapping(path = "/GetLoger")
    public static String GetLoger(Model Modelo){
        resultado=DataBase.TablaUsuarios.GetLoger();
        Modelo.addAttribute("results", resultado);
        return "nodo";
    }


    @GetMapping(path = "/GetCiudad")
    public static String GetCiudad(Model Modelo){
        resultado=DataBase.TablaAdministrador.GetCiudad();
        Modelo.addAttribute("results", resultado);
        return "nodo";
        
    }


    @GetMapping(path = "/GetDrivers")
    public static String GetDrivers(Model Modelo, 
    @RequestParam(name = "Ciudad1", required = false, defaultValue = "-1") String Ciudad1, 
    @RequestParam(name = "Ciudad2", required = false, defaultValue = "-1") String Ciudad2,
    @RequestParam(name = "tipoPlan", required = false, defaultValue = "-1") String tipoPlan,
    @RequestParam(name = "tipoVuelo", required = false, defaultValue = "-1") String tipoVuelo
    ){
        resultado=DataBase.TablaAdministrador.GetDrivers(Ciudad1, Ciudad2, tipoPlan, tipoVuelo);
        Modelo.addAttribute("results", resultado);
        return "nodo";
        
    }
    
    
}
