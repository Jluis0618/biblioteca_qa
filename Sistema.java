

// Clase principal
public class Sistema {
    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry", 3));
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 2));

        // Registrar usuario
        Usuario juan = new Usuario("Juan");

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();

        // Prestar libro a Juan
        biblioteca.prestarLibro(juan, "El Principito");

        // Mostrar información de Juan
        juan.mostrarInformacion();

        // Devolver libro
        biblioteca.recibirDevolucion(juan, "El Principito");

        // Mostrar información de Juan
        juan.mostrarInformacion();

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();
    }
}