package app.demo.db;

import java.util.ArrayList;

public class DataBase {
    static String[][] Administradores= new String[][]{{"Jorge", "joji"}, {"Martin", "martin123"}, {"Aldair", "#AldairSoftwareDevelopment"}, {"Roys", "roys123"}, {"Jose", "admin"}};
    
    /**
     * Tabla
     */ 
    public static class TablaTiquets {
        public static ArrayList<ObjectTiquets> ArrayTiquets = new ArrayList<>();
        public static class ObjectTiquets {

        }

    }



    public static class TablaUsuarios {
        
        public static ArrayList<ObjectRegistos> ArrayUsuario = new ArrayList<>();
        static String adminNombre = "No Logeado";
        public static String GetAdmin(){return adminNombre;}

        public static class ObjectRegistos {
            String cedula;
            String nombre;
            String apellido;
            String fechaNacimiento;
            String numeroCelular;
            String correoElectronico;
            String contrasenia;
            String universidad;
            String genero;
            public ObjectRegistos(String cedula, String nombre, String apellido, String fechaNacimiento,
                    String numeroCelular, String correoElectronico, String contrasenia, String universidad,
                    String genero) {
                this.cedula = cedula;
                this.nombre = nombre;
                this.apellido = apellido;
                this.fechaNacimiento = fechaNacimiento;
                this.numeroCelular = numeroCelular;
                this.correoElectronico = correoElectronico;
                this.contrasenia = contrasenia;
                this.universidad = universidad;
                this.genero = genero;
            }
            public String getCedula() {
                return cedula;
            }
            public String getNombre() {
                return nombre;
            }
            public String getApellido() {
                return apellido;
            }
            public String getFechaNacimiento() {
                return fechaNacimiento;
            }
            public String getNumeroCelular() {
                return numeroCelular;
            }
            public String getCorreoElectronico() {
                return correoElectronico;
            }
            public String getContrasenia() {
                return contrasenia;
            }
            public String getUniversidad() {
                return universidad;
            }
            public String getGenero() {
                return genero;
            }
            public void setCedula(String cedula) {
                this.cedula = cedula;
            }
            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
            public void setApellido(String apellido) {
                this.apellido = apellido;
            }
            public void setFechaNacimiento(String fechaNacimiento) {
                this.fechaNacimiento = fechaNacimiento;
            }
            public void setNumeroCelular(String numeroCelular) {
                this.numeroCelular = numeroCelular;
            }
            public void setCorreoElectronico(String correoElectronico) {
                this.correoElectronico = correoElectronico;
            }
            public void setContrasenia(String contrasenia) {
                this.contrasenia = contrasenia;
            }
            public void setUniversidad(String universidad) {
                this.universidad = universidad;
            }
            public void setGenero(String genero) {
                this.genero = genero;
            }
        }
        
        public static String Registro(String usuario, String apellido, String correo, String telefono, String contraseña, String confirContraseña, String universidad, String fechaNacmiento, String genero){
            String resultado = "false";
            
            return resultado;
        }

        public static String Login(String NomUser, String password){
            String resultado = "false";
            for (String[] objectAdmins : Administradores) {
                if (objectAdmins[0].equals(NomUser) && objectAdmins[1].equals(password)) {
                    resultado="admin";
                    adminNombre=NomUser;
                }
            }
            return resultado;
        }

        
    }


    public static class TablaAdministrador {
        public static ArrayList<ObjectAdministrador> ArrayAdministrador = new ArrayList<>();
        public static class ObjectAdministrador {
            
        }
    }
    


    

}
