/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.ventanas;

import fes.aragon.dinamicas.ListaSimple;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author theni
 */
public class Lamina extends JPanel {

    private int anchura, altura;
    private int x=1;
    private ListaSimple datos=new ListaSimple();

    public Lamina(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        this.pintarCuadros(g2);
    }

    public void setDatos(ListaSimple datos) {
        this.datos = datos;
    }

    public void setX(int x) {
        this.x = x;
    }

    private void pintarCuadros(Graphics2D g2) {
        if (datos.getLongitud() != 0) {
            int xx=x;
            for (int i = 1; i < datos.getLongitud(); i++) {
                Rectangle2D rect = new Rectangle2D.Float(i, (200 - (Integer) datos.obtenerNodo(i)), 4F, 4F);
                g2.setColor(Color.BLACK);
                g2.fill(rect);
                g2.draw(rect);

            }
        }
    }
}
