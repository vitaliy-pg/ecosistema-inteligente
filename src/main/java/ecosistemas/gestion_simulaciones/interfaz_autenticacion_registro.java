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
class Autenticacion {
    private Map<String, Usuario> usuarios;

    public Autenticacion() {
        this.usuarios = new HashMap<>();
    }
    public void registrarUsuario(String nombreUsuario, String contrasena) {
        usuarios.put(nombreUsuario, new Usuario(nombreUsuario, contrasena));
    }
    public boolean autenticarUsuario(String nombreUsuario, String contrasena) {
        Usuario usuario = usuarios.get(nombreUsuario);
        return usuario != null && usuario.verificarContrasena(contrasena);
    }
}
class Simulacion {
    private String nombre;
    private String configuracion;

    public Simulacion(String nombre, String configuracion) {
        this.nombre = nombre;
        this.configuracion = configuracion;
    }

    // Getters y setters
    // ...
}