package fes.aragon.inicio;

import fes.aragon.arbolesbinarios.ArbolBinarioMayorMenor;

/**
 *
 * @author theni
 */
public class PruebaArbolkit {
    public static void main(String[] args) {
        ArbolBinarioMayorMenor arbol = new ArbolBinarioMayorMenor();
        arbol.insertar(40);
        arbol.insertar(30);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(16);
        arbol.insertar(10);
        arbol.insertar(60);
        arbol.insertar(28);
        arbol.insertar(42);
        arbol.insertar(41);
        arbol.insertar(13);
        arbol.insertar(5);
        arbol.insertar(53);
        //arbol.recorridoAmplitud();
        System.out.println("-------------------------");
        arbol.postOrden(arbol.getRaiz());
    }
}