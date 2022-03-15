/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static biblioteca.Dashboard.content;

/**
 *
 * @author Antonio
 */
public class UpClients extends javax.swing.JPanel {

    boolean edition;
    String origId;
    private javax.swing.JTextField[] campos;
    private final String[] instrucciones = new String[]{
            "Ingrese el CURP",
            "Ingrese el Nombre completo",
            "Ingrese el Domicilio",
            "Ingrese el Teléfono",
            "Ingrese el Correo electronico",
            "0"
        };
    
    
    /**
     * Creates new form Principal
     */
    public UpClients() {
        initComponents();

        edition = false;
        
        campos = new javax.swing.JTextField[]{
            curp,nombre,domicilio,telefono,correo,sanciones
                        };
        
        for(int i = 0; i<campos.length; i++){
            campos[i].setText(instrucciones[i]);
        } 
        sanciones.setEditable(false);
    }
    
    public UpClients(String[] libro){
        initComponents();

        edition = true;
        
        campos = new javax.swing.JTextField[]{
            curp,nombre,domicilio,telefono,correo,sanciones
                        };
        
        for(int i = 0; i<campos.length; i++){
            campos[i].setText(libro[i+1]);
        }  
        origId = libro[0];
        
        jLabel1.setText("Guardar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        curp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        domicilio = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        sanciones = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Subir nuevo Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 10, 350));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMousePressed(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subir");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 30));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("CURP");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        curp.setForeground(new java.awt.Color(102, 102, 102));
        curp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        curp.setBorder(null);
        curp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                curpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                curpFocusLost(evt);
            }
        });
        add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Nombre");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Domicilio");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        domicilio.setForeground(new java.awt.Color(102, 102, 102));
        domicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        domicilio.setBorder(null);
        domicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                domicilioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                domicilioFocusLost(evt);
            }
        });
        add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Teléfono");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        telefono.setForeground(new java.awt.Color(102, 102, 102));
        telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono.setBorder(null);
        telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoFocusLost(evt);
            }
        });
        add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 310, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Correo electronico");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        correo.setForeground(new java.awt.Color(102, 102, 102));
        correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo.setBorder(null);
        correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoFocusLost(evt);
            }
        });
        add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 310, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 310, 10));

        sanciones.setForeground(new java.awt.Color(102, 102, 102));
        sanciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sanciones.setBorder(null);
        sanciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sancionesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sancionesFocusLost(evt);
            }
        });
        add(sanciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 310, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 310, 10));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Sanciones");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    // SUBIR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        boolean algunDatoVacio = false;
        String[] subir = new String [campos.length];
        for(int i = 0; i < campos.length-1; i++){
            subir[i] = campos[i].getText();
            if(campos[i].getText().equals(instrucciones[i])){
                algunDatoVacio = true;
                break;
            }
        }
        subir[campos.length-1] = campos[campos.length-1].getText();
        
        if(algunDatoVacio){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            String errores = "";
            if( !curp.getText().matches("^[a-zA-Z0-9\\s]+$") ){
                errores += "ERROR curp invalido\n";
            }
            if( !nombre.getText().matches("^[a-zA-Z\\s]+$") ){
                errores += "ERROR nombre debe ser alfabetico\n";
            }
            if( !telefono.getText().matches("^\\d+$")){
                errores += "ERROR teléfono debe ser númerico\n";
            }
            if( !correo.getText().matches("^(.+)@(.+)$") ){
                errores += "ERROR correo invalida\n";
            }
            if( !sanciones.getText().matches("^\\d+$")){
                errores += "ERROR sanciones invalidas\n";
            }
            
            if(errores.length() > 1){
                javax.swing.JOptionPane.showMessageDialog(this, errores, "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(edition){
                    try {
                        ComunicacionBD.actualizarBD("usuarios", subir, origId);
                        javax.swing.JOptionPane.showMessageDialog(this, 
                                "¡Cliente editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpBooks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    try {
                        ComunicacionBD.subirBD("usuarios", subir);
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "¡Cliente registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpBooks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                Clientes p1 = new Clientes();
                p1.setSize(750, 430);
                p1.setLocation(0,0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
                
            }
        }
    }//GEN-LAST:event_buttonMousePressed

    private void curpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_curpFocusGained
        if(campos[0].getText().equals(instrucciones[0])){
            campos[0].setText("");
        }
    }//GEN-LAST:event_curpFocusGained

    private void curpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_curpFocusLost
        if(campos[0].getText().isEmpty()){
            campos[0].setText(instrucciones[0]);
        }
    }//GEN-LAST:event_curpFocusLost

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
        if(campos[1].getText().equals(instrucciones[1])){
            campos[1].setText("");
        }
    }//GEN-LAST:event_nombreFocusGained

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        if(campos[1].getText().isEmpty()){
            campos[1].setText(instrucciones[1]);
        }
    }//GEN-LAST:event_nombreFocusLost

    private void domicilioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_domicilioFocusGained
        if(campos[2].getText().equals(instrucciones[2])){
            campos[2].setText("");
        }
    }//GEN-LAST:event_domicilioFocusGained

    private void domicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_domicilioFocusLost
        if(campos[2].getText().isEmpty()){
            campos[2].setText(instrucciones[2]);
        }
    }//GEN-LAST:event_domicilioFocusLost

    private void telefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFocusGained
        if(campos[3].getText().equals(instrucciones[3])){
            campos[3].setText("");
        }
    }//GEN-LAST:event_telefonoFocusGained

    private void telefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFocusLost
        if(campos[3].getText().isEmpty()){
            campos[3].setText(instrucciones[3]);
        }
    }//GEN-LAST:event_telefonoFocusLost

    private void correoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusLost
        if(campos[4].getText().isEmpty()){
            campos[4].setText(instrucciones[4]);
        }
    }//GEN-LAST:event_correoFocusLost

    private void correoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoFocusGained
        if(campos[4].getText().equals(instrucciones[4])){
            campos[4].setText("");
        }
    }//GEN-LAST:event_correoFocusGained

    private void sancionesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sancionesFocusLost
        if(campos[5].getText().isEmpty()){
            campos[5].setText(instrucciones[5]);
        }
    }//GEN-LAST:event_sancionesFocusLost

    private void sancionesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sancionesFocusGained
        if(campos[5].getText().equals(instrucciones[5])){
            campos[5].setText("");
        }
    }//GEN-LAST:event_sancionesFocusGained

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField domicilio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField sanciones;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
