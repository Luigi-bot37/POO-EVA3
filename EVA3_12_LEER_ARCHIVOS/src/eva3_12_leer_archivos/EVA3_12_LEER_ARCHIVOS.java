/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author luisin
 */
public class EVA3_12_LEER_ARCHIVOS {

    final static String Ruta = "E:\\archivos\\texto.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            readFileswithFiles(Ruta);
            readFileswithBufferedReader(Ruta);
            readFileswithFileReader(Ruta);
            readFileswithScanner(Ruta);
        } catch (IOException e) {

        }
    }

    public static void readFileswithFiles(String ruta) throws IOException {
       System.out.println("----Leer archivos con Files----");
        Path path = Paths.get(ruta);
        byte[] datos = Files.readAllBytes(path);
        //new String()---
        System.out.println(new String(datos));
    } 

    public static void readFileswithBufferedReader(String ruta) throws IOException {
        System.out.println("----Leer archivos con BufferedReader----");
        File file = new File(ruta);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in);//convierte en caracteres
        //buffered: memoria temporal, es rapido
        //bueno para archivos grandes
        BufferedReader br = new BufferedReader(reader);
        String cade;
        while ((cade = br.readLine()) != null) {
            System.out.println(cade);
        }
br.close();
    }

    public static void readFileswithFileReader(String ruta) throws IOException {
        System.out.println("----Leer archivos con FileReader----");
        File file = new File(ruta);
        //FileReader reader= new FileReader(file);
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String cade;
        while ((cade = br.readLine()) != null) {
            System.out.println(cade);
        }
        br.close();
    }
public static void readFileswithScanner(String ruta) throws IOException{
    System.out.println("----Leer archivos con Scanner----");
     Path path = Paths.get(ruta);
    Scanner leer= new Scanner(path);
   while(leer.hasNextLine()){
       String cade= leer.nextLine();
       System.out.println(cade);
   }
   leer.close();
}
}