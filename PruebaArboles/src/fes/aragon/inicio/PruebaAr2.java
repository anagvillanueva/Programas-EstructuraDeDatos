package fes.aragon.inicio;

import fes.aragon.ordenamiento.MetodosOrdenamiento;
import fes.aragon.dinamicas.ListaSimple;
import java.util.Random;
import pruebaarboles.NodoAr;

public class PruebaAr2 {

    public static void main(String[] args) {
        
        
        ListaSimple lista = new ListaSimple();
        Random rd=new Random();
        for(int i=0; i<5;i++){
            lista.agregarEnCola(rd.nextInt(200));
        }
        
        lista.imprimirElementos();
        System.out.println("-------------------------");
        //constructor de arbol binario
        ListaSimple arbolBinario = new ListaSimple();
        int increm=1;
        for(int i=0; i<lista.getLongitud();i++){
            arbolBinario.agregarEnCola(new NodoAr((Integer)lista.obtenerNodo(i)));
        if(i != lista.getLongitud()-1){
            ((NodoAr)arbolBinario.obtenerNodo(i)).setHijoIzq(increm);
            ((NodoAr)arbolBinario.obtenerNodo(i)).setHijoDer(++increm);
        }
        increm++;
        }
        for (int i = 0; i < arbolBinario.getLongitud(); i++) {
            NodoAr tmp = (NodoAr) arbolBinario.obtenerNodo(i);
            System.out.println(tmp.toString());
            if (tmp.getHijoIzq() != null) {
                System.out.println("Izquierdo---" + lista.obtenerNodo(tmp.getHijoIzq()));
            }
            if (tmp.getHijoDer() != null) {
                System.out.println("Derecho---" + lista.obtenerNodo(tmp.getHijoDer()));
            }
        }
    }

}//Increible :0