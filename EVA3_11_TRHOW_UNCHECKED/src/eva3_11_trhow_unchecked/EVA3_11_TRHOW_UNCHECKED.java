/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_11_trhow_unchecked;

import java.util.Scanner;

/**
 *
 * @author LUISIN
 */
public class EVA3_11_TRHOW_UNCHECKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner captura = new Scanner(System.in);
        boolean valido = true;
        Persona perso = new Persona();
        System.out.println("Ingrese nombres: ");
        perso.setNombre(captura.nextLine());
        System.out.println("Ingrese apellidos: ");
        perso.setApe(captura.nextLine());
        do {

            try {
                captura = new Scanner(System.in);
                System.out.println("Ingrese edad: ");
                perso.setEdad(captura.nextInt());
                valido = false;
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("Vuelva a repetirlo");
            }
        } while (valido);
        System.out.println("Persona: ");
        System.out.println("Nombre completo: "+perso.getNombre()+ " "+ perso.getApe());
        System.out.println("Edad:"+perso.getEdad());
                
        System.out.println("FIN!");
    }

}
