class Libro {
    private String Titulo;
    private String Autor;
    private int cantidadDisponible;

    public Libro(String titulo, String autor, int cantidadDisponible) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public String getAutor() {
        return this.Autor;
    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    
    public void prestar(){
        if (this.cantidadDisponible > 0) {
            this.cantidadDisponible--;
        } else {
            System.out.println("No hay libros disponibles");
        }
    }

    public void devolver(){
        this.cantidadDisponible++;
    }

    public void mostrarInformacion (){
        System.out.println("Titulo: " + this.Titulo);
        System.out.println("Autor: " + this.Autor);
        System.out.println("Cantidad disponible: " + this.cantidadDisponible);
    }

}