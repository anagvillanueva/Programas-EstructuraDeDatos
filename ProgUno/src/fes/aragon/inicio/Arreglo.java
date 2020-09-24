package fes.aragon.inicio;

public class Arreglo {

    public static void main(String[] args) {
        final int l = 4;
        int[] ar = new int[l]; // Declarando un arreglo con 10 datos
        int[] ar2 = new int[l];
        String[] ar3 = {"Pedro", "Juan", "Pablo", "Teodoro"};

        System.out.println(ar[0]); // Acedo a la posicion 0 
        //recorrer
        for (int i = 0; i < ar.length; i++) { // ar.lenght por si cambio el numero del arreglo me evito el cambio 
            System.out.print(ar[i] + "");
        }
        //Asignar valores
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i + 1;
            System.out.println(ar[i] + "");
        }
        //Pasar valores de un lugar a otro 
        for (int i = 0; i < ar.length; i++) {
            ar2[i] = ar[i];
        }
        System.out.println("");
        int contador=0;
        for (int i = 0; i < ar3.length; i++) {
            String elemento = ar3[i];
            for (int j = 0; j < elemento.length(); j++) {
                if(elemento.charAt(j)=='o'){ // Contamos cuantas O hay en total 
                contador ++;
            }
            System.out.println("--------");
        }
        System.out.println(contador); 
    }
}}
