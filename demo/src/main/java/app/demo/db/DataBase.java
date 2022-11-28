package app.demo.db;

import java.util.ArrayList;

public class DataBase {
    String[][] Administradores= new String[][]{{"Jorge", ""}, {"Martin", ""}, {"Aldair", ""}, {"Roys", ""}, {"Jose", ""}};
    
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
        
        public static void Registro(){

        }

        public static String Login(String NomUser, String password){
            String resultado = "hola pepe";
            return resultado;
        }
    }
    
    
    public static class TablaAdministrador {
        public static ArrayList<ObjectAdministrador> ArrayAdministrador = new ArrayList<>();
        public static class ObjectAdministrador {
            
            
        }
    }
    


    

}
