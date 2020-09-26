
package ico.tarea;

public class TareaInt2 {
    public static void main(String[] args) {
      
        int cont=0, cont2=0, cont3=0, cont4=0, cont5=0;
        String[] Apostoles = {"Pedro", "Juan", "Pablo", "Teodoro"}; 
      
        for (int i = 0; i < Apostoles.length; i++) { 
            String elemento = Apostoles[i];
            
            for (int j = 0; j < elemento.length(); j++) {
                if(elemento.charAt(j)=='a'){ // Contamos cuantas O hay en total
                    cont ++;
                    }
                }
            for (int h = 0; h < elemento.length(); h++) {
                if(elemento.charAt(h)=='e'){ // Contamos cuantas O hay en total 
                cont2 ++;
                    }
                }
            for (int w = 0; w < elemento.length(); w++) {
                if(elemento.charAt(w)=='i'){ // Contamos cuantas O hay en total 
                cont3 ++;
                    }
                }
            for (int x = 0; x < elemento.length(); x++) {
                if(elemento.charAt(x)=='o'){ // Contamos cuantas O hay en total 
                cont4 ++;
                    }
                }
            for (int b = 0; b < elemento.length(); b++) {
                if(elemento.charAt(b)=='u'){ // Contamos cuantas O hay en total 
                cont5 ++;
                }    
            }
        System.out.println (Apostoles[i] +" A:"+ cont+" - E:"+cont2+ " - I:"+ cont3 + " - O:"+cont4+" - U:"+ cont5);
        cont=0;
        cont2=0;
        cont3=0;
        cont4=0;
        cont5=0;
    }
     System.out.println("---------");  
     System.out.println("");
     System.out.println("Total de vocales: ");
     System.out.println("A:"+ cont+" - E:"+cont2+ " - I:"+ cont3 + " - O:"+cont4+" - U:"+ cont5);
    }
}