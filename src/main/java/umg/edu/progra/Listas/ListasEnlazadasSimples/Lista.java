package umg.edu.progra.Listas.ListasEnlazadasSimples;

/**
 * La clase Lista representa una lista enlazada que almacena instancias de Nodo
 * Proporciona varios métodos para gestionar y manipular los nodos de la lista.
 */

public class Lista {

    private Nodo primero; // Apuntador al primer nodo de la lista


    @Override
    public String toString() {
        return "=>" + primero;
    }

    // Constructor
    public Lista() {
        primero = null;
    }

    public Nodo leerPrimero() {
        return primero;
    }

    public void insertarCabezaLista(int entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
    }

    public void insertarLista(Nodo anterior, int entrada) {
        if (anterior != null) {
            Nodo nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior.enlace = nuevo;
        }
    }

    public void eliminar(int entrada) {
        Nodo actual = primero, anterior = null;
        while (actual != null && actual.dato != entrada) {
            anterior = actual;
            actual = actual.enlace;
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
        }
    }

    public Nodo buscarLista(int destino) {
        Nodo indice = primero;
        while (indice != null) {
            if (indice.dato == destino) {
                return indice;
            }
            indice = indice.enlace;
        }
        return null;
    }

    public void visualizar() {
        Nodo n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
        System.out.println();
    }

    // Método para ordenar la lista de forma ascendente (Bubble Sort)
    public void ordenarLista() {
        if (primero == null || primero.enlace == null) return;
        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = primero;
            Nodo anterior = null;
            while (actual.enlace != null) {
                if (actual.dato > actual.enlace.dato) {
                    int temp = actual.dato;
                    actual.dato = actual.enlace.dato;
                    actual.enlace.dato = temp;
                    intercambio = true;
                }
                actual = actual.enlace;
            }
        } while (intercambio);
    }

    // Método para unir dos listas
    public void unirLista(Lista otra) {
        if (otra.primero == null) return;
        if (primero == null) {
            primero = otra.primero;
        } else {
            Nodo actual = primero;
            while (actual.enlace != null) {
                actual = actual.enlace;
            }
            actual.enlace = otra.primero;
        }
    }

    // Método para separar números pares e impares en dos listas
    public void separarParesImpares(Lista pares, Lista impares) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.dato % 2 == 0) {
                pares.insertarCabezaLista(actual.dato);
            } else {
                impares.insertarCabezaLista(actual.dato);
            }
            actual = actual.enlace;
        }
    }

    // Método para invertir la lista enlazada
    public void invertirLista() {
        Nodo prev = null, actual = primero, siguiente;
        while (actual != null) {
            siguiente = actual.enlace;
            actual.enlace = prev;
            prev = actual;
            actual = siguiente;
        }
        primero = prev;
    }

    // Método para obtener el elemento en la posición n desde el final
    public int obtenerDesdeFinal(int n) {
        Nodo principal = primero, referencia = primero;
        int contador = 0;
        while (contador < n) {
            if (referencia == null) return -1;
            referencia = referencia.enlace;
            contador++;
        }
        while (referencia != null) {
            principal = principal.enlace;
            referencia = referencia.enlace;
        }
        return principal.dato;
    }

    // Método para eliminar duplicados
    public void eliminarDuplicados() {
        Nodo actual = primero;
        while (actual != null && actual.enlace != null) {
            Nodo temp = actual;
            while (temp.enlace != null) {
                if (actual.dato == temp.enlace.dato) {
                    temp.enlace = temp.enlace.enlace;
                } else {
                    temp = temp.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    // Método para obtener el tamaño de la lista
    public int obtenerTamano() {
        int contador = 0;
        Nodo actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.enlace;
        }
        return contador;
    }
}
