/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUISIN
 */
public class EVA3_8_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            Scanner captura= new Scanner(System.in);
            int num= captura.nextInt();
            System.out.println("El valor capturado es: "+num);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("ESTO SIEMPRE SE EJECUTA");
        }
        System.out.println("Fin del programa :D");
    }
    
}
