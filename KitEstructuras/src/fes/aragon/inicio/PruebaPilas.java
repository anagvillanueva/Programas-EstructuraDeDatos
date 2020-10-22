
package fes.aragon.inicio;

import fes.aragon.impl.PilaLista;


public class PruebaPilas {
    public static void main(String[] args) {
        
        PilaLista<Integer> pila= new PilaLista<>(9);
        pila.setLongitud(10);
        for ( int i = 0; i <10; i++){
            pila.insertar(i);
        }
        while(!pila.estaVacia()){
            System.out.println(pila.extraer());
        }
    }
}
