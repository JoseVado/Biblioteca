/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import static biblioteca.Dashboard.content;
import java.awt.BorderLayout;

/**
 *
 * @author Antonio
 */
public class Empleados extends javax.swing.JPanel {

    Conexion conn;
    Connection reg;
    /**
     * Creates new form Principal
     */
    public Empleados() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConnection();
        try {
            GetBooks();
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
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
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nuevo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Empleados");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 620, 10));

        bid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        bid.setForeground(new java.awt.Color(102, 102, 102));
        bid.setText("Ingrese el ID del Libro a buscar");
        bid.setBorder(null);
        bid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bidMousePressed(evt);
            }
        });
        add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

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
        jLabel1.setText("Buscar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        nuevo.setBackground(new java.awt.Color(18, 90, 173));
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoMousePressed(evt);
            }
        });
        nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nuevo");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        nuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 395, 80, -1));

        edit.setBackground(new java.awt.Color(18, 90, 173));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");
        edit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 395, 80, -1));

        delete.setBackground(new java.awt.Color(18, 90, 173));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Borrar");
        delete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, -1));

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 395, 80, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplaresl", "Stock", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void bidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bidMousePressed
       if(bid.getText().equals("Ingrese el ID del Libro a buscar"))
        bid.setText("");
    }//GEN-LAST:event_bidMousePressed

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // Abrir sección
        UpBooks p1 = new UpBooks();
        p1.setSize(750, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jLabel3MousePressed

    private void nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseEntered

    private void nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseExited

    private void nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMousePressed
        // Abrir sección
        UpUsers p1 = new UpUsers();
        p1.setSize(750, 430);
        p1.setLocation(0,0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_nuevoMousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        setColor(delete);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        resetColor(delete);
    }//GEN-LAST:event_deleteMouseExited

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if(bid.getText().equals("") || bid.getText() == null || bid.getText().equals(" "))
            bid.setText("Ingrese el ID del Libro a buscar");
    }//GEN-LAST:event_jTable1MousePressed
    // BORRAR
    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                Statement stm = reg.createStatement();
                ResultSet counter = stm.executeQuery("SELECT * FROM `books`");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][12];
                int i = 0;
                ResultSet re = stm.executeQuery("SELECT * FROM `books`");
                while(re.next()){
                    list[i][0] = re.getString("id");
                    list[i][1] = re.getString("title");
                    list[i][2] = re.getString("date");
                    list[i][3] = re.getString("author");
                    list[i][4] = re.getString("category");
                    list[i][5] = re.getString("edit");
                    list[i][6] = re.getString("lang");
                    list[i][7] = re.getString("pages");
                    list[i][8] = re.getString("description");
                    list[i][9] = re.getString("ejemplares");
                    list[i][10] = re.getString("stock");
                    list[i][11] = re.getString("available");
                    i++;
                }
                String id = list[idcell][0];
                if(id == null || id.equals("")){
                    javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    Statement stm2=null;
                    try {
                    stm2 = reg.createStatement();
                    } catch (SQLException ex) {
                    Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                    stm2.executeUpdate("DELETE FROM `books` WHERE `id` = '"+id+"' LIMIT 1");
                    javax.swing.JOptionPane.showMessageDialog(this, "¡Libro borrado! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    GetBooks();
                    } catch (SQLException ex) {
                    Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteMousePressed

    // EDITAR
    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        try {
            int idcell = jTable1.getSelectedRow();
            if(idcell <= -1){
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el libro a editar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                
                Statement stm = reg.createStatement();
                ResultSet counter = stm.executeQuery("SELECT * FROM `books`");

                int count = 0;
                while(counter.next()){count++;}

                String list[][] = new String[count][12];
                int i = 0;
                ResultSet re = stm.executeQuery("SELECT * FROM `books`");
                while(re.next()){
                    list[i][0] = re.getString("id");
                    list[i][1] = re.getString("title");
                    list[i][2] = re.getString("date");
                    list[i][3] = re.getString("author");
                    list[i][4] = re.getString("category");
                    list[i][5] = re.getString("edit");
                    list[i][6] = re.getString("lang");
                    list[i][7] = re.getString("pages");
                    list[i][8] = re.getString("description");
                    list[i][9] = re.getString("ejemplares");
                    list[i][10] = re.getString("stock");
                    list[i][11] = re.getString("available");
                    i++;
                }
                String id = list[idcell][0];
                if(id == null || id.equals("")){
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
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editMousePressed
    // BUSCAR
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        try {
            String inf = bid.getText();
            Statement stm = reg.createStatement();
            ResultSet counter = stm.executeQuery("SELECT * FROM `books` WHERE id LIKE '"+inf+"%'");
            
            int count = 0;
            while(counter.next()){count++;}
            
            String list[][] = new String[count][12];
            int i = 0;
            ResultSet re = stm.executeQuery("SELECT * FROM `books` WHERE id LIKE '"+inf+"%'");
            while(re.next()){
            list[i][0] = re.getString("id");
            list[i][1] = re.getString("title");
            list[i][2] = re.getString("date");
            list[i][3] = re.getString("author");
            list[i][4] = re.getString("category");
            list[i][5] = re.getString("edit");
            list[i][6] = re.getString("lang");
            list[i][7] = re.getString("pages");
            list[i][8] = re.getString("description");
            list[i][9] = re.getString("ejemplares");
            list[i][10] = re.getString("stock");
            list[i][11] = re.getString("available");
            i++;
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplaresl", "Stock", "Disponibles"
        }));
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    private void GetBooks() throws SQLException{
        Statement stm = reg.createStatement();
        ResultSet counter = stm.executeQuery("SELECT * FROM `books`");
        
        int count = 0;
        while(counter.next()){count++;}
        
        String list[][] = new String[count][12];
        int i = 0;
        ResultSet re = stm.executeQuery("SELECT * FROM `books`");
        while(re.next()){
            list[i][0] = re.getString("id");
            list[i][1] = re.getString("title");
            list[i][2] = re.getString("date");
            list[i][3] = re.getString("author");
            list[i][4] = re.getString("category");
            list[i][5] = re.getString("edit");
            list[i][6] = re.getString("lang");
            list[i][7] = re.getString("pages");
            list[i][8] = re.getString("description");
            list[i][9] = re.getString("ejemplares");
            list[i][10] = re.getString("stock");
            list[i][11] = re.getString("available");
            i++;
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        list,
        new String [] {
            "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplaresl", "Stock", "Disponibles"
        }));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField bid;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel nuevo;
    // End of variables declaration//GEN-END:variables
}
