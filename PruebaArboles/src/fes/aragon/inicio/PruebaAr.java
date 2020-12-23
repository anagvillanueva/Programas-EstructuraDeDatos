package fes.aragon.inicio;

import fes.aragon.dinamicas.ListaSimple;
import java.util.Random;
import pruebaarboles.NodoAr;

public class PruebaAr {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregarEnCola(new Integer(13));
        lista.agregarEnCola(new Integer(11));
        lista.agregarEnCola(new Integer(5));
        lista.agregarEnCola(new Integer(27));
        lista.agregarEnCola(new Integer(18));
        lista.agregarEnCola(new Integer(2));
        lista.agregarEnCola(new Integer(31));
        lista.agregarEnCola(new Integer(9));
        lista.imprimirElementos();
        //constructor de arbol binario
        ListaSimple arbolBinario = new ListaSimple();
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(0)));
        ((NodoAr) arbolBinario.obtenerNodo(0)).setHijoIzq(1);
        ((NodoAr) arbolBinario.obtenerNodo(0)).setHijoDer(2);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(1)));
        ((NodoAr) arbolBinario.obtenerNodo(1)).setHijoIzq(3);
        ((NodoAr) arbolBinario.obtenerNodo(1)).setHijoDer(4);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(2)));
        ((NodoAr) arbolBinario.obtenerNodo(2)).setHijoIzq(5);
        ((NodoAr) arbolBinario.obtenerNodo(2)).setHijoDer(6);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(3)));
        ((NodoAr) arbolBinario.obtenerNodo(3)).setHijoIzq(null);
        ((NodoAr) arbolBinario.obtenerNodo(3)).setHijoDer(null);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(4)));
        ((NodoAr) arbolBinario.obtenerNodo(4)).setHijoIzq(null);
        ((NodoAr) arbolBinario.obtenerNodo(4)).setHijoDer(null);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(5)));
        ((NodoAr) arbolBinario.obtenerNodo(5)).setHijoIzq(null);
        ((NodoAr) arbolBinario.obtenerNodo(5)).setHijoDer(null);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(6)));
        ((NodoAr) arbolBinario.obtenerNodo(6)).setHijoIzq(7);
        ((NodoAr) arbolBinario.obtenerNodo(6)).setHijoDer(null);
        arbolBinario.agregarEnCola(new NodoAr((Integer) lista.obtenerNodo(7)));
        ((NodoAr) arbolBinario.obtenerNodo(7)).setHijoIzq(null);
        ((NodoAr) arbolBinario.obtenerNodo(7)).setHijoDer(null);

        for (int i = 0; i < arbolBinario.getLongitud(); i++) {
            NodoAr tmp = (NodoAr) arbolBinario.obtenerNodo(i);
            System.out.println(tmp.toString());
            if (tmp.getHijoIzq() != null) {
                System.out.println("izq-->" + lista.obtenerNodo(tmp.getHijoIzq()));
            }
            if (tmp.getHijoDer() != null) {
                System.out.println("der-->" + lista.obtenerNodo(tmp.getHijoDer()));
            }

        }
    }
}
