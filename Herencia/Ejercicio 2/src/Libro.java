//Clase Padre
public class Libro {
    // 3 Atributos
    public String titulo;
    public String autor;
    public int año;
    //Constructor
    public Libro(String titulo, String autor, int año){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    //Metodos
    public void mostrarInfo(){
        System.out.println("El titiulo del libro es: " + titulo + "\n El autor es: " + autor + "\n El año del libro es: " + año);
    }
}
