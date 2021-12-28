import java.util.Date;
public class Entrenador extends Empleado{
    private int n_horas_reservadas;
    private int n_horas_libres;

    public Entrenador(int n_horas_reservadas, int n_horas_libres, String dni, String nombre, Date fecha_nacimiento, float salario, String telefono, UUID id, String tipo_empleado, String usuario, String contrasena){
        this.n_horas_reservadas=n_horas_libres;
        this.n_horas_libres=n_horas_libres;
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