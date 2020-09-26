
package fes.aragon.inicio;

public class Operadores {
    public static void main(String[] args) {
        int i, j; 
        boolean condicion, condicion1,condicion2, condicion3, condicion4, condicion5; 
        i = 0; 
        j = 1; 
        float k, m, l, u;
        k = 10;
        m = 3;
        u = 1/3f;
        l = 1/3;
        System.out.println("K " + k/m);
        System.out.println("L " + l);
        System.out.println("U "+ u);
        
        condicion = i < j; // menor
        condicion1 = i > j; // mayor
        condicion2 = k/m == u; // igual
        condicion4 = k/m != u; // diferente
        condicion5 = !(k==10);// Lo que salga de adentro lo voy a negar 
        
        
        System.out.println("Valor:"+ condicion);
        System.out.println("Valor:" + condicion1);
        System.out.println("Valor:"+ condicion2);
        System.out.println("Valor:"+ condicion4);
        System.out.println("Valor:" + condicion5);
    }
  
}
