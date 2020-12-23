/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ventanas;

import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.ordenamiento.MetodosOrdenamiento;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author theni
 */
public class Ventana extends JFrame {

    private Lamina lamina = null;

    public Ventana() {
        Toolkit hr = Toolkit.getDefaultToolkit();
        Dimension tamano = hr.getScreenSize();
        int altura = tamano.height;
        int anchura = tamano.width;
        this.setSize(anchura / 3, altura / 3);
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTitle("Visor de Ordenamiento");
        this.lamina = new Lamina(anchura, altura);
        this.add(lamina);
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Ventana ventana2 = new Ventana();

        Random rd = new Random();
        ListaSimple lista = new ListaSimple();
        ListaSimple lista2 = new ListaSimple();
        for (int i = 0; i < 150; i++) {
            lista.agregarEnCola(rd.nextInt(200));
            lista2.agregarEnCola(rd.nextInt(200));
        }

        ventana.lamina.setDatos(lista);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana2.lamina.setDatos(lista2);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setVisible(true);
        ventana2.setVisible(true);

        MetodosOrdenamiento.seleccion(lista, ventana.lamina);
        MetodosOrdenamiento.burbuja(lista2, ventana2.lamina);
    }

}
