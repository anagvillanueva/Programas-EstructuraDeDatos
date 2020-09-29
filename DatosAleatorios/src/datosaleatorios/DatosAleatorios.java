
package datosaleatorios;

import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatosAleatorios {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            
            int[] datos = new int[10];
            Random rd = new Random();
            File f = new File(System.getProperty("user.dir") + "/numeros.txt");
            fw = new FileWriter(f, false);
            PrintWriter pr = new PrintWriter(fw);
          
            int contador=1; // Cuando el contador sea 1 haga un salto de linea
            for (int i = 0; i < datos.length; i++) {
                pr.write(String.valueOf(rd.nextInt(50))+";");   
                if(i==contador){
                    pr.write("\n");
                    contador+=2; // Salto de linea en 2
                }
            }
            
            
        } catch (IOException ex) {
            //ex.printStackTrace();
            Logger.getLogger(DatosAleatorios.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                
                   //ex.printStackTrace();
                Logger.getLogger(DatosAleatorios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
