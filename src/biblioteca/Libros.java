/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static biblioteca.Dashboard.content;
import java.awt.BorderLayout;
import javax.swing.ListSelectionModel;


public class Libros extends javax.swing.JPanel {

    private static final String tabla = "libros";
    private static final String busquedaTexto = "Ingrese el ISBN o del Titulo del libro a buscar";
    
    private static final String[] datosTabla = new String [] {
            "Folio", "ISBN", "Titulo", "Autor", "Categorías", "Cantidad", "Disponible", "Descripición",
            "Fecha de ingreso"
            } ; 

    /**
     * Creates new form Principal
     */
    public Libros() {
        initComponents();
        try {
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                            ComunicacionBD.datosBD(tabla),datosTabla));
            jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jSeparator2 = new javax.swing.JSeparator();
        bid = new javax.swing.JTextField();
        btnBuscarLibro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarLibro = new javax.swing.JPanel();
        labelAgregar = new javax.swing.JLabel();
        btnModificarLibro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        eliminar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Libros");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        bid.setForeground(new java.awt.Color(102, 102, 102));
        bid.setText("Ingrese el ISBN o del Titulo del libro a buscar");
        bid.setBorder(null);
        bid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bidFocusLost(evt);
            }
        });
        add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        btnBuscarLibro.setBackground(new java.awt.Color(102, 51, 0));
        btnBuscarLibro.setToolTipText("");
        btnBuscarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarLibroMousePressed(evt);
            }
        });
        btnBuscarLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar");
        btnBuscarLibro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(btnBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        btnAgregarLibro.setBackground(new java.awt.Color(102, 51, 0));
        btnAgregarLibro.setToolTipText("");
        btnAgregarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMousePressed(evt);
            }
        });
        btnAgregarLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAgregar.setForeground(new java.awt.Color(255, 255, 255));
        labelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAgregar.setText("Nuevo");
        btnAgregarLibro.add(labelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(btnAgregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 80, -1));

        btnModificarLibro.setBackground(new java.awt.Color(102, 51, 0));
        btnModificarLibro.setToolTipText("");
        btnModificarLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarLibroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarLibroMousePressed(evt);
            }
        });
        btnModificarLibro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar");
        btnModificarLibro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

        add(btnModificarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 110, -1));

        eliminar.setBackground(new java.awt.Color(102, 51, 0));
        eliminar.setToolTipText("");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarMousePressed(evt);
            }
        });
        eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Eliminar");
        eliminar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, -1));

        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 90, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ISBN", "Titulo", "Autor", "Categoría", "Cantidad", "Disponible", "Descripcion", "Fecha de ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(3);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(3);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 730, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMousePressed
        // Abrir sección
        UpBooks p1 = new UpBooks();
        p1.setSize(750, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnAgregarLibroMousePressed

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        setColor(eliminar);
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        resetColor(eliminar);
    }//GEN-LAST:event_eliminarMouseExited
    
    
    
    // BORRAR
    private void eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMousePressed
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{                
                String list[][] = ComunicacionBD.datosBD(tabla);
                
                String id = list[idcell][0];
                
                if(id.isEmpty()){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    int aceptar = javax.swing.JOptionPane.showConfirmDialog(this, "¿Desea eliminar estos libros?", "ELIMINAR", javax.swing.JOptionPane.WARNING_MESSAGE);
                    if(aceptar == javax.swing.JOptionPane.YES_OPTION){
                        ComunicacionBD.eliminarBD(tabla, id);
                        javax.swing.JOptionPane.showMessageDialog(this, "¡Libro borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                ComunicacionBD.datosBD(tabla),datosTabla));
                        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    }
                   
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarMousePressed

    // EDITAR
    private void btnModificarLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarLibroMousePressed
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{

                String list[][] = ComunicacionBD.datosBD(tabla);
                String id = list[idcell][0];
                
                if(id.isEmpty()){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
           
                    UpBooks p1 = new UpBooks(list[idcell]);
                    p1.setSize(750, 430);
                    p1.setLocation(5, 5);

                    content.removeAll();
                    content.add(p1, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarLibroMousePressed
    // BUSCAR
    private void btnBuscarLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMousePressed
        
        String inf = bid.getText();
        try {
            String[][] datosISBN =  ComunicacionBD.datosBD(tabla, "isbn", inf);
            String[][] datosNombre = ComunicacionBD.datosBD(tabla, "nombre", inf);
            
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                ((datosISBN.length>datosNombre.length)?datosISBN:datosNombre),datosTabla));
            jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarLibroMousePressed

    private void btnAgregarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseEntered
        setColor(btnAgregarLibro);
    }//GEN-LAST:event_btnAgregarLibroMouseEntered

    private void btnAgregarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseExited
        resetColor(btnAgregarLibro);
    }//GEN-LAST:event_btnAgregarLibroMouseExited

    private void btnBuscarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseEntered
        setColor(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseEntered

    private void btnBuscarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarLibroMouseExited
        resetColor(btnBuscarLibro);
    }//GEN-LAST:event_btnBuscarLibroMouseExited

    private void btnModificarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarLibroMouseEntered
        setColor(btnModificarLibro);
    }//GEN-LAST:event_btnModificarLibroMouseEntered

    private void btnModificarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarLibroMouseExited
        resetColor(btnModificarLibro);
    }//GEN-LAST:event_btnModificarLibroMouseExited

    private void bidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bidFocusGained
        if(bid.getText().equals(busquedaTexto))
            bid.setText("");
    }//GEN-LAST:event_bidFocusGained

    private void bidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bidFocusLost
        if(bid.getText().isEmpty())
            bid.setText(busquedaTexto);
    }//GEN-LAST:event_bidFocusLost

    void setColor(JPanel panel){
        panel.setBackground(new Color(204,102,0));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(102,51,0));
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField bid;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnAgregarLibro;
    private javax.swing.JPanel btnBuscarLibro;
    private javax.swing.JPanel btnModificarLibro;
    private javax.swing.JPanel eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAgregar;
    // End of variables declaration//GEN-END:variables
}
