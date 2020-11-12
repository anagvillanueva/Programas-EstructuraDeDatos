
package fes.aragon.dinamicas;

/**
 *
 * @author Sou Akiyama
 * @author anagvillanueva
 * @author leomoal
 */
public class ListaDoble {

    protected Nodo cabeza, cola;
    protected int longitud = 0;

    public ListaDoble() {
        cabeza = cola = null;
    }

    public int getLongitud() {
        return longitud;
    }
    
    // Verifica si la lista está vacía
    public boolean isEmpty() {
        return cabeza == null;
    }
    
    // Agrega el Nodo en la cabeza de la lista, desplazando los demás elementos
    public void addHeader (Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setDato(dato);

        // Si no existe nodo en cabeza
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(null);
            cabeza.setAnterior(null);
            cola = cabeza;
        } else {
            cabeza.setAnterior(nuevo);
            nuevo.setSiguiente(cabeza);
            nuevo.setAnterior(null);
            cabeza = nuevo;
        }

        longitud++;
    }
    
    // Agrega el Nodo en la posición final de la lista
    public void addFooter(Object dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(null);
            cabeza.setAnterior(null);
            cola = cabeza;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            nuevo.setSiguiente(null);
            cola = nuevo;
        }
        longitud++;
    }
    
    // Elimina el Nodo que se encuentra en la cabeza de la lista
    public Object deleteHeader() {
        Object dato = 0;

        if (cabeza != null) {
            dato = cabeza.getDato();
            // Si únicamente existe un elemento
            if (cabeza == cola) {
                cabeza = cola = null;
              // SI tiene más elementos
            } else {
                cabeza = cabeza.getSiguiente();
            }

            longitud--;
        }

        return dato;
    }
    
    // Elimina el Nodo que se encuentra al final de la lista
    public void deleteFooter() {
        
        Nodo temporal = cola;
        if (temporal.getAnterior() != null) {
            cola = temporal.getAnterior();
            cola.setSiguiente(null);
        } else {
            cola = cabeza = null;
        }
        longitud--;
    }
    
    // Verifica si el dato se encuentra o no en la lista
    public boolean isOnList(Object dato) {
        Nodo temporal;
        for (temporal = cabeza; temporal != null && !temporal.getDato().equals(dato); temporal = temporal.getSiguiente());
        return temporal != null;
    }
    
    // Elimina un Nodo con dato x y lo busca en toda la lista
    public boolean deleteData(Object dato) {
        boolean borrar = false;
        if (cabeza != null) {
            if (cabeza == cola && dato.equals(cabeza.getDato())) {
                cabeza = cola = null;
                
                // Cambio de estado de variables
                borrar = true;
                longitud --;
            } else if (cabeza.getDato().equals(dato)) {
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
                
                // Cambio de estado de variables
                borrar = true;
                longitud --;
            } else {
                Nodo predecesor, temporal;
                
                for (predecesor = cabeza, temporal = cabeza.getSiguiente();
                        temporal != null && !temporal.getDato().equals(dato);
                        predecesor = predecesor.getSiguiente(), temporal = temporal.getSiguiente());
                
                if (temporal != null) {
                    // Cambio de estado de variables
                    borrar = true;
                    longitud --;
                    
                    predecesor.setSiguiente(temporal.getSiguiente());
                    if (temporal == cola) {
                        cola = predecesor;
                    }
                }
            }
        }
        return borrar;
    }
    
    // Devuelve el dato que se encuentra en el Nodo con índice x
    public Object getNodo(int indice) {
        Nodo temporal = null;
        
        if (indice <= longitud) {
            temporal = cabeza;
            for (int contador = 0; contador < indice && temporal != null; contador++, temporal = temporal.getSiguiente());
        }
        if (temporal != null) {
            return temporal.getDato();
        } else {
            return null;
        }
    }
    
    // Inserta un Nodo en un índice x, reemplazando el nodo previo por el nuevo
    public boolean insertDataOnIndex(Object dato, int indice) {
        Nodo temporal = null;
        
        if (indice <= longitud) {
            temporal = cabeza;
            
            // Se recorren los nodos y busca el elemento en el índice correspondiente
            for (int contador = 0; contador < indice && temporal != null; contador++, temporal = temporal.getSiguiente());
        }
        
        if (temporal != null) {
            temporal.setDato(dato);
            return true;
        } else {
            return false;
        }
    }
    
    // Elimina el Nodo con índice x y desplaza la lista
    public boolean deleteDataOnIndex(int indice) {
        boolean deleted = false;
        
        if (indice <= longitud) {
            if (cabeza != null) {
                
                // Si únicamente existe un elemento
                if (cabeza == cola && indice == 0) {
                    cabeza = cola = null;
                    deleted = true;
                    longitud --;
                // Si existe más de un dato (Primer elemento)
                } else if(indice == 0) {
                    Nodo temporal = null;
                    temporal = cabeza.getSiguiente();
                    temporal.setAnterior(null);
                    temporal.setSiguiente(temporal.getSiguiente());
                    cabeza = temporal;
                    
                    deleted = true;
                    longitud --;
                // Para más elementos
                } else {
                    Nodo predecesor, temporal;
                    int contador = 1;
                    
                    for(predecesor = cabeza, temporal = cabeza.getSiguiente(); contador < indice;
                            predecesor = predecesor.getSiguiente(), temporal = temporal.getSiguiente(), contador ++);
                    
                    if (temporal != null) {
                        deleted = true;
                        longitud --;
                        
                        predecesor.setSiguiente(temporal.getSiguiente());
                        predecesor.setAnterior(temporal.getAnterior());
                        
                        if (temporal == cola) {
                            cola = predecesor;
                        }
                    }
                }
            }
        }
        
        return deleted;
    }
    
    // Recorre la lista y muestra en consola (PRINT) los datos que se encuentran en la lista
    public void imprimirElementos() {
        for (Nodo temporal = cabeza; temporal != null; temporal = temporal.getSiguiente()) {
            System.out.println(temporal.getDato());
        }
        
        /* Exactamente lo mismo pero en ciclo while
        Nodo temporal = cabeza;
        while (temporal != null) {
            System.out.println(temporal.getDato());
            temporal = temporal.getSiguiente();
        }
        */
    }
}