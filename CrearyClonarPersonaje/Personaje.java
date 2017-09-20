/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.util.ArrayList;

/**
 *
 * @author -Camilo
 */
public class Personaje implements Cloneable {
    private String Clase;
    private String Nivel;   
    
    public void setClase(String h){
        this.Clase = h;
    }
    
    public void setNivel(String t){
       this.Nivel= t;
    }

    public String getClase() {
        return Clase;
    }

    public String getNivel() {
        return Nivel;
    }
public Personaje clone(){
    Personaje clonedPersonaje = null;
    try{
        clonedPersonaje = (Personaje) super.clone();
        clonedPersonaje.setClase(Clase);
        clonedPersonaje.setNivel(Nivel);
    } catch (CloneNotSupportedException e){
        e.printStackTrace();
    }
       return clonedPersonaje;
}
     public String HolaPersoanje() {
        return "Soy un " + getClase() + " y Tengo una experencia de nivel:  " + getNivel()
                + ". A por la victoria!!!";
    }  
    
}

