package fes.aragon.ordenamiento;

import fes.aragon.dinamicas.ListaSimple;
import javax.swing.JPanel;

public class MetodosOrdenamiento {

    public static void seleccion(ListaSimple lista) {
        int min = 0;
        for (int i = 0; i < lista.getLongitud(); i++) {
            min = i;
            for (int j = i + 1; j < lista.getLongitud(); j++) {
                if ((Integer) lista.obtenerNodo(j) < (Integer) lista.obtenerNodo(min)) {
                    min = j;
                }
            }
            if (i != min) {
                Object tmp = lista.obtenerNodo(i);
                lista.insertarIndice(lista.obtenerNodo(min), i);
                lista.insertarIndice(tmp, min);
            }
        }
    }

    public static void seleccion(ListaSimple lista, JPanel lamina) {
        int min = 0;
        for (int i = 0; i < lista.getLongitud(); i++) {
            min = i;
            for (int j = i + 1; j < lista.getLongitud(); j++) {
                if ((Integer) lista.obtenerNodo(j) < (Integer) lista.obtenerNodo(min)) {
                    min = j;
                }
            }
            if (i != min) {
                Object tmp = lista.obtenerNodo(i);
                lista.insertarIndice(lista.obtenerNodo(min), i);
                lista.insertarIndice(tmp, min);
            }
            lamina.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void burbuja(ListaSimple lista) {
        for (int i = 1; i < lista.getLongitud(); i++) {
            for (int j = 0; j < lista.getLongitud() - i; j++) {
                if ((Integer) lista.obtenerNodo(j) > (Integer) lista.obtenerNodo(j + 1)) {
                    Object tmp = lista.obtenerNodo(j);
                    lista.insertarIndice(lista.obtenerNodo(j + 1), j);
                    lista.insertarIndice(tmp, j + 1);
                }

            }

        }
    }

    public static void burbuja(ListaSimple lista, JPanel lamina) {
        for (int i = 1; i < lista.getLongitud(); i++) {
            for (int j = 0; j < lista.getLongitud() - i; j++) {
                if ((Integer) lista.obtenerNodo(j) > (Integer) lista.obtenerNodo(j + 1)) {
                    Object tmp = lista.obtenerNodo(j);
                    lista.insertarIndice(lista.obtenerNodo(j + 1), j);
                    lista.insertarIndice(tmp, j + 1);
                }

            }
            lamina.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
