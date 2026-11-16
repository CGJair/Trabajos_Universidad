import java.util.Scanner;
public class App { 
//Validacion de numeros
//NextInt para almacenar un dato en una variable
//hasNextLine para validar si es un numero de tipo int 
  //

    public double radio = 0.0;

    public int Validacion(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        while(true){
            System.out.println("Ingresa un numero entero ");
            if(sc.hasNextInt()){
                numero = sc.nextInt();
                System.out.println("El numero valido es: " + numero);
                break;
                //Limpiador de Buffer
            }else { 
                System.out.println("No es un numero valido");
                System.out.println("Ingrese Nuevamente: ");
                sc.nextLine();
            }       
        }
        return numero;
    }
    
    //Ejercicio 2
    //Un programa que calcule el area de un circulo
    //El radio debe estar validado
    // 2 metodos 1 para validacion de radio
    //2 para el calculo del area

    
    public double radioValidacion(){
        Scanner rd = new Scanner(System.in);
        while (true){ 
            System.out.println("Ingresa el radio ");
            if( rd.hasNextDouble()){
                radio = rd.nextDouble();
                break;
            }else {
                //Limpiador de buffer
                System.out.println("No es un caracter valido");
                System.out.println("Ingrese Nuevamente");
                rd.nextLine();
            }
        }
        return radio;
    } 
    //Operacion para radio

    public void radioOperacion(){
        radio = Math.PI * (this.radio * this.radio );
        System.out.println("El area es: " + radio);
    }
    public static void main(String[] args) throws Exception {
        App dato1 = new App();
        dato1.Validacion();

        App radio1 = new App();
        radio1.radioValidacion();
        radio1.radioOperacion();
    }  
}
