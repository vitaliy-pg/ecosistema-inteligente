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
    // Getter para el nombre de la simulación
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre de la simulación
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la configuración de la simulación
    public String getConfiguracion() {
        return configuracion;
    }

    // Setter para la configuración de la simulación
    public void setConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }
}
class RegistroActividades {
    private Map<String, Simulacion> simulaciones;

    public RegistroActividades() {
        this.simulaciones = new HashMap<>();
    }
    public void registrarSimulacion(String nombreSimulacion, String configuracion) {
        simulaciones.put(nombreSimulacion, new Simulacion(nombreSimulacion, configuracion));
    }
    public Simulacion obtenerSimulacion(String nombreSimulacion) {
        return simulaciones.get(nombreSimulacion);
    }
}
class InterfazUsuario {
    private Autenticacion autenticacion;
    private RegistroActividades registroActividades;

    public InterfazUsuario() {
        this.autenticacion = new Autenticacion();
        this.registroActividades = new RegistroActividades();
    }

    public void registrarUsuario(String nombreUsuario, String contrasena) {
        autenticacion.registrarUsuario(nombreUsuario, contrasena);
    }

    public boolean autenticarUsuario(String nombreUsuario, String contrasena) {
        return autenticacion.autenticarUsuario(nombreUsuario, contrasena);
    }

    public void iniciarSimulacion(String nombreSimulacion, String configuracion) {
        registroActividades.registrarSimulacion(nombreSimulacion, configuracion);
    }

    public Simulacion obtenerSimulacion(String nombreSimulacion) {
        return registroActividades.obtenerSimulacion(nombreSimulacion);
    }

    public void crearOrganismo(String nombreOrganismo) {
        System.out.println("Se ha creado el organismo " + nombreOrganismo);
    }

    public void visualizarResultados ( String nombreSimulacion ) {
        Simulacion simulacion = registroActividades.obtenerSimulacion(nombreSimulacion);
        System.out.println("Visualizando resultados de la simulación " + simulacion.getNombre());
        System.out.println("Configuración: " + simulacion.getConfiguracion());
    }
}