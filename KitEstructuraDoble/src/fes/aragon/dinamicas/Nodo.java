
package fes.aragon.dinamicas;

public class Nodo {
Object dato;
Nodo anterior;
Nodo siguiente;
    
    public Nodo(Object dato) {
        this(dato,null, null);
    }

    public Nodo(Object dato, Nodo anterior, Nodo siguiente) {
        this.dato = dato;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}