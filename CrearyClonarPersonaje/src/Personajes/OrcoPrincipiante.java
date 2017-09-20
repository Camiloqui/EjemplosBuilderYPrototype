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
public class OrcoPrincipiante extends ConstructorPersonaje {
       @Override
       public void construirClase(){
        Personaje.setClase("Orco");
    }
       @Override
    public void construirNivel(){
        Personaje.setNivel("Principiante");
    }
    public void construirPersonaje(){
            Personaje= new Personaje();
    }

}
