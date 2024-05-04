/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_9_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            metodoProblematico();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }/*se llego a un punto donde ya no podemos arrojar la bronca a otro metodo
    asi que ya hay qiue atender la excepcion
    */
    public static void metodoProblematico() throws Exception{
        System.out.println("Trouble Maker!! D:"); 
        throw new Exception("TE VOY A ANEXAR >:D");
       // System.out.println("Que terrible tragedia!!");
        //instruccion INALCANZABLE por la excepcion arrojada
    }
}
