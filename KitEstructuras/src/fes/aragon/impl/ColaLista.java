/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.impl;

import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.inter.Cola;

/**
 *
 * @author theni
 */
public class ColaLista<E> implements Cola<E> {

    private ListaSimple cola = new ListaSimple();
    private int longitud = 10;

    public ColaLista(int longitud) {
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
        cola = new ListaSimple();
    }

    @Override
    public boolean estaVacia() {
        return cola.esVacia();
    }

    @Override
    public void insertar(E dato) {
        if (cola.getLongitud() < longitud) {
            cola.agregarEnCola(dato);
        } else {
            System.out.println("Cola Llena");
        }
    }

    @Override
    public E extraer() {
        return (E) cola.eliminarEnCabeza();
    }

    @Override
    public E elementoSuperior() {
        Object tmp = cola.eliminarEnCabeza();
        cola.agregarEnCabeza(tmp);
        return (E) tmp;
    }
    
    //Agregando mas funcionalidad a la cola par resolver mi problema
    public void insertarAlFinal(E dato){
        cola.agregarEnCola(dato);
    }
    
    public void imprimirCola(){
        cola.imprimirElementos();
    }
    
    public Object elementoCola(int indice){
        return cola.obtenerNodo(indice);
    }

}
