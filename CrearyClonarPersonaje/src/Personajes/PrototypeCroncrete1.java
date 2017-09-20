/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author -Camilo
 */
public class PrototypeCroncrete1 {
    /** COntador interno de objetos */
    private int contador_de_objetos = 0;
    /** Los objetos se almacenaran en un MAP */
    private Map map = new HashMap();   
    /** JPanel */
    private JPanel contenedor;
    /** DefaultListModel */
    
    
    /** Constructor de clase 
     * @param JPanel Donde se colocaran los objetos
     * @param DefaultListModel Aqui se almacenaran los key (identificadores) de objetos
     */
    public PrototypeCroncrete1(JPanel jpanel ){
        this.contenedor = jpanel;
       
    }
    
    /**
     * Metodo que crea un nuevo objeto
     */
    public void Nuevo_Objeto(ImageIcon Icon)
    {
//        ImageIcon orco1 = new ImageIcon("src/PersonajesImagenes/orco1.png");
//     Icon iorco1 = new ImageIcon(orco1.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));
        ImageIcon icon= Icon; 
        //aumenta contador en +1        
        this.contador_de_objetos +=1;
        //Crea una nueva instancia de "MiObjeto"
        Prototype tmp = new Prototype( "Objeto " + this.contador_de_objetos , (ImageIcon) icon);
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation( rndNum( this.contenedor.getWidth() - tmp.getWidth() )  , rndNum(this.contenedor.getHeight()-tmp.getHeight() ) );        
        //agrega el objeto en el MAP
        map.put("Objeto " + this.contador_de_objetos, tmp );        
        //agrega el KEY en el List
        
        //agrega el objeto en el JPanel
        this.contenedor.add(tmp);
        //actualiza graficos
        this.contenedor.repaint();
    }
    public int rndNum( int value ){
        int num = (int) Math.floor(Math.random()*value+1);            
        return num;
    }
}
