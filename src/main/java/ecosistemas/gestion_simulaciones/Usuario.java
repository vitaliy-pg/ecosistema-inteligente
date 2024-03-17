package ecosistemas.gestion_simulaciones;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public boolean verificarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }
}
