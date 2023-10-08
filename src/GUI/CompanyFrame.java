/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Companies.Company;

/**
 *
 * @author Andres
 */
public class CompanyFrame extends javax.swing.JFrame {

    public Company company;

    /**
     * Creates new form CompanyFrame
     */
    public CompanyFrame(Company company) {
        initComponents();
        this.company = company;

        //Decir los maximos y minimos de cada progress bar
        //Narrative
        guionProgressBar.setMinimum(0);
        guionProgressBar.setMaximum(company.getDrive().getMaxNarrative());

        //Niveles
        levelsProgressBar.setMinimum(0);
        levelsProgressBar.setMaximum(company.getDrive().getMaxLevels());

        //DLc
        DLCProgressBar.setMinimum(0);
        DLCProgressBar.setMaximum(company.getDrive().getMaxDLCs());

        //Sprites
        spritesProgressBar.setMinimum(0);
        spritesProgressBar.setMaximum(company.getDrive().getMaxSprites());

        //Sistemas
        siistemasProgressBar.setMinimum(0);
        siistemasProgressBar.setMaximum(company.getDrive().getMaxSistems());

        //El numero de empleados con el que se comienza
        cantDesarroladoresLabel.setText(String.valueOf(company.getEmployees()[0].getSize()));
        cantDisenadoresLabel.setText(String.valueOf(company.getEmployees()[1].getSize()));
        cantSpritesLabel.setText(String.valueOf(company.getEmployees()[2].getSize()));
        cantProgramadoresLabel.setText(String.valueOf(company.getEmployees()[3].getSize()));
        cantDLCLabel.setText(String.valueOf(company.getEmployees()[4].getSize()));
        cantIntegradoresLabel.setText(String.valueOf(company.getEmployees()[5].getSize()));

        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guionProgressBar = new javax.swing.JProgressBar();
        levelsProgressBar = new javax.swing.JProgressBar();
        spritesProgressBar = new javax.swing.JProgressBar();
        siistemasProgressBar = new javax.swing.JProgressBar();
        DLCProgressBar = new javax.swing.JProgressBar();
        companyLogo = new javax.swing.JLabel();
        utilidadLabel = new javax.swing.JLabel();
        gananciasLabel = new javax.swing.JLabel();
        costosLabel = new javax.swing.JLabel();
        utilidadLabel1 = new javax.swing.JLabel();
        desarroladoresLabel = new javax.swing.JLabel();
        disenadoresLabel = new javax.swing.JLabel();
        integradoresLabel = new javax.swing.JLabel();
        programadoresLabel = new javax.swing.JLabel();
        dlcLabel = new javax.swing.JLabel();
        masIntegradoresButton = new javax.swing.JButton();
        menosIntegradoresButton = new javax.swing.JButton();
        cantIntegradoresLabel = new javax.swing.JLabel();
        masDLCButton = new javax.swing.JButton();
        menosDLCButton = new javax.swing.JButton();
        cantDLCLabel = new javax.swing.JLabel();
        masProgramadoresButton = new javax.swing.JButton();
        menosProgramadoresButton = new javax.swing.JButton();
        cantProgramadoresLabel = new javax.swing.JLabel();
        masSpritesButton = new javax.swing.JButton();
        menosSpritesButton = new javax.swing.JButton();
        cantSpritesLabel = new javax.swing.JLabel();
        masDisenadoresButton = new javax.swing.JButton();
        menosDisenadoresButton = new javax.swing.JButton();
        cantDisenadoresLabel = new javax.swing.JLabel();
        masDesarrolladoresButton = new javax.swing.JButton();
        menosDesarroladoresButton = new javax.swing.JButton();
        cantDesarroladoresLabel = new javax.swing.JLabel();
        utilidadEmpresaLabel = new javax.swing.JLabel();
        costosEmpresaLabel = new javax.swing.JLabel();
        gananciasEmpresaLabel = new javax.swing.JLabel();
        dlcsLabel = new javax.swing.JLabel();
        guionesLabel = new javax.swing.JLabel();
        nivelesLabel = new javax.swing.JLabel();
        spritesLabel = new javax.swing.JLabel();
        sistemasLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dlcCostosLabel = new javax.swing.JLabel();
        guionesCostosLabel = new javax.swing.JLabel();
        nivelesCostosLabel = new javax.swing.JLabel();
        spritesCostosLabel = new javax.swing.JLabel();
        sistemasCostosLabel = new javax.swing.JLabel();
        utilidadLabel2 = new javax.swing.JLabel();
        gananciasLabel1 = new javax.swing.JLabel();
        costosLabel1 = new javax.swing.JLabel();
        faltasLabel = new javax.swing.JLabel();
        costosPMLabel = new javax.swing.JLabel();
        statusPMLabel = new javax.swing.JLabel();
        gananciasLabel2 = new javax.swing.JLabel();
        statusDirectorLabel = new javax.swing.JLabel();
        costosLabel2 = new javax.swing.JLabel();
        costosDirectorLabel = new javax.swing.JLabel();
        vovlerButton = new javax.swing.JButton();
        verGraficoButton = new javax.swing.JButton();
        gananciasLabel3 = new javax.swing.JLabel();
        catnidadDeTrabajadores = new javax.swing.JLabel();
        utilidadLabel3 = new javax.swing.JLabel();
        diasLanzamientoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guionProgressBar.setBackground(new java.awt.Color(0, 0, 255));
        guionProgressBar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(guionProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 101, 125, 40));

        levelsProgressBar.setBackground(new java.awt.Color(0, 0, 255));
        levelsProgressBar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(levelsProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 101, 125, 40));

        spritesProgressBar.setBackground(new java.awt.Color(0, 0, 255));
        spritesProgressBar.setForeground(new java.awt.Color(255, 255, 255));
        spritesProgressBar.setToolTipText("");
        getContentPane().add(spritesProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 101, 125, 40));

        siistemasProgressBar.setBackground(new java.awt.Color(0, 0, 255));
        siistemasProgressBar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(siistemasProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 101, 125, 40));

        DLCProgressBar.setBackground(new java.awt.Color(0, 0, 255));
        DLCProgressBar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DLCProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 101, 125, 40));
        getContentPane().add(companyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 294, 58));

        utilidadLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        utilidadLabel.setText("Utilidad:");
        getContentPane().add(utilidadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 80, 30));

        gananciasLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gananciasLabel.setText("Ganancias:");
        getContentPane().add(gananciasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 80, 30));

        costosLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        costosLabel.setText("Costos:");
        getContentPane().add(costosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 80, 30));

        utilidadLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        utilidadLabel1.setText("Artistas de sprites:");
        getContentPane().add(utilidadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 170, 30));

        desarroladoresLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        desarroladoresLabel.setText("Desarrolladores de narrativa:");
        getContentPane().add(desarroladoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 190, 30));

        disenadoresLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        disenadoresLabel.setText("Diseñadores de niveles:");
        getContentPane().add(disenadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 180, 30));

        integradoresLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        integradoresLabel.setText("Integradores:");
        getContentPane().add(integradoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 150, 30));

        programadoresLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        programadoresLabel.setText("Programadores de lógica:");
        getContentPane().add(programadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 180, 30));

        dlcLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dlcLabel.setText("Desarrolladores de DLC:");
        getContentPane().add(dlcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 180, 30));

        masIntegradoresButton.setText("+");
        masIntegradoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masIntegradoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masIntegradoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 50, 40));

        menosIntegradoresButton.setText("-");
        menosIntegradoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosIntegradoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menosIntegradoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 50, 40));

        cantIntegradoresLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantIntegradoresLabel.setText("0");
        getContentPane().add(cantIntegradoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 30, 20));

        masDLCButton.setText("+");
        masDLCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masDLCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masDLCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 50, 40));

        menosDLCButton.setText("-");
        menosDLCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosDLCButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menosDLCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 50, 40));

        cantDLCLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantDLCLabel.setText("0");
        getContentPane().add(cantDLCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 30, 20));

        masProgramadoresButton.setText("+");
        masProgramadoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masProgramadoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masProgramadoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 50, 40));

        menosProgramadoresButton.setText("-");
        menosProgramadoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosProgramadoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menosProgramadoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 50, 40));

        cantProgramadoresLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantProgramadoresLabel.setText("0");
        getContentPane().add(cantProgramadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 30, 20));

        masSpritesButton.setText("+");
        masSpritesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masSpritesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masSpritesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 50, 40));

        menosSpritesButton.setText("-");
        menosSpritesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosSpritesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menosSpritesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 50, 40));

        cantSpritesLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantSpritesLabel.setText("0");
        getContentPane().add(cantSpritesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, 30, 20));

        masDisenadoresButton.setText("+");
        masDisenadoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masDisenadoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masDisenadoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 50, 40));

        menosDisenadoresButton.setText("-");
        menosDisenadoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosDisenadoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menosDisenadoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 50, 40));

        cantDisenadoresLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantDisenadoresLabel.setText("0");
        getContentPane().add(cantDisenadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 30, 20));

        masDesarrolladoresButton.setText("+");
        masDesarrolladoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masDesarrolladoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masDesarrolladoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 50, 40));

        menosDesarroladoresButton.setText("-");
        menosDesarroladoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosDesarroladoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(menosDesarroladoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 50, 40));

        cantDesarroladoresLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cantDesarroladoresLabel.setText("0");
        getContentPane().add(cantDesarroladoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 30, 20));

        utilidadEmpresaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        utilidadEmpresaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        utilidadEmpresaLabel.setText("0");
        getContentPane().add(utilidadEmpresaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 100, 30));

        costosEmpresaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        costosEmpresaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        costosEmpresaLabel.setText("0");
        getContentPane().add(costosEmpresaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, 30));

        gananciasEmpresaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gananciasEmpresaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gananciasEmpresaLabel.setText("0");
        getContentPane().add(gananciasEmpresaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 30));

        dlcsLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dlcsLabel.setText("DLCs");
        getContentPane().add(dlcsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 100, 50));

        guionesLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        guionesLabel.setText("Guiones");
        getContentPane().add(guionesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 50));

        nivelesLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nivelesLabel.setText("Niveles");
        getContentPane().add(nivelesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, 50));

        spritesLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        spritesLabel.setText("Sprites");
        getContentPane().add(spritesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 100, 50));

        sistemasLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        sistemasLabel.setText("Sistemas");
        getContentPane().add(sistemasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 100, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Gastos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));

        dlcCostosLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dlcCostosLabel.setText("0");
        getContentPane().add(dlcCostosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 90, -1));

        guionesCostosLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guionesCostosLabel.setText("0");
        getContentPane().add(guionesCostosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 90, -1));

        nivelesCostosLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nivelesCostosLabel.setText("0");
        getContentPane().add(nivelesCostosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 90, -1));

        spritesCostosLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        spritesCostosLabel.setText("0");
        getContentPane().add(spritesCostosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 90, -1));

        sistemasCostosLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sistemasCostosLabel.setText("0");
        getContentPane().add(sistemasCostosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 90, -1));

        utilidadLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        utilidadLabel2.setText("Faltas:");
        getContentPane().add(utilidadLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 30));

        gananciasLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gananciasLabel1.setText("Status PM:");
        getContentPane().add(gananciasLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 30));

        costosLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        costosLabel1.setText("Costos:");
        getContentPane().add(costosLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 30));

        faltasLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        faltasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        faltasLabel.setText("0");
        getContentPane().add(faltasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 100, 30));

        costosPMLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        costosPMLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        costosPMLabel.setText("0");
        getContentPane().add(costosPMLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 100, 30));

        statusPMLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        statusPMLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        statusPMLabel.setText("Viendo streams");
        getContentPane().add(statusPMLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, 30));

        gananciasLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gananciasLabel2.setText("Status Director:");
        getContentPane().add(gananciasLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 30));

        statusDirectorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        statusDirectorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        statusDirectorLabel.setText("Trabajando");
        getContentPane().add(statusDirectorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 30));

        costosLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        costosLabel2.setText("Costos:");
        getContentPane().add(costosLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 80, 30));

        costosDirectorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        costosDirectorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        costosDirectorLabel.setText("0");
        getContentPane().add(costosDirectorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 100, 30));

        vovlerButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        vovlerButton.setText("Volver");
        getContentPane().add(vovlerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 40));

        verGraficoButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        verGraficoButton.setText("Ver Gráfico");
        getContentPane().add(verGraficoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 140, 40));

        gananciasLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gananciasLabel3.setText("Trabajadores disponibles:");
        getContentPane().add(gananciasLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 180, 30));

        catnidadDeTrabajadores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        catnidadDeTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        catnidadDeTrabajadores.setText("0");
        getContentPane().add(catnidadDeTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 60, 40));

        utilidadLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        utilidadLabel3.setText("Días para el lanzamiento");
        getContentPane().add(utilidadLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 30));

        diasLanzamientoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        diasLanzamientoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        diasLanzamientoLabel.setText("0");
        getContentPane().add(diasLanzamientoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menosDesarroladoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosDesarroladoresButtonActionPerformed
        company.fireEmployee(0);
        cantDesarroladoresLabel.setText(String.valueOf(company.getEmployees()[0].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_menosDesarroladoresButtonActionPerformed

    private void masDesarrolladoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masDesarrolladoresButtonActionPerformed
        company.hireEmployee(0);
        cantDesarroladoresLabel.setText(String.valueOf(company.getEmployees()[0].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_masDesarrolladoresButtonActionPerformed

    private void masDisenadoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masDisenadoresButtonActionPerformed
        company.hireEmployee(1);
        cantDisenadoresLabel.setText(String.valueOf(company.getEmployees()[1].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_masDisenadoresButtonActionPerformed

    private void menosDisenadoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosDisenadoresButtonActionPerformed
        company.fireEmployee(1);
        cantDisenadoresLabel.setText(String.valueOf(company.getEmployees()[1].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_menosDisenadoresButtonActionPerformed

    private void masSpritesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masSpritesButtonActionPerformed
        company.hireEmployee(2);
        cantSpritesLabel.setText(String.valueOf(company.getEmployees()[2].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_masSpritesButtonActionPerformed

    private void menosSpritesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosSpritesButtonActionPerformed
        company.fireEmployee(2);
        cantSpritesLabel.setText(String.valueOf(company.getEmployees()[2].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_menosSpritesButtonActionPerformed

    private void masProgramadoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masProgramadoresButtonActionPerformed
        company.hireEmployee(3);
        cantProgramadoresLabel.setText(String.valueOf(company.getEmployees()[3].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_masProgramadoresButtonActionPerformed

    private void menosProgramadoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosProgramadoresButtonActionPerformed
        company.fireEmployee(3);
        cantProgramadoresLabel.setText(String.valueOf(company.getEmployees()[3].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_menosProgramadoresButtonActionPerformed

    private void masDLCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masDLCButtonActionPerformed
        company.hireEmployee(4);
        cantDLCLabel.setText(String.valueOf(company.getEmployees()[4].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_masDLCButtonActionPerformed

    private void menosDLCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosDLCButtonActionPerformed
        company.fireEmployee(4);
        cantDLCLabel.setText(String.valueOf(company.getEmployees()[4].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_menosDLCButtonActionPerformed

    private void masIntegradoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masIntegradoresButtonActionPerformed
        company.hireEmployee(5);
        cantIntegradoresLabel.setText(String.valueOf(company.getEmployees()[5].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_masIntegradoresButtonActionPerformed

    private void menosIntegradoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosIntegradoresButtonActionPerformed
        company.fireEmployee(5);
        cantIntegradoresLabel.setText(String.valueOf(company.getEmployees()[5].getSize()));
        catnidadDeTrabajadores.setText(String.valueOf(company.getAmountOfEmployees()));
    }//GEN-LAST:event_menosIntegradoresButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar DLCProgressBar;
    private javax.swing.JLabel cantDLCLabel;
    private javax.swing.JLabel cantDesarroladoresLabel;
    private javax.swing.JLabel cantDisenadoresLabel;
    private javax.swing.JLabel cantIntegradoresLabel;
    private javax.swing.JLabel cantProgramadoresLabel;
    private javax.swing.JLabel cantSpritesLabel;
    private javax.swing.JLabel catnidadDeTrabajadores;
    private javax.swing.JLabel companyLogo;
    private javax.swing.JLabel costosDirectorLabel;
    private javax.swing.JLabel costosEmpresaLabel;
    private javax.swing.JLabel costosLabel;
    private javax.swing.JLabel costosLabel1;
    private javax.swing.JLabel costosLabel2;
    private javax.swing.JLabel costosPMLabel;
    private javax.swing.JLabel desarroladoresLabel;
    private javax.swing.JLabel diasLanzamientoLabel;
    private javax.swing.JLabel disenadoresLabel;
    private javax.swing.JLabel dlcCostosLabel;
    private javax.swing.JLabel dlcLabel;
    private javax.swing.JLabel dlcsLabel;
    private javax.swing.JLabel faltasLabel;
    private javax.swing.JLabel gananciasEmpresaLabel;
    private javax.swing.JLabel gananciasLabel;
    private javax.swing.JLabel gananciasLabel1;
    private javax.swing.JLabel gananciasLabel2;
    private javax.swing.JLabel gananciasLabel3;
    private javax.swing.JProgressBar guionProgressBar;
    private javax.swing.JLabel guionesCostosLabel;
    private javax.swing.JLabel guionesLabel;
    private javax.swing.JLabel integradoresLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar levelsProgressBar;
    private javax.swing.JButton masDLCButton;
    private javax.swing.JButton masDesarrolladoresButton;
    private javax.swing.JButton masDisenadoresButton;
    private javax.swing.JButton masIntegradoresButton;
    private javax.swing.JButton masProgramadoresButton;
    private javax.swing.JButton masSpritesButton;
    private javax.swing.JButton menosDLCButton;
    private javax.swing.JButton menosDesarroladoresButton;
    private javax.swing.JButton menosDisenadoresButton;
    private javax.swing.JButton menosIntegradoresButton;
    private javax.swing.JButton menosProgramadoresButton;
    private javax.swing.JButton menosSpritesButton;
    private javax.swing.JLabel nivelesCostosLabel;
    private javax.swing.JLabel nivelesLabel;
    private javax.swing.JLabel programadoresLabel;
    private javax.swing.JProgressBar siistemasProgressBar;
    private javax.swing.JLabel sistemasCostosLabel;
    private javax.swing.JLabel sistemasLabel;
    private javax.swing.JLabel spritesCostosLabel;
    private javax.swing.JLabel spritesLabel;
    private javax.swing.JProgressBar spritesProgressBar;
    private javax.swing.JLabel statusDirectorLabel;
    private javax.swing.JLabel statusPMLabel;
    private javax.swing.JLabel utilidadEmpresaLabel;
    private javax.swing.JLabel utilidadLabel;
    private javax.swing.JLabel utilidadLabel1;
    private javax.swing.JLabel utilidadLabel2;
    private javax.swing.JLabel utilidadLabel3;
    private javax.swing.JButton verGraficoButton;
    private javax.swing.JButton vovlerButton;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cantDLCLabel
     */
    public javax.swing.JLabel getCantDLCLabel() {
        return cantDLCLabel;
    }

    /**
     * @return the cantDesarroladoresLabel
     */
    public javax.swing.JLabel getCantDesarroladoresLabel() {
        return cantDesarroladoresLabel;
    }

    /**
     * @return the cantDisenadoresLabel
     */
    public javax.swing.JLabel getCantDisenadoresLabel() {
        return cantDisenadoresLabel;
    }

    /**
     * @return the cantIntegradoresLabel
     */
    public javax.swing.JLabel getCantIntegradoresLabel() {
        return cantIntegradoresLabel;
    }

    /**
     * @return the cantProgramadoresLabel
     */
    public javax.swing.JLabel getCantProgramadoresLabel() {
        return cantProgramadoresLabel;
    }

    /**
     * @return the cantSpritesLabel
     */
    public javax.swing.JLabel getCantSpritesLabel() {
        return cantSpritesLabel;
    }

    /**
     * @return the DLCProgressBar
     */
    public javax.swing.JProgressBar getDLCProgressBar() {
        return DLCProgressBar;
    }

    /**
     * @return the catnidadDeTrabajadores
     */
    public javax.swing.JLabel getCatnidadDeTrabajadores() {
        return catnidadDeTrabajadores;
    }

    /**
     * @return the costosEmpresaLabel
     */
    public javax.swing.JLabel getCostosEmpresaLabel() {
        return costosEmpresaLabel;
    }

    /**
     * @return the gananciasEmpresaLabel
     */
    public javax.swing.JLabel getGananciasEmpresaLabel() {
        return gananciasEmpresaLabel;
    }

    /**
     * @return the guionProgressBar
     */
    public javax.swing.JProgressBar getGuionProgressBar() {
        return guionProgressBar;
    }

    /**
     * @return the levelsProgressBar
     */
    public javax.swing.JProgressBar getLevelsProgressBar() {
        return levelsProgressBar;
    }

    /**
     * @return the siistemasProgressBar
     */
    public javax.swing.JProgressBar getSiistemasProgressBar() {
        return siistemasProgressBar;
    }

    /**
     * @return the spritesProgressBar
     */
    public javax.swing.JProgressBar getSpritesProgressBar() {
        return spritesProgressBar;
    }

    /**
     * @return the utilidadEmpresaLabel
     */
    public javax.swing.JLabel getUtilidadEmpresaLabel() {
        return utilidadEmpresaLabel;
    }

    /**
     * @return the costosDirectorLabel
     */
    public javax.swing.JLabel getCostosDirectorLabel() {
        return costosDirectorLabel;
    }

    /**
     * @return the costosPMLabel
     */
    public javax.swing.JLabel getCostosPMLabel() {
        return costosPMLabel;
    }

    /**
     * @return the dlcCostosLabel
     */
    public javax.swing.JLabel getDlcCostosLabel() {
        return dlcCostosLabel;
    }

    /**
     * @return the faltasLabel
     */
    public javax.swing.JLabel getFaltasLabel() {
        return faltasLabel;
    }

    /**
     * @return the guionesCostosLabel
     */
    public javax.swing.JLabel getGuionesCostosLabel() {
        return guionesCostosLabel;
    }

    /**
     * @return the nivelesCostosLabel
     */
    public javax.swing.JLabel getNivelesCostosLabel() {
        return nivelesCostosLabel;
    }

    /**
     * @return the sistemasCostosLabel
     */
    public javax.swing.JLabel getSistemasCostosLabel() {
        return sistemasCostosLabel;
    }

    /**
     * @return the spritesCostosLabel
     */
    public javax.swing.JLabel getSpritesCostosLabel() {
        return spritesCostosLabel;
    }

    /**
     * @return the statusDirectorLabel
     */
    public javax.swing.JLabel getStatusDirectorLabel() {
        return statusDirectorLabel;
    }

    /**
     * @return the statusPMLabel
     */
    public javax.swing.JLabel getStatusPMLabel() {
        return statusPMLabel;
    }

    /**
     * @return the diasLanzamientoLabel
     */
    public javax.swing.JLabel getDiasLanzamientoLabel() {
        return diasLanzamientoLabel;
    }
}
