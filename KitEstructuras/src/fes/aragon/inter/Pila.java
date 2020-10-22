
package fes.aragon.inter;

public interface Pila<E>{
    void borrar();
    boolean estaVacia();
    void insertar(E dato);
    E extraer();
    E elementoSuperior();
}
