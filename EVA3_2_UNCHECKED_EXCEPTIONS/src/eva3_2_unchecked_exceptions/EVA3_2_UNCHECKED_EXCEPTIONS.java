/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_unchecked_exceptions;

import java.util.Scanner;
/**
 *
 * @author LUISIN
 */

public class EVA3_2_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NullPointerException: cuando tratamos de usar un objeto sin crear
        Persona persona= null;
         System.out.println(persona.toString());

        //IndexoutofBoundsException: cuando tratamos de leer una posicion 
        //inexistente en un arreglo
           int array[]= new int[13];// N= 13
         //en java la 1ra posicion es 0
         //y la ultima es N-1= 12
         array[14]= 200;
         System.out.println(array[14]);
        //Aritmetic>Exception: division entre 0
       int x= 34, y= 0;
         int divi= x/y;
         System.out.println("Resultado: "+ divi);
      //InputMismatchException:   
      Scanner captura= new Scanner(System.in);
      
       System.out.println("Ingrese un numero:");
        int num= captura.nextInt();
        System.out.println(num);
    }

}

class Persona {

}
