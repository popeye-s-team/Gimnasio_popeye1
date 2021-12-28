import java.util.UUID;

public class socio{
    private String nombre;
    private String telefono;
    private String mail;
    private String n_cuenta_bancaria;
    private UUID id;

    public socio(String nombre, String telefono, String mail, String n_cuenta_bancaria UUID id){
        this.nombre=nombre;
        this.telefono=telefono;
        this.n_cuenta_bancaria=n_cuenta_bancaria;
        this.id=id;
    }

}