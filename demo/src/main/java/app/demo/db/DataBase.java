package app.demo.db;

import java.util.ArrayList;

import javax.swing.Spring;

public class DataBase {
    /**
     * baseDeDatos
     */
    public class baseDeDatos extends TablaAdministrador{
        public static void ConfigBase(){
            ArrayList<String> HotelesList;

            HotelesList = new ArrayList<>();
            HotelesList.add(null);
            City.add(new ObjectCity("Medellín", 100, 10, 10, HotelesList));
            
            
        }
    }


//     Datos_personales=[]
// ciudades=['1.Medellín','2.Bogotá','3.Santa Marta','4.Barranquilla','5.Villavicencio','6.Bucaramanga','7.Cartagena']
// universidades=[[
// #UNIVERSIDADES DE MEDELLIN
// '1.Colegio Mayor de Antioquía (COLMAYOR)','2.Universidad de Antioquia (UDEA)', '3.Universidad Nacional de Colombia (UNAL)', '4.Tecnológico de Antioquía (TDEA)','5.Universidad Pontificia Bolivariana (UPB)'],
// #UNIVERSIDADES DE BOGOTA
// ['1.Universidad Nacional de Colombia (UNAL)','2.Pontificia Universidad Javeriana','3.Universidad de los Andes','4.Universidad Militar Nueva Granada (UMNG)','5.Corporación Universitaria Minuto de Dios'],
// #UNIVERSIDADES DE SANTA MARTA
// ['1.Universidad del Magdalena (UNIMAG)', '2.Universidad Sergio Arboleda','3.Universidad Antonio Nariño (UAN)','4.Universidad Cooperativa de Colombia (UCC)','5.Inst. Nac. de Formación Técnica Profesional de Ciénaga'],
// #UNIVERSIDADES DE BARRANQUILLA
// ['1.Universidad del Atlántico','2.Universidad del Norte (UNINORTE)','3.Universidad Autónoma del Caribe (UAC)', '4.Corporación Universitaria de la Costa (CUC)','5.Corporación Universitaria Latinoamericana (CUL)'],
// #UNIVERSIDADES DE VILLAVICENCIO
// ['1.Universidad de los Llanos','2.Corporación Universitaria del Meta (UNIMETA)','3.Corporación Universitaria Minuto de Dios','4.Universidad Autónoma de Nariño','5.Universidad Santo Tomás (USTA)'],
// #UNIVERSIDADES DE BUCARAMANGA
// ['1.Universidad Industrial de Santander (UIS)', '2.Universidad Francisco de Paula Santander (UFPS)','3.Universidad de Santander (UDES)','4.Universidad Autónoma de Bucaramanga (UNAB)','5.Universidad Pontificia Bolivariana (UPB)'],
// #UNIVERSIDADES DE CARTAGENA
// ['1.Universidad de Cartagena','2.Universidad del Sinú (UNISINU)','3.Corporación Universitaria Rafael Núñez (CURN)','4.Fundación Universitaria Tecnológico Comfenalco','5.Universidad de San Buenaventura']]


// hoteles=[[
// #HOTELES DE MEDELLIN
// '1.Hotel Poblado Plaza','2.Hotel dorado la 70.''3.The Morgana Polado Suites.','4.Hotel San Fernando Plaza','5.Hotel Poblado Alejandria.'],
// #HOTELES DE BOGOTA
// ['1.Hotel regina.','2.Wyndham Bogotá Art.','3.Hotel Santa Barbara Real.','4.Black Bogotá.','5.Tryp Bogotá Embajada.'],
// #HOTELES DE SANTAMARTA
// ['1.Hotel La Riviera.','2.Irotama Resort.','3.Hotel Mercure Emile.','4.Sanha Plus Hotel.','5.Portobahia Hotel.'],
// #HOTELES DE BARRANQUILLA
// ['1.Hotel Estelar En Alto Prado.','2.Hotel American Golf.','3.Movich Buro 51.','4.Country International Hotel.','5.Hotel Costa Linda.'],
// #HOTELES DE VILLAVICENCIO
// ['1.Hotel Villavicencio Plaza.','2.Hotel Del Llano.','3.Hotel Fontana Mar.','4.Confort Plaza Hotel.','5.VVC HOTELS.'],
// #HOTELES DE BUCARAMANGA
// ['1.Hotel Cabecera Country.','2.Hotel Chicamocha.','3.San Jose Plaza.','4.Hotel Buena Vista.','5.Hotel Plazuela Real.'],
// #HOTELES DE CARTAGENA
// ['1.Hotel Capilla Del Mar.','2.Hotel La Gran Vía.','3.Hotel Cartagena Plaza.','4.Hotel Almirante Cartagena.','5.Americas Torre del Mar.']]


    static String[][] Administradores= new String[][]{{"Jorge", "joji"}, {"Martin", "martin123"}, {"Aldair", "#Aldair"}, {"Roys", "roys123"}, {"Jose", "admin"}};

    /**
     * Tabla
     */ 
    public static class TablaTiquets {
        public static class ObjectTiquets {
            public String DepartamentoOut ="";
            public String LocalidadOut ="";

            public String DepartamentoIn ="";
            public String LocalidadIn ="";
            
            
            public String FechaVuelo ="";
            public String HoraVuelo ="";
            
            public String TipoEntrada ="";
            public String TipoTransporte ="";
            public ObjectTiquets(String departamentoOut, String localidadOut, String departamentoIn, String localidadIn,
                    String fechaVuelo, String horaVuelo, String tipoEntrada, String tipoTransporte) {
                this.DepartamentoOut = departamentoOut;
                this.LocalidadOut = localidadOut;
                this.DepartamentoIn = departamentoIn;
                this.LocalidadIn = localidadIn;
                this.FechaVuelo = fechaVuelo;
                this.HoraVuelo = horaVuelo;
                this.TipoEntrada = tipoEntrada;
                this.TipoTransporte = tipoTransporte;
            }
            public String getDepartamentoOut() {
                return DepartamentoOut;
            }
            public void setDepartamentoOut(String departamentoOut) {
                DepartamentoOut = departamentoOut;
            }
            public String getLocalidadOut() {
                return LocalidadOut;
            }
            public void setLocalidadOut(String localidadOut) {
                LocalidadOut = localidadOut;
            }
            public String getDepartamentoIn() {
                return DepartamentoIn;
            }
            public void setDepartamentoIn(String departamentoIn) {
                DepartamentoIn = departamentoIn;
            }
            public String getLocalidadIn() {
                return LocalidadIn;
            }
            public void setLocalidadIn(String localidadIn) {
                LocalidadIn = localidadIn;
            }
            public String getFechaVuelo() {
                return FechaVuelo;
            }
            public void setFechaVuelo(String fechaVuelo) {
                FechaVuelo = fechaVuelo;
            }
            public String getHoraVuelo() {
                return HoraVuelo;
            }
            public void setHoraVuelo(String horaVuelo) {
                HoraVuelo = horaVuelo;
            }
            public String getTipoEntrada() {
                return TipoEntrada;
            }
            public void setTipoEntrada(String tipoEntrada) {
                TipoEntrada = tipoEntrada;
            }
            public String getTipoTransporte() {
                return TipoTransporte;
            }
            public void setTipoTransporte(String tipoTransporte) {
                TipoTransporte = tipoTransporte;
            }
        }
        public static String AddTiquet(String DepartamentoOut, String LocalidadOut, String DepartamentoIn, String LocalidadIn, String FechaVuelo, String HoraVuelo, String TipoEntrada, String TipoTransporte){
            if (TablaUsuarios.SelectUser>=0) {
                TablaUsuarios.ArrayUsuario.get(TablaUsuarios.SelectUser).ArrayTiquets.add(new ObjectTiquets(DepartamentoOut, LocalidadOut, DepartamentoIn, LocalidadIn, FechaVuelo, HoraVuelo, TipoEntrada, TipoTransporte));
            }
            return "true";
        }
    }



    public static class TablaUsuarios extends TablaTiquets{
        public static ArrayList<ObjectUsers> ArrayUsuario = new ArrayList<>();
        static String adminNombre = "No Logeado";
        static String userNombre = "No Logeado";
        public static Integer SelectUser = -1;
        public static String GetAdmin(){return adminNombre;}
        public static String GetUser(){return userNombre;}

        public static class ObjectUsers  {
            String cedula;
            String nombre;
            String apellido;
            String fechaNacimiento;
            String numeroCelular;
            String correoElectronico;
            String contrasenia;
            String universidad;
            String genero;
            public static ArrayList<ObjectTiquets> ArrayTiquets = new ArrayList<>();
            public ObjectUsers(String cedula, String nombre, String apellido, String fechaNacimiento,
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
            boolean existe = false;

            for (ObjectUsers usuarios : ArrayUsuario) {
                if (usuarios.getCorreoElectronico().equals(correo)) {
                    existe = true;
                }
            }
            if (!existe) {
                if (contraseña.equals(confirContraseña)) {
                    ArrayUsuario.add(new ObjectUsers("", usuario, apellido, fechaNacmiento,telefono, correo, contraseña, universidad, genero));
                    resultado= "true";
                }
            }
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
            Integer contero =0;
            for (ObjectUsers usuario : ArrayUsuario) {
                if (usuario.correoElectronico.equals(NomUser) && usuario.contrasenia.equals(password)) {
                    userNombre = NomUser;
                    resultado="user";
                    SelectUser = contero;
                }
                contero++;
            }
            return resultado;
        }

        
    }

    public static class TablaAdministrador{
        public static ArrayList<ObjectAdministrador> ArrayAdministrador = new ArrayList<>();
        public static ArrayList<ObjectCity> City = new ArrayList<>();
        

        public static class ObjectAdministrador {
            city Ciudad1;
            city Ciudad2;
            Integer PrecioTotal;
            public ObjectAdministrador(city ciudad1, city ciudad2, Integer precioTotal) {
                Ciudad1 = ciudad1;
                Ciudad2 = ciudad2;
                PrecioTotal = precioTotal;
            }
            public city getCiudad1() {
                return Ciudad1;
            }
            public void setCiudad1(city ciudad1) {
                Ciudad1 = ciudad1;
            }
            public city getCiudad2() {
                return Ciudad2;
            }
            public void setCiudad2(city ciudad2) {
                Ciudad2 = ciudad2;
            }
            public Integer getPrecioTotal() {
                return PrecioTotal;
            }
            public void setPrecioTotal(Integer precioTotal) {
                PrecioTotal = precioTotal;
            }
        }

        public static class ObjectCity {
            String NombreCiudad="";
            Integer PrecioXkilometro=0;
            Integer Location_x=0; 
            Integer Location_Y=0;
            ArrayList<String> Hoteles = new ArrayList<>();
            public ObjectCity(String nombreCiudad, Integer precioXkilometro, Integer location_x, Integer location_Y,
                    ArrayList<String> hoteles) {
                NombreCiudad = nombreCiudad;
                PrecioXkilometro = precioXkilometro;
                Location_x = location_x;
                Location_Y = location_Y;
                Hoteles = hoteles;
            }
            public String getNombreCiudad() {
                return NombreCiudad;
            }
            public void setNombreCiudad(String nombreCiudad) {
                NombreCiudad = nombreCiudad;
            }
            public Integer getPrecioXkilometro() {
                return PrecioXkilometro;
            }
            public void setPrecioXkilometro(Integer precioXkilometro) {
                PrecioXkilometro = precioXkilometro;
            }
            public Integer getLocation_x() {
                return Location_x;
            }
            public void setLocation_x(Integer location_x) {
                Location_x = location_x;
            }
            public Integer getLocation_Y() {
                return Location_Y;
            }
            public void setLocation_Y(Integer location_Y) {
                Location_Y = location_Y;
            }
            public ArrayList<String> getHoteles() {
                return Hoteles;
            }
            public void setHoteles(ArrayList<String> hoteles) {
                Hoteles = hoteles;
            }
        }

    }
    


    

}
