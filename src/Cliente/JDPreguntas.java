/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
import static Cliente.FrmPrincipal.contenedor;
import javax.swing.ImageIcon;

/**
 *
 * @author USUARIO
 */
public class JDPreguntas extends javax.swing.JDialog {

    /**
     * Creates new form JDPreguntas
     */
    public JDPreguntas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    String rpta; int valorChk;
    boolean bloquear;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        txtRpta = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(".: Pregunta de TEST VOCACIONAL");
        setBackground(new java.awt.Color(255, 255, 255));

        lblFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(txtRpta, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRpta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        System.out.println(rpta);
        if (!(txtRpta.getText().equalsIgnoreCase(rpta))){
            JDTest.bloquearChk(valorChk);
             //bloquear  = false;
             txtRpta.setText("");
            this.dispose();
        }else{
            JDTest.desbloquearChk(valorChk);
            //contenedor.add(obj);
            //FrmTest.setVisible(true);
            //JDTest.bloquearChk(valorChk);
            //bloquear  = true;
            txtRpta.setText("");
            this.dispose();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
   public void tipo(int valor){
        ImageIcon url;
        valorChk = valor;
        int ejer;
        //VALOR INDICA SI ES DE MATEMÁTICA, VOCACIÓN, ETC
        switch (valor){
            case 1:
                ejer = (int) (Math.random() * 5) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\atencion\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "B";   
                }
                if (ejer == 2){
                    rpta = "B";   
                }
                if (ejer == 3){
                    rpta = "A";   
                }
                if (ejer == 4){
                    rpta = "A";   
                }
                if (ejer == 5){
                    rpta = "D";   
                }
                break;
            case 2:    
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\hab_numerica\\"+ejer+".jpeg");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "5";   
                }
                if (ejer == 2){
                    rpta = "3";   
                }
                if (ejer == 3){
                    rpta = "3";   
                }
                if (ejer == 4){
                    rpta = "80";   
                }
                break;
            case 3:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\razonamiento\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "E";   
                }
                if (ejer == 2){
                    rpta = "D";   
                }
                if (ejer == 3){
                    rpta = "B";   
                }
                if (ejer == 4){
                    rpta = "B";   
                }
                break;    
                
            case 4:    
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\vocabulario\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "C";   
                }
                if (ejer == 2){
                    rpta = "A";   
                }
                if (ejer == 3){
                    rpta = "C";   
                }
                if (ejer == 4){
                    rpta = "C";   
                }
                break;
            case 5:
                url = new ImageIcon ("src\\imagenes\\Preguntas\\domhabla\\1.jpg");
                System.out.println(url);
                System.out.println(valor);
                lblFoto.setIcon(url);
                rpta= "B";
                break;
            case 6:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\espacial\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "C";   
                }
                if (ejer == 2){
                    rpta = "A";   
                }
                if (ejer == 3){
                    rpta = "D";   
                }
                if (ejer == 4){
                    rpta = "A";   
                }
                break;
           case 7:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\trabajo_equipo\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "C";   
                }
                if (ejer == 2){
                    rpta = "A";   
                }
                if (ejer == 3){
                    rpta = "B";   
                }
                if (ejer == 4){
                    rpta = "C";   
                }
                break;
            case 8:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\idioma\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "A";   
                }
                if (ejer == 2){
                    rpta = "A";   
                }
                if (ejer == 3){
                    rpta = "B";   
                }
                if (ejer == 4){
                    rpta = "D";   
                }
                break;
            case 9:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\informatica\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "A";   
                }
                if (ejer == 2){
                    rpta = "C";   
                }
                if (ejer == 3){
                    rpta = "A";   
                }
                if (ejer == 4){
                    rpta = "A";   
                }
                break;
            case 10:
                ejer = (int) (Math.random() * 3) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\potempresarial\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "B";   
                }
                if (ejer == 2){
                    rpta = "B";   
                }
                if (ejer == 3){
                    rpta = "B";   
                }
                break;
            case 11:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\comprension\\"+ejer+".PNG");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "C";   
                }
                if (ejer == 2){
                    rpta = "D";   
                }
                if (ejer == 3){
                    rpta = "D";   
                }
                if (ejer == 4){
                    rpta = "D";   
                }
                break;
            case 12:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\Mate\\"+ejer+".jpg");
                System.out.println(url);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "34";   
                }
                if (ejer == 2){
                    rpta = "-3";   
                }
                if (ejer == 3){
                    rpta = "10";   
                }
                if (ejer == 4){
                    rpta = "C";   
                }
                break;
            case 13:
                ejer = (int) (Math.random() * 4) + 1; //INDICA CUÁL DE LAS 4 PREGUNTAS APARECE

                url = new ImageIcon ("src\\imagenes\\Preguntas\\filosofia\\"+ejer+".PNG");
                System.out.println(url);
                System.out.println(ejer);
                lblFoto.setIcon(url);
                if (ejer == 1){
                    rpta = "2";   
                }
                if (ejer == 2){
                    rpta = "1";   
                }
                if (ejer == 3){
                    rpta = "1";   
                }
                if (ejer == 4){
                    rpta = "3";   
                }
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField txtRpta;
    // End of variables declaration//GEN-END:variables
}
