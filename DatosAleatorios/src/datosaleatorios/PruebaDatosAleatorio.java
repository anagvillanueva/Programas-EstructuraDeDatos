
package datosaleatorios;

import java.io.*;
import java.nio.file.FileSystemNotFoundException;
public class PruebaDatosAleatorio {
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
        FileReader Leer = null;
        File Archivo=new File(System.getProperty("user.dir")+"/numeros.txt");
        Leer = new FileReader(Archivo);
        BufferedReader Bf = new BufferedReader(Leer);
        String temp= "";
        while ((temp=Bf.readLine())!=null){
        String x;
        x = temp;
        String []arreglo = x.split(";"); // Lee y guarda cada que encuentra un ; con slipt
           
        for (int i = 0; i < arreglo.length; i++) { // Recorriendo el indice del arreglo 
                System.out.println(""+ arreglo[i]); // Imprimir el arreglo
            }
         //System.out.println("Posicion 2 en el arreglo:"+ arreglo[2]);
        }
        } catch (FileSystemNotFoundException | IOException e){
                e.printStackTrace();
        }
    }
}
