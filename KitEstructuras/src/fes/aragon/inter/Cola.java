/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inter;

/**
 *
 * @author theni
 */
public interface Cola<E> {
    
    void borrar();
    boolean estaVacia();
    void insertar(E dato);
    E extraer();
    E elementoSuperior();
    
}
