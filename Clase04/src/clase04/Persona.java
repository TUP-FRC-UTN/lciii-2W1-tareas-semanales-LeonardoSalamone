/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

/**
 *
 * @author Usuario
 */
public class Persona {

    private String nombre;
    private int edad;

    Persona(String nombre, int edad) {
        this.nombre= nombre;
        this.edad = edad;
    }
    
    public int decimeEdad() {
        return edad;
    }

}
