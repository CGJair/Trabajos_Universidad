public class Cola{
    private static class Nodo {
        int dato;
        Nodo siguiente;
        Nodo(int dato) { this.dato = dato; this.siguiente = null; }
    }

    private Nodo frente;
    private Nodo fin;

    public Cola() { this.frente = null; this.fin = null; }

    public boolean estaVacia() { return frente == null; }

    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            frente = nuevo;
            fin    = nuevo;
            return;
        }
        fin.siguiente = nuevo;
        fin = nuevo;
    }

    public int desencolar() {
        if (estaVacia()) throw new IllegalStateException("La cola está vacía");
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return valor;
    }

    public int verFrente() {
        if (estaVacia()) throw new IllegalStateException("La cola está vacía");
        return frente.dato;
    }

    public int tamaño() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) { contador++; actual = actual.siguiente; }
        return contador;
    }

    public void imprimir() {
        if (estaVacia()) { System.out.println("La cola está vacía."); return; }
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" → ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Cola cola = new Cola();

        System.out.println("¿Está vacía? " + cola.estaVacia()); // true

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.print("Cola tras encolar 10, 20, 30: ");
        cola.imprimir();                                // 10 → 20 → 30

        System.out.println("verFrente():  " + cola.verFrente());  // 10
        System.out.println("desencolar(): " + cola.desencolar()); // 10
        System.out.print("Cola tras desencolar: ");
        cola.imprimir();                                // 20 → 30

        System.out.println("Tamaño: " + cola.tamaño());        // 2
        System.out.println("desencolar(): " + cola.desencolar()); // 20
        System.out.println("desencolar(): " + cola.desencolar()); // 30
        System.out.println("¿Está vacía? " + cola.estaVacia()); // true
    }
}
