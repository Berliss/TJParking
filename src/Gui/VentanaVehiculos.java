/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import BaseDeDatos.BaseDatos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author berli
 */
public class VentanaVehiculos extends javax.swing.JDialog {

    BaseDatos baseDatos = new BaseDatos();
    FileWriter Fr;
    PrintWriter Pr;
    String nombreCarpeta = File.separator + "BD" + File.separator;
    String datosCliente;
    static ArrayList<JTextField> listaCampoDeTexto;
    private BufferedWriter buffer;
    VentanaTablas ventana;
    static boolean EditarPuedeFuncionar = false;
    private static boolean campoDuenoPuedeFuncionar = true;
    private boolean estoyGuardando = true;
    static String lineaProvinienteDeTabla = "";
    static String DuenoProvinienteDeTabla = "";

    /**
     * Creates new form ventaEntradaVehiculos
     */
    public VentanaVehiculos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarArrayList();
        bordesDeCampo();
        ventana = new VentanaTablas(null, true, new String[]{"NOMBRE", "CEDULA", "DIRECCION", "TELEFONO"}, "bdClientes.txt", "VentanaVehiculos");
        metodosGenerales.camposDeTextoMayuscula(listaCampoDeTexto);
        metodosGenerales.impedirCiertosCaracteres(listaCampoDeTexto);
        btnEditar.setVisible(false);
        campoDuenoPuedeFuncionar = true;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDueno = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        etiquetaDeError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Dueno");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("No. Placa");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Modelo");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Color");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Tipo");

        txtDueno.setEditable(false);
        txtDueno.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtDueno.setForeground(new java.awt.Color(51, 153, 255));
        txtDueno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDuenoMouseClicked(evt);
            }
        });

        txtPlaca.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 153, 255));
        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlacaFocusGained(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(51, 153, 255));

        txtModelo.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(51, 153, 255));

        txtColor.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtColor.setForeground(new java.awt.Color(51, 153, 255));

        comboTipo.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        comboTipo.setForeground(new java.awt.Color(51, 153, 255));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NORMAL", "PESADO" }));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnGuardarKeyReleased(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Cancelar");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton6KeyReleased(evt);
            }
        });

        etiquetaDeError.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        etiquetaDeError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etiquetaDeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPlaca)
                    .addComponent(txtMarca)
                    .addComponent(txtModelo)
                    .addComponent(txtColor)
                    .addComponent(comboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDueno))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaDeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Registro de Vehiculos");

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBuscarMouseReleased(evt);
            }
        });

        btnEditar.setEnabled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setIcon(new ImageIcon("Imagenes/iconoVehiculos.png"));
        btnBuscar.setIcon(new ImageIcon("Imagenes/iconoBuscar.png"));
        btnEditar.setIcon(new ImageIcon("Imagenes/iconoEditar.png"));
        jLabel9.setIcon(new ImageIcon("Imagenes/iconoEliminar.png"));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        btnBuscar.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, null));
    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseReleased
        btnBuscar.setBorder(null);
        bordesDeCampo();
        ventana = new VentanaTablas(null, true, new String[]{"DUENO", "MATRICULA", "MARCA", "MODELO", "COLOR", "TIPO"}, "bdVehiculos.txt", "VentanaVehiculos");
        etiquetaDeError.setText(null);
        VentanaTablas.setNombreTitulo("Consulta Vehiculos");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnBuscarMouseReleased

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        if (EditarPuedeFuncionar) {
            if (btnEditar.isEnabled()) {
                btnEditar.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, null));
            }
        }
    }//GEN-LAST:event_btnEditarMousePressed

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        if (EditarPuedeFuncionar) {
            if (btnEditar.isEnabled()) {
                estoyGuardando = false;
                campoDuenoPuedeFuncionar = true;
                comboTipo.setEnabled(true);
                btnEditar.setBorder(null);
                habilitarCamposParaEdicion();
            }
        }
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (estoyGuardando == true) {
            insercionDatosDeVehiculo();
        } else {
            edicionDeVehiculos();
        }
        comboTipo.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (estoyGuardando == true) {
                insercionDatosDeVehiculo();
            } else {
                edicionDeVehiculos();
            }
        }
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void txtDuenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDuenoMouseClicked
        if (campoDuenoPuedeFuncionar) {
            accionParaCampoTextoDueno();
        } else {
        }
    }//GEN-LAST:event_txtDuenoMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setLookAndFeel();
        lineaProvinienteDeTabla = "";
        EditarPuedeFuncionar = false;
    }//GEN-LAST:event_formWindowClosing

    private void txtPlacaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusGained
        etiquetaDeError.setText("");
    }//GEN-LAST:event_txtPlacaFocusGained

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        accionBotonCancelar();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionBotonCancelar();
        }
    }//GEN-LAST:event_jButton6KeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (focusCampoVacio() == false) {
            eliminarVehiculos();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVehiculos dialog = new VentanaVehiculos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEditar;
    private static javax.swing.JButton btnGuardar;
    private static javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel etiquetaDeError;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDueno;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    public void inicializarArrayList() {
        listaCampoDeTexto = new ArrayList();
        listaCampoDeTexto.add(txtDueno);
        listaCampoDeTexto.add(txtPlaca);
        listaCampoDeTexto.add(txtMarca);
        listaCampoDeTexto.add(txtModelo);
        listaCampoDeTexto.add(txtColor);
    }

    public void borrarCamposTexto() {
        for (JTextField campoActual : listaCampoDeTexto) {
            campoActual.setText(null);
        }

        bordesDeCampo();
    }

    private boolean focusCampoVacio() {
        bordesDeCampo();

        for (JTextField campoActual : listaCampoDeTexto) {

            if (campoActual.getText().trim().isEmpty()) {
                campoActual.grabFocus();
                campoActual.setBorder(BorderFactory.createEtchedBorder(Color.RED, null));

                return true;
            }
        }

        return false;
    }

    private void bordesDeCampo() {
        for (JTextField campoActual : listaCampoDeTexto) {
            campoActual.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, null));
        }

        comboTipo.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, null));
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }

    private void edicionDeVehiculos() {
        String lineaNueva = "";
        if (focusCampoVacio() == false) {

            for (JTextField campoActual : listaCampoDeTexto) {
                lineaNueva += campoActual.getText() + "|";
            }

            lineaNueva += String.valueOf(comboTipo.getSelectedItem()) + "|";
            System.out.println(lineaNueva);

            baseDatos.editarArchivo("bdVehiculos.txt", lineaProvinienteDeTabla, lineaNueva);
            borrarCamposTexto();
            estoyGuardando = true;
            btnBuscar.setEnabled(true);
            btnEditar.setEnabled(true);
            EditarPuedeFuncionar = false;

        }
    }

    private void insercionDatosDeVehiculo() {

        String lineaDeDatos = "";

        if (focusCampoVacio() == false) {
            //ejecuto insercion de datos
            for (JTextField campoActual : listaCampoDeTexto) {
                lineaDeDatos += campoActual.getText() + "|";
            }

            if (!validarMatriculaCliente(lineaDeDatos)) {
                baseDatos.insertarDatos(lineaDeDatos, "bdVehiculos.txt", comboTipo);
                borrarCamposTexto();
                estoyGuardando = true;
                EditarPuedeFuncionar = false;
            }

        }
    }

    public void habilitarCamposParaEdicion() {
        for (JTextField campoActual : listaCampoDeTexto) {
            campoActual.setFocusable(true);
        }
        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }

    private boolean validarMatriculaCliente(String lineaActual) {

        ArrayList<String> listaTodosLosVehiculos = baseDatos.obtenerTodosLosDatos("bdVehiculos.txt");
        ArrayList<String> listaVehiculoEspecifico;
        ArrayList<String> lista = baseDatos.obtenerDatosEnLineaEspecifica(lineaActual);
        String matricula = lista.get(1);

        for (int i = 0; i < listaTodosLosVehiculos.size(); i++) {

            listaVehiculoEspecifico = baseDatos.obtenerDatosEnLineaEspecifica(listaTodosLosVehiculos.get(i));

            String matriculaObtenida = listaVehiculoEspecifico.get(1);

            if (matricula.equals(matriculaObtenida)) {
                etiquetaDeError.setText("ESTA PLACA YA EXISTE");
                return true;
            }
        }
        return false;
    }

    private void accionParaCampoTextoDueno() {
        ventana = new VentanaTablas(null, true, new String[]{"NOMBRE", "CEDULA", "DIRECCION", "TELEFONO"}, "bdClientes.txt", "VentanaClientesDeVehiculos");
        ventana.setVisible(true);
        //esto aqui se ve tonto , pero es la unica manera que habia para que mi jDialog sin barra de titulo saliera sin ella al invocarla.
        //la razon?? no lo se solo se que funciona. si ve esto expliqueme. perdi mucho tiempo en este errorcito.
    }

    //este metodo puede ser diferente en cada clase
    public static void rellenarCampoDueno() {

        BaseDatos base = new BaseDatos();
        ArrayList listaLineasDeTabla = base.obtenerDatosEnLineaEspecifica(getDuenoProvinienteDeTabla());
        System.out.println(getDuenoProvinienteDeTabla());
        JTextField campoActual;
        String datoDeLaLineaObtenido;

        campoActual = listaCampoDeTexto.get(0);

        datoDeLaLineaObtenido = String.valueOf(listaLineasDeTabla.get(0));
        campoActual.setText(datoDeLaLineaObtenido);
        campoActual.setFocusable(false);

        System.out.println(campoActual.getText());
    }

    public static void rellenarCamposConDatosDeTabla() {
        BaseDatos base = new BaseDatos();
        ArrayList listaLineasDeTabla = base.obtenerDatosEnLineaEspecifica(getLineaProvinienteDeTabla());
        System.out.println(getLineaProvinienteDeTabla());
        JTextField campoActual;
        String datoDeLaLineaObtenido;

        for (int i = 0; i < 5; i++) {
            campoActual = listaCampoDeTexto.get(i);
            datoDeLaLineaObtenido = String.valueOf(listaLineasDeTabla.get(i));
            campoActual.setText(datoDeLaLineaObtenido);
            campoActual.setFocusable(false);
        }

        btnGuardar.setEnabled(false);
        EditarPuedeFuncionar = true;
        campoDuenoPuedeFuncionar = false;
        ponerValorComboBox();
    }

    private static void ponerValorComboBox() {
        if (getLineaProvinienteDeTabla().contains("NORMAL")) {
            comboTipo.setSelectedIndex(0);
        } else {
            comboTipo.setSelectedIndex(1);
        }

        comboTipo.setEnabled(false);
    }

    public void accionBotonCancelar() {
        borrarCamposTexto();
        EditarPuedeFuncionar = false;
        campoDuenoPuedeFuncionar = true;
        estoyGuardando = true;
        lineaProvinienteDeTabla = "";
        comboTipo.setSelectedIndex(0);
        comboTipo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnGuardar.setEnabled(true);
        etiquetaDeError.setText(null);

        for (JTextField campoActual : listaCampoDeTexto) {
            campoActual.setFocusable(true);
        }
    }

    public static String getLineaProvinienteDeTabla() {
        return lineaProvinienteDeTabla;
    }

    public static void setLineaProvinienteDeTabla(String aLineaProvinienteDeTabla) {
        lineaProvinienteDeTabla = aLineaProvinienteDeTabla;
    }

    public static String getDuenoProvinienteDeTabla() {
        return DuenoProvinienteDeTabla;
    }

    public static void setDuenoProvinienteDeTabla(String DuenoProvinienteDeTabla) {
        VentanaVehiculos.DuenoProvinienteDeTabla = DuenoProvinienteDeTabla;
    }

    private void eliminarVehiculos() {
        String dueno = txtDueno.getText();
        String placa = txtPlaca.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        String tipo = String.valueOf(comboTipo.getSelectedItem());
        System.out.println("toy aqui");
        String linea = dueno + "|" + placa + "|" + marca + "|" + modelo + "|" + color + "|" + tipo + "|";

        ArrayList<String> listaEstacionamientos = baseDatos.obtenerTodosLosDatos("bdEstacionamiento.txt");
        ArrayList<String> lineaEstacionamientoEspecifico;

        for (int i = 0; i < listaEstacionamientos.size(); i++) {
            lineaEstacionamientoEspecifico = baseDatos.obtenerDatosEnLineaEspecifica(listaEstacionamientos.get(i));
            String placaObtenida = lineaEstacionamientoEspecifico.get(2);

            if (placaObtenida.equalsIgnoreCase(placa)) {
                etiquetaDeError.setText("Para eliminar el vehiculo debes  primero eliminar su entrada");
                System.out.println("estoy roto");
                break;
            } 
            //con este ultimo if resulvo el problema de que eliminaba aunque saltara el error
            if(i==49){
                baseDatos.eliminarLineaDeArchivo("bdVehiculos.txt", linea);
                borrarCamposTexto();
                 System.out.println("sigo vivooo");

            }
         
        }
    }

}