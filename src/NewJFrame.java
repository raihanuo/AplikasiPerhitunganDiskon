/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelPenghematan = new javax.swing.JLabel();
        labelHargaAkhir = new javax.swing.JLabel();
        labelRiwayat = new javax.swing.JLabel();
        textFieldHarga = new javax.swing.JTextField();
        textFieldDiskon = new javax.swing.JTextField();
        comboBoxDiskon = new javax.swing.JComboBox<>();
        sliderDiskon = new javax.swing.JSlider();
        buttonHitung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaRiwayat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perhitungan Diskon");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Masukkan Harga");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kode Diskon");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jumlah Diskon (%)");

        labelPenghematan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPenghematan.setText("Total Penghematan");

        labelHargaAkhir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHargaAkhir.setText("Harga Akhir");

        labelRiwayat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelRiwayat.setText("Riwayat");

        textFieldHarga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        textFieldDiskon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboBoxDiskon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "20", "30", "40", "50" }));
        comboBoxDiskon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxDiskonItemStateChanged(evt);
            }
        });

        sliderDiskon.setMajorTickSpacing(10);
        sliderDiskon.setMaximum(50);
        sliderDiskon.setMinorTickSpacing(5);
        sliderDiskon.setPaintLabels(true);
        sliderDiskon.setPaintTicks(true);
        sliderDiskon.setValue(0);

        buttonHitung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonHitung.setText("Hitung Diskon");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        textAreaRiwayat.setEditable(false);
        textAreaRiwayat.setColumns(20);
        textAreaRiwayat.setRows(5);
        jScrollPane1.setViewportView(textAreaRiwayat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldDiskon)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldHarga)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHargaAkhir)
                            .addComponent(labelPenghematan)
                            .addComponent(labelRiwayat))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textFieldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxDiskon)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHargaAkhir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPenghematan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRiwayat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        try {
            // Memeriksa apakah textFieldHarga kosong
            if (textFieldHarga.getText().isEmpty()) {
                // Menampilkan pesan kesalahan jika harga tidak dimasukkan
                JOptionPane.showMessageDialog(this, "Masukkan harga terlebih dahulu!");
            } else {
                // Mengambil nilai diskon dari comboBox
                String __ = (String) comboBoxDiskon.getSelectedItem();
                int comboBox = Integer.valueOf(__); // Mengonversi string ke integer
                int slider = sliderDiskon.getValue(); // Mengambil nilai dari slider
                // Menentukan diskon maksimum antara nilai dari comboBox dan slider
                int diskon = comboBox > slider ? comboBox : slider;

                // Menghitung harga awal, penghematan, dan harga akhir
                double hargaAwal = Double.parseDouble(textFieldHarga.getText()),
                    penghematan = hargaAwal * diskon / 100,
                    hargaAkhir = hargaAwal - penghematan;

                // Memeriksa apakah kode diskon diinput
                String kodeDiskon = textFieldDiskon.getText();
                if (!kodeDiskon.isEmpty()) {
                    // Menambahkan penghematan tambahan jika kode diskon ada
                    penghematan += 5000; 
                    hargaAkhir = hargaAwal - penghematan; // Menghitung kembali harga akhir
                }

                // Menampilkan hasil akhir dan penghematan pada label
                labelHargaAkhir.setText("Harga Akhir : " + hargaAkhir);
                labelPenghematan.setText("Total Penghematan : " + penghematan);

                // Menformat hasil untuk ditampilkan di textAreaRiwayat
                String hasil = String.format("Harga Asli : Rp %.2f\nDiskon : %d%%\nKode Diskon : %s\nHarga Akhir : Rp %.2f\nPenghematan : Rp %.2f\n\n", 
                    hargaAwal, diskon, kodeDiskon, hargaAkhir, penghematan);
                // Menambahkan hasil ke dalam riwayat
                textAreaRiwayat.append(hasil);
            }
        } catch (NumberFormatException e) {
            // Menampilkan pesan kesalahan jika harga tidak valid
            JOptionPane.showMessageDialog(this, "Masukkan harga yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void comboBoxDiskonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxDiskonItemStateChanged
        // Memeriksa apakah item pada comboBox terpilih
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            // Mengambil nilai dari comboBox dan mengatur nilai pada slider
            String value = (String) comboBoxDiskon.getSelectedItem();
            sliderDiskon.setValue(Integer.valueOf(value));
        }
    }//GEN-LAST:event_comboBoxDiskonItemStateChanged

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHitung;
    private javax.swing.JComboBox<String> comboBoxDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHargaAkhir;
    private javax.swing.JLabel labelPenghematan;
    private javax.swing.JLabel labelRiwayat;
    private javax.swing.JSlider sliderDiskon;
    private javax.swing.JTextArea textAreaRiwayat;
    private javax.swing.JTextField textFieldDiskon;
    private javax.swing.JTextField textFieldHarga;
    // End of variables declaration//GEN-END:variables
}
