/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_throw;

/**
 *
 * @author luisin
 */
public class Persona {

    private String nombre;
    private String ape;
    private int edad;

    public Persona() {
        this.nombre = "-----";
        this.ape ="-----";
        this.edad = 0;
    }

    public Persona(String nombre, String ape, int edad) throws Exception {
        this.nombre = nombre;
        this.ape = ape;
         if((edad<0) || (edad>120))
            throw new Exception("El valor capturado en edad no es valido.");
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if((edad<0) || (edad>120))
            throw new Exception("El valor capturado en edad no es valido.");
        this.edad = edad;
    }

}
