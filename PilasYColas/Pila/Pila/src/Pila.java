public class Pila {
    private static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    private Nodo tope;
    public Pila() { this.tope = null; }

    public boolean estaVacia() { return tope == null; }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public int pop() {
        if (estaVacia()) throw new IllegalStateException("La pila está vacía");
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public int peek() {

        if (estaVacia()) throw new IllegalStateException("La pila está vacía");
        return tope.dato;
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) { contador++; actual = actual.siguiente; }
        return contador;
    }

    public void imprimir() {
        if (estaVacia()) { System.out.println("La pila está vacía."); return; }
        Nodo actual = tope;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" ↓ ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println("¿Está vacía? " + pila.estaVacia()); // true

        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.print("Pila tras push 10, 20, 30: ");
        pila.imprimir();                                 // 30 ↓ 20 ↓ 10

        System.out.println("peek():  " + pila.peek());     // 30
        System.out.println("pop():   " + pila.pop());      // 30
        System.out.print("Pila tras pop: ");
        pila.imprimir();                                 // 20 ↓ 10

        System.out.println("Tamaño: " + pila.tamaño());    // 2
        System.out.println("pop():   " + pila.pop());      // 20
        System.out.println("pop():   " + pila.pop());      // 10
        System.out.println("¿Está vacía? " + pila.estaVacia()); // true
    }

}
