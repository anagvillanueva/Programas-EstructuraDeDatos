package ico.tarea;

public class Tarea {
    
    public static void main(String[] args) {
       int vocales[]=new int[5];
       String[] Apostoles = {"Pedro", "Juan", "Pablo", "Teodoro"}; 
      
        for (int i = 0; i < Apostoles.length; i++) { 
            String elemento = Apostoles[i];
      
        char caracter;
        for(int j=0;j<Apostoles.length;j++){
            caracter = Character.toLowerCase(Apostoles.charAt(j));
            
                switch(caracter)
                {
                    case'a': 
                        vocales[0]++;
                        break;    
                    case 'e':
                        vocales[1]++;
                        break;
                    case 'i':
                        vocales[2]++;
                        break;
                    case 'o':
                        vocales[3]++;
                        break;
                    case 'u':
                        vocales[4]++;
                        break;    
                    default:
                        break;
            }
           System.out.print(Apostoles[i] + " ");
          }
        System.out.println( "A:"); 
        }
    }
}


    

//if((elemento.charAt(j)=='a')||(elemento.charAt(j)=='e')||(elemento.charAt(j)=='i')
                //||(elemento.charAt(j)=='o')||(elemento.charAt(j)=='u')){ 
                                  //contador ++;