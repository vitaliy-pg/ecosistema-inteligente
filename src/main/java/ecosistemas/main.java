package ecosistemas;
import ecosistemas.analisis.IntegracionNuevasFunciones;
import ecosistemas.analisis.ResolucionProblemas;
import ecosistemas.gestion.InterfazUsuario;
import ecosistemas.simulador.Ambiente;
import ecosistemas.simulador.Simulador;

import java.util.Scanner;

import java.util.Random;

import static ecosistemas.gestion.InterfazUsuario.RegistroActividades;
import static ecosistemas.main.SimuladorEcologico.*;

public class main {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        Ambiente ambiente = new Ambiente ( "Tropical", "Selva", 1000, 50, 50 );
        Simulador simulador = new Simulador ( 3.0, 80.0 );

        boolean salir = false;

        while (!salir) {
            System.out.println ( "\n--- Menú Principal ---" );
            System.out.println ( "1. Modelado de Entidades" );
            System.out.println ( "2. Simulador de Dinámicas Poblacionales" );
            System.out.println ( "3. Gestión de Usuarios y Simulaciones" );
            System.out.println ( "4. Análisis Avanzado" );
            System.out.println ( "5. Salir" );
            System.out.print ( "Seleccione una opción: " );
            scanner.nextLine (); // Consumir el salto de línea
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    modeladoEntidadesMenu ( ambiente );
                    break;
                case 2:
                    simuladorPoblacionalMenu ( ambiente, simulador );
                    break;
                case 3:
                    gestionUsuariosSimulacionesMenu ();
                    break;
                case 4:
                    analisisAvanzadoMenu ();
                    break;
                case 5:
                    salir = true;
                    System.out.println ( "Saliendo del programa..." );
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
    }

    public static void analisisAvanzadoMenu() {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Ejecutar simulación");
            System.out.println("2. Visualizar resultados");
            System.out.println("3. Integrar nuevas funciones");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarSimulacion(scanner);
                    break;
                case 2:
                    visualizarResultados(scanner, new double[0], new double[0]);
                    break;
                case 3:
                    integrarNuevasFunciones(scanner);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }
    }

public  static void visualizarResultados (Scanner scanner, double[] tasasReproduccion, double[] tasasMortalidad) {
        System.out.println("Visualizando resultados de la simulación:");

        // Mostrar las tasas de reproducción y mortalidad de cada especie
        System.out.println("\nTasas de reproducción y mortalidad de las especies:");
        for (int i = 0; i < tasasReproduccion.length; i++) {
            System.out.println("Especie " + (i + 1) + ":");
            System.out.println("  Tasa de reproducción: " + tasasReproduccion[i]);
            System.out.println("  Tasa de mortalidad: " + tasasMortalidad[i]);
        }

        // Aquí puedes agregar más lógica para mostrar otros resultados de la simulación
        // según sea necesario

        // Regresar al menú principal
        System.out.println("\nPresione Enter para volver al menú principal.");
        scanner.nextLine(); // Esperar a que el usuario presione Enter
    }







    public static void modeladoEntidadesMenu ( Ambiente ambiente ) {
        Scanner scanner = new Scanner ( System.in );
        boolean salir = false;

        while (!salir) {
            System.out.println ( "\n--- Modelado de Entidades ---" );
            System.out.println ( "1. Crear Planta" );
            System.out.println ( "2. Crear Animal" );
            System.out.println ( "3. Volver al Menú Principal" );
            System.out.print ( "Seleccione una opción: " );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Lógica para crear una nueva planta
                    crearNuevaPlanta ( scanner );
                    break;
                case 2:
                    // Lógica para crear un nuevo animal
                    crearNuevoAnimal ( scanner );
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
    }

    public static void crearNuevaPlanta ( Scanner scanner ) {
        System.out.println ( "Ingrese el nombre de la planta:" );
        String nombre = scanner.next ();

        System.out.println ( "Ingrese el tipo de la planta:" );
        String tipo = scanner.next ();

        System.out.println ( "Ingrese la altura de la planta:" );
        double altura = scanner.nextDouble ();

        System.out.println ( "Ingrese el estado de salud de la planta (bueno, regular, malo):" );
        String salud = scanner.next ();

        System.out.println ( "Ingrese el estado de reproducción de la planta (true/false):" );
        boolean estadoReproduccion = scanner.nextBoolean ();

        // Crear una nueva instancia de Planta con los datos proporcionados
        Planta nuevaPlanta = new Planta ( nombre, tipo, altura, salud, estadoReproduccion );

        // Aquí puedes hacer algo con la nueva planta, como agregarla a una lista de plantas en tu vivero, etc.
        System.out.println ( "¡Planta creada exitosamente!" );
    }


    public static void crearNuevoAnimal ( Scanner scanner ) {
        System.out.println ( "Ingrese el nombre del animal:" );
        String nombre = scanner.next ();

        System.out.println ( "Ingrese la especie del animal:" );
        String especie = scanner.next ();

        System.out.println ( "Ingrese la edad del animal:" );
        int edad = scanner.nextInt ();

        // Aquí puedes agregar más atributos según tu clase Animal
        System.out.println ( "Ingrese el género del animal:" );
        String genero = scanner.next ();

        System.out.println ( "Ingrese el color del animal:" );
        String color = scanner.next ();

        // Crear una nueva instancia de Animal con los datos proporcionados
        Animal nuevoAnimal = new Animal ( nombre, especie, edad, genero, color );

        // Aquí puedes hacer algo con el nuevo animal, como agregarlo a una lista de animales en tu zoológico, etc.
        System.out.println ( "¡Animal creado exitosamente!" );
    }


    public static void simuladorPoblacionalMenu ( Ambiente ambiente, Simulador simulador ) {
        Scanner scanner = new Scanner ( System.in );
        boolean salir = false;

        while (!salir) {
            System.out.println ( "\n--- Simulador de Dinámicas Poblacionales ---" );
            System.out.println ( "1. Simular Crecimiento y Reproducción" );
            System.out.println ( "2. Simular Eventos Aleatorios" );
            System.out.println ( "3. Ver Resultados de la Simulación" );
            System.out.println ( "4. Volver al Menú Principal" );
            System.out.print ( "Seleccione una opción: " );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    simularCrecimientoYReproduccion ( ambiente, simulador );
                    // Lógica para simular el crecimiento y reproducción

                    break;
                case 2:
                    simularEventosAleatorios ( ambiente, simulador );
                    // Lógica para simular eventos aleatorios

                    break;
                case 3:
                    verResultadosSimulacion ( ambiente, simulador );
                    // Lógica para ver resultados de la simulación

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }

    }

    public static void simularCrecimientoYReproduccion ( Ambiente ambiente, Simulador simulador ) {
        // Lógica para simular el crecimiento y reproducción
        simulador.simularCrecimientoYReproduccion ( ambiente, 3.0, 1000 );
        System.out.println ( "Simulación de crecimiento y reproducción realizada." );
    }

    public static void verResultadosSimulacion ( Ambiente ambiente, Simulador simulador ) {
        // Lógica para ver resultados de la simulación
        simulador.verResultadosSimulacion ( ambiente );
        // No es necesario imprimir aquí, ya que se imprime dentro del método verResultadosSimulacion
    }

    public static void simularEventosAleatorios ( Ambiente ambiente, Simulador simulador ) {
        Random random = new Random ();
        double probabilidadEvento = 0.8; // Probabilidad de que ocurra un evento aleatorio (80%)
        if (random.nextDouble () < probabilidadEvento) { // Comprobamos si ocurre un evento aleatorio según la probabilidad configurada
            int poblacionActual = ambiente.getPoblacion ();
            if (poblacionActual > 9) {
                int reduccion = random.nextInt ( Math.min ( poblacionActual, 10 ) ); // Reducción de hasta el 10% de la población actual
                int nuevaPoblacion = poblacionActual - reduccion;
                ambiente.setPoblacion ( nuevaPoblacion );
                System.out.println ( "Se ha producido un evento aleatorio. Población actual: " + nuevaPoblacion );
            } else {
                System.out.println ( "No ha ocurrido ningún evento aleatorio. La población actual es cero." );
            }
        } else {
            System.out.println ( "No ha ocurrido ningún evento aleatorio." );
        }
    }


    public static void gestionUsuariosSimulacionesMenu () {
        Scanner scanner = new Scanner ( System.in );
        boolean salir = false;
        boolean usuarioAutenticado = false; // Inicialmente el usuario no está autenticado

        while (!salir) {
            System.out.println ( "\n--- Gestión de Usuarios y Simulaciones ---" );
            System.out.println ( "1. Interfaz de Usuario" );
            System.out.println ( "2. Autenticación" );
            System.out.println ( "3. Registro de Actividades" );
            System.out.println ( "4. Volver al Menú Principal" );
            System.out.print ( "Seleccione una opción: " );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    if (usuarioAutenticado) {
                        interfazUsuario ();
                    } else {
                        System.out.println ( "Error: Debe autenticarse primero para acceder a la interfaz de usuario." );
                    }
                    break;
                case 2:
                    usuarioAutenticado = autenticacion ();
                    if (usuarioAutenticado) {
                        System.out.println ( "Autenticación exitosa. Ahora puede acceder a la interfaz de usuario." );
                    } else {
                        System.out.println ( "Error: La autenticación falló. Inténtelo nuevamente." );
                    }
                    break;
                case 3:
                    if (usuarioAutenticado) {
                        RegistroActividades ();
                    } else {
                        System.out.println ( "Error: Debe autenticarse primero para acceder al registro de actividades." );
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
    }


    private static void interfazUsuario () {
        Scanner scanner = new Scanner ( System.in );
        boolean salir = false;

        // Variables para almacenar los parámetros de simulación
        double velocidadSimulacion = 1.0;
        double temperaturaInicial = 25.0;
        int duracionSimulacion = 100;

        while (!salir) {
            System.out.println ( "\n--- Interfaz de Usuario ---" );
            System.out.println ( "1. Configurar Simulación" );
            System.out.println ( "2. Iniciar Simulación" );
            System.out.println ( "3. Detener Simulación" );
            System.out.println ( "4. salir" );
            int opcion = scanner.nextInt ();
            scanner.nextLine (); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println ( "--- Configuración de Simulación ---" );
                    System.out.print ( "Ingrese la velocidad de simulación (por defecto es 1.0): " );
                    velocidadSimulacion = scanner.nextDouble ();
                    System.out.print ( "Ingrese la temperatura inicial (en grados Celsius, por defecto es 25.0): " );
                    temperaturaInicial = scanner.nextDouble ();
                    System.out.print ( "Ingrese la duración de la simulación (en días, por defecto es 100): " );
                    duracionSimulacion = scanner.nextInt ();
                    break;
                case 2:
                    System.out.println ( "Iniciando la simulación..." );
                    // Aquí puedes iniciar la simulación con los parámetros configurados previamente
                    System.out.println ( "Velocidad de simulación: " + velocidadSimulacion );
                    System.out.println ( "Temperatura inicial: " + temperaturaInicial + "°C" );
                    System.out.println ( "Duración de la simulación: " + duracionSimulacion + " días" );
                    break;
                case 3:
                    System.out.println ( "Deteniendo la simulación..." );
                    // Aquí puedes detener la simulación en curso
                    break;
                case 4:
                    salir = true;
                    System.out.println ( "Saliendo del programa..." );
                    break;
                default:
                    System.out.println ( "Opción no válida, intente de nuevo." );
                    break;
            }
        }
    }


    public static boolean autenticacion () {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Ingrese su nombre de usuario:" );
        String usuario = scanner.nextLine ();
        System.out.println ( "Ingrese su contraseña:" );
        String contrasena = scanner.nextLine ();

        // Usuario y contraseña predefinidos
        String usuarioCorrecto = "vitaliy";
        String contrasenaCorrecta = "mercadona";

        // Verificar si el usuario y la contraseña ingresados coinciden con los predefinidos
        if (usuario.equals ( usuarioCorrecto ) && contrasena.equals ( contrasenaCorrecta )) {
            System.out.println ( "¡Autenticación exitosa!" );
            return true;
        } else {
            System.out.println ( "Usuario o contraseña incorrectos. Inténtelo de nuevo." );
            return false;
        }
    }


    public class SimuladorEcologico {

        // Método para ejecutar la simulación
        public static void ejecutarSimulacion(Scanner scanner) {
            System.out.println("Ejecutando simulación...");

            // Solicitar al usuario datos de entrada específicos para la simulación
            System.out.print("Ingrese el número de especies en la simulación: ");
            int numEspecies = scanner.nextInt();

            // Consumir el carácter de nueva línea pendiente
            scanner.nextLine();

            // Arrays para almacenar las características de cada especie
            double[] tasasReproduccion = new double[numEspecies];
            double[] tasasMortalidad = new double[numEspecies];

            // Solicitar al usuario las características de cada especie
            for (int i = 0; i < numEspecies; i++) {
                System.out.println("Especie " + (i + 1) + ":");
                System.out.print("  Tasa de reproducción: ");
                tasasReproduccion[i] = scanner.nextDouble();
                System.out.print("  Tasa de mortalidad: ");
                tasasMortalidad[i] = scanner.nextDouble();

                // Consumir el carácter de nueva línea pendiente
                scanner.nextLine();
            }

            // Lógica de simulación utilizando los datos de entrada proporcionados por el usuario
            // En este ejemplo, simplemente imprimimos las tasas de reproducción y mortalidad de cada especie
            System.out.println("\nTasas de reproducción y mortalidad de las especies:");
            for (int i = 0; i < numEspecies; i++) {
                System.out.println("Especie " + (i + 1) + ":");
                System.out.println("  Tasa de reproducción: " + tasasReproduccion[i]);
                System.out.println("  Tasa de mortalidad: " + tasasMortalidad[i]);
            }

            // Regresar al menú principal
            System.out.println("\nPresione Enter para volver al menú principal.");
            scanner.nextLine(); // Esperar a que el usuario presione Enter
        }


        // Método para visualizar los resultados de la simulación
        public static void visualizarResultados(Scanner scanner, double[] tasasReproduccion, double[] tasasMortalidad) {
            System.out.println("Visualizando resultados de la simulación:");

            // Mostrar las tasas de reproducción y mortalidad de cada especie
            System.out.println("\nTasas de reproducción y mortalidad de las especies:");
            for (int i = 0; i < tasasReproduccion.length; i++) {
                System.out.println("Especie " + (i + 1) + ":");
                System.out.println("  Tasa de reproducción: " + tasasReproduccion[i]);
                System.out.println("  Tasa de mortalidad: " + tasasMortalidad[i]);
            }

            // Aquí puedes agregar más lógica para mostrar otros resultados de la simulación
            // según sea necesario

            // Regresar al menú principal
            System.out.println("\nPresione Enter para volver al menú principal.");
            scanner.nextLine(); // Esperar a que el usuario presione Enter
        }
        // Método para permitir la integración de nuevas funciones
        public static void integrarNuevasFunciones ( Scanner scanner ) {
            System.out.println ( "Integrando nuevas funciones..." );

            // Ejemplo de cómo podrías permitir al usuario definir nuevas reglas de interacción entre especies
            System.out.println ( "¿Desea definir nuevas reglas de interacción entre especies? (s/n)" );
            String respuesta = scanner.next ();
            if (respuesta.equalsIgnoreCase ( "s" )) {
                System.out.println ( "Ingrese la nueva regla de interacción entre especies:" );
                String nuevaRegla = scanner.next ();
                System.out.println ( "Nueva regla integrada: " + nuevaRegla );
            }

            // Ejemplo de cómo podrías permitir al usuario configurar parámetros personalizados
            System.out.println ( "¿Desea configurar parámetros personalizados para la simulación? (s/n)" );
            respuesta = scanner.next ();
            if (respuesta.equalsIgnoreCase ( "s" )) {
                System.out.println ( "Ingrese el nombre del parámetro:" );
                String nombreParametro = scanner.next ();
                System.out.println ( "Ingrese el valor del parámetro:" );
                double valorParametro = scanner.nextDouble ();
                System.out.println ( "Parámetro configurado: " + nombreParametro + " = " + valorParametro );
            }

        }
    }

        // Método principal para ejecutar el programa


    static class Planta {
        private String nombre;
        private String tipo;
        private double altura;
        private String salud;
        private boolean estadoReproduccion;

        // Constructor
        public Planta ( String nombre, String tipo, double altura, String salud, boolean estadoReproduccion ) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.altura = altura;
            this.salud = salud;
            this.estadoReproduccion = estadoReproduccion;
        }

        // Getters y setters
        public String getNombre () {
            return nombre;
        }

        public void setNombre ( String nombre ) {
            this.nombre = nombre;
        }

        public String getTipo () {
            return tipo;
        }

        public void setTipo ( String tipo ) {
            this.tipo = tipo;
        }

        public double getAltura () {
            return altura;
        }

        public void setAltura ( double altura ) {
            this.altura = altura;
        }

        public String getSalud () {
            return salud;
        }

        public void setSalud ( String salud ) {
            this.salud = salud;
        }

        public boolean isEstadoReproduccion () {
            return estadoReproduccion;
        }

        public void setEstadoReproduccion ( boolean estadoReproduccion ) {
            this.estadoReproduccion = estadoReproduccion;
        }
    }


    static class Animal {
        private String nombre;
        private String especie;
        private int edad;
        private String genero;
        private String color;

        // Constructor
        public Animal ( String nombre, String especie, int edad, String genero, String color ) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
            this.genero = genero;
            this.color = color;
        }

        // Getters y setters
        public String getNombre () {
            return nombre;
        }

        public void setNombre ( String nombre ) {
            this.nombre = nombre;
        }

        public String getEspecie () {
            return especie;
        }

        public void setEspecie ( String especie ) {
            this.especie = especie;
        }

        public int getEdad () {
            return edad;
        }

        public void setEdad ( int edad ) {
            this.edad = edad;
        }

        public String getGenero () {
            return genero;
        }

        public void setGenero ( String genero ) {
            this.genero = genero;
        }

        public String getColor () {
            return color;
        }

        public void setColor ( String color ) {
            this.color = color;
        }
    }
        }


