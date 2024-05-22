/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author selva
 */
public class EVA3_15_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso= new Persona("Pancho", "Villa", 10);
        try {
            guardarObjeto(perso);
        } catch (IOException e) {
        }
    }
    public static void guardarObjeto(Persona obj) throws IOException{
        String ruta="C:\\Users\\selva\\Desktop\\Respaldo_Solver\\archivos\\persona.human";
        FileOutputStream abrirArch= new FileOutputStream(ruta);
        ObjectOutputStream guardarArch= new ObjectOutputStream(abrirArch);
        guardarArch.writeObject(obj);
        guardarArch.close();
    }
   public static Persona leerObjeto() throws FileNotFoundException, IOException, ClassNotFoundException{
       String ruta= "C:\\Users\\selva\\Desktop\\Respaldo_Solver\\archivos";
        Persona perso= null;
        FileInputStream abrirArch= new FileInputStream(ruta);
        ObjectInputStream leerObj = new ObjectInputStream(abrirArch);
        perso= (Persona)leerObj.readObject();
        leerObj.close();
        return perso;
        
    }
}
