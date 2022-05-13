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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class UpEmpleados extends javax.swing.JPanel {

    private String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    boolean edition;
    String origId;
    private javax.swing.JTextField[] campos;
    private int numFecha = 3;
    private int numCargo = 4;
    private final String[] instrucciones = new String[]{
            "Ingrese el CURP",
            "Ingrese el Nombre completo",
            simpleDateFormat.format(new Date()),
            simpleDateFormat.format(new Date()),
            "<Seleccionar un cargp>",
            "Ingrese usuario",
            "Ingrese contraseña"
        };
    
    
    /**
     * Creates new form Principal
     */
    public UpEmpleados() {
        initComponents();

        edition = false;
        
        campos = new javax.swing.JTextField[]{
            curp,nombre,fecha_nacimiento,fecha_ingreso,txtAux,usuario,contraseña
                        };
        for(int i = 0; i<campos.length; i++){
            campos[i].setText(instrucciones[i]);
        }
        
    }
    
    public UpEmpleados(String[] empleado){
        initComponents();

        edition = true;
        
        campos = new javax.swing.JTextField[]{
            curp,nombre,fecha_nacimiento,fecha_ingreso,txtAux,usuario,contraseña
                        };
        
        for(int i = 0; i<campos.length; i++){
            campos[i].setText(empleado[i+1]);
        }
        
        if(txtAux.getText().equals(cboxCargo.getItemAt(1))){
            cboxCargo.setSelectedIndex(1);
        }
        if(txtAux.getText().equals(cboxCargo.getItemAt(2))){
            cboxCargo.setSelectedIndex(2);
        }
        
        origId = empleado[0];
        lblTitulo.setText("Actualizar nuevo empleado");
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

        txtAux = new javax.swing.JTextField();
        body = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
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
        fecha_nacimiento = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        fecha_ingreso = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        cboxCargo = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        usuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        Text5 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();

        txtAux.setText("jTextField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Agregar nuevo empleado");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 250, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Cargo");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

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
        add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 310, 10));

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
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 180, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Fecha nacimiento");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        fecha_nacimiento.setForeground(new java.awt.Color(102, 102, 102));
        fecha_nacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_nacimiento.setBorder(null);
        fecha_nacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fecha_nacimientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_nacimientoFocusLost(evt);
            }
        });
        add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 310, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Fecha ingreso");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        fecha_ingreso.setEditable(false);
        fecha_ingreso.setForeground(new java.awt.Color(102, 102, 102));
        fecha_ingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_ingreso.setBorder(null);
        fecha_ingreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fecha_ingresoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_ingresoFocusLost(evt);
            }
        });
        add(fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, 10));

        btnCancelar.setBackground(new java.awt.Color(18, 90, 173));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        btnCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cancelar");
        btnCancelar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 50));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("CURP");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        cboxCargo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cboxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecciona un cargo>", "Empleado", "Administrador" }));
        add(cboxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 180, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 10));

        usuario.setForeground(new java.awt.Color(102, 102, 102));
        usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario.setBorder(null);
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 310, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 310, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Contraseña");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        contraseña.setForeground(new java.awt.Color(102, 102, 102));
        contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraseña.setBorder(null);
        contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseñaFocusLost(evt);
            }
        });
        add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 310, 30));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Usuario");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 310, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    
    
    private static boolean isValidDate(String input) {
        String formatString = "yyyy-MM-dd";

        try {
            SimpleDateFormat format = new SimpleDateFormat(formatString);
            format.setLenient(false);
            format.parse(input);
        } catch (ParseException e) {
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }

        return true;
    }

    
    // SUBIR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        boolean algunDatoVacio = false;
        String[] subir = new String [campos.length];
        for(int i = 0; i < subir.length; i++){
            subir[i] = campos[i].getText();
            if(campos[i].getText().equals(instrucciones[i]) && i != numFecha && i!= numCargo){
                algunDatoVacio = true;
                break;
            }
        }
        
        subir[numCargo] = cboxCargo.getItemAt(cboxCargo.getSelectedIndex());
        
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
            if( !isValidDate(fecha_nacimiento.getText())){
                errores += "ERROR fecha de nacimiento invalida";
            }
            
            if(errores.length() > 0){
                javax.swing.JOptionPane.showMessageDialog(this, errores, "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(edition){
                    try {
                        ComunicacionBD.actualizarBD("empleados", subir, origId);
                        javax.swing.JOptionPane.showMessageDialog(this, 
                                "¡Empleado editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpBooks.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                }else{
                    try {
                        String[][] datos = ComunicacionBD.datosBD("empleados", "curp", subir[0] );
                        if(datos.length>0){
                            javax.swing.JOptionPane.showMessageDialog(this, "Empleado anteriormente registrado", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            ComunicacionBD.subirBD("empleados", subir);
                            javax.swing.JOptionPane.showMessageDialog(this,
                                    "¡Empleado registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(UpBooks.class.getName()).log(Level.SEVERE, null, ex);
                        javax.swing.JOptionPane.showMessageDialog(this, "Formato de fecha no válida,\n no es posible agregar el empleado", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        
                    }
                }
                
                Empleados p1 = new Empleados();
                p1.setSize(750, 430);
                p1.setLocation(0,0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
                content.requestFocus();
                
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

    private void fecha_nacimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_nacimientoFocusGained
        if(campos[2].getText().equals(instrucciones[2])){
            campos[2].setText("");
        }
    }//GEN-LAST:event_fecha_nacimientoFocusGained

    private void fecha_nacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_nacimientoFocusLost
        if(campos[2].getText().isEmpty()){
            campos[2].setText(instrucciones[2]);
        }
    }//GEN-LAST:event_fecha_nacimientoFocusLost

    private void fecha_ingresoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_ingresoFocusGained
        if(campos[3].getText().equals(instrucciones[3])){
            campos[3].setText("");
        }
    }//GEN-LAST:event_fecha_ingresoFocusGained

    private void fecha_ingresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_ingresoFocusLost
        if(campos[3].getText().isEmpty()){
            campos[3].setText(instrucciones[3]);
        }
    }//GEN-LAST:event_fecha_ingresoFocusLost

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        Empleados p1 = new Empleados();
                p1.setSize(750, 430);
                p1.setLocation(0,0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusGained
        if(campos[4].getText().equals(instrucciones[4])){
            campos[4].setText("");
        }
    }//GEN-LAST:event_usuarioFocusGained

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        if(campos[4].getText().isEmpty()){
            campos[4].setText(instrucciones[4]);
        }
    }//GEN-LAST:event_usuarioFocusLost

    private void contraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusGained
        if(campos[5].getText().equals(instrucciones[5])){
            campos[5].setText("");
        }
    }//GEN-LAST:event_contraseñaFocusGained

    private void contraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseñaFocusLost
        if(campos[5].getText().isEmpty()){
            campos[5].setText(instrucciones[5]);
        }
    }//GEN-LAST:event_contraseñaFocusLost

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel button;
    private javax.swing.JComboBox<String> cboxCargo;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField fecha_ingreso;
    private javax.swing.JTextField fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField txtAux;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
