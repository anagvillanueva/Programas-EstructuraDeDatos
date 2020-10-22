package fes.aragon.dinamicas;

public class Nodo {
    //Nodos tienen dato y la memoria del siguiente
    private Object dato;
    private Nodo siguiente; //Siguiente guarda un objeto tipo Nodo 
    
    //Nodo para solo uno
    public Nodo(Object dato){//Cuando se crea el nodo deben darnos un dato
        this(dato,null);
    }
    //Nodo para uno y el siguiente
    public Nodo(Object dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
    
    //Setters and Getters   
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
