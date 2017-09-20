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
public class ElfoPrincipiante extends ConstructorPersonaje {
    public void construirClase(){
        Personaje.setClase("Elfo");
    }
    public void construirNivel(){
        Personaje.setNivel("Principiante");
    }

  public void construirPersonaje(){
            Personaje= new Personaje();
    }

}
  
