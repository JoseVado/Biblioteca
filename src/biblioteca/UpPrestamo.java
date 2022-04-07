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
public class UpPrestamo extends javax.swing.JPanel {
    String[] multa;
    final int COLUMNA_TIEMPO_PRESTAMO = 5;
    final int COLUMNA_FECHA_SALIDA = 3;
    final int COLUMNA_FECHA_REGRESO = 4;
    
    final String valorTiempo = "Ingrese cuantos días es el prestamo";
    /**
     * Creates new form Principal
     */
    
    public UpPrestamo(String[] prestamo) {
        initComponents();
        
        this.multa = prestamo;
        fechaRegreso.setEditable(false);
        tiempoPrestamo.setText(multa[COLUMNA_TIEMPO_PRESTAMO]);
        fechaRegreso.setText(multa[COLUMNA_FECHA_REGRESO]);

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
        tiempoPrestamo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        fechaRegreso = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Registrar nuevo Usuario");
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
        jLabel1.setText("Actualizar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Tiempo de prestamo");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        tiempoPrestamo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tiempoPrestamo.setForeground(new java.awt.Color(102, 102, 102));
        tiempoPrestamo.setText("Ingrese el nombre");
        tiempoPrestamo.setBorder(null);
        tiempoPrestamo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tiempoPrestamoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tiempoPrestamoFocusLost(evt);
            }
        });
        add(tiempoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Día de regreso (actual)");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        fechaRegreso.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaRegreso.setForeground(new java.awt.Color(102, 102, 102));
        fechaRegreso.setText("Ingrese el apellido paterno");
        fechaRegreso.setBorder(null);
        add(fechaRegreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 260, 10));

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

        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    
    // REGISTRAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed

        String tiempo = tiempoPrestamo.getText();
        String[] multaActualizada = new String[multa.length -1];
        for(int i = 1; i<multa.length; i++)
            multaActualizada[i-1] = multa[i];

        if(tiempo.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else if( !tiempo.matches("^\\d+$") ){
                javax.swing.JOptionPane.showMessageDialog(this, "El tiempo debe ser un valor numerico positivo", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{ 
            try {
                Date ahora = new SimpleDateFormat("yyyy-MM-dd").parse(multa[COLUMNA_FECHA_SALIDA]);  
                Date devol = Prestar.sumarFechasDias(ahora, Integer.parseInt(tiempo));
                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        
                multaActualizada[COLUMNA_TIEMPO_PRESTAMO-1] = tiempo;
                multaActualizada[COLUMNA_FECHA_REGRESO-1] = formateador.format(devol);
                    
                ComunicacionBD.actualizarBD("prestamos",multaActualizada, multa[0]);
                javax.swing.JOptionPane.showMessageDialog(this, "¡Prestamo editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                Prestamos p1 = new Prestamos();
                p1.setSize(750, 430);
                p1.setLocation(0, 0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
                    
            } catch (SQLException ex) {
                    Logger.getLogger(UpPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(UpPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
    }//GEN-LAST:event_buttonMousePressed

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        Prestamos p1 = new Prestamos();
        p1.setSize(750, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void tiempoPrestamoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tiempoPrestamoFocusGained
        if(tiempoPrestamo.getText().equals(valorTiempo))
            tiempoPrestamo.setText("");
    }//GEN-LAST:event_tiempoPrestamoFocusGained

    private void tiempoPrestamoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tiempoPrestamoFocusLost
        if(fechaRegreso.getText().isEmpty())
            fechaRegreso.setText(valorTiempo);
    }//GEN-LAST:event_tiempoPrestamoFocusLost
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel button;
    private javax.swing.JTextField fechaRegreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField tiempoPrestamo;
    // End of variables declaration//GEN-END:variables
}