import java.util.UUID;

public class Actividad {
    private UUID id;
    private String tipo;
    private String horario;
    private int aforo_max;
    private String sala;

    public Actividad (UUID id, String tipo, String horario, int aforo_max, String sala){
        this.id = id;
        this.tipo=tipo;
        this.horario=horario;
        this.aforo_max= aforo_max;
        this.sala=sala;
    }
}