package umg.edu.progra.Listas.ListasEnlazadasSimples;

/**
 * La clase Nodo representa un elemento de una lista enlazada en la que se almacenan datos.
 * Cada Nodo tiene una referencia al siguiente Nodo en la lista, lo que permite un recorrido lineal entre los elementos.
 */

public class Nodo {

    int dato;  // Almacena el valor del nodo.

    Nodo enlace; // Puntero al siguiente nodo.
    // Nodo enlaceSiguiente;
    // Nodo enlaceAnterior;

    @Override
    public String toString() {
        return dato + "=>" +  enlace;
    }

    // Constructor
    public Nodo(int x) {
        dato = x;
        enlace = null;
    }

    public Nodo(int x, Nodo n) {
        dato = x;
        enlace = n;
    }

    public int leerDato() {
        return dato;
    }

    public Nodo siguiente() {
        return enlace;
    }
}
