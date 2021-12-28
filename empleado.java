import java.util.Date;
import java.util.UUID;

public class Empleado {
    private String dni;
    private String nombre;
    private Date fecha_nacimiento;
    private float salario;
    private String telefono;
    private UUID id;
    private String tipo_empleado;
    private String usuario;
    private String contrasena;

    public Empleado(String dni, String nombre, Date fecha_nacimiento, float salario, String telefono, UUID id, String tipo_empleado, String usuario, String contrasena) {
        this.dni=dni;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.salario = salario;
        this.telefono = telefono;
        this.id = id;
        this.tipo_empleado = tipo_empleado;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

}
