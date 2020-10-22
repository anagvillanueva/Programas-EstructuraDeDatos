package fes.aragon.inicio;

import fes.aragon.dinamicas.ListaSimple;
import java.util.Random;

public class ListaPrueba {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        ListaSimple listaE = new ListaSimple();
        Random rd = new Random();
        for (int i = 0; i < rd.nextInt(1500); i++) {
            lista.agregarEnCola(rd.nextInt(200));
        }
        System.out.println("-LISTA COMPLETA-");
        lista.imprimirElementos();

        System.out.println("-ELEMENTOS ELIMINADOS-");
        for (int i = 0; i < 10; i++) {
            listaE.agregarEnCola(lista.eliminarEnCola());
        }
        listaE.imprimirElementos();

        System.out.println("-LISTA SIN LOS ELEMENTOS-");
        lista.imprimirElementos();
        
        
        System.out.println("-LISTA ELIMINA DATO-");
        lista.buscaDato(10);
    }
}
//Crear Esta en Lista. Boolean 
//Borrar 