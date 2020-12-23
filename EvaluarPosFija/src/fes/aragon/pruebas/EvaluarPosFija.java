/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.pruebas;

import fes.aragon.impl.PilaLista;

/**
 *
 * @author theni
 */
public class EvaluarPosFija {

    public static void main(String[] args) {
        String cadena = "5 4 + 3 1 - *";
        PilaLista pila = new PilaLista(100);
        String[] token = cadena.split(" ");
        int indice = 0;
        while (indice < token.length) {
            String simbolo = token[indice];
            if (simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/")) {
                Integer op2 = (Integer) pila.extraer();
                Integer op1 = (Integer) pila.extraer();
                Integer operacion = null;
                if (simbolo.equals("+")) {
                    operacion = op1 + op2;
                } else if (simbolo.equals("-")) {
                    operacion = op1 - op2;
                } else if (simbolo.equals("*")) {
                    operacion = op1 * op2;
                } else if (simbolo.equals("/")) {
                    operacion = op1 / op2;
                }
                pila.insertar(operacion);
            } else {
                try {
                    pila.insertar(Integer.parseInt(simbolo));
                } catch (NumberFormatException ex) {
                    System.out.println("Numero no valido");
                }
            }
            indice++;
        }
        System.out.println(pila.extraer());
    }
}
