package ecosistemas.gestion_simulaciones;
import java.util.HashMap;
import java.util.Map;

class Usuario {
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