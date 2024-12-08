import java.util.List;
import java.util.ArrayList;

class Usuario {
    private String nombre;
    private List<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarLibro(Libro libro) {
        if (libro.getCantidadDisponible() > 0) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println(nombre + " ha tomado prestado el libro: " + libro.getTitulo());
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " no tiene prestado el libro: " + libro.getTitulo());
        }
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre);
        System.out.print("Libros prestados: ");
        if (librosPrestados.isEmpty()) {
            System.out.println("Ninguno");
        } else {
            librosPrestados.forEach(libro -> System.out.print(libro.getTitulo() + ", "));
            System.out.println();
        }
    }
}
