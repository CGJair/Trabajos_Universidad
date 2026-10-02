public class App {

    //Suma de números del 1 al N
    public int Suma(int n){
        //Si n es 1 o menor, no hay mas que sumar
        if(n<=1){
            return n;
        }
        //Caso recursivo: n + sumar(n-1)
        return n + Suma(n-1);
    }

    //Fibonacci
    public int Fibonacci(int n){
        //caso base: si n es 0 o 1, devolvemos n
        if (n <= 1){
            return n;
        }
        //Caso recursivo: suma de los dos términos anteriores
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    //Potencia
    public int Potencia(int base, int exponente){
        //Caso base: cualquier numero elevado a 0 es 1
        if (exponente ==0){
            return 1;
        }
        //Caso recursivo: base * potencia(base, exponente-1)
        return base * Potencia(base, exponente -1);
    }

    //String al revés
    public String StringAlRevez(String texto){
        //Caso base: Si la cadena se encuentra vacia se devuelve de la misma manera
        if (texto.isEmpty()){
            return texto;
        }
        //Caso recursivo:Toma desde el segundo carácter en adelante y le pega el primero al final
        return StringAlRevez(texto.substring(1)) + texto.charAt(0);
    }

    //Metodo main 
    public static void main(String[] args) throws Exception {
        App app = new App();
        //Impresion para Suma
        System.out.println(app.Suma(3));
        //Impresion para Fibonacci
        System.out.println(app.Fibonacci(9));
        //Impresion para Potencia
        System.out.println(app.Potencia(5, 3));
        //Impresion para String al reves
        System.out.println(app.StringAlRevez("ollop"));

    }
}
