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
    @RequestParam(name = "user", required = false, defaultValue = "nothing") String usuario, 
    @RequestParam(name = "pasword", required = false, defaultValue = "nothing") String password){
        resultado=DataBase.TablaUsuarios.Login(usuario, password);
        Modelo.addAttribute("results", resultado);
        return "nodo";
        
    }
    
}
