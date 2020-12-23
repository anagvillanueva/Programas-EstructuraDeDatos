package fes.aragon.arbolesbinarios;

import fes.aragon.impl.ColaLista;

/**
 *
 * @author theni
 */
public class ArbolBinarioMayorMenor {

    private Nodo raiz;

    public ArbolBinarioMayorMenor() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        Nodo n = raiz, previo = null;
        while (n != null) {
            previo = n;
            if (n.getDato() < dato) {
                n = n.getDer();
            } else {
                n = n.getIzq();
            }
        }
        if (raiz == null) {
            raiz = new Nodo(dato);
        } else if (previo.getDato() < dato) {
            previo.setDer(new Nodo(dato));
        } else {
            previo.setIzq(new Nodo(dato));
        }
    }

    public void recorridoAmplitud() {
        Nodo n = raiz;
        ColaLista cola = new ColaLista(100);
        if (n != null) {
            cola.insertar(n);
            while (!cola.estaVacia()) {
                n = (Nodo) cola.extraer();
                System.out.println(n.getDato());
                if (n.getIzq() != null) {
                    cola.insertar(n.getIzq());
                }
                if (n.getDer() != null) {
                    cola.insertar(n.getDer());
                }
            }
        }
    }

    public void preOrden(Nodo n) {
        if (n != null) {
            System.out.println(n.getDato());
            preOrden(n.getIzq());
            preOrden(n.getDer());
        }
    }
    
    public void orden(Nodo n){
        if(n!=null){
            orden(n.getIzq());
            System.out.println(n .getDato());
            orden(n.getDer());
        }
    }
    
    public void postOrden(Nodo n){
        if(n!=null){
            postOrden(n.getIzq());
            postOrden(n.getDer());
            System.out.println(n.getDato());
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
}