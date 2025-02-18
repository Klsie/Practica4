/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cena_Filosofos;

import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo Arana
 */
public class Mesa extends javax.swing.JFrame {

    private static int Filosofos = 5;
    private static Semaforo[] tenedores = new Semaforo[Filosofos];
    private static int[] contadorComidas = new int[5]; // Array para contar las comidas de cada filósofo
    private static Vector<Filosofos> hilosFilosofos = new Vector<>(); // Vector para almacenar los hilos de los filósofos

    public Mesa() {
        initComponents();
        for (int i = 0; i < Filosofos; i++) {
            tenedores[i] = new Semaforo(1);
        }
        lblAlerta.setVisible(false);
        btnSalir.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTemach = new javax.swing.JLabel();
        lblDiego = new javax.swing.JLabel();
        lblYordi = new javax.swing.JLabel();
        lblDany = new javax.swing.JLabel();
        lblJacobo = new javax.swing.JLabel();
        btnCenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContador = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        lblNombreDanny = new javax.swing.JLabel();
        lblNombreDiego = new javax.swing.JLabel();
        lblNombreJacobo = new javax.swing.JLabel();
        lblNombreTemach = new javax.swing.JLabel();
        lblNombreYordi = new javax.swing.JLabel();
        btnParar = new javax.swing.JButton();
        lblAlerta = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblMesa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cena de Filosofos");
        setBounds(new java.awt.Rectangle(0, 0, 1200, 850));
        setMinimumSize(new java.awt.Dimension(1200, 850));
        setSize(new java.awt.Dimension(1200, 850));
        getContentPane().setLayout(null);

        lblTemach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTemach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/temachPensando.jpeg"))); // NOI18N
        getContentPane().add(lblTemach);
        lblTemach.setBounds(300, 520, 240, 150);

        lblDiego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diegoPensando.jpg"))); // NOI18N
        getContentPane().add(lblDiego);
        lblDiego.setBounds(730, 210, 176, 180);

        lblYordi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/yordiPensando.jpg"))); // NOI18N
        getContentPane().add(lblYordi);
        lblYordi.setBounds(200, 230, 150, 150);

        lblDany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/danyPensando.jpeg"))); // NOI18N
        getContentPane().add(lblDany);
        lblDany.setBounds(450, 40, 150, 190);

        lblJacobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jacoboPensando.jpeg"))); // NOI18N
        getContentPane().add(lblJacobo);
        lblJacobo.setBounds(650, 440, 160, 160);

        btnCenar.setText("Cenar");
        btnCenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCenar);
        btnCenar.setBounds(480, 340, 75, 20);

        tblContador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Danny", "Diego", "Jacobo", "Temach", "Yordi"
            }
        ));
        jScrollPane1.setViewportView(tblContador);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 320, 50);

        lblTitulo.setText("Veces en las que ha comido el Filosofo");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(30, 30, 320, 16);

        lblNombreDanny.setText("Danny Flow");
        getContentPane().add(lblNombreDanny);
        lblNombreDanny.setBounds(490, 20, 70, 16);

        lblNombreDiego.setText("Diego Ruzzarin");
        getContentPane().add(lblNombreDiego);
        lblNombreDiego.setBounds(780, 190, 80, 16);

        lblNombreJacobo.setText("Jacobo Wong");
        getContentPane().add(lblNombreJacobo);
        lblNombreJacobo.setBounds(710, 600, 80, 20);

        lblNombreTemach.setText("Temach");
        getContentPane().add(lblNombreTemach);
        lblNombreTemach.setBounds(390, 680, 50, 16);

        lblNombreYordi.setText("Yordi Rosado");
        getContentPane().add(lblNombreYordi);
        lblNombreYordi.setBounds(210, 210, 80, 16);

        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });
        getContentPane().add(btnParar);
        btnParar.setBounds(30, 110, 72, 23);

        lblAlerta.setForeground(new java.awt.Color(153, 0, 0));
        lblAlerta.setText("Debera Reiniciar el Programa \n");
        getContentPane().add(lblAlerta);
        lblAlerta.setBounds(690, 50, 210, 80);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(480, 340, 72, 23);

        lblMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mesa.png"))); // NOI18N
        getContentPane().add(lblMesa);
        lblMesa.setBounds(240, 150, 522, 478);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenarActionPerformed

        hilosFilosofos.clear();

        for (int i = 0; i < Filosofos; i++) {
            Filosofos f = new Filosofos(i, tenedores);
            f.start();
            hilosFilosofos.add(f);
        }

    }//GEN-LAST:event_btnCenarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        for (Filosofos f : hilosFilosofos) {
            f.interrupt(); // Interrumpir el hilo
        }
        hilosFilosofos.clear(); // Limpiar la lista de hilos
        btnCenar.setVisible(false);
        lblTitulo.setText("Los Filosofos Comieron:");
        lblAlerta.setVisible(true);
        JOptionPane.showMessageDialog(null, "Necesitara Reiniciar el Programa", "Advertencia", HEIGHT);
        btnSalir.setVisible(true);

    }//GEN-LAST:event_btnPararActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);

            }
        });
    }

    public class Filosofos extends Thread {

        private int id;
        private Semaforo Izquierdo;
        private Semaforo Derecho;
        private String[] nombresFilosofos = {"Danny Flow", "Diego Ruzzarin", "Jacobo Wong", "El Temach", "Yordi Rosado"};

        public Filosofos(int id, Semaforo[] tenedores) {
            this.id = id;
            this.Izquierdo = tenedores[id];
            this.Derecho = tenedores[(id + 1) % tenedores.length];
        }

        private void conTenedor() throws InterruptedException {
            Derecho.tener();
            Izquierdo.tener();
        }

        private void sinTenedor() {
            Derecho.dejar();
            Izquierdo.dejar();
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // Pensar
                    System.out.println(nombresFilosofos[id] + " esta pensando");
                    switch (id) {
                        case 0:
                            lblDany.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/danyPensando.jpeg")));
                            break;
                        case 1:
                            lblDiego.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/diegoPensando.jpg")));
                            break;
                        case 2:
                            lblJacobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/jacoboPensando.jpeg")));
                            break;
                        case 3:
                            lblTemach.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/temachPensando.jpeg")));
                            break;
                        case 4:
                            lblYordi.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/YordiPensando.jpg")));
                            break;

                    }
                    Random random = new Random();
                    int randomNum = random.nextInt(4) + 1;
                    int randomMilliseconds = randomNum * 1000;

                    Thread.sleep(randomMilliseconds);

                    conTenedor();

                    // Comer
                    System.out.println(nombresFilosofos[id] + " esta comiendo");
                    contadorComidas[id]++; // Incrementar el contador de comidas del filósofo

                    switch (id) {
                        case 0:
                            lblDany.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/danyComiendo.png")));
                            break;
                        case 1:
                            lblDiego.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/diegoComiendo.png")));
                            break;
                        case 2:
                            lblJacobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/jacoboComiendo.png")));
                            break;
                        case 3:
                            lblTemach.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/temachComiendo.png")));
                            break;
                        case 4:
                            lblYordi.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/YordiComiendo.jpg")));
                            break;

                    }
                    updateTable();
                    Thread.sleep(1500);
                    // Dejar tenedores
                    sinTenedor();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void updateTable() {
        SwingUtilities.invokeLater(() -> {
            DefaultTableModel model = (DefaultTableModel) tblContador.getModel();
            for (int i = 0; i < contadorComidas.length; i++) {
                model.setValueAt(contadorComidas[i], 0, i);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCenar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblDany;
    private javax.swing.JLabel lblDiego;
    private javax.swing.JLabel lblJacobo;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lblNombreDanny;
    private javax.swing.JLabel lblNombreDiego;
    private javax.swing.JLabel lblNombreJacobo;
    private javax.swing.JLabel lblNombreTemach;
    private javax.swing.JLabel lblNombreYordi;
    private javax.swing.JLabel lblTemach;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblYordi;
    private javax.swing.JTable tblContador;
    // End of variables declaration//GEN-END:variables
}
