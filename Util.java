import java.util.ArrayList;

public class Util {
    private static ArrayList<Socio> arraySocios = new ArrayList<>();
    private static ArrayList<Empleado> arrayEmpleados = new ArrayList<>();
    private static ArrayList <Actividad> arrayActividades = new ArrayList<>();
    private static ArrayList <Servicios_adicionales> arrayServicios_adicionales = new ArrayList<>();

    public static ArrayList<Socio> getArraySocios(){
        return arraySocios;
    }
    public static ArrayList<Empleado> getArrayEmpleado(){
        return arrayEmpleados;
    }
    public static ArrayList<Actividad> getArrayActividades(){
        return arrayActividades;
    }
    public static ArrayList<Servicios_adicionales> getArrayServicios_adicionales(){
        return arrayServicios_adicionales;
    }
    public static int inicioSesion(String usuario, String contrasena) {
        int numero = -2;

        for (int i = 0; i < arrayEmpleados.size(); i++) {
            if ((arrayEmpleados.get(i).getUsuario().equals(usuario)) && (arrayEmpleados.get(i).getContrasena().equals(contrasena))) {
                if (arrayEmpleados.get(i).getTipoEmpleado() == "Monitor") {
                    numero = 1;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Recepcionista") {
                    numero = 2;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Entrenador") {
                    numero = 3;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Limpiador") {
                    numero = 4;
                }
            }

        }
        for (int i = 0; i < arraySocios.size(); i++) {
            if ((arraySocios.get(i).getUsuario().equals(usuario)) && (arraySocios.get(i).getContrasena().equals(contrasena))) {
                numero = 5;
            }
        }

        return numero;
    }
    public static boolean altaEmpleado(Empleado empleado){
        if (!arrayEmpleados.contains(empleado)) {
            arrayEmpleados.add(empleado);
            return true;
        } else {
            return false;
        }
    }
    public static boolean altaSocio(Socio socio){
        if (!arraySocios.contains(socio)) {
            arraySocios.add(socio);
            return true;
        } else {
            return false;
        }
    }

    public static void registrar_actividad (Actividad actividad){
        arrayActividades.add(actividad);
    }

    public static void registrar_Servicios_adicionales (Servicios_adicionales servicios_adicionales){
        arrayServicios_adicionales.add(servicios_adicionales);
    }
}
