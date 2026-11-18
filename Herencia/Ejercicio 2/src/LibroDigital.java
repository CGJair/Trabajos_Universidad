// Clase hija
public class LibroDigital extends Libro {
    //Atributos propios
    public String formato;
    public double tamañoMB;
    //Constructor de la clase hija
    public LibroDigital(String titulo,String autor, int año, String formato, double tamañoMB){
        //Constructor de la clase Padre
        super(titulo, autor, año);
        this.formato = formato;
        this.tamañoMB = tamañoMB;
    }
    //Metodos
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("El formato es: " + formato + "\n El tamaño es: " + tamañoMB + " MB");
    }
}