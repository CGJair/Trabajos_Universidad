import java.util.Scanner;

public class App {

    //Ejercicio 1. Mostrar los elementos de un arreglo
    //Crea un programa que tenga un arreglo con 5 números enteros
    //y muestre todos sus elementos utilizando un ciclo for

    public void ejercicio1(){
        int [] arreglo1 = { 1,2,3,4,5};
        for (int i = 0; i < arreglo1.length; i++){
            System.out.println(arreglo1[i]);
        }
    }
    //Ejercicio 2 Calcular la suma y el promedio.
    //Crea un arreglo de 5 números enteros.
    //El programa deberá recorrer el arreglo y calcular la suma de todos los números
    //Posteriormente, deberá calcular y mostrar el promedio de los valores almacenados.
    public void ejercicio2(){
        int [] arreglo2 = {1,2,3,4,5};
        int resultadoArregloSuma = 0;
        System.out.println("Los numeros del arreglo son:");
        for (int i =0; i< arreglo2.length; i++){
            System.out.println(arreglo2[i]);
            resultadoArregloSuma += arreglo2[i];
        }
        System.out.println("El resultado de la suma del arreglo es: " + resultadoArregloSuma);
        double promedio = resultadoArregloSuma / 5;
        System.out.println("El promedio es: " + promedio);
    }

    //Ejercicio 3 Encontrar el número mayor
    //Crea un arreglo de 8 números enteros.
    //El programa deberá recorrer todos los elementos del arreglo y determinar cuál es el número mayor.
    //Al finalizar, deberá mostrar en pantalla el contenido del arreglo y el número mayor encontrado.
    public void ejercicio3(){
        int arreglo3[] = {1,2,3,4,5,6,7,8};
        int numMayor = arreglo3[0];
        for (int i = 0; i < arreglo3.length; i++) {
            if (numMayor < arreglo3[i]){
                numMayor = arreglo3[i];
            }    
        }
        System.out.println(numMayor);      
    }
    //Ejercicio 4 Buscar un número
    //Crea un arreglo de 10 números enteros.
    //Después, solicita al usuario que introduzca un número mediante el teclado.
    //El programa deberá recorrer el arreglo y determinar
    //si el número introducido por el usuario se encuentra dentro del arreglo.
    //Al finalizar, el programa deberá indicar claramente si el número fue encontrado o si no se encuentra

    public void ejercicio4(){
        Scanner scanner = new Scanner(System.in);
        int arreglo4[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Ingresa un numero: ");
        int datoIngresado = Integer.parseInt(scanner.nextLine());
        boolean datoEncontrado = false;

        for (int i = 0; i < arreglo4.length; i++){
            if (datoIngresado == arreglo4[i]){
                datoEncontrado = true;   
            }
        }
        if (datoEncontrado){
            System.out.println("Dato encontrado");
        }else{
            System.out.println("Dato no encontrado");
        }
        scanner.close();
    }
    //Ejercicio 5 Contar números pares e impares.
    //Crea un arreglo de 10 números enteros.
    //El programa deberá recorrer todos los elementos del arreglo y determinar cuántos números son pares y cuantos impares
    public void ejercicio5(){
        int arreglo5[] = {1,2,3,4,5,6,7,8,11,13};
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < arreglo5.length; i++){
            if (arreglo5[i] % 2 == 0){
                pares++;            
            }else{
                impares++;
            }
        }
        System.out.println("Hay " + pares + " Numeros pares" );
        System.out.println("Hay: " + impares + "Numeros impares");
    }
        public static void main(String[] args) throws Exception {
            App app = new App();
            app.ejercicio5();   
    }
}