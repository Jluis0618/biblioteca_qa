import java.util.List;
import java.util.ArrayList;


class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Se agregó el libro: " + libro.getTitulo());
    }

    public void prestarLibro(Usuario usuario, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                usuario.tomarLibro(libro);
                return;
            }
        }
        System.out.println("El libro " + titulo + " no se encuentra en la biblioteca.");
    }

    public void recibirDevolucion(Usuario usuario, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                usuario.devolverLibro(libro);
                return;
            }
        }
        System.out.println("El libro " + titulo + " no pertenece a esta biblioteca.");
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }
    }
}
