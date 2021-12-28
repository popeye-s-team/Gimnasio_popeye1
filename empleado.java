import java.util.Date;
import java.util.UUID;

public class empleado {
    private String dni;
    private String nombre;
    private Date fecha_nacimiento;
    private float salario;
    private UUID id;
    private String tipo_empleado;
    private String usuario;
    private String contrasena;

    public empleado(String dni, String nombre, Date fecha_nacimiento, float salario, UUID id, String tipo_empleado, String usuario, String contrasena){
        this.dni=dni;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;

    }



}
