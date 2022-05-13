/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Antonio
 */
public class Devolver extends javax.swing.JPanel {
    Prestar Inter;
    String usuario = "Ingrese el folio del usuario";
    String libro = "Ingrese el ID del Libro a devolver";
    final int COLUMNA_DATE_RETURN = 4;
    final int COLUMNA_PRECIO_DIA = 9;
    /**
     * Creates new form Principal
     */
    public Devolver() {
        initComponents();
        Inter = new Prestar();
        folio.setText(usuario);
        book_id.setText(libro);
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
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        book_id = new javax.swing.JTextField();
        folio = new javax.swing.JTextField();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Devolución de Libro");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("ISBN Libro");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Folio Usuario");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 10, 350));

        book_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        book_id.setForeground(new java.awt.Color(102, 102, 102));
        book_id.setBorder(null);
        book_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                book_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                book_idFocusLost(evt);
            }
        });
        add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 30));

        folio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        folio.setForeground(new java.awt.Color(102, 102, 102));
        folio.setBorder(null);
        folio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                folioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                folioFocusLost(evt);
            }
        });
        add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 30));

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
        jLabel1.setText(" Devolver");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 50));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/Library.gif"))); // NOI18N
        Image.setMaximumSize(new java.awt.Dimension(750, 430));
        Image.setMinimumSize(new java.awt.Dimension(750, 430));
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseEntered
        setColor(button);
    }//GEN-LAST:event_buttonMouseEntered

    private void buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseExited
        resetColor(button);
    }//GEN-LAST:event_buttonMouseExited
    
    
    public void Devolutions(String fo, String bookid) throws SQLException, ParseException{

        String[] prestamo = ComunicacionBD.verPrestamoBD(bookid, fo);

        Inter.RefreshBooksStock(bookid, 1);
        
        if( prestamo[prestamo.length-1].equals("1") ){
            int days = diferenciasDeFechas(prestamo[COLUMNA_DATE_RETURN]);
            int cost = Integer.parseInt(prestamo[COLUMNA_PRECIO_DIA]);// Costo por día retardado.
            int money = days * cost;
            int aceptar = javax.swing.JOptionPane.showConfirmDialog(this, "¡SANCIONADO POR ENTREGA A DESTIEMPO!\n          (costo "+cost+" x dias "+days+" = $"+money+")" , "AVISO", javax.swing.JOptionPane.OK_CANCEL_OPTION);
            if(aceptar == javax.swing.JOptionPane.YES_OPTION)
                ComunicacionBD.eliminarBD("prestamos", prestamo[0]);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "¡Devolución realizada correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            ComunicacionBD.eliminarBD("prestamos", prestamo[0]);
        }
          
    }
    
    // DEVOLVER
    private void buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMousePressed
        String book = book_id.getText();
        String fol = folio.getText();

        try {
            // Verificamos el usuario
            boolean pase = Inter.UserExist(fol);
            if(!pase){
                javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún usuario con ese Folio. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                folio.requestFocus();
            }
            // Verificamos el libro
            else if (!Inter.BookExist(book)){
                javax.swing.JOptionPane.showMessageDialog(this, "No existe ningún libro con esa ID. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                book_id.requestFocus();
            }
            else if(!Inter.CheckLending(fol, book)){
                javax.swing.JOptionPane.showMessageDialog(this, "No se ha podido encontrar el préstamo correspondiente a los datos ingresados. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                book_id.requestFocus();
            }
            // DEVOLVEMOS
            else{
                Devolutions(fol, book);
                folio.setText(usuario);
                book_id.setText(libro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Devolver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Devolver.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
         
    }//GEN-LAST:event_buttonMousePressed

    private void folioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_folioFocusGained
        if(folio.getText().equals(usuario))
            folio.setText("");
    }//GEN-LAST:event_folioFocusGained

    private void folioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_folioFocusLost
        if(folio.getText().isEmpty())
            folio.setText(usuario);
    }//GEN-LAST:event_folioFocusLost

    private void book_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_book_idFocusGained
        if(book_id.getText().equals(libro))
            book_id.setText("");
    }//GEN-LAST:event_book_idFocusGained

    private void book_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_book_idFocusLost
        if(book_id.getText().isEmpty())
            book_id.setText(libro);
    }//GEN-LAST:event_book_idFocusLost

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }

    public static synchronized int diferenciasDeFechas(String fechaFinal) {
	LocalDate myDate = LocalDate.parse(fechaFinal);

        LocalDate currentDate = LocalDate.now();

        long numberOFDays = DAYS.between(myDate, currentDate);
	return (int) numberOFDays;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JTextField book_id;
    private javax.swing.JPanel button;
    private javax.swing.JTextField folio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
