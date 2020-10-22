
package fes.aragon.inicio;

import fes.aragon.impl.PilaLista;

public class PosFija {
    public static void main(String[] args) {
        String cadena="623+-382/+*2$3+";
        PilaLista<Integer> pila=new PilaLista<>(20);
        int indice=0;
        while(indice<cadena.length()){
            char caracter=cadena.charAt(indice);
            if(caracter>= 48 && caracter<=57){
            pila.insertar(Integer.parseInt(String.valueOf(caracter)));
            }else{
                int valor=0;
                int opr2=pila.extraer();
                int opr1=pila.extraer();
                if(caracter=='+'){
                    valor=opr1+opr2;
                }else
                if(caracter=='-'){
                    valor=opr1-opr2;
                }else
                if(caracter=='*'){
                    valor=opr1*opr2;
                }else
                if(caracter=='/'){
                    valor=(int)(opr1/opr2);
                }else
                if(caracter=='$'){
                    valor=(int)Math.pow(opr1, opr2);
                }
                pila.insertar(valor);
        }
            indice++;
        }
        System.out.println(pila.extraer());
    }
    
}
