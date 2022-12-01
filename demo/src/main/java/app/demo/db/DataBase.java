package app.demo.db;

import java.util.ArrayList;


public class DataBase {
    /**
     * baseDeDatos
     */
    public class baseDeDatos extends TablaAdministrador{
        public static void ConfigBase(){
            ArrayList<String> HotelesList;

            //MEDELLIN
            HotelesList = new ArrayList<>();
            HotelesList.add("Hotel Poblado Plaza");
            HotelesList.add("Hotel dorado la 70.");
            HotelesList.add("The Morgana Polado Suites");
            HotelesList.add("Hotel San Fernando Plaza");
            HotelesList.add("Hotel Poblado Alejandria");
            City.add(new ObjectCity("Medellín", 260000, -80, 100, HotelesList));
                                                                //Precio                       X               Y 

            //BOGOTA
            HotelesList = new ArrayList<>();
            HotelesList.add("Hotel Regina");
            HotelesList.add("Wyndham Bogotá Art");
            HotelesList.add("Hotel Santa Barbara Real");
            HotelesList.add("Black Bogotá");
            HotelesList.add("Tryp Bogotá Embajada");
            City.add(new ObjectCity("Bogotá", 285000, 0, 0, HotelesList));
                                                                //Precio                       X               Y 
            

            //SANTA MARTA
            HotelesList = new ArrayList<>();
            HotelesList.add("Hotel La Riviera");
            HotelesList.add("Irotama Resort");
            HotelesList.add("Hotel Mercure Emile");
            HotelesList.add("Sanha Plus Hotel");
            HotelesList.add("Portobahia Hotel");
            City.add(new ObjectCity("Santa Marta", 200000, 0, 180, HotelesList));
                                                                //Precio                       X               Y 
            

            // Barranquilla
            HotelesList = new ArrayList<>();
            HotelesList.add("Hotel Estelar En Alto Prado");
            HotelesList.add("Hotel American Golf");
            HotelesList.add("Movich Buro 51.");
            HotelesList.add("Country International Hotel");
            HotelesList.add("Hotel Costa Linda.");
            City.add(new ObjectCity("Barranquilla", 2250000, -20, 160, HotelesList));
                                                                //Precio                       X               Y 
            

            //VILLAVICENIO
            HotelesList = new ArrayList<>();
            HotelesList.add("Villavicencio Plaza");
            HotelesList.add("Hotel Del Llano");
            HotelesList.add("Confort Plaza Hotel");
            HotelesList.add("Hotel Fontana Mar");
            HotelesList.add("VVC HOTELS");
            City.add(new ObjectCity("Villavicencio", 180000, 15, 30, HotelesList));
                                                                //Precio                       X               Y 
            
            
            // Bucaramanga
            HotelesList = new ArrayList<>();
            HotelesList.add("Hotel Cabecera Country");
            HotelesList.add("Irotama Resort");
            HotelesList.add("Hotel Mercure Emile");
            HotelesList.add("Sanha Plus Hotel");
            HotelesList.add("Portobahia Hotel");
            City.add(new ObjectCity("Bucaramanga", 150000, -20, 40, HotelesList));
                                                                //Precio                       X               Y 
            

            // Cartagena
            HotelesList = new ArrayList<>();
            HotelesList.add("Hotel Capilla Del Mar");
            HotelesList.add("Hotel La Gran Vía");
            HotelesList.add("Hotel Cartagena Plaza");
            HotelesList.add("Hotel Almirante Cartagena");
            HotelesList.add("Americas Torre del Mar");
            City.add(new ObjectCity("Cartagena", 270000, -40, 140, HotelesList));
                                                                //Precio                       X               Y 

            
            // #UNIVERSIDADES DE MEDELLIN
            Universidades.add("Colegio Mayor de Antioquía (COLMAYOR)");
            Universidades.add(".Universidad de Antioquia (UDEA)");
            Universidades.add("Universidad Nacional de Colombia (UNAL)");
            Universidades.add("Tecnológico de Antioquía (TDEA)");
            Universidades.add("Universidad Pontificia Bolivariana (UPB)");
            
            // #UNIVERSIDADES DE BOGOTA
            Universidades.add("Corporación Universitaria Minuto de Dios");
            Universidades.add("Universidad Militar Nueva Granada (UMNG)");
            Universidades.add("Universidad de los Andes");
            Universidades.add("Pontificia Universidad Javeriana");
            Universidades.add("Universidad Nacional de Colombia (UNAL)");
            
            // #UNIVERSIDADES DE SANTA MARTA
            Universidades.add("Universidad del Magdalena (UNIMAG)");
            Universidades.add("Universidad Sergio Arboleda");
            Universidades.add("Universidad Antonio Nariño (UAN)");
            Universidades.add("Universidad Cooperativa de Colombia (UCC)");
            Universidades.add("Inst. Nac. de Formación Técnica Profesional de Ciénaga");
            
            // #UNIVERSIDADES DE BARRANQUILLA
            Universidades.add("Universidad del Atlántico");
            Universidades.add("Universidad del Norte (UNINORTE)");
            Universidades.add("Universidad Autónoma del Caribe (UAC)");
            Universidades.add("Corporación Universitaria de la Costa (CUC)");
            Universidades.add("Corporación Universitaria Latinoamericana (CUL)");
            

            // #UNIVERSIDADES DE VILLAVICENCIO
            Universidades.add("Universidad Santo Tomás (USTA)");
            Universidades.add("Universidad Autónoma de Nariño");
            Universidades.add("Corporación Universitaria Minuto de Dios");
            Universidades.add("Corporación Universitaria del Meta (UNIMETA)");
            Universidades.add("Universidad Autónoma de Nariño");

            // #UNIVERSIDADES DE BUCARAMANGA
            Universidades.add("Universidad Autónoma de Bucaramanga (UNAB)");
            Universidades.add("Universidad Pontificia Bolivariana (UPB)");
            Universidades.add("Universidad Industrial de Santander (UIS)");
            Universidades.add("Universidad Francisco de Paula Santander (UFPS)");
            Universidades.add("Universidad de Santander (UDES)");


            // #UNIVERSIDADES DE CARTAGENA
            Universidades.add("Universidad de San Buenaventura");
            Universidades.add("Fundación Universitaria Tecnológico Comfenalco");
            Universidades.add("Corporación Universitaria Rafael Núñez (CURN)");
            Universidades.add("Universidad del Sinú (UNISINU)");
            Universidades.add("Universidad de Cartagena");
            
            ArrayAdministrador.add(new ObjectAdministrador(City.get(0), City.get(1), "Basic", "Tierra"));
            ArrayAdministrador.add(new ObjectAdministrador(City.get(0), City.get(2), "Premiun", "Tierra"));
            ArrayAdministrador.add(new ObjectAdministrador(City.get(0), City.get(3), "Ejecutivo", "Aire"));

        }
    }

    static String[][] Administradores= new String[][]{{"Jorge", "joji"}, {"Martin", "martin123"}, {"Aldair", "#Aldair"}, {"Roys", "roys123"}, {"Jose", "admin"}};

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
        public static String GetLoger(){return adminNombre;}
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
        
        public static String Regist(String usuario, String apellido, String correo, String telefono, String contraseña, String confirContraseña, String universidad, String fechaNacmiento, String genero){
            String resultado = "false";
            boolean existe = false;

            boolean byPass=false;
            if (usuario.length()>0 && 
                apellido.length()>0  && 
                correo.length()>0  && 
                telefono.length()>0  && 
                contraseña.length()>0  && 
                confirContraseña.length()>0  && 
                fechaNacmiento.length()>0) {
                    byPass=true;
            }

            for (ObjectUsers usuarios : ArrayUsuario) {
                if (usuarios.getCorreoElectronico().equals(correo)) {
                    existe = true;
                }
            }
            if (!existe && byPass) {
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
        public static ArrayList<String> Universidades = new ArrayList<>();
        
        public static String GetDrivers(String Ciudad1, String Ciudad2, String tipoPlan, String tipoVuelo){
            // System.out.println("Ciudad1:" + Ciudad1 + " Ciudad2:" + Ciudad2 + " tipo de Plan:" + tipoPlan + " tipo de Vuelo:" + tipoVuelo);
            String retorno = "";
            for (int i = 0; i < 3; i++) {
                retorno += "Elemento " + i + (i<3-1?",":"");
            }
            // System.out.println("Retorno=" + retorno);
            return retorno;
        } 
        public static String GetCiudad(){
            String retorno = "";
            for (int i = 0; i < City.size(); i++) {
                retorno += City.get(i).NombreCiudad + (i<City.size()-1?",":"");
            }
            return retorno;
        }

        public static class ObjectAdministrador {
            ObjectCity Ciudad1;
            ObjectCity Ciudad2;
            String TipoPLan;
            String  TipoTransporte;
            public ObjectAdministrador(ObjectCity ciudad1, ObjectCity ciudad2, String tipoPLan, String tipoTransporte) {
                Ciudad1 = ciudad1;
                Ciudad2 = ciudad2;
                TipoPLan = tipoPLan;
                TipoTransporte = tipoTransporte;
            }
            public ObjectCity getCiudad1() {
                return Ciudad1;
            }
            public void setCiudad1(ObjectCity ciudad1) {
                Ciudad1 = ciudad1;
            }
            public ObjectCity getCiudad2() {
                return Ciudad2;
            }
            public void setCiudad2(ObjectCity ciudad2) {
                Ciudad2 = ciudad2;
            }
            public String getTipoPLan() {
                return TipoPLan;
            }
            public void setTipoPLan(String tipoPLan) {
                TipoPLan = tipoPLan;
            }
            public String getTipoTransporte() {
                return TipoTransporte;
            }
            public void setTipoTransporte(String tipoTransporte) {
                TipoTransporte = tipoTransporte;
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
