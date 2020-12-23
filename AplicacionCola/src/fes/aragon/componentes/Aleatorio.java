/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.componentes;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Aleatorio {
    public static boolean personaEnFila() {
        Random rd = new Random();
        return rd.nextBoolean();
    }
    
    public static int tiempoEnAtender() {
        Random rd = new Random();
        return ((int) rd.nextDouble()*10 + 5);
    }
}