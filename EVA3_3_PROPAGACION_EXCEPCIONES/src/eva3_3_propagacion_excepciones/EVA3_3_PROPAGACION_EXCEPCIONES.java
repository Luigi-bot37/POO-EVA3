/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_propagacion_excepciones;

/**
 *
 * @author LUISIN
 */
public class EVA3_3_PROPAGACION_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A();
    }

    private static void A() {
        B();
    }

    private static void B() {
       C();
    }

    private static void C() {
        int x= 9, y=0;
        int resul= x/y;
        System.out.println(resul);
    }
    
}
