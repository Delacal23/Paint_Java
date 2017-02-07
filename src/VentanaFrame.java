
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delacal_23
 */
public class VentanaFrame extends javax.swing.JFrame {

   
    BufferedImage buffer = null;
    BufferedImage buffer2 = null;
    
    Graphics2D bufferGraphics,buffer2Graphics, lienzoGraphics = null;
    
    
    Color colorseleccionado = Color.black;
    
    
    int formaSeleccionada = 0;
    
    
    Circulo  miCirculo;
    Cuadrado miCuadrado;
    
    
    
    
    public VentanaFrame() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(640,450);
        
        
        
        
    }
    
    private void inicializaBuffers () {
        
    lienzoGraphics = (Graphics2D )lienzo.getGraphics();   
    // creo una imagen del mismo ancho y alto que el lienzo
    buffer = (BufferedImage) lienzo.createImage(lienzo.getWidth (), lienzo.getHeight());
    
    //  crea una imagen  modificable 
    bufferGraphics = buffer.createGraphics();
    
    // dibujamos un  rectangulo blanco del tamaño del lienzo
    bufferGraphics.setColor(Color.white);
    bufferGraphics.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
    
    
    
    
     // creo una imagen del mismo ancho y alto que el lienzo
    buffer2 = (BufferedImage) lienzo.createImage(lienzo.getWidth (), lienzo.getHeight());
    
    //  crea una imagen  modificable 
    buffer2Graphics = buffer2.createGraphics();
    
    // dibujamos un  rectangulo blanco del tamaño del lienzo
    buffer2Graphics.setColor(Color.white);
    buffer2Graphics.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
    
    
    
     

    
    
}
   
    
    
    //Override modificamos  un metodo manteniendo sus caracteristicas (con super.paint mantiene sus carecteristicas).
    @Override
    public void  paint ( Graphics g) {
        super.paint(g);
        //apuntamos al lienzo 
        lienzoGraphics.drawImage(buffer, 0, 0, null);
    }
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lienzo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bottonCuadrado = new javax.swing.JButton();
        bottonCirculo = new javax.swing.JButton();

        jButton2.setText("Aceptar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(133, 133, 133))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lienzo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N
        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jButton1.setText("Color");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        bottonCuadrado.setText("Circulo");
        bottonCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bottonCuadradoMousePressed(evt);
            }
        });

        bottonCirculo.setText("Cuadrado");
        bottonCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bottonCirculoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bottonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottonCirculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(bottonCuadrado)
                    .addComponent(bottonCirculo))
                .addGap(12, 12, 12)
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        
        switch (formaSeleccionada){
            case 0:
            miCirculo = new Circulo (evt.getX(),evt.getY(),1,colorseleccionado,true); 
            miCirculo.dibujate(bufferGraphics);
            break;
            case 1:
            miCuadrado = new Cuadrado (evt.getX(),evt.getY(),1,colorseleccionado,true);
            miCuadrado.dibujate(bufferGraphics);
            break;
        }
        repaint(0,0,1,1);
    }//GEN-LAST:event_lienzoMousePressed

    
    
    //El movimiento de crear el circulo arrastrandolo.
    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
   
       //borro lo que hibiera en el lienzo
       // g2.fillRect(0, 0, buffer.getWidth(), buffer.getHeight());
       bufferGraphics.drawImage(buffer2, 0, 0, null);
       
            switch (formaSeleccionada){
            case 0:
            int radio = Math.abs ((int) miCirculo.x - evt.getX());
            miCirculo.width = radio ;
            miCirculo.height =radio ;
            miCirculo.dibujate(bufferGraphics);
            break;
            
            case 1:
            int lado = Math.abs ((int) miCuadrado.x - evt.getX());
            miCuadrado.width = lado ;
            miCuadrado.height =lado ;
            miCuadrado.dibujate(bufferGraphics);
            break;
            
            }
 
        
        lienzoGraphics.drawImage(buffer, 0, 0, null);
        repaint(0,0,1,1);
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
       Graphics2D g2 =  (Graphics2D) buffer2.getGraphics();
    switch (formaSeleccionada){
            case 0:  
            miCirculo.dibujate(buffer2Graphics);
            break;
            case 1:
            miCuadrado.dibujate(buffer2Graphics);
            break;
        }
    }//GEN-LAST:event_lienzoMouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    
    //Boton aceptar color
    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        colorseleccionado = jColorChooser1.getColor();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2MousePressed

    
    
    //Boton Cancelar Color
    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void bottonCuadradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottonCuadradoMousePressed
        formaSeleccionada = 0;
    }//GEN-LAST:event_bottonCuadradoMousePressed

    private void bottonCirculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bottonCirculoMousePressed
        formaSeleccionada = 1;
    }//GEN-LAST:event_bottonCirculoMousePressed
 
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonCirculo;
    private javax.swing.JButton bottonCuadrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
}
