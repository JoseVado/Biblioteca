package biblioteca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    private javax.swing.JPanel botonActual;
    private final int TIEMPO_CARGA_PANTALLA = 400;
    private Thread base;
    private Runnable MENSJAE_ERROR_RUN = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(TIEMPO_CARGA_PANTALLA);
                if (base.isAlive()){
                    base.interrupt();
                    ventanaError();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    
    private Login parent;

    public Dashboard(Login parent, boolean esAdmin) {
        initComponents();
        
        btnEmpleados.setVisible(esAdmin);
        this.parent = parent;
        
        actualizarPantalla(new Inicio());
        
        botonActual = btnInicio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraArriba = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        txtCerra = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLibros = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnPrestar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMultas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        barraArriba.setBackground(new java.awt.Color(153, 51, 0));
        barraArriba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraArribaMouseDragged(evt);
            }
        });
        barraArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraArribaMousePressed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(153, 51, 0));
        btnCerrar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        txtCerra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCerra.setForeground(new java.awt.Color(255, 255, 255));
        txtCerra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/cerrar-sesion.png"))); // NOI18N
        txtCerra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCerra.setMinimumSize(new java.awt.Dimension(40, 40));
        txtCerra.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Cerrar Seción");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addComponent(txtCerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraArribaLayout = new javax.swing.GroupLayout(barraArriba);
        barraArriba.setLayout(barraArribaLayout);
        barraArribaLayout.setHorizontalGroup(
            barraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraArribaLayout.createSequentialGroup()
                .addContainerGap(874, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraArribaLayout.setVerticalGroup(
            barraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(153, 51, 0));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/images/libro-abierto (1).png"))); // NOI18N
        jLabel6.setToolTipText("");
        Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("El libro prestado");
        Menu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 20));

        btnInicio.setBackground(new java.awt.Color(204, 102, 0));
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

        Menu.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

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

        Menu.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 270, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Header.setBackground(new java.awt.Color(153, 51, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Biblioteca Municipal \"El libro prestado\"");

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
                .addContainerGap(27, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barraArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(barraArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 627, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ventanaError(){
        actualizarPantalla(new Error());
    }

    public void actualizarPantalla(javax.swing.JPanel panelActualizar){
        panelActualizar.setSize(750, 430);
        panelActualizar.setLocation(0,0);
        
        content.removeAll();
        content.add(panelActualizar, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    private void actualizarBoton(javax.swing.JPanel btnAux){
        resetColor(botonActual);
        botonActual = btnAux;
        setColor(btnAux);
    }
    
    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        actualizarBoton( btnInicio );
        
        // Abrir sección
        actualizarPantalla(new Inicio());
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnPrestarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestarMousePressed
        actualizarBoton( btnPrestar );
        
        // Abrir sección
        actualizarPantalla(new Prestar());
    }//GEN-LAST:event_btnPrestarMousePressed

    private void btnDevolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMousePressed
        actualizarBoton( btnDevolver );
        
        // Abrir sección
        actualizarPantalla(new Devolver());
    }//GEN-LAST:event_btnDevolverMousePressed

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        actualizarBoton( btnClientes );
        
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(new Clientes());
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnLibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMousePressed
        actualizarBoton( btnLibros );
        
        
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(new Libros());
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnLibrosMousePressed

    private void btnPrestamosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamosMousePressed
        actualizarBoton( btnPrestamos );
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(new Prestamos());
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnPrestamosMousePressed

    private void btnMultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultasMousePressed
        actualizarBoton( btnMultas );
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    // Abrir sección
                    actualizarPantalla(new Multas());
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnMultasMousePressed

    private void btnEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMousePressed
        actualizarBoton( btnEmpleados );
        base = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    actualizarPantalla(new Empleados());
                }
            }
        );
        Thread error = new Thread(MENSJAE_ERROR_RUN);
        base.start();
        error.start();
    }//GEN-LAST:event_btnEmpleadosMousePressed

    private void barraArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraArribaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraArribaMouseDragged

    private void barraArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraArribaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraArribaMousePressed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        parent.setVisible(true);
        parent.requestFocus();
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(153,51,0));
    }//GEN-LAST:event_btnCerrarMouseExited

    void setColor(JPanel panel){
        panel.setBackground(new Color(204,102,0));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(102,51,0));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel barraArriba;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnDevolver;
    private javax.swing.JPanel btnEmpleados;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLibros;
    private javax.swing.JPanel btnMultas;
    private javax.swing.JPanel btnPrestamos;
    private javax.swing.JPanel btnPrestar;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel frase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtCerra;
    // End of variables declaration//GEN-END:variables
}
