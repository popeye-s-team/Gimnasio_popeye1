import java.util.UUID;

public class Socio {
    
    private String usuario;
    private String contrasena;
    private String nombre;
    private String telefono;
    private String mail;
    private String n_cuenta_bancaria;
    private UUID id;
    private boolean alta;

    public Socio (String usuario, String contrasena, String nombre, String telefono, String mail, String n_cuenta_bancaria, UUID id) {
        this.usuario=usuario;
        this.contrasena=contrasena;
        this.nombre=nombre;
        this.telefono=telefono;
        this.n_cuenta_bancaria=n_cuenta_bancaria;
        this.id=id;
        this.alta = true;
    }

    public void darAlta(){
        this.alta = true;
    }
    
    public void darBaja(){
        this.alta = false;
    }

    public String getUsuario(){
        return usuario;
    }

    public String getContrasena(){
        return contrasena;
    }

}
