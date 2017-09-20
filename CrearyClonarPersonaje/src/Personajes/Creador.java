/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import GUI.Interfaz;
import java.util.Iterator;

/**
 *
 * @author -Camilo
 */
public class Creador {

  

    private ConstructorPersonaje constructor;

    public void setConstructor(ConstructorPersonaje constructor) {
        this.constructor = constructor;
    }
    
    public Personaje getPersonaje(){
        return constructor.getPersonaje();
    }
    
    public void construirPersonaje(){
        constructor.construirPersonaje();
        constructor.construirClase();
        constructor.construirNivel();
    }
     public Personaje retrievePersonaje(String Personaje) {
        if ("Orco".equals(Personaje)) {
            return (Personaje) constructor.getPersonaje().clone();
        } else if ("Mago".equals(Personaje)) {
            return (Personaje) constructor.getPersonaje().clone();        
        } else if("Elfo".equals(Personaje)){
            return (Personaje) constructor.getPersonaje().clone();
        }// if	

        return null;    
    }
   public static void main(String[] args) {
////        Creador creador = new Creador();
////        creador.setConstructor(new ClasePersonajes());
////        creador.construirPersonaje();
////        
////        Personaje personaje = creador.getPersonaje();
////        Iterator itClase = personaje.getClase().listIterator();
////        Iterator itArma = personaje.getArma().listIterator();
////        while(itClase.hasNext() ){
////            System.out.println(itArma.next() + " en el " + itClase.next());
////        }

 
  new Interfaz().setVisible(true);
  
 }
    
}
