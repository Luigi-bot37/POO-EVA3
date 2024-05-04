/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LUISIN
 */
public class EVA3_6_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner captura = new Scanner(System.in);
            System.out.println("Ingrese numerador: ");
            int nume = captura.nextInt();

            System.out.println("Ingrese divisor: ");
            int divi = captura.nextInt();

            int resu = nume / divi;
            System.out.println("El resultado de: " + nume + "/" + divi + " es: " + resu);
        } catch (Exception e) {
            if(e instanceof InputMismatchException)
            e.printStackTrace();
        }
        System.out.println("FIN DE PROGRAMA :]");

    }
}
