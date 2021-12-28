import java.util.UUID;

public class Socio {
    
    private String nombre;
    private String telefono;
    private String mail;
    private String n_cuenta_bancaria;
    private UUID id;

    public Socio (String nombre, String telefono, String mail, String n_cuenta_bancaria, UUID id) {
        this.nombre=nombre;
        this.telefono=telefono;
        this.n_cuenta_bancaria=n_cuenta_bancaria;
        this.id=id;
    }
}