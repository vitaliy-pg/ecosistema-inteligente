package ecosistemas.gestion_simulaciones;

import java.util.HashMap;
import java.util.Map;

public class Autenticacion {
    private Map<String, Usuario> usuarios;

    public Autenticacion() {
        this.usuarios = new HashMap<> ();
    }
    public void registrarUsuario(String nombreUsuario, String contrasena) {
        usuarios.put(nombreUsuario, new Usuario(nombreUsuario, contrasena));
    }
    public boolean autenticarUsuario(String nombreUsuario, String contrasena) {
        Usuario usuario = usuarios.get(nombreUsuario);
        return usuario != null && usuario.verificarContrasena(contrasena);
    }
}
