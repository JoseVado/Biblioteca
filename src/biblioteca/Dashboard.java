package biblioteca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    Conexion conn;
    Connection reg;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        conn = new Conexion();
        reg = conn.getConnection();
        
        /*
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        */
        Inventario p1 = new Inventario();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLibros = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_reports1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnPrestar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnMultas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnMultas1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnMultas3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(153, 51, 0));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(102, 51, 0));
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInicio.setName("btnInicio"); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });
        btnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/home-outline.png"))); // NOI18N
        btnInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inicio");
        btnInicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 50));

        btnDevolver.setBackground(new java.awt.Color(102, 51, 0));
        btnDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDevolver.setName("btnDevolver"); // NOI18N
        btnDevolver.setPreferredSize(new java.awt.Dimension(270, 51));
        btnDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDevolverMousePressed(evt);
            }
        });
        btnDevolver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/calendar-multiple-check.png"))); // NOI18N
        btnDevolver.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Devolver");
        btnDevolver.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        btnClientes.setBackground(new java.awt.Color(102, 51, 0));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setName("btnClientes"); // NOI18N
        btnClientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });
        btnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/account-multiple.png"))); // NOI18N
        btnClientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Clientes");
        btnClientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        btnLibros.setBackground(new java.awt.Color(102, 51, 0));
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLibros.setName("btnLibros"); // NOI18N
        btnLibros.setPreferredSize(new java.awt.Dimension(270, 51));
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLibrosMousePressed(evt);
            }
        });
        btnLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/book-open-page-variant.png"))); // NOI18N
        btnLibros.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Libros");
        btnLibros.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        btnPrestamos.setBackground(new java.awt.Color(102, 51, 0));
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrestamos.setName("btnPrestamos"); // NOI18N
        btnPrestamos.setPreferredSize(new java.awt.Dimension(270, 51));
        btnPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrestamosMousePressed(evt);
            }
        });
        btnPrestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/file-chart.png"))); // NOI18N
        btnPrestamos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Prestamos");
        btnPrestamos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btn_reports1.setBackground(new java.awt.Color(18, 90, 173));
        btn_reports1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports1.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reports1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reports1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reports1MousePressed(evt);
            }
        });
        btn_reports1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/file-chart.png"))); // NOI18N
        btn_reports1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Reportes");
        btn_reports1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btnPrestamos.add(btn_reports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        Menu.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btnPrestar.setBackground(new java.awt.Color(102, 51, 0));
        btnPrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrestar.setName("btnPrestar"); // NOI18N
        btnPrestar.setPreferredSize(new java.awt.Dimension(270, 51));
        btnPrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrestarMousePressed(evt);
            }
        });
        btnPrestar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/calendar-plus.png"))); // NOI18N
        btnPrestar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Préstar");
        btnPrestar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btnPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 20));

        btnMultas.setBackground(new java.awt.Color(102, 51, 0));
        btnMultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultas.setName("btnMultas"); // NOI18N
        btnMultas.setPreferredSize(new java.awt.Dimension(270, 51));
        btnMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMultasMousePressed(evt);
            }
        });
        btnMultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/account-multiple.png"))); // NOI18N
        btnMultas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Multas");
        btnMultas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btnMultas1.setBackground(new java.awt.Color(102, 51, 0));
        btnMultas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultas1.setName("btnMultas"); // NOI18N
        btnMultas1.setPreferredSize(new java.awt.Dimension(270, 51));
        btnMultas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMultas1MousePressed(evt);
            }
        });
        btnMultas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/account-multiple.png"))); // NOI18N
        btnMultas1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Multas");
        btnMultas1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btnMultas.add(btnMultas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 270, -1));

        Menu.add(btnMultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 270, -1));

        btnEmpleados.setBackground(new java.awt.Color(102, 51, 0));
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleados.setName("btnEmpleados"); // NOI18N
        btnEmpleados.setPreferredSize(new java.awt.Dimension(270, 51));
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmpleadosMousePressed(evt);
            }
        });
        btnEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/account-multiple.png"))); // NOI18N
        btnEmpleados.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Empleados");
        btnEmpleados.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btnMultas3.setBackground(new java.awt.Color(102, 51, 0));
        btnMultas3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultas3.setName("btnMultas"); // NOI18N
        btnMultas3.setPreferredSize(new java.awt.Dimension(270, 51));
        btnMultas3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMultas3MousePressed(evt);
            }
        });
        btnMultas3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/account-multiple.png"))); // NOI18N
        btnMultas3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Multas");
        btnMultas3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        btnEmpleados.add(btnMultas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 270, -1));

        Menu.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 270, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/libro-abierto (1).png"))); // NOI18N
        jLabel6.setToolTipText("");
        Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("El libro prestado");
        Menu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(153, 51, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Biblioteca Municipal \"EL libro prestado\"");

        frase.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        frase.setForeground(new java.awt.Color(255, 255, 255));
        frase.setText("Sin bibliotecas, ¿qué tenemos? Ni pasado ni futuro\" - Ray Bradbury");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frase))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 210));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        setColor(btnInicio);
        resetColor(btnPrestar);
        resetColor(btnDevolver);
        resetColor(btnClientes);
        resetColor(btnLibros);
        resetColor(btnPrestamos);
        resetColor(btnMultas);
        resetColor(btnEmpleados);
        // Abrir sección
        Inventario p1 = new Inventario();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnPrestarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestarMousePressed
        setColor(btnPrestar);
        resetColor(btnInicio);
        resetColor(btnDevolver);
        resetColor(btnClientes);
        resetColor(btnLibros);
        resetColor(btnPrestamos);
        resetColor(btnMultas);
        resetColor(btnEmpleados);
        
        // Abrir sección
        Prestar p1 = new Prestar();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnPrestarMousePressed

    private void btnDevolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMousePressed
        setColor(btnDevolver);
        resetColor(btnInicio);
        resetColor(btnPrestar);
        resetColor(btnClientes);
        resetColor(btnLibros);
        resetColor(btnPrestamos);
        resetColor(btnMultas);
        resetColor(btnEmpleados);
        // Abrir sección
        Devolver p1 = new Devolver();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnDevolverMousePressed

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        setColor(btnClientes);
        resetColor(btnInicio);
        resetColor(btnDevolver);
        resetColor(btnPrestar);
        resetColor(btnLibros);
        resetColor(btnPrestamos);
        resetColor(btnMultas);
        resetColor(btnEmpleados);
        // Abrir sección
        Clientes p1 = new Clientes();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnLibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMousePressed
        setColor(btnLibros);
        resetColor(btnInicio);
        resetColor(btnDevolver);
        resetColor(btnClientes);
        resetColor(btnPrestar);
        resetColor(btnPrestamos);
        resetColor(btnMultas);
        resetColor(btnEmpleados);
        
        // Abrir sección
        Libros p1 = new Libros();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnLibrosMousePressed

    private void btnPrestamosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamosMousePressed
        setColor(btnPrestamos);
        resetColor(btnInicio);
        resetColor(btnDevolver);
        resetColor(btnClientes);
        resetColor(btnLibros);
        resetColor(btnPrestar);
        resetColor(btnMultas);
        resetColor(btnEmpleados);
        
        // Abrir sección
        Prestamos p1 = new Prestamos();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnPrestamosMousePressed

    private void btn_reports1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseEntered
       
    }//GEN-LAST:event_btn_reports1MouseEntered

    private void btn_reports1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseExited
        
    }//GEN-LAST:event_btn_reports1MouseExited

    private void btn_reports1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MousePressed
       
    }//GEN-LAST:event_btn_reports1MousePressed

    private void btnMultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultasMousePressed
        setColor(btnMultas);
        resetColor(btnInicio);
        resetColor(btnDevolver);
        resetColor(btnClientes);
        resetColor(btnLibros);
        resetColor(btnPrestamos);
        resetColor(btnPrestar);
        resetColor(btnEmpleados);
        
        // Abrir sección
        Multas p1 = new Multas();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnMultasMousePressed

    private void btnMultas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultas1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultas1MousePressed

    private void btnMultas3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultas3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultas3MousePressed

    private void btnEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMousePressed
        setColor(btnEmpleados);
        resetColor(btnInicio);
        resetColor(btnDevolver);
        resetColor(btnClientes);
        resetColor(btnLibros);
        resetColor(btnPrestamos);
        resetColor(btnPrestar);
        resetColor(btnMultas);
        
        // Abrir sección
        Empleados p1 = new Empleados();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnEmpleadosMousePressed

    void setColor(JPanel panel){
        panel.setBackground(new Color(204,102,0));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(102,51,0));
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnDevolver;
    private javax.swing.JPanel btnEmpleados;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLibros;
    private javax.swing.JPanel btnMultas;
    private javax.swing.JPanel btnMultas1;
    private javax.swing.JPanel btnMultas3;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JPanel btnPrestar;
    private javax.swing.JPanel btn_reports1;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel frase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}