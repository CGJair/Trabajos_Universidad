import java.util.Scanner;

public class App {
    // Instanciamos el objeto scanner en la clase principal 
    // Para poder utilizarlo en todos los metodos de la clase 
    Scanner scanner = new Scanner(System.in);
    
    //Realiza un programa que lea un número ingresado por el usuario
    //Mediante el teclado e indique si dicho número es divisible entre 2.
    public void ejercicio1(){
        System.out.println("Ingresa un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        // Se utiliza una estructura condicional para verificar
        // si el número es divisible entre 2.
        if (numero % 2 == 0){
            System.out.println("El numero " + numero +" es divisible entre 2");
        } else {
            System.out.println("No es divisible entre 2");
        }    
    }
    
    //Realiza un programa que solicite al usuario el precio de un producto. El precio puede contener números decimales.
    //El programa deberá calcular el precio final agregando el IVA.
    //El IVA deberá declararse como una constante y tendrá un valor del 21%.
    public void ejercicio2(){
        // variable constante iva 
        final double iva = 0.21;
        System.out.println("Ingresa el valor del producto");
        //Parseo de entrada de dato por teclado
        double precio = Double.parseDouble(scanner.nextLine());
        double precioFinal = (precio *iva) + precio;
        System.out.println("El precio del producto es: $" + precio + "\n Aplicado un iva del 21% \n Precio final de: $" + precioFinal);        
    }
    
    //Realiza un programa que muestre en pantalla los números del 1 al 100, incluyendo ambos números (bucle while).
    public void ejercicio3(){
        int i = 1;
        while(i <= 100 ){
            System.out.print(" " + i);
            i++;
        }
    }

    //Realiza el mismo ejercicio anterior, mostrando los números del 1 al 100, incluyendo ambos números(for).
    public void ejercicio4(){
        for (int i = 1; i <= 100; i++){
            System.out.print(" " + i);
        }
    }

    //Realiza un programa que muestre los números del 1 al 100, incluyendo ambos números.
    //Además, el programa deberá identificar y mostrar cuáles de esos números son divisibles entre 2 y 3.
    public void ejercicio5(){
        for (int i =1; i <= 100; i++){
            if (i % 2 == 0 || i % 3 ==0 ){
                System.out.println("El numero: " + i + " Es divisible entre 2 o 3");
            } else{
                System.out.println(i + " No es divisible entre 2 o 3");
            }
        }
    }

    //Metodo main para ejecucion de los metodos 
        public static void main(String[] args) throws Exception {
            App app = new App();
            app.ejercicio5();      
    }
}


    