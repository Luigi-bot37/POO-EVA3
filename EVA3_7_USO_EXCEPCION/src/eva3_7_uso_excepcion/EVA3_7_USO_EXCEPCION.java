/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUISIN
 */
public class EVA3_7_USO_EXCEPCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        int num = 0;
        boolean valido = true;

        System.out.println("Ingrese un numero: ");
        do {
            try {
                Scanner captura = new Scanner(System.in);
                num = captura.nextInt();
                valido = false;
            } catch (InputMismatchException e) {

                System.out.println("Pendejo eso no es un numero >:[");
                System.out.println("Vuelve a intentarlo");

            }
          
        } while (valido);

        System.out.println("Numero ingresado:" + num);
        System.out.println("FIN ;D");
    }

}
