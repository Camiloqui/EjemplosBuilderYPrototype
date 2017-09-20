/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Personajes.Creador;
import Personajes.ElfoExperto;
import Personajes.ElfoIntermedio;
import Personajes.ElfoPrincipiante;
import Personajes.MagoExperto;
import Personajes.MagoIntermedio;
import Personajes.MagoPrincipiante;
import Personajes.OrcoExperto;
import Personajes.OrcoIntermedio;
import Personajes.OrcoPrincipiante;
import Personajes.Personaje;
import Personajes.Prototype;
import Personajes.PrototypeCroncrete1;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author -Camilo
 */
public class Interfaz extends javax.swing.JFrame{

    /**
     * Creates new form NewJFrame
     */
    Creador creador = new Creador();

    private PrototypeCroncrete1 ms;
    ImageIcon orco1 = new ImageIcon("src/PersonajesImagenes/orco1.png");
    Icon iorco1 = new ImageIcon(orco1.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));

    ImageIcon orco2 = new ImageIcon("src/PersonajesImagenes/orco nivel intermedio.png");
    Icon iorco2 = new ImageIcon(orco2.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));

    ImageIcon orco3 = new ImageIcon("src/PersonajesImagenes/orco experto.jpg");
    Icon iorco3 = new ImageIcon(orco3.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));

    ImageIcon mago1 = new ImageIcon("src/PersonajesImagenes/mago3.png");
    Icon imago1 = new ImageIcon(mago1.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));
    ImageIcon mago2 = new ImageIcon("src/PersonajesImagenes/mago intermedio 1.png");
    Icon imago2 = new ImageIcon(mago2.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));
    ImageIcon mago3 = new ImageIcon("src/PersonajesImagenes/mago experto 1.png");
    Icon imago3 = new ImageIcon(mago3.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));

    ImageIcon elfo1 = new ImageIcon("src/PersonajesImagenes/elfo1.jpg");
    Icon ielfo1 = new ImageIcon(elfo1.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));

    ImageIcon elfo2 = new ImageIcon("src/PersonajesImagenes/elfo2 intermedio.jpg");
    Icon ielfo2 = new ImageIcon(elfo2.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));
    ImageIcon elfo3 = new ImageIcon("src/PersonajesImagenes/elfo3 experto.png");
    Icon ielfo3 = new ImageIcon(elfo3.getImage().getScaledInstance(124, 150, Image.SCALE_DEFAULT));
    ImageIcon icon;
   

    public Interfaz() {

        initComponents();
        ms = new PrototypeCroncrete1(this.jPanel1);

        jLabel1.setIcon(iorco1);
        jLabel3.setIcon(imago1);
        jLabel2.setIcon(ielfo1);
    }

    public int rndNum(int value) {
        int num = (int) Math.floor(Math.random() * value + 1);
        return num;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPersonajes = new javax.swing.ButtonGroup();
        GrupoDificultad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        etiqueta = new javax.swing.JTextPane();
        rbtnOrco = new javax.swing.JRadioButton();
        rbtnMago = new javax.swing.JRadioButton();
        rbtnElfo = new javax.swing.JRadioButton();
        btnAtras = new javax.swing.JButton();
        rbtnPrincipiante = new javax.swing.JRadioButton();
        rbtnIntermedio = new javax.swing.JRadioButton();
        rbtnExperto = new javax.swing.JRadioButton();
        jTextCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etiqueta2 = new javax.swing.JTextPane();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 0));
        jLabel2.setPreferredSize(new java.awt.Dimension(145, 245));

        jLabel3.setPreferredSize(new java.awt.Dimension(145, 245));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setPreferredSize(new java.awt.Dimension(145, 245));

        etiqueta.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        etiqueta.setText("Elige un personaje:");
        jScrollPane2.setViewportView(etiqueta);

        grupoPersonajes.add(rbtnOrco);
        rbtnOrco.setText("Orco");

        grupoPersonajes.add(rbtnMago);
        rbtnMago.setText("Mago");

        grupoPersonajes.add(rbtnElfo);
        rbtnElfo.setText("Elfo");
        rbtnElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnElfoActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.setVisible(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        GrupoDificultad.add(rbtnPrincipiante);
        rbtnPrincipiante.setText("Principiante");
        rbtnPrincipiante.setAutoscrolls(true);
        rbtnPrincipiante.setBorderPainted(true);
        rbtnPrincipiante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbtnPrincipiante.setVisible(false);
        rbtnPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPrincipianteActionPerformed(evt);
            }
        });

        GrupoDificultad.add(rbtnIntermedio);
        rbtnIntermedio.setText("Intermedio");
        rbtnIntermedio.setVisible(false);

        GrupoDificultad.add(rbtnExperto);
        rbtnExperto.setText("Experto");
        rbtnExperto.setVisible(false);

        jTextCantidad.setToolTipText("");
        jTextCantidad.setVisible(false);

        jScrollPane1.setVisible(false);
        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        etiqueta2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        etiqueta2.setText("Cantidad:");
        etiqueta2.setVisible(false);
        jScrollPane1.setViewportView(etiqueta2);

        btnAceptar.setText("Aceptar");
        btnAceptar.setVisible(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnPrincipiante)
                                        .addGap(160, 160, 160)
                                        .addComponent(rbtnIntermedio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(rbtnMago)
                                        .addGap(158, 158, 158)))
                                .addComponent(rbtnElfo)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(rbtnOrco)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                        .addComponent(btnAceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras)
                        .addGap(416, 416, 416)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnExperto)
                            .addComponent(btnSiguiente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAceptar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnOrco)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnPrincipiante)
                            .addComponent(rbtnExperto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras)
                            .addComponent(btnSiguiente))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnMago)
                            .addComponent(rbtnElfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnIntermedio)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        try {
            int x = Integer.parseInt(jTextCantidad.getText());
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            rbtnPrincipiante.setVisible(false);
            rbtnIntermedio.setVisible(false);
            rbtnExperto.setVisible(false);
            btnAceptar.setVisible(false);
            etiqueta.setVisible(false);
            etiqueta2.setVisible(false);
            jScrollPane2.setVisible(false);
            jScrollPane1.setVisible(false);
            jTextCantidad.setVisible(false);
            
            Personaje orco = creador.getPersonaje();
            Personaje[] principiante = new Personaje[x];

            for (int i = 0; i < x; i++) {

                principiante[i] = orco.clone();
                System.out.println(principiante[i].HolaPersoanje());
               ms.Nuevo_Objeto(icon);
//                Prototype tmp = new Prototype("Objeto " + i, (ImageIcon) icon);
//                tmp.setLocation(rndNum(this.jPanel1.getWidth() - tmp.getWidth()), rndNum(this.jPanel1.getHeight() - tmp.getHeight()));
//                this.jPanel1.add(tmp);
//
//                this.jPanel1.repaint();
            }

        } catch (Exception e) {
            System.out.println("Escriba un numero entero");
             
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rbtnPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPrincipianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnPrincipianteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        ImageIcon orco1 = new ImageIcon("src/PersonajesImagenes/orco1.png");
        Icon iorco1 = new ImageIcon(orco1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        ImageIcon mago1 = new ImageIcon("src/PersonajesImagenes/mago3.png");
        Icon imago1 = new ImageIcon(mago1.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));

        ImageIcon elfo1 = new ImageIcon("src/PersonajesImagenes/elfo1.jpg");
        Icon ielfo1 = new ImageIcon(elfo1.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));

        rbtnOrco.setVisible(true);
        rbtnMago.setVisible(true);
        rbtnElfo.setVisible(true);
        rbtnPrincipiante.setVisible(false);
        rbtnIntermedio.setVisible(false);
        rbtnExperto.setVisible(false);
        jLabel2.setIcon(ielfo1); // NOI18N

        jLabel3.setIcon(imago1); // NOI18N

        jLabel1.setIcon(iorco1); // NOI18N

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void rbtnElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnElfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnElfoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:

        int n1 = 0;
        int n2;
        int n3;
        String Personaje = "";

        btnAtras.setVisible(true);
        rbtnOrco.setVisible(false);
        rbtnMago.setVisible(false);
        rbtnElfo.setVisible(false);
        rbtnPrincipiante.setVisible(true);
        rbtnIntermedio.setVisible(true);
        rbtnExperto.setVisible(true);
        if (rbtnOrco.isSelected()) {

            jLabel3.setIcon(iorco2);
            jLabel2.setIcon(iorco3); // NOI18N
            n1 = 1;

        }
        if (rbtnElfo.isSelected()) {
            jLabel1.setIcon(ielfo1); // NOI18N

            jLabel2.setIcon(ielfo3); // NOI18N

            jLabel3.setIcon(ielfo2); // NOI18N
            n1 = 2;

        }
        if (rbtnMago.isSelected()) {
            jLabel1.setIcon(imago1); // NOI18N

            jLabel2.setIcon(imago3); // NOI18N

            jLabel3.setIcon(imago2); // NOI18N
            n1 = 3;
        }
        if (rbtnPrincipiante.isSelected()) {
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            rbtnIntermedio.setVisible(false);
            rbtnExperto.setVisible(false);
            etiqueta.setText("Usted Eligio El Siguiente Personaje");
            btnSiguiente.setVisible(false);
            btnAceptar.setVisible(true);
            btnAtras.setVisible(false);
            etiqueta2.setVisible(true);
            jScrollPane1.setVisible(true);
            jTextCantidad.setVisible(true);

            switch (n1) {
                case 1:
                    creador.setConstructor(new OrcoPrincipiante());
                    creador.construirPersonaje();
                    icon = (ImageIcon) iorco1;
                    break;
                case 2:
                    creador.setConstructor(new ElfoPrincipiante());
                    creador.construirPersonaje();
                    icon = (ImageIcon) ielfo1;
                    break;
                case 3:
                    creador.setConstructor(new MagoPrincipiante());
                    creador.construirPersonaje();
                    icon = (ImageIcon) imago1;
                    break;
                default:

            }
        }
        if (rbtnIntermedio.isSelected()) {
            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            rbtnPrincipiante.setVisible(false);
            rbtnExperto.setVisible(false);
            etiqueta.setText("Usted Eligio El Siguiente Personaje");
            btnSiguiente.setVisible(false);
            btnAceptar.setVisible(true);
            btnAtras.setVisible(false);
            etiqueta2.setVisible(true);
            jScrollPane1.setVisible(true);
            jTextCantidad.setVisible(true);
            switch (n1) {
                case 1:
                    creador.setConstructor(new OrcoIntermedio());
                    creador.construirPersonaje();
                    icon = (ImageIcon) iorco2;
                    break;
                case 2:
                    creador.setConstructor(new ElfoIntermedio());
                    creador.construirPersonaje();
                    icon = (ImageIcon) ielfo2;
                    break;
                case 3:
                    creador.setConstructor(new MagoIntermedio());
                    creador.construirPersonaje();
                    icon = (ImageIcon) imago2;
                    break;
                default:

            }
        }
        if (rbtnExperto.isSelected()) {
            jLabel3.setVisible(false);
            jLabel1.setVisible(false);
            rbtnIntermedio.setVisible(false);
            rbtnPrincipiante.setVisible(false);
            etiqueta.setText("Usted Eligio El Siguiente Personaje");
            btnSiguiente.setVisible(false);

            btnAceptar.setVisible(true);
            btnAtras.setVisible(false);
            jScrollPane1.setVisible(true);
            etiqueta2.setVisible(true);
            jTextCantidad.setVisible(true);
            switch (n1) {
                case 1:
                    creador.setConstructor(new OrcoExperto());
                    creador.construirPersonaje();
                    icon = (ImageIcon) iorco3;
                    break;
                case 2:
                    creador.setConstructor(new ElfoExperto());
                    creador.construirPersonaje();
                    icon = (ImageIcon) ielfo3;
                    break;
                case 3:
                    creador.setConstructor(new MagoExperto());
                    creador.construirPersonaje();
                    icon = (ImageIcon) imago3;
                    break;
                default:

            }
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if (evt.isShiftDown()) {
            

        }


    }//GEN-LAST:event_jPanel1MouseClicked

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoDificultad;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JTextPane etiqueta;
    private javax.swing.JTextPane etiqueta2;
    private javax.swing.ButtonGroup grupoPersonajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JRadioButton rbtnElfo;
    private javax.swing.JRadioButton rbtnExperto;
    private javax.swing.JRadioButton rbtnIntermedio;
    private javax.swing.JRadioButton rbtnMago;
    private javax.swing.JRadioButton rbtnOrco;
    private javax.swing.JRadioButton rbtnPrincipiante;
    // End of variables declaration//GEN-END:variables

 
}
