/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cuenta;
import java.awt.Toolkit;
import java.util.Calendar;
public class Ventana extends javax.swing.JFrame {
    int xMouse,yMouse;
    Boolean combo = false;
    
    
    Enlaces en = new Enlaces();
    Coloresfilas colorf = new Coloresfilas();
    public Ventana() {
        initComponents();
           setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/logo.png")));
        
        
       
        setLocationRelativeTo(null);
        en.inicio(dinero);
        en.cargartablaingresos(tablaingresos);
        en.cargartablaretiros(tablaretiros);
        en.cargartablahistorial(Tablahistorial);
          en.cargarcombo(combomes);
         
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsuperior = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        dinero1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pane2 = new javax.swing.JLabel();
        pane1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaingresos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion1 = new javax.swing.JTextArea();
        btnregistrar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dineroagregar = new javax.swing.JTextField();
        jdt = new com.toedter.calendar.JDateChooser();
        titulo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcion2 = new javax.swing.JTextArea();
        btnregistrar1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        dineroretirar = new javax.swing.JTextField();
        jdt1 = new com.toedter.calendar.JDateChooser();
        titulo1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaretiros = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tablahistorial = new javax.swing.JTable();
        combomes = new javax.swing.JComboBox<>();
        titulo2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsuperior.setBackground(new java.awt.Color(0, 153, 153));
        panelsuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(106, 183, 157));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1s.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 20, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/min1.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 20, -1));

        panelsuperior.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 40));

        dinero.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        dinero.setForeground(new java.awt.Color(255, 255, 255));
        dinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dinero.setText("0");
        dinero.setToolTipText("");
        panelsuperior.add(dinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 360, 60));

        dinero1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        dinero1.setForeground(new java.awt.Color(255, 255, 255));
        dinero1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dinero1.setText("Total:");
        panelsuperior.add(dinero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 330, 60));

        getContentPane().add(panelsuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1049, 100));

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>  <center> <b>Registrar <p> retiro</b> <p><p> todo el dinero que retiras<p> lo puedes registrar aquí.   </html>");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 220, 190));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>  <center> <b>Registrar <p> ingreso</b> <p><p> todo el dinero que recibes<p> para aumentar el capital.   </html>");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, 190));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoretirar.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 150, 150));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoingresar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 150, 150));

        pane2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane1.png"))); // NOI18N
        pane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pane2MouseExited(evt);
            }
        });
        jPanel2.add(pane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 280, 400));

        pane1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane1.png"))); // NOI18N
        pane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pane1MouseExited(evt);
            }
        });
        jPanel2.add(pane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 400));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconolistas.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel7MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 150, 160));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Historial");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 130, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel23.setText("jLabel5");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -120, 1070, 1130));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaingresos.setBackground(new java.awt.Color(0, 102, 102));
        tablaingresos.setForeground(new java.awt.Color(255, 255, 255));
        tablaingresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaingresos);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 810, 210));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcion1.setColumns(20);
        descripcion1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descripcion1.setForeground(new java.awt.Color(0, 110, 133));
        descripcion1.setRows(5);
        jScrollPane1.setViewportView(descripcion1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 580, 100));

        btnregistrar.setBackground(new java.awt.Color(0, 102, 102));
        btnregistrar.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Registrar");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        btnregistrar.add(jLabel12);

        jPanel5.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 100, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("$");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 220, 20));

        dineroagregar.setBackground(new java.awt.Color(255, 255, 255));
        dineroagregar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        dineroagregar.setForeground(new java.awt.Color(0, 110, 133));
        dineroagregar.setBorder(null);
        jPanel6.add(dineroagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 220, -1));

        jdt.setBackground(new java.awt.Color(0, 102, 102));
        jdt.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdtMouseClicked(evt);
            }
        });
        jPanel6.add(jdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 100, -1));

        titulo.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 102, 102));
        titulo.setText("Ingresos:");
        jPanel6.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 580, 100));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modern-white-background-free-vector.jpg"))); // NOI18N
        jLabel19.setText("jLabel5");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -250, 1280, 550));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 810, 290));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda1.png"))); // NOI18N
        jLabel8.setText("Atrás");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel9.setText("jLabel5");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -120, 1070, 1130));

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcion2.setColumns(20);
        descripcion2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        descripcion2.setForeground(new java.awt.Color(0, 110, 133));
        descripcion2.setRows(5);
        jScrollPane3.setViewportView(descripcion2);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 580, 100));

        btnregistrar1.setBackground(new java.awt.Color(153, 0, 0));
        btnregistrar1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Registrar");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        btnregistrar1.add(jLabel15);

        jPanel8.add(btnregistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 100, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("$");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel9.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 220, 20));

        dineroretirar.setBackground(new java.awt.Color(255, 255, 255));
        dineroretirar.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        dineroretirar.setForeground(new java.awt.Color(0, 110, 133));
        dineroretirar.setBorder(null);
        jPanel9.add(dineroretirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 220, -1));

        jdt1.setBackground(new java.awt.Color(0, 102, 102));
        jdt1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jdt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdt1MouseClicked(evt);
            }
        });
        jPanel9.add(jdt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 100, -1));

        titulo1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(153, 0, 0));
        titulo1.setText("Retiros:");
        jPanel9.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 580, 100));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modern-white-background-free-vector.jpg"))); // NOI18N
        jLabel17.setText("jLabel5");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -250, 1280, 550));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 810, 290));

        tablaretiros.setBackground(new java.awt.Color(153, 0, 0));
        tablaretiros.setForeground(new java.awt.Color(255, 255, 255));
        tablaretiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaretiros);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 810, 200));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda1.png"))); // NOI18N
        jLabel13.setText("Atrás");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel18.setText("jLabel5");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -120, 1070, 1130));

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablahistorial.setBackground(new java.awt.Color(51, 51, 51));
        Tablahistorial.setForeground(new java.awt.Color(255, 255, 255));
        Tablahistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(Tablahistorial);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1000, 340));

        combomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combomesActionPerformed(evt);
            }
        });
        jPanel7.add(combomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 300, -1));

        titulo2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Historial de registros:");
        jPanel7.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 30));

        jLabel21.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Fecha:");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 80, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda1.png"))); // NOI18N
        jLabel14.setText("Atrás");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabel22.setText("jLabel5");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -120, 1070, 1130));

        jTabbedPane1.addTab("tab4", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pane1MouseClicked

    private void pane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane1MouseEntered
        pane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane2.png")));
    }//GEN-LAST:event_pane1MouseEntered

    private void pane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane1MouseExited
      pane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane1.png")));
    }//GEN-LAST:event_pane1MouseExited

    private void pane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pane2MouseClicked

    private void pane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane2MouseEntered
        pane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane2.png")));
    }//GEN-LAST:event_pane2MouseEntered

    private void pane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pane2MouseExited
          pane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane1.png")));
    }//GEN-LAST:event_pane2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clicicon1.png")));
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
       jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoingresar.png")));
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
                          
        pane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane2.png")));
     
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
     pane1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane1.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x-xMouse,y-yMouse);     
        
        
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xMouse = evt.getX();
     yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1s.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/min2.png")));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/min1.png")));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
 pane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane2.png")));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
     pane2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pane1.png")));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
         jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clicicon2.png")));
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoretirar.png")));
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
             jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconolistas2.png")));
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseReleased
          jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconolistas.png")));
    }//GEN-LAST:event_jLabel7MouseReleased

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        combo = true;
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtMouseClicked
   
    }//GEN-LAST:event_jdtMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
          String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mese = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
        String fechas = (year + "-" + mese+ "-" + dia);
        String money = dineroagregar.getText();
        String desc = descripcion1.getText();
        String mes= (mese + "-" + year);
        en.Ingresar(money,desc, fechas,dinero,mes);
        en.cargartablaingresos(tablaingresos);
          en.cargartablahistorial(Tablahistorial);
          combomes.removeAllItems();
            en.cargarcombo(combomes);
        
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        btnregistrar.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
      btnregistrar.setBackground(new java.awt.Color(0,102,102));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
         jTabbedPane1.setSelectedIndex(1);
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
         String dia = Integer.toString(jdt1.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mese = Integer.toString(jdt1.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(jdt1.getCalendar().get(Calendar.YEAR));
        String fechas = (year + "-" + mese+ "-" + dia);
        
        String mes= (mese + "-" + year);
        String money = dineroretirar.getText();
        String desc = descripcion2.getText();
        
        en.Ingresar2(money,desc, fechas,dinero, mes);
        en.cargartablaretiros(tablaretiros);
         en.cargartablahistorial(Tablahistorial);
             combomes.removeAllItems();
            en.cargarcombo(combomes);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
     btnregistrar1.setBackground(new java.awt.Color(204,0,0));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
       btnregistrar1.setBackground(new java.awt.Color(153,0,0));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jdt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jdt1MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
           jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda2.png")));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
         jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda1.png")));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
           jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda2.png")));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
              jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda1.png")));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
         combo = false;
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
             jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda2.png")));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
             jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda1.png")));
    }//GEN-LAST:event_jLabel14MouseExited

    private void combomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combomesActionPerformed
      String meses = String.valueOf(combomes.getSelectedItem());
        System.out.println(meses);
        if(combo){
        
        en.cargartablahistorialcombo(Tablahistorial, meses);
         
        
        }
      
    }//GEN-LAST:event_combomesActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablahistorial;
    private javax.swing.JPanel btnregistrar;
    private javax.swing.JPanel btnregistrar1;
    private javax.swing.JComboBox<String> combomes;
    private javax.swing.JTextArea descripcion1;
    private javax.swing.JTextArea descripcion2;
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel dinero1;
    private javax.swing.JTextField dineroagregar;
    private javax.swing.JTextField dineroretirar;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdt;
    private com.toedter.calendar.JDateChooser jdt1;
    private javax.swing.JLabel pane1;
    private javax.swing.JLabel pane2;
    private javax.swing.JPanel panelsuperior;
    private javax.swing.JTable tablaingresos;
    private javax.swing.JTable tablaretiros;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
