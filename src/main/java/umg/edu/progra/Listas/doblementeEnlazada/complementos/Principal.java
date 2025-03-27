package umg.edu.progra.Listas.doblementeEnlazada.complementos;

import umg.edu.progra.Listas.doblementeEnlazada.DoblementeEnlazada;

public class Principal {

    public static void main(String[] args) {

        listaenlazadaDoble();

    }

    public static void listaEnlazadaSimple() {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        lista.visualizar();


        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());



        lista.eliminar(3);
        System.out.println("lista: " + lista);

        System.out.println("\n");

        Nodo dato = lista.buscarLista(4);
        System.out.println("dato: " + dato);

        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);

        dato = lista.buscarLista(5);
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);

        System.out.println("lista " + lista);

        lista.visualizar();


        /**
         * Ejercicio 1: Ordernar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
         */

    }

    public static void listaenlazadaDoble() {
        DoblementeEnlazada dll = new DoblementeEnlazada();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtBeginning(5);

        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001b[32m";

        System.out.println(GREEN + "========== Lista Doblemente Enlazada ==========");
        System.out.println(RESET+"Lista en orden:");
        dll.displayForward();

        System.out.println("\nLista en orden inverso:"+ RED);
        dll.displayBackward();

        System.out.println(RESET +"\nEliminando 20: " + dll.delete(20)+RED);
        dll.displayForward();

        System.out.println(RESET + "\nBuscando 10: " + dll.search(10));
        System.out.println("Buscando 50: " + dll.search(50));


        //=================================
        //= LLAMANDO A LOS NUEVOS METODOS =
        //=================================

        System.out.println("\nNúmero de nodos: " + dll.contarNodos());

        System.out.println("\nInsertando 25 después de 10"+RED);
        dll.insertarDespuesDe(10, 25);
        dll.displayForward();

        System.out.println(RESET+"\nRevirtiendo la lista"+RED);
        dll.revertirLista();
        dll.displayForward();

        System.out.println(GREEN + "==========================");


    }



}