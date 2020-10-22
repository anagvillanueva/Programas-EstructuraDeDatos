/*
RECORRER UNA LISTA DE 1500 DATOS ENTEROS Y ELIMINAR AQUELLOS QUE SEAN IGUALES DEJANDO SOLO EL ORIGINAL 
 */
package fes.aragon.tarea;

import fes.aragon.dinamicas.ListaSimple;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Bruno
 */
public class ListaTareaEliminaDato {
    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        Random rd = new Random();
        for (int i = 0; i < 1500; i++) {
            l.agregarEnCola("Numero: "+i+" Dato: "+rd.nextInt(100));  
            
        }  
        l.imprimirElementos();
    }
    
}
