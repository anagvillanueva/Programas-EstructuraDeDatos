
package fes.aragon.inicio;

public class DoWhile {
    public static void main(String[] args) {
      
      int i=0;
      boolean bandera=false;
      do{
          System.out.print(i + "");
          i++;
          if(i==6){
              bandera = true; 
          }
      } while (bandera != true);
      
    }
}
