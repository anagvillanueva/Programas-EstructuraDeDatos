package fes.aragon.inicio;

import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Dame un numero");
        try {
            int dato = Integer.parseInt(numero);// Parseo para convertir de string a integer 
            int n=1;
            int factorial=1;
            while(n<=dato){
                factorial*=n;
                n++;
            }
            JOptionPane.showMessageDialog(null, "El factorial de" + dato +"="+factorial);//Null porque no tenemos componente parent, eso es con JFrame
        } catch (NumberFormatException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Solo numeros"); // Un try catch, en caso de que me mande letras en vez de numeros
        }
    }
}