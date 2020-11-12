
package fes.aragon.dinamicas.prueba;

import fes.aragon.dinamicas.ListaDoble;

public class ListaDoblePruebas {
    public static void main(String[] args) {
        ListaDoble lista1 = new ListaDoble();

        lista1.deleteData(new String("Banana"));
        lista1.addHeader(new String("Mipansumsum"));
        lista1.addHeader(new String("POO"));
        lista1.addHeader(new String("Dia de muertos"));
        lista1.addFooter(new String("Ana"));
        lista1.addHeader(new String("Equipo 3"));
        lista1.addHeader(new Integer(4));

        lista1.imprimirElementos();
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        lista1.deleteHeader();
        lista1.imprimirElementos();
        System.out.println("----------------------------");
        lista1.deleteHeader();
        lista1.imprimirElementos();
        System.out.println("----------------------------");
        lista1.imprimirElementos();
        System.out.println("----------------------------");
        lista1.deleteData(new String("POO"));
        System.out.println("----------------------------");
        System.out.println(lista1.isOnList(2));

    } 
}
