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
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Antonio
 */
public class UpBooks extends javax.swing.JPanel {

    boolean edition;
    String origId;
    private javax.swing.JTextField[] campos;
    
    private String pattern = "yyyy/MM/dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    private final String[] instrucciones = new String[]{
            "Ingrese el ISBN del Libro",
            "Ingrese el Título",
            "Ingrese el Autor/es",
            "Ingrese las Categorias separadas por coma",
            "Ingrese la Cantidad total",
            "Ingrese los Disponibles",
            "Ingrese la descripción del Libro",
            simpleDateFormat.format(new Date())
        };
    
    
    /**
     * Creates new form Principal
     */
    public UpBooks() {
        initComponents();

        edition = false;
        
        campos = new javax.swing.JTextField[]{
            isbn,titulo,autor,categorias,cantidad,disponibles,descripcion,fecha
                        };
        
        for(int i = 0; i<campos.length; i++){
            campos[i].setText(instrucciones[i]);
        } 
    }
    
    public UpBooks(String[] libro){
        initComponents();

        edition = true;
        
        campos = new javax.swing.JTextField[]{
            isbn,titulo,autor,categorias,cantidad,disponibles,descripcion,fecha
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
        isbn = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        autor = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        categorias = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text9 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        disponibles = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        Text10 = new javax.swing.JLabel();
        Text12 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        Text14 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();

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

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 260, 50));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("ISBN");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        isbn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isbn.setForeground(new java.awt.Color(102, 102, 102));
        isbn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isbn.setBorder(null);
        isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isbnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                isbnFocusLost(evt);
            }
        });
        add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 310, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Título");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 102, 102));
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo.setBorder(null);
        titulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tituloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tituloFocusLost(evt);
            }
        });
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 310, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Autor");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        autor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        autor.setForeground(new java.awt.Color(102, 102, 102));
        autor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        autor.setBorder(null);
        autor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                autorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                autorFocusLost(evt);
            }
        });
        add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 310, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 310, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Categorias");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        categorias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        categorias.setForeground(new java.awt.Color(102, 102, 102));
        categorias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categorias.setBorder(null);
        categorias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                categoriasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                categoriasFocusLost(evt);
            }
        });
        add(categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 310, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, 10));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Cantidad");
        add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        cantidad.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cantidad.setForeground(new java.awt.Color(102, 102, 102));
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.setBorder(null);
        cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantidadFocusLost(evt);
            }
        });
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 30));

        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, 10));

        disponibles.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        disponibles.setForeground(new java.awt.Color(102, 102, 102));
        disponibles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        disponibles.setBorder(null);
        disponibles.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                disponiblesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                disponiblesFocusLost(evt);
            }
        });
        add(disponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 140, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 140, 10));

        Text10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text10.setText("Disponibles");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Descripción");
        add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descripcion.setForeground(new java.awt.Color(102, 102, 102));
        descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcion.setBorder(null);
        descripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionFocusLost(evt);
            }
        });
        add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 260, 180));

        jSeparator13.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator13.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 260, 10));

        Text14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text14.setText("Fecha de ingreso");
        add(Text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fecha.setForeground(new java.awt.Color(102, 102, 102));
        fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha.setBorder(null);
        fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fechaMousePressed(evt);
            }
        });
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 260, 30));

        jSeparator15.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator15.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void fechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaMousePressed

    }//GEN-LAST:event_fechaMousePressed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

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
            if( !isbn.getText().matches("^\\d+$") ){
                errores += "ERROR isbn invalido\n";
            }
            if( !titulo.getText().matches("^[a-zA-Z0-9\\s]+$") ){
                errores += "ERROR titulo debe ser alfanumerico\n";
            }
            if( !autor.getText().matches("^[a-zA-Z.\\s]+$") ){
                errores += "ERROR autor debe ser alfabetico\n";
            }
            if( !cantidad.getText().matches("^\\d+$") ){
                errores += "ERROR cantidad invalida\n";
            }
            if( !disponibles.getText().matches("^\\d+$")){
                errores += "ERROR disponibles invalida\n";
            }
            
            if(errores.length() > 1){
                javax.swing.JOptionPane.showMessageDialog(this, errores, "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }else{
                if(edition){
                    try {
                        ComunicacionBD.actualizarBD("libros", subir, origId);
                        javax.swing.JOptionPane.showMessageDialog(this, 
                                "¡Libro editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpBooks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    try {
                        ComunicacionBD.subirBD("libros", subir);
                        javax.swing.JOptionPane.showMessageDialog(this,
                                "¡Libro registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException ex) {
                        Logger.getLogger(UpBooks.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                Libros p1 = new Libros();
                p1.setSize(750, 430);
                p1.setLocation(0,0);

                content.removeAll();
                content.add(p1, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
                
            }
        }
    }//GEN-LAST:event_buttonMousePressed

    private void isbnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFocusGained
        if(campos[0].getText().equals(instrucciones[0])){
            campos[0].setText("");
        }
    }//GEN-LAST:event_isbnFocusGained

    private void isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFocusLost
        if(campos[0].getText().isEmpty()){
            campos[0].setText(instrucciones[0]);
        }
    }//GEN-LAST:event_isbnFocusLost

    private void tituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tituloFocusGained
        if(campos[1].getText().equals(instrucciones[1])){
            campos[1].setText("");
        }
    }//GEN-LAST:event_tituloFocusGained

    private void tituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tituloFocusLost
        if(campos[1].getText().isEmpty()){
            campos[1].setText(instrucciones[1]);
        }
    }//GEN-LAST:event_tituloFocusLost

    private void autorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_autorFocusGained
        if(campos[2].getText().equals(instrucciones[2])){
            campos[2].setText("");
        }
    }//GEN-LAST:event_autorFocusGained

    private void autorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_autorFocusLost
        if(campos[2].getText().isEmpty()){
            campos[2].setText(instrucciones[2]);
        }
    }//GEN-LAST:event_autorFocusLost

    private void categoriasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_categoriasFocusGained
        if(campos[3].getText().equals(instrucciones[3])){
            campos[3].setText("");
        }
    }//GEN-LAST:event_categoriasFocusGained

    private void categoriasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_categoriasFocusLost
        if(campos[3].getText().isEmpty()){
            campos[3].setText(instrucciones[3]);
        }
    }//GEN-LAST:event_categoriasFocusLost

    private void cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusGained
        if(campos[4].getText().equals(instrucciones[4])){
            campos[4].setText("");
        }
    }//GEN-LAST:event_cantidadFocusGained

    private void cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusLost
        if(campos[4].getText().isEmpty()){
            campos[4].setText(instrucciones[4]);
        }
    }//GEN-LAST:event_cantidadFocusLost

    private void disponiblesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disponiblesFocusGained
        if(campos[5].getText().equals(instrucciones[5])){
            campos[5].setText("");
        }
    }//GEN-LAST:event_disponiblesFocusGained

    private void disponiblesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disponiblesFocusLost
        if(campos[5].getText().isEmpty()){
            campos[5].setText(instrucciones[5]);
        }
    }//GEN-LAST:event_disponiblesFocusLost

    private void descripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionFocusGained
        if(campos[6].getText().equals(instrucciones[6])){
            campos[6].setText("");
        }
    }//GEN-LAST:event_descripcionFocusGained

    private void descripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionFocusLost
        if(campos[6].getText().isEmpty()){
            campos[6].setText(instrucciones[6]);
        }
    }//GEN-LAST:event_descripcionFocusLost

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text14;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField autor;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField categorias;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField disponibles;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
