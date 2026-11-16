import java.util.Scanner;
public class EjerciciosPoo {

//Ejercicio 1
//Una lampara que se pueda apagar y prenender
    public class Lampara{
        //Atributos
        public boolean estado;
        // Constructor
        public Lampara(boolean estado){
            this.estado = estado;
        }
        //Metodos
        public void Encender(){
            this.estado = true;
            System.out.println("Prendiendo lampara");
        }
        public void Apagar(){
            this.estado = false;
            System.out.println("Apagando lampara");
        }
        public void Estado(){
            if(estado == true){ 
                System.out.println("La lampara esta prendida");
            } else {
                System.out.println("La lampara esta apagada");
            }
        }
    }

//Ejercicio 2
//Un semaforo que pueda cambiar de color
    public class Semaforo{
        //Atributos
        public String color;
        //Constructor
        public Semaforo(String color){
            this.color = color;
        }
        //Metodos
        public void cambiarRojo(){
            this.color = "Rojo";
            System.out.println("Cambiando a: " + color);
        }
        public void cambiarAmarillo(){
            this.color = "Amarillo";
            System.out.println("Cambiando a: " + color);
        }
        public void cambiarVerde(){
            this.color = "Verde";
            System.out.println("Cambiando a: " + color);
        }
        public void MostrarColor(){
            System.out.println(color);
        }
    }

//Ejercicio 3
//Simula un reproductor basico
    public class Reproductor{
        //Atributos
        public String cancion = "La vaca";
        public boolean reproduciendo;
        //Constructor
        public Reproductor(boolean reproduciendo){
            this.reproduciendo = reproduciendo;
        }
        //Metodos
        public void Reproducir(){
            this.reproduciendo = true;
        }
        public void Pausar(){
            this.reproduciendo = false;
            System.out.println("Pausando...");
        }
        public void Estado(){
            if(this.reproduciendo == true){
                System.out.println("Reproduciendo: " + cancion);
            }else {
                System.out.println("Reproductor pausado"); 
            }
        }
    }

//Ejercicio 4
//Un termometro que guarda una temperatura
//Y permite bajarla o subirla
    public class Termometro{
        Scanner sc = new Scanner(System.in);
        //Atributos
        public double temperatura = 0;
        //Metodos
        public void subirGrados(){
            while (true){ 
                System.out.println("Ingrese los grados que desee subir: ");
                if( sc.hasNextDouble()){
                    temperatura = temperatura + (sc.nextDouble());
                    break;
                }else {
            //Limpiador de buffer
                    System.out.println("No es un caracter valido");
                    System.out.println("Ingrese Nuevamente: ");
                    sc.nextLine();
                }
            }
        }
        public void bajarGrados(){
            while(true){
                System.out.println("Ingrese los datos que desee bajar: ");
                if (sc.hasNextDouble()){
                    temperatura = temperatura - sc.nextDouble();
                    break;
                } else {
            //Limpiador de buffer
                    System.out.println("No es un caracter valido");
                    System.out.println("Ingrese nuevamente: ");
                    sc.nextLine();         
                }
            }
        }
        public void mostrarTemperatura(){
            System.out.println("Los grados actuales son: " + temperatura); 
        }
    }

//Ejercicio 5
//Una puerta que se puede abrir y cerrar
    public class Puerta{
        //Atributos
        public boolean abierta;
        //Constructor
        public Puerta(boolean abierta){
            this.abierta = abierta;
        }
        //Metodos
        public void Abrir(){
            this.abierta = true;
            System.out.println("Abriendo puerta");
        }
        public void Cerrar(){
            this.abierta = false;
            System.out.println("Cerrando puerta");
        }
        public void Estado(){
            if(this.abierta == true){
                System.out.println("La puerta esta abierta...");
            } else {
                System.out.println("La puerta esta cerrada...");
            }
        }
    }
    


//Metodo Main
    public void main(String[] args) throws Exception {

        //Main Ejercicio 1
        System.out.println("Ejercicio 1: ");
        Lampara lampara1 = new Lampara(false);
        lampara1.Apagar();
        lampara1.Estado();
        lampara1.Encender();
        lampara1.Estado();

        //Main Ejercicio 2
        System.out.println("\n Ejercicio 2: ");
        Semaforo semaforo1 = new Semaforo("Rojo");
        semaforo1.cambiarRojo();
        semaforo1.MostrarColor();
        semaforo1.cambiarAmarillo();
        semaforo1.MostrarColor();
        semaforo1.cambiarVerde();
        semaforo1.MostrarColor();

        //Main Ejercicio 3
        System.out.println("\n Ejercicio 3: ");
        Reproductor reproductor1 = new Reproductor(false);
        reproductor1.Estado();
        reproductor1.Reproducir();
        reproductor1.Estado();
        reproductor1.Pausar();
        reproductor1.Estado();

        //Main Ejercicio 4
        System.out.println("\n Ejercicio 4: ");
        Termometro termometro1 = new Termometro();
        termometro1.mostrarTemperatura();
        termometro1.subirGrados();
        termometro1.mostrarTemperatura();
        termometro1.bajarGrados();
        termometro1.mostrarTemperatura();

        //Main Ejercicio 5
        System.out.println("\n Ejercicio 5: ");
        Puerta puerta1 = new Puerta(false);
        puerta1.Estado();
        puerta1.Abrir();
        puerta1.Estado();
        puerta1.Cerrar();
        puerta1.Estado();   
    }  
}