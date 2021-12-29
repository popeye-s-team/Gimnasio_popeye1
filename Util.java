import java.util.ArrayList;
public class Util {
    private static ArrayList<Socio> arraySocios = new ArrayList<>();
    private static ArrayList<Empleado> arrayEmpleados = new ArrayList<>();
    
    public static ArrayList<Socio> getArraySocios(){
        return arraySocios;
    }
    public static ArrayList<Empleado> getArrayEmpleado(){
        return arrayEmpleados;
    }
    public static int inicioSesion(String usuario, String contrasena){
        int numero=-2;
        if ((usuario.equals("director"))&&(contrasena.equals("director01"))){
            numero=-1;
        }
        else {
            for (int i=0; i< arrayEmpleados.size(); i++){
                if ((arrayEmpleados.get(i).getUsuario().equals(usuario))&&(arrayEmpleados.get(i).getContrasena().equals(contrasena)))
                    numero=1;
            }
            for (int i=0; i< arraySocios.size(); i++){
                if ((arraySocios.get(i).getUsuario().equals(usuario))&&(arraySocios.get(i).getContrasena().equals(contrasena)))
                    numero=2;
            }
        } 
        return numero;
    }
}
