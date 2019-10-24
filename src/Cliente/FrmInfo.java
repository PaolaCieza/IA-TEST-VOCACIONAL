/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author GUADALUPE
 */
public class FrmInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmInfo
     */
    public FrmInfo() {
        initComponents();
    }
    
    public void carrera(int cod){
       
        switch (cod){
            case 1:
                lblTitulo.setText("Ing. Civil");
                txtDesc.setText("El egresado de esta carrera podrá:\n"
                        + "+ Elaborar estudios de impacto ambiental y planes de \n"
                        + "gestión de residuos.\n" 
                        + "+ Gestionar el abastecimiento y tratamiento de \n"
                        + "recursos hídricos y calidad del aire.\n" 
                        + "+ Diseñar edificios y obras de saneamiento urbano – rural.\n" 
                        + "+ Administrar procedimientos constructivos y maquinaria \n"
                        + "de construcción.\n" 
                        + "+ Asesorar arbitrajes, pericias y tasaciones de \n"
                        + "proyectos y obras de edificaciones, saneamiento, \n "
                        + "hidráulicas y de transporte.\n" 
                        + "+ Realizar estudios y diseño de captaciones de aguas \n"
                        + "superficiales o subterráneas.\n" 
                        + "+ Construir obras e instalaciones hidráulicas, sistemas\n"
                        + "energéticos e hidroeléctricos.\n" 
                        + "+ Diseñar obras de presas, conducciones y bombeos, \n"
                        + "puertos, aeropuertos, estaciones de transporte, vías\n"
                        + "y obras portuarias.\n" 
                        + "+ Aplicar herramientas tecnológicas para resolver \n"
                        + "problemas del entorno vial.");
                break;
            
            case 2:
                lblTitulo.setText("Ing. Ambiental");
                txtDesc.setText("El egresado de esta carrera podrá:\n"
                        + "+ Desarrollar proyectos de investigación científica y\n"
                        + "tecnológica orientados a la solución creativa de problemas\n"
                        + "ambientales con base de tecnologías limpias y uso \n"
                        + "eficiente de la energía.\n" 
                        + "+ Elaborar y evaluar estios de impacto ambiental \n "
                        + "respetando leyes, normas y reglamentos vigentes que \n"
                        + "protegen y regulan el equilibrio del ecosistema.\n" 
                        + "+ Seleccionar, diseñar, optimizar y operar sistemas \n "
                        + "de prevención y control de la contaminación ambiental, \n"
                        + "tecnologías limpias, biotecnología y energía alternativa.");
                break;
                
            case 3:
                lblTitulo.setText("Ing. Industrial");
                txtDesc.setText("El egresado de esta carrera podrá:\n"
                        + "+ Diseñar, implementar, gestionar, integrar y mejorar \n"
                        + "los procesos operativos y de apoyo a lo largo de la \n"
                        + "cadena de valor tanto en las empresas manufactureras \n "
                        + "como de servicios.\n" 
                        + "+ Optimiza la productividad y calidad en el marco del\n"
                        + "desarrollo sostenible, con sentido ético y de \n"
                        + "responsabilidad social.");
                break;
                
            case 4:
                lblTitulo.setText("Contabilidad");
                txtDesc.setText("El egresado de esta carrera podrá:\n"
                        + "+ Gestionar la información contable y financiera, \n"
                        + "analizando el manejo de los costos y aplicando \n"
                        + "las Normas Contables y Tributarias Vigentes.\n"
                        + "+ Realizar auditorías de acuerdo a las normas \n"
                        + "Internacionales de Auditoría y según marco normativo \n"
                        + "vigente para emitir una opinión independiente.\n"
                        + "+ Desarrollar y comunicar investigaciones en \n"
                        + "información contable, financiera, tributaria y de \n"
                        + "auditoría, de acuerdo a métodos y técnicas adecuadas \n"
                        + "al campo de aplicación.");
                break;
                
            case 5:
                lblTitulo.setText("Derecho");
                txtDesc.setText("El egresado de esta carrera podrá:\n"
                        + "+ Asesorar y brindar consultorías a personas \n"
                        + "naturales y jurídicas mediante la interpretación \n"
                        + "y aplicación de las fuentes de ordenamiento \n"
                        + "jurídico para la toma de decisiones oportunas \n"
                        + "y adecuadas en el ámbito jurídico conforme al \n"
                        + "Derecho y la ética.\n"
                        + "+ Patrocinar y gestionar los intereses de personas \n"
                        + "naturales y jurídicas mediante la interpretación \n"
                        + "y aplicación de las fuentes del ordenamiento \n"
                        + "jurídico para la toma de decisiones oportunas y \n"
                        + "adecuadas conforme al Derecho y la ética.\n"
                        + "+ Investigar problemas en el ámbito de las \n"
                        + "distintas áreas y disciplinas jurídicas, \n"
                        + "observando las normas de investigación científica.");
                break;
               
            case 6:
                lblTitulo.setText("Medicina");
                txtDesc.setText("El egresado de esta carrera podrá:\n"
                        + "+ Identificar  los  factores  sociales,  económicos  y\n"
                        + "culturales  que  expliquen  el  perfil  epidemiológico\n"
                        + "de la comunidad para realizar actividades de prevención\n"
                        + "y promoción de la salud.\n" 
                        + "+ Solucionar los problemas de salud, locales y nacionales,\n"
                        + "utilizando diagnósticos y terapias basadas con criterio\n"
                        + "clínico. Realizar procedimientos médicos y quirúrgicos\n"
                        + "que necesite el paciente.\n" 
                        + "+ Realizar investigación científica para generar \n"
                        + "conocimiento y tecnología que solucione problemas \n"
                        + "actuales de salud.\n" 
                        + "+ Gestionar servicios de salud del primer nivel de atención.");
                break;
             
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        lblTitulo.setText("-");

        txtDesc.setEditable(false);
        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtDesc;
    // End of variables declaration//GEN-END:variables
}
