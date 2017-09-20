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
public abstract class ConstructorPersonaje {
    protected Personaje Personaje;

    public Personaje getPersonaje() {
        return Personaje;
    }
//    public void construirPersonajes(){
//            Personaje= new Personaje();
//    }
    public abstract void construirPersonaje();
    public abstract void construirClase();
    public abstract void construirNivel();
}
