/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Negocio.Registro;
import Negocio.Test;
import java.awt.Checkbox;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import org.jpl7.Term;
import prolog.Prolog;


/**
 *
 * @author USUARIO
 */
public class JDTest extends javax.swing.JDialog {
    JDPreguntas obj = new JDPreguntas(null, true);
    /**
     * Creates new form JDTest
     */
    public JDTest(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jButton1 = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("E-mail:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Sitka Small", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Seleccione todos los adjetivos que \ndescriban su personalidad. Señale \ntantos como desee, trate de definirse \ntal como es, no como le gustaría ser.");
        jScrollPane1.setViewportView(jTextArea1);

        chk1.setText("Matemático");
        chk1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chk1StateChanged(evt);
            }
        });
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });

        chk2.setText("Dominio espacial");

        chk3.setText("Dominio del habla");
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });

        chk4.setText("Vocación de servicio");
        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });

        chk5.setText("Relaciones interpersonales");

        chk6.setText("Manejo de software");
        chk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk6ActionPerformed(evt);
            }
        });

        chk7.setText("Buen vocabulario");
        chk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk7ActionPerformed(evt);
            }
        });

        chk8.setText("Razonamiento Matematico");
        chk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk8ActionPerformed(evt);
            }
        });

        jButton3.setText("ENVIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk8)
                    .addComponent(chk4)
                    .addComponent(chk3)
                    .addComponent(chk2)
                    .addComponent(chk1)
                    .addComponent(chk5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(chk7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chk6, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chk1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk8)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chk1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chk1StateChanged

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        // TODO add your handling code here:

        if(chk1.isSelected()==true){
            llamarForm(1);
        }

    }//GEN-LAST:event_chk1ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        // TODO add your handling code here:
        if(chk3.isSelected()==true){
            llamarForm(3);
        }
    }//GEN-LAST:event_chk3ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4ActionPerformed

    private void chk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk6ActionPerformed

    private void chk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk7ActionPerformed
        // TODO add your handling code here:
        if(chk7.isSelected()==true){
            llamarForm(7);
        }
    }//GEN-LAST:event_chk7ActionPerformed

    private void chk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk8ActionPerformed
        // TODO add your handling code here:
        if(chk8.isSelected()==true){
            llamarForm(8);
        }
    }//GEN-LAST:event_chk8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int posAlumno = Registro.buscarAlumno(txtemail.getText());

        if (posAlumno !=-1) {
            Prolog.limpiezaprolog();
            if(chk1.isSelected()){
                Prolog.insertaopc("matematico", "si");
            }else{
                Prolog.insertaopc("matematico", "no");
            }
            if(chk2.isSelected()){
                Prolog.insertaopc("domesp", "si");
            }else{
                Prolog.insertaopc("domesp", "no");
            }
            if(chk3.isSelected()){
                Prolog.insertaopc("domhabla", "si");
            }else{
                Prolog.insertaopc("domhabla", "no");
            }
            if(chk4.isSelected()){
                Prolog.insertaopc("vocserv", "si");
            }else{
                Prolog.insertaopc("vocserv", "no");
            }
            if(chk5.isSelected()){
                Prolog.insertaopc("relinter", "si");
            }else{
                Prolog.insertaopc("relinter", "no");
            }
            if(chk6.isSelected()){
                Prolog.insertaopc("mansw", "si");
            }else{
                Prolog.insertaopc("mansw", "no");
            }
            Prolog.reglas(txtemail.getText());
            JOptionPane.showMessageDialog(null, "TEST REGISTRADO", "MENSAJE DEL SISTEMA", JOptionPane.INFORMATION_MESSAGE);

            FrmResultados interfaz = new FrmResultados();
            FrmPrincipal.contenedor.add(interfaz);
            this.setVisible(false);
            interfaz.toFront();
            interfaz.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "ALUMNO NO REGISTRADO", "MENSAJE DEL SISTEMA", JOptionPane.ERROR_MESSAGE);
        }

        txtemail.setText("");
        chk1.setSelected(false);
        chk2.setSelected(false);
        chk3.setSelected(false);
        chk4.setSelected(false);
        chk5.setSelected(false);
        chk6.setSelected(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void llamarForm(int valor){
        obj.tipo(valor);
        obj.setVisible(true);
        
    }
    public static void bloquearChk(int chk){ 
        switch(chk){
            case 1:
                chk1.setSelected(false);
                chk1.setEnabled(false);
                break;
            case 3:
                chk3.setSelected(false);
                chk3.setEnabled(false);
                break;
            case 7:
                chk7.setSelected(false);
                chk7.setEnabled(false);
                break;
            case 8:
                chk8.setSelected(false);
                chk8.setEnabled(false);
                break;
        }

    }
    public static void desbloquearChk(int chk){
              
         switch(chk){
            case 1:
                chk1.setSelected(true);
                chk1.setEnabled(false);
                break;
            case 3:
                chk3.setSelected(true);
                chk3.setEnabled(false);
                break;
            case 7:
                chk7.setSelected(true);
                chk7.setEnabled(false);
                break;
            case 8:
                chk8.setSelected(true);
                chk8.setEnabled(false);
                break;          
        }
    }
  
    
    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox chk1;
    public static javax.swing.JCheckBox chk2;
    public static javax.swing.JCheckBox chk3;
    public static javax.swing.JCheckBox chk4;
    public static javax.swing.JCheckBox chk5;
    public static javax.swing.JCheckBox chk6;
    public static javax.swing.JCheckBox chk7;
    public static javax.swing.JCheckBox chk8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
