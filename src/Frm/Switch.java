/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frm;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author bradl
 */
public class Switch extends javax.swing.JFrame {
    JButton boton;
    JRadioButton radio1, radio2, radio3;

    /**
     * Creates new form Switch
     */
    public Switch() {
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

        lEjer3 = new javax.swing.JLabel();
        bDeterminar5 = new javax.swing.JButton();
        tfMes3 = new javax.swing.JTextField();
        bMostrar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEjer1 = new javax.swing.JTextArea();
        pEstadoCivil = new javax.swing.JPanel();
        rbSoltero = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbOtro = new javax.swing.JRadioButton();
        bCalcular4 = new javax.swing.JButton();
        tfMes1 = new javax.swing.JTextField();
        bMostrar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfMes2 = new javax.swing.JTextField();
        lEjer5 = new javax.swing.JLabel();
        bMostrar2 = new javax.swing.JButton();
        tfNum5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lEjer3.setText("3. Según el número del mes, determine el número de días");

        bDeterminar5.setText("Determinar");
        bDeterminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeterminar5ActionPerformed(evt);
            }
        });

        bMostrar3.setText("Mostar");
        bMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Realice la tarea que indica la selección");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        taEjer1.setEditable(false);
        taEjer1.setBackground(new java.awt.Color(240, 240, 240));
        taEjer1.setColumns(20);
        taEjer1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taEjer1.setLineWrap(true);
        taEjer1.setRows(5);
        taEjer1.setText("1. De acuerdo con el nombre del mes digitado, muestre si pertenece al grupo de 28 días, 29 días, 30 días o 31 días");
        taEjer1.setToolTipText("");
        taEjer1.setAutoscrolls(false);
        taEjer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(taEjer1);

        pEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));

        rbSoltero.setText("Calcular la raíz de un número");

        rbCasado.setText("Calcular el residuo de una división entera");

        rbOtro.setText("Mostrar el menor de N números");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCasado)
                            .addComponent(rbOtro)
                            .addComponent(rbSoltero)))
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bCalcular4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbSoltero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbOtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bMostrar1.setText("Mostar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Según el número del mes, determine la época del año");

        lEjer5.setText("5. Determinar si el número entero es par o impar");

        bMostrar2.setText("Mostar");
        bMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar2))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar3))
                    .addComponent(lEjer4)
                    .addComponent(lEjer2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeterminar5)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeterminar5)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed
        // TODO add your handling code here:
        String mes = tfMes1.getText().toLowerCase();
        int mesNum = 0;
        switch (mes) {
            case "enero":
                JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case "febrero":
                 JOptionPane.showMessageDialog(this, "Tiene 29 dias");
                break;
            case "marzo":
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case "abril":
                 JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case "mayo":
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case "junio":
                JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case "julio":
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case "agosto":
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case "septiembre":
                JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case "octubre":
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case "noviembre":
                JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case "diciembre":
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_bMostrar1ActionPerformed

    private void bMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar2ActionPerformed
        // TODO add your handling code here:
        int numMes = Integer.parseInt(tfMes2.getText());
        switch(numMes){
            case 1:JOptionPane.showMessageDialog(this, "Invierno"); 
                break;
            case 2: JOptionPane.showMessageDialog(this, "Invierno");
                break;
            case 3:JOptionPane.showMessageDialog(this, "Invierno");
                break;
            case 4: JOptionPane.showMessageDialog(this, "Primavera");
                break;
            case 5: JOptionPane.showMessageDialog(this, "Primavera");
                break;
            case 6:JOptionPane.showMessageDialog(this, "Primavera");
                break;
            case 7: JOptionPane.showMessageDialog(this, "Verano");
                break;
            case 8: JOptionPane.showMessageDialog(this, "Verano");
                break;
            case 9:JOptionPane.showMessageDialog(this, "Verano");
                break;
            case 10: JOptionPane.showMessageDialog(this, "Otoño");
                break;
            case 11: JOptionPane.showMessageDialog(this, "Otoño");
                break;
            case 12:JOptionPane.showMessageDialog(this, "Otoño");
                break;
        }
    }//GEN-LAST:event_bMostrar2ActionPerformed

    private void bMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar3ActionPerformed
        // TODO add your handling code here:
        int numMes = Integer.parseInt(tfMes3.getText());
        switch (numMes) {
            case 1:
                JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case 2:
                 JOptionPane.showMessageDialog(this, "Tiene 29 dias");
                break;
            case 3:
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case 4:
                 JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case 5:
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case 6:
                JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case 7:
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case 8:
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case 9:
                JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case 10:
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            case 11:
                JOptionPane.showMessageDialog(this, "Tiene 30 dias");
                break;
            case 12:
                 JOptionPane.showMessageDialog(this, "Tiene 31 dias");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_bMostrar3ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        // TODO add your handling code here:

        if(rbSoltero.getModel().isSelected()){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
            JOptionPane.showMessageDialog(null, Math.sqrt(num));
        }else if(rbCasado.getModel().isSelected()){
            float num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
            float num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
            float residuo = num1%num2;
            JOptionPane.showMessageDialog(this, residuo);
        }else if(rbOtro.getModel().isSelected()){
            int[] numeros= {5,8,3,7,9,0,3,2,1,4,6};
            JOptionPane.showMessageDialog(this, numeros);
            int menor =0;
            for(int i:numeros){
            
            if(menor > i){
                menor = i;
            }
        }
        JOptionPane.showMessageDialog(this, menor);
        }
        
    }//GEN-LAST:event_bCalcular4ActionPerformed

    private void bDeterminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeterminar5ActionPerformed
        // TODO add your handling code here:
        int num = Integer.parseInt(tfNum5.getText());
        if(num%2 == 0){
            JOptionPane.showMessageDialog(null, "Es par");
        }else{
            JOptionPane.showMessageDialog(null, "Es impar");
        }
    }//GEN-LAST:event_bDeterminar5ActionPerformed

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
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Switch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bDeterminar5;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JPanel pEstadoCivil;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JTextArea taEjer1;
    private javax.swing.JTextField tfMes1;
    private javax.swing.JTextField tfMes2;
    private javax.swing.JTextField tfMes3;
    private javax.swing.JTextField tfNum5;
    // End of variables declaration//GEN-END:variables
}
