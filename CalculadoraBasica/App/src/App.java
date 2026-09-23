import java.util.Scanner;

public class App {

    /*
    Se requiere hacer una calculadora con java y utilizando POO
    - Cada operacion debe tener su propio metodo, ejemplo sumar
    - Debe exisir un metodo que nos ayude a la ejecucion del codigo
    - El main debe estar limpio solo instancia y metodo de ejecucion
    */

   public double valor1;
   public double valor2 = 0;
   public int opcion = 0;
   
   public double sumar(double valor1, double valor2){

        return valor1 + valor2;

    }

    public double restar(double valor1, double valor2){
        return valor1 - valor2;

    }

    public double multiplicacion(double valor1, double valor2){
        return valor1 * valor2;

    }

    public double division(double valor1, double valor2){
        return valor1 / valor2;

    }


    public void Obtenerinformacion(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que deseas hacer?");
        System.out.println("1 - Sumar, 2 - Restar, 3 - Multiplicar, 4 - Dividir  ");
        this.opcion = scanner.nextInt();

        System.out.println("Escribe el valor 1");
        this.valor1 = scanner.nextDouble();

        System.out.println("Escribe el valor 2");
        this.valor2 = scanner.nextDouble();

        scanner.close();

    }

    public void ejecutar(){

        this.Obtenerinformacion();

        switch (this.opcion){

            case 1:

                System.out.println("La suma es " + this.sumar(this.valor1, this.valor2));
                break;

            case 2:

                System.out.println("La resta es " + this.restar(this.valor1, this.valor2));
                break;

            case 3:

                System.out.println("La multiplicacion es " + this.multiplicacion(this.valor1, this.valor2));
                break;

            case 4:

                System.out.println("La division es " + this.division(this.valor1, this.valor2));
            default:
                System.out.println("No es una opcion valida");
                break;

        }
    }

    public static void main(String[] args) throws Exception {

        App app = new App();
        app.ejecutar();

    }
}