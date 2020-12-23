
import fes.aragon.dinamicas.ListaSimple;
import fes.aragon.ordenamiento.MetodosOrdenamiento;
import java.util.Random;


public class PruebasOrdenamiento {
    public static void main(String[] args) {
        Random rd=new Random();
        ListaSimple lista=new ListaSimple();
        for(int i=0;i<10;i++){
            lista.agregarEnCola(rd.nextInt(200));
            }
        lista.imprimirElementos();
        System.out.println("-----------------------");
        MetodosOrdenamiento.burbuja(lista);
        lista.imprimirElementos();
        
        }
    }
