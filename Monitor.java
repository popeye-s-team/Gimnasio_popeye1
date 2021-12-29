import java.util.*;

public class Monitor extends Empleado{   

        private ArrayList<Actividad> actividades_asignadas;

        public Monitor (String dni, String nombre, Date fecha_nacimiento, float salario, String telefono, UUID id, String tipo_empleado, String usuario, String contrasena){
                super(dni,nombre,fecha_nacimiento,salario,telefono,id,tipo_empleado,usuario,contrasena);
                actividades_asignadas = new ArrayList<>();
        }

        public void anadir_actividad(Actividad a){
                actividades_asignadas.add(a);
        }

        public void eliminar_actividad(Actividad a){
                actividades_asignadas.remove(a);
        }
}