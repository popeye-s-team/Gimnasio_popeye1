import java.util.Date;
import java.util.UUID;

public class Entrenador extends Empleado{
    private int n_horas_reservadas;
    private int n_horas_libres;

    public Entrenador() {
        super(dni,nombre,fecha_nacimiento,salario,telefono,id,tipo_empleado,usuario,contrasena);
        this.n_horas_reservadas=n_horas_libres;
        this.n_horas_libres=n_horas_libres;    
        
     }
}