public class ListaEnlazada {
    // Atributo principal
    // cabeza apunta al PRIMER nodo de la lista.
    // Si la lista está vacía, cabeza = null
    private Nodo cabeza;
    
    // Constructor, al crear la lista, está vacía, cabeza apunta a null
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Devuelve true si la lista no tiene ningún nodo
    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlInicio(int dato) {
        // Se crea el nuevo nodo con el dato recibido
        // Sigue apuntando al antiguo primer nodo
        Nodo nuevo = new Nodo(dato);
        // Hacemos que el nuevo nodo apunte al que era el primer nodo
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void insertarAlFinal(int dato) {
        // Nuevo nodo
        Nodo nuevo = new Nodo(dato);
        // Si la lista está vacía el nuevo nodo pasa a ser la cabeza
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        // Si no está vacía recorre hasta el último nodo
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    // Devuelve true si el dato existe, false si no
    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    // Si la lista está vacía no hay nada que eliminar
    public boolean eliminar(int dato) {
        if (cabeza == null) return false;

        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.dato == dato) {
                anterior.siguiente = actual.siguiente;
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        return false;
    }

    // Es encargado de devolver cuantos elementos hay
    public int contar() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // Devuelve el dato de la posición índice (empezando en 0)
    public int obtener(int indice) {
        if (indice < 0) throw new IndexOutOfBoundsException("Índice negativo");

        Nodo actual = cabeza;
        int posicion = 0;

        while (actual != null) {
            if (posicion == indice) return actual.dato;
            actual = actual.siguiente;
            posicion++;
        }

        throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
    }

    // Recorre la lista y muestra los datos
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" - ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}