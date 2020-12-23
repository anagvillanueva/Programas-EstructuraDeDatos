/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.componentes;

/**
 *
 * @author HP
 */
public class Caja {
    private boolean semaforo = true;
    private int tiempoAtender;
    private int tiempoRestante;
    private Persona persona;

    public Caja(int tiempoAtender, int tiempoRestante, Persona persona) {
        this.tiempoAtender = tiempoAtender;
        this.tiempoRestante = tiempoRestante;
        this.persona = persona;
    }

    public boolean isSemaforo() {
        return semaforo;
    }

    public void setSemaforo(boolean semaforo) {
        this.semaforo = semaforo;
    }

    public int getTiempoAtender() {
        return tiempoAtender;
    }

    public void setTiempoAtender(int tiempoAtender) {
        this.tiempoAtender = tiempoAtender;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Caja{" + "semaforo=" + semaforo + ", tiempoAtender=" + tiempoAtender + ", tiempoRestante=" + tiempoRestante + ", persona=" + persona + '}';
    }
}

