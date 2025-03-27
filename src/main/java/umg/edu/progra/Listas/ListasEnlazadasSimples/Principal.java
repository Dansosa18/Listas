package umg.edu.progra.Listas.ListasEnlazadasSimples;

public class Principal {

    public static void main(String[] args) {

        // Crear una lista y llenarla con datos
        Lista lista = new Lista();
        lista.insertarCabezaLista(10);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(7);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(8);

        // Probar ordenación
        System.out.println("Lista antes de ordenar:");
        lista.visualizar();
        lista.ordenarLista();
        System.out.println("Lista ordenada:");
        lista.visualizar();

        // Probar unión de dos listas
        Lista otraLista = new Lista();
        otraLista.insertarCabezaLista(50);
        otraLista.insertarCabezaLista(40);
        otraLista.insertarCabezaLista(30);
        System.out.println("Otra lista:");
        otraLista.visualizar();
        lista.unirLista(otraLista);
        System.out.println("Lista unida:");
        lista.visualizar();

        // Separar pares e impares
        Lista pares = new Lista();
        Lista impares = new Lista();
        lista.separarParesImpares(pares, impares);
        System.out.println("Lista de pares:");
        pares.visualizar();
        System.out.println("Lista de impares:");
        impares.visualizar();

        // Invertir la lista
        System.out.println("Lista antes de invertir:");
        lista.visualizar();
        lista.invertirLista();
        System.out.println("Lista invertida:");
        lista.visualizar();

        // Obtener el n-ésimo elemento desde el final
        int n = 2;
        System.out.println("El elemento en la posición " + n + " desde el final es: " + lista.obtenerDesdeFinal(n));

        // Eliminar duplicados
        lista.insertarCabezaLista(10);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(3);
        System.out.println("Lista con duplicados:");
        lista.visualizar();
        lista.eliminarDuplicados();
        System.out.println("Lista sin duplicados:");
        lista.visualizar();

        // Obtener el tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.obtenerTamano());

    }
}




