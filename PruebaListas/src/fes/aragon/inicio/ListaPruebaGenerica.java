package fes.aragon.inicio;

import fes.aragon.dinamicas.ListaSimple;

/**
 *
 * @author Bruno
 */
public class ListaPruebaGenerica {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregarEnCola(new String("Demo"));
        lista.agregarEnCola(new String("Perro"));
        lista.agregarEnCola(new Integer(10));
        lista.imprimirElementos();
        lista.eliminaEnDato(new Integer(10));
        lista.imprimirElementos();
      //Escribir un programa donde guardas 1500 datos en una lista y eliminar de esa lista los datos repetidos
      //Generar una lista de 1500 datos enteros y buscar cuantos numeros son pares e impares 
      //Crear dentro del kit de estructuras una lista doblemente enlazada
       
    }
}



