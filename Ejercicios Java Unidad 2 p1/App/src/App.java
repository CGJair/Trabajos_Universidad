import java.util.Scanner;
public class App {

    //EJERCICIO 1. Saludo.
    //Escribir un programa que pregunte al usuario su nombre y luego lo salude.
    public void Ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        scanner.close();

    }
    //EJERCICIO 2. Área y perímetro de un rectángulo.
    //Calcular el perímetro y el área de un rectángulo dada su base y su altura.
    public void Ejercicio2(){
        Scanner scanner = new Scanner (System.in);
        double base, altura, area, perimetro;

        System.out.println("Ingrese la base del rectángulo en cm: ");
        base = scanner.nextDouble();
        System.out.println( "Ingrese la altura del rectángulo en cm: ");
        altura = scanner.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        System.out.println("El área del rectángulo es: " + area + " cm²");
        System.out.println("El perímetro del rectángulo es: " + perimetro + " cm");
        scanner.close();
    }
    //EJERCICIO 3. Hipotenusa de un triángulo rectángulo.
    //Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
    public void Ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa, a, b;
        System.out.println("Ingrese el valor del primer cateto: ");
        cateto1 = scanner.nextDouble();
        System.out.println("Ingrese el valor del cateto opuesto: ");
        cateto2 = scanner.nextDouble();

        a = cateto1 * cateto1;
        b = cateto2 * cateto2;
        hipotenusa = Math.sqrt(a + b);
        System.out.println ( "La hipotenusa del triangulo es " + hipotenusa);
        scanner.close();
    }

    //EJERCICIO 4. Operaciones matemáticas
    //Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
    public void Ejercicio4(){
        double num1, num2, suma, resta, multiplicacion, division;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: "); 
        num1 = scanner.nextDouble(); 
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        scanner.close();
    }


    //EJERCICIO 5. Conversión de Fahrenheit a Celsius.
    //Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
    public void Ejercicio5(){
        Scanner scanner = new Scanner (System.in);
        double fahrenheit, celsius;
        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit -32) *5/9;
        System.out.println("La conversion de Fahrenheit a celsius es: " + celsius);
        scanner.close();
    }


    //EJERCICIO 6. Media de tres números.
    //Escribir un programa que solicite tres números por teclado y calcule la media de los tres.
    public void Ejercicio6(){
        Scanner scanner = new Scanner (System.in);
        double num1, num2, num3, mediaAritmetica;

        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        num3 = scanner.nextDouble();

        mediaAritmetica = (num1 + num2 + num3) / 3;
        System.out.println("La media aritmetica de los tres numeros es: " + mediaAritmetica);
        scanner.close();
    }

    //EJERCICIO 7. Conversión de minutos a horas.
    //Realizar un programa que reciba una cantidad de minutos.
    //Y muestre por pantalla a cuántas horas y minutos corresponde.
    public void Ejercicio7(){
        Scanner scanner = new Scanner (System.in);
        int minutos, horas, resultado;

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = scanner.nextInt();

        horas = minutos / 60;
        resultado = minutos % 60;

        System.out.println(minutos + " minutos son equivalentes a " + horas + " horas y " + resultado + " minutos.");
        scanner.close();
    }


    //EJERCICIO 8. Sueldo y comisión.
    //Un vendedor recibe un sueldo base más un 10% de comisión por sus ventas.
    //El vendedor desea saber:
    // Cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes.
    // Cuánto recibirá en total durante el mes, considerando su sueldo base y las comisiones.
    public void Ejercicio8(){
        Scanner scanner = new Scanner (System.in);
        double sueldoBase, ventas, comision, sueldoTotal;

        System.out.println("Bienvenido, ingrese su sueldo base: ");
        sueldoBase = scanner.nextDouble();
        System.out.println("Ingrese el monto total obtenido de sus ventas: ");
        ventas = scanner.nextDouble();

        comision = ventas * 0.10;
        sueldoTotal = sueldoBase + comision;

        System.out.println("La comisión obtenida de sus ventas es: $" + comision);
        System.out.println("El sueldo total es: $" + sueldoTotal);
        scanner.close();
    }

    //EJERCICIO 9. Descuento en una compra.
    //Una tienda ofrece un descuento del 15% sobre el total de una compra.
    //Escribir un programa que permita calcular cuánto deberá pagar finalmente el cliente.
    public void Ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        double precio, descuento, preciofinal;
        System.out.println("Ingrese el precio del producto por favor: ");
        precio = scanner.nextDouble();
        descuento = precio * 0.15;
        preciofinal = precio - descuento;
        System.out.println("El descuento es: $" + descuento);
        System.out.println("El precio final es: $" + preciofinal);
        scanner.close();
    }


    //EJERCICIO 10. Calificación final.
    //Un alumno desea saber cuál será su calificación final en la materia de Algoritmos.
    // 55% del promedio de sus tres calificaciones parciales.
    // 30% de la calificación del examen final.
    // 15% de la calificación de un trabajo final.
    //Escribir un programa que solicite las calificaciones necesarias y calcule la calificación final del alumno.
    public void Ejercicio10(){
        Scanner scanner = new Scanner(System.in);
        double examenFinal, trabajoFinal, promedioParciales, calificacionFinal;
        double sumaParciales = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingresa la calificación parcial " + i + ": ");
            sumaParciales += scanner.nextDouble(); 
        }
        System.out.print("Ingresa la calificación del examen final: ");
        examenFinal = scanner.nextDouble();
        System.out.print("Ingresa la calificación del trabajo final: ");
        trabajoFinal = scanner.nextDouble();

        promedioParciales = sumaParciales / 3;
        calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("\nPromedio de parciales: " + promedioParciales);
        System.out.println("Calificación final: " + calificacionFinal);
        scanner.close();
    }

        public static void main(String[] args) throws Exception {
            App app = new App();
            app.Ejercicio10();
    }
}
