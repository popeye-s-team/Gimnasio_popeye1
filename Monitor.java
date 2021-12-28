import java.util.Date;
import java.util.UUID;

public class Monitor extends Empleado{   
        public Monitor (String dni, String nombre, Date fecha_nacimiento, float salario, String telefono, UUID id, String tipo_empleado, String usuario, String contrasena){
                super(dni,nombre,fecha_nacimiento,salario,telefono,id,tipo_empleado,usuario,contrasena);
        } 
}
