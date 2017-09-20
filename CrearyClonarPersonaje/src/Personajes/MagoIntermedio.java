/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author -Camilo
 */
public class MagoIntermedio extends ConstructorPersonaje {

    public void construirClase() {
        Personaje.setClase("Mago");
    }

    public void construirNivel() {
        Personaje.setNivel("Intermedio");
    }

    public void construirPersonaje() {
        Personaje = new Personaje();
    }
}
