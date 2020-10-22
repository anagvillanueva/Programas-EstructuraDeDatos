package fes.aragon.inicio;

import fes.aragon.dinamicas.ListaSimple;

/**
 *
 * @author Bruno
 */
public class ListaPruebaDos {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregarEnCola(100);
        lista.agregarEnCola(80);
        lista.agregarEnCola(67);
        lista.agregarEnCola(90);
        lista.agregarEnCola(1);
        lista.imprimirElementos();
        System.out.println(lista.buscaDato(10));
        System.out.println(lista.eliminaEnDato(67));
        System.out.println("------");
        lista.imprimirElementos();
    }
}
