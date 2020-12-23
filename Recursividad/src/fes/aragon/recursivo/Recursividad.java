
package fes.aragon.recursivo;

public class Recursividad {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return factorial(n - 1)*n;
        }
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Recursividad.factorial(3));
        System.out.println(Recursividad.fibonacci(5));
    }
}

