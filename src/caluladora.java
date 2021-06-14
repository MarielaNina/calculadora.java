//POR: MARIELA MELISSA NINA CAPUJRA --->COD:2020204032
import javax.swing.ImageIcon;
import javax.swing.JButton;
public class caluladora extends javax.swing.JFrame {
    private boolean punto; 
    String valor1,valor2,signo,contenido;
    Double resultado;
    
    public caluladora() {
        this.punto = true;
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/calculadora/brain-regular-24.png")).getImage());
        this.setTitle("Calculadora");
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        procedimiento2 = new javax.swing.JLabel();
        resultado2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        procedimiento = new javax.swing.JLabel();
        resultados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        division = new javax.swing.JButton();
        exponente = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        multiiplicacion = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        borrartodo = new javax.swing.JButton();
        borraranterior = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        inverza = new javax.swing.JButton();
        cambiosig = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        procedimiento2.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        procedimiento2.setForeground(new java.awt.Color(51, 51, 51));
        procedimiento2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        procedimiento2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        resultado2.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        resultado2.setForeground(new java.awt.Color(0, 0, 0));
        resultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultado2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("≡ Estándar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(procedimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(procedimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        procedimiento.setBackground(new java.awt.Color(225, 136, 250));
        procedimiento.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        procedimiento.setForeground(new java.awt.Color(0, 0, 0));
        procedimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        procedimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        procedimiento.setOpaque(true);

        resultados.setBackground(new java.awt.Color(225, 136, 250));
        resultados.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        resultados.setForeground(new java.awt.Color(51, 0, 51));
        resultados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        resultados.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("≡ Estándar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(procedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addComponent(resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 180));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        division.setBackground(new java.awt.Color(255, 204, 255));
        division.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        division.setForeground(new java.awt.Color(255, 255, 255));
        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        division.setText("÷");
        division.setFocusPainted(false);
        division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        exponente.setBackground(new java.awt.Color(255, 204, 255));
        exponente.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        exponente.setForeground(new java.awt.Color(255, 255, 255));
        exponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        exponente.setText("^");
        exponente.setFocusPainted(false);
        exponente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exponente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        exponente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponenteActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(255, 204, 255));
        cinco.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        cinco.setText("5");
        cinco.setFocusPainted(false);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        multiiplicacion.setBackground(new java.awt.Color(255, 204, 255));
        multiiplicacion.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        multiiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        multiiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        multiiplicacion.setText("X");
        multiiplicacion.setFocusPainted(false);
        multiiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        multiiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        multiiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiiplicacionActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(255, 204, 255));
        ocho.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        ocho.setText("8");
        ocho.setFocusPainted(false);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ocho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(255, 204, 255));
        nueve.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        nueve.setText("9");
        nueve.setFocusPainted(false);
        nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        nueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(255, 204, 255));
        siete.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        siete.setText("7");
        siete.setFocusPainted(false);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(255, 204, 255));
        tres.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        tres.setText("3");
        tres.setFocusPainted(false);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        tres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(255, 204, 255));
        dos.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        dos.setText("2");
        dos.setFocusPainted(false);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        menos.setBackground(new java.awt.Color(255, 204, 255));
        menos.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        menos.setForeground(new java.awt.Color(255, 255, 255));
        menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        menos.setText("--");
        menos.setFocusPainted(false);
        menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        menos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(255, 204, 255));
        cuatro.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        cuatro.setText("4");
        cuatro.setFocusPainted(false);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        cuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(255, 204, 255));
        seis.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        seis.setText("6");
        seis.setFocusPainted(false);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        seis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(255, 204, 255));
        uno.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        uno.setText("1");
        uno.setFocusPainted(false);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        mas.setBackground(new java.awt.Color(255, 204, 255));
        mas.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        mas.setForeground(new java.awt.Color(255, 255, 255));
        mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        mas.setText("+");
        mas.setFocusPainted(false);
        mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        btnpunto.setBackground(new java.awt.Color(255, 204, 255));
        btnpunto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnpunto.setForeground(new java.awt.Color(255, 255, 255));
        btnpunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        btnpunto.setText(".");
        btnpunto.setFocusPainted(false);
        btnpunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        btnpunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(255, 204, 255));
        igual.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        igual.setText("=");
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(255, 204, 255));
        cero.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        cero.setText("0");
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        borrartodo.setBackground(new java.awt.Color(255, 204, 255));
        borrartodo.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        borrartodo.setForeground(new java.awt.Color(204, 0, 51));
        borrartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        borrartodo.setText("X");
        borrartodo.setFocusPainted(false);
        borrartodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrartodo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        borrartodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        borrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrartodoActionPerformed(evt);
            }
        });

        borraranterior.setBackground(new java.awt.Color(255, 204, 255));
        borraranterior.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        borraranterior.setForeground(new java.awt.Color(255, 255, 0));
        borraranterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        borraranterior.setText("<<");
        borraranterior.setFocusPainted(false);
        borraranterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borraranterior.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        borraranterior.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        borraranterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraranteriorActionPerformed(evt);
            }
        });

        factorial.setBackground(new java.awt.Color(255, 204, 255));
        factorial.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        factorial.setForeground(new java.awt.Color(255, 255, 255));
        factorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        factorial.setText("x!");
        factorial.setFocusPainted(false);
        factorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        factorial.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        factorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        inverza.setBackground(new java.awt.Color(255, 204, 255));
        inverza.setFont(new java.awt.Font("Eras Medium ITC", 1, 8)); // NOI18N
        inverza.setForeground(new java.awt.Color(255, 255, 255));
        inverza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        inverza.setText("1/x");
        inverza.setFocusPainted(false);
        inverza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inverza.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        inverza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        inverza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverzaActionPerformed(evt);
            }
        });

        cambiosig.setBackground(new java.awt.Color(255, 204, 255));
        cambiosig.setFont(new java.awt.Font("Eras Light ITC", 1, 10)); // NOI18N
        cambiosig.setForeground(new java.awt.Color(255, 255, 255));
        cambiosig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        cambiosig.setText("+/-");
        cambiosig.setFocusPainted(false);
        cambiosig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cambiosig.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        cambiosig.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        cambiosig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosigActionPerformed(evt);
            }
        });

        raiz.setBackground(new java.awt.Color(255, 204, 255));
        raiz.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        raiz.setForeground(new java.awt.Color(255, 255, 255));
        raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        raiz.setText("√");
        raiz.setFocusPainted(false);
        raiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        raiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        raiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        porcentaje.setBackground(new java.awt.Color(255, 204, 255));
        porcentaje.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.png"))); // NOI18N
        porcentaje.setText("%");
        porcentaje.setFocusPainted(false);
        porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/boton.jpg"))); // NOI18N
        porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/boton 2.png"))); // NOI18N
        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiosig, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inverza, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borraranterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borraranterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inverza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(division, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiosig, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiosigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosigActionPerformed
        contenido=procedimiento.getText();
        if(contenido.length()>0){
            resultado=(-1)*Double.parseDouble(contenido);
            procedimiento.setText(resultado.toString());

        }
    }//GEN-LAST:event_cambiosigActionPerformed

    private void inverzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inverzaActionPerformed
        contenido=procedimiento.getText();
        valor1=contenido;
        if(contenido.length()>0){
            resultado=1/(Double.parseDouble(contenido));
            procedimiento.setText(resultado.toString());

        }
        resultados.setText("1/"+valor1);
    }//GEN-LAST:event_inverzaActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        contenido=procedimiento.getText();
        int m;
        m = Integer.parseInt(procedimiento.getText());
        int res = 1;
        if(contenido.length()>0){

            for (int i = 1; i <= m; i++) {
                res=res*i;
            }
            procedimiento.setText(Integer. toString(res));
        }
        resultados.setText(contenido+"!");

    }//GEN-LAST:event_factorialActionPerformed

    private void borraranteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraranteriorActionPerformed
        contenido=procedimiento.getText();
        if(contenido.length()>0){
            contenido=contenido.substring(0,contenido.length()-1);
            procedimiento.setText(contenido);
        }
    }//GEN-LAST:event_borraranteriorActionPerformed

    private void borrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrartodoActionPerformed
        procedimiento.setText(" ");
        resultados.setText(" ");

    }//GEN-LAST:event_borrartodoActionPerformed

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
        if(!procedimiento.getText().equals("")){
            valor1=procedimiento.getText();
            signo="%";
            procedimiento.setText("");
            resultados.setText(valor1+signo);}
    }//GEN-LAST:event_porcentajeActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        procedimiento.setText(procedimiento.getText()+"0");
    }//GEN-LAST:event_ceroActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        String resultadototal;
        valor2=procedimiento.getText();
        resultados.setText(valor1+signo+valor2);
        if(!valor2.equals("")){
            resultadototal=operaciones(valor1,valor2,signo);
            procedimiento.setText(resultadototal);

        }

    }//GEN-LAST:event_igualActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed

        contenido = procedimiento.getText();

        if(contenido.length()<=0){
            procedimiento.setText("0.");

        }else
        //contenido cuando existen los puntos, para evitar poner otros puntos

        if(procedimiento.getText().contains(".")){

        }else{
            procedimiento.setText(procedimiento.getText()+".");
            punto = false;
        }

    }//GEN-LAST:event_btnpuntoActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        if(!procedimiento.getText().equals("")){
            valor1=procedimiento.getText();
            signo="+";
            procedimiento.setText("");
            resultados.setText(valor1+signo);
        }

    }//GEN-LAST:event_masActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        procedimiento.setText(procedimiento.getText()+"1");
    }//GEN-LAST:event_unoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        procedimiento.setText(procedimiento.getText()+"6");
    }//GEN-LAST:event_seisActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        procedimiento.setText(procedimiento.getText()+"4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        if(!procedimiento.getText().equals("")){
            valor1=procedimiento.getText();
            signo="-";
            procedimiento.setText("");
            resultados.setText(valor1+signo);
        }

    }//GEN-LAST:event_menosActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        procedimiento.setText(procedimiento.getText()+"2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        procedimiento.setText(procedimiento.getText()+"3");
    }//GEN-LAST:event_tresActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        procedimiento.setText(procedimiento.getText()+"7");
    }//GEN-LAST:event_sieteActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        procedimiento.setText(procedimiento.getText()+"9");
    }//GEN-LAST:event_nueveActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        procedimiento.setText(procedimiento.getText()+"8");
    }//GEN-LAST:event_ochoActionPerformed

    private void multiiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiiplicacionActionPerformed
        if(!procedimiento.getText().equals("")){
            valor1=procedimiento.getText();
            signo="*";
            procedimiento.setText("");
            resultados.setText(valor1+signo);
            resultados.setText(valor1+signo);
        }
    }//GEN-LAST:event_multiiplicacionActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        procedimiento.setText(procedimiento.getText()+"5");
    }//GEN-LAST:event_cincoActionPerformed

    private void exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponenteActionPerformed
        contenido=procedimiento.getText();
        if(!procedimiento.getText().equals("")){
            valor1=procedimiento.getText();
            signo="^";
            procedimiento.setText("");
            resultados.setText(valor1+signo);

        }

    }//GEN-LAST:event_exponenteActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        contenido=procedimiento.getText();
        if(contenido.length()>0){
            resultado=Math.sqrt(Double.parseDouble(contenido));
            procedimiento.setText(resultado.toString());
            resultados.setText("√("+contenido+")");

        }

    }//GEN-LAST:event_raizActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        if(!procedimiento.getText().equals("")){
            valor1=procedimiento.getText();
            signo="/";
            procedimiento.setText("");
            resultados.setText(valor1+signo);

        }
    }//GEN-LAST:event_divisionActionPerformed
     public static String operaciones(String valor1, String valor2, String signo){
       Double resultadocalc=0.0;
       String respuesta;
        //las operaciones
        
       if(signo.equals("+")){
           resultadocalc=Double.parseDouble(valor1)+Double.parseDouble(valor2); 
       }else  if(signo.equals("-")){
           resultadocalc=Double.parseDouble(valor1)-Double.parseDouble(valor2);
             
       }else if(signo.equals("*")){
           resultadocalc=Double.parseDouble(valor1)*Double.parseDouble(valor2);
               
       }else if(signo.equals("/")){
           resultadocalc=Double.parseDouble(valor1)/Double.parseDouble(valor2);
       }else if(signo.equals("%")){
           resultadocalc=((Double.parseDouble(valor1)*Double.parseDouble(valor2))/100);
           
       }else if(signo.equals("^")){
           resultadocalc=Math.pow(Double.parseDouble(valor1),Double.parseDouble(valor2));
       }
      
       respuesta=resultadocalc.toString();
       return respuesta;
        
   }   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caluladora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caluladora().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borraranterior;
    private javax.swing.JButton borrartodo;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton cambiosig;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JButton exponente;
    private javax.swing.JButton factorial;
    private javax.swing.JButton igual;
    private javax.swing.JButton inverza;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton multiiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton porcentaje;
    private javax.swing.JLabel procedimiento;
    private javax.swing.JLabel procedimiento2;
    private javax.swing.JButton raiz;
    private javax.swing.JLabel resultado2;
    private javax.swing.JLabel resultados;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables

    private void setBackground() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//metodo para mostrar numero en pantalla
    private void addNumber(String numero) {
        procedimiento.setText(procedimiento.getText()+numero);
    }

    private JButton doClick() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIconText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIcon(String jjj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

