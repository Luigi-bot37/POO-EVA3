/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_throw;

/**
 *
 * @author Luisin
 */
public class EVA3_10_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
             Persona perso= new Persona();
             perso.setNombre("Vania");
             perso.setApe("Ramos");
             perso.setEdad(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("FIN!");
    }
    
}
