//Clase Hija
public class Usuario extends Persona{
    //Atributos propios de la clase hija
    public String correo;
    public String contraseña;
    //Constructor clase hija
    public Usuario(String nombre, int edad, String sexo, String correo, String contraseña){
        //Constructor de la clase persona
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contraseña = contraseña;
    }
    public void informacionUsuario(){
        System.out.println("\n El nombre es: " + nombre + "\n La edad es: " + edad);
        System.out.println("\n El sexo del usuario es: " + sexo + "\n El correo es: " + correo);
        System.out.println("\n La contraseña es: " + contraseña);
    }
}
