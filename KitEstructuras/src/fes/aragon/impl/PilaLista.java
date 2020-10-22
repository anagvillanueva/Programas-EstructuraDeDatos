
package fes.aragon.impl;

import fes.aragon.inter.Pila;
import fes.aragon.dinamicas.ListaSimple;

public class PilaLista <E> implements Pila <E> {
    private ListaSimple pila=new ListaSimple();
    // Con el limite se cambia la naturaleza de la pila.
    private int longitud = 10;

    public PilaLista(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    @Override
    public void borrar() {
        pila=new ListaSimple();
    }

    @Override
    public boolean estaVacia() {
        return pila.esVacia();
    }

    @Override
    public void insertar(E dato) {
    //Si añade la longitud
    if (pila.getLongitud()< longitud){
    pila.agregarEnCabeza(dato);
    }else{
          System.out.println("Pila Llena");
         }
    }

    @Override
    public E extraer() {
        return (E)pila.eliminarEnCabeza();
    }

    @Override
    public E elementoSuperior() {
        Object tmp=pila.eliminarEnCabeza();
        pila.agregarEnCabeza(tmp);
        return (E)tmp;
    }
}

   

    

   
    

