/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import BaseDeDatos.BaseDatos;
import OptionPanes.aviso;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author berli
 */
public class VentanaEntradaVehiculos extends javax.swing.JDialog {

    private static ArrayList<JTextField> listaCampoDeTexto;
    VentanaTablas ventana;
    private static String lineaProvinienteDeTabla = "";
    BaseDatos baseDatos = new BaseDatos();

    /**
     * Creates new form VentanaEntradaVehiculos
     */
    public VentanaEntradaVehiculos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarArrayListDeCampos();
        propiedadesDeCampo();
        metodosGenerales.fechaActualACampoDeTexto(txtFecha);
        ventana = new VentanaTablas(null, true, new String[]{"DUENO", "MATRICULA", "MARCA", "MODELO", "COLOR", "TIPO"}, "bdVehiculos.txt", "VentanaEntradaVehiculos");
        jPanel1.setBackground(Color.WHITE);
        jPanel2.setBackground(Color.WHITE);

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
        txtTipo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        etiquetaError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));

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

        txtDueno.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtDueno.setForeground(new java.awt.Color(51, 153, 255));
        txtDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuenoActionPerformed(evt);
            }
        });

        txtPlaca.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 153, 255));

        txtMarca.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(51, 153, 255));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtModelo.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(51, 153, 255));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        txtColor.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtColor.setForeground(new java.awt.Color(51, 153, 255));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtTipo.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(51, 153, 255));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnIngresarKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Fecha");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(51, 153, 255));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        etiquetaError.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        etiquetaError.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(etiquetaError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDueno)
                    .addComponent(txtPlaca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(etiquetaError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Ingreso a parqueo");

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBuscarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(14, 14, 14)))))
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBuscar.setIcon(new ImageIcon("Imagenes/iconoBuscar.png"));
        jLabel10.setIcon(new ImageIcon("Imagenes/iconoEntrada.png"));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        btnBuscar.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, null));
    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseReleased
        btnBuscar.setBorder(null);
        btnBuscar.setBorder(null);
        ventana = new VentanaTablas(null, true, new String[]{"DUENO", "MATRICULA", "MARCA", "MODELO", "COLOR", "TIPO"}, "bdVehiculos.txt", "VentanaEntradaVehiculos");
        VentanaTablas.setNombreTitulo("Consulta Vehiculos");
        ventana.setVisible(true);
    }//GEN-LAST:event_btnBuscarMouseReleased

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (!txtDueno.getText().isEmpty()) {// Esta validacion es para que si no se a elegido un vehiculo el boton insertar no haga nada
            insercionDatosEntrada();
            VentanaPrincipal.disponibilidadEstacionamientos();
            VentanaPrincipal.imagenesEnBotones();
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarKeyReleased

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuenoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setLookAndFeel();
        lineaProvinienteDeTabla = "";
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(VentanaEntradaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEntradaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEntradaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEntradaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEntradaVehiculos dialog = new VentanaEntradaVehiculos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel etiquetaError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDueno;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    private void inicializarArrayListDeCampos() {

        listaCampoDeTexto = new ArrayList();

        listaCampoDeTexto.add(txtDueno);
        listaCampoDeTexto.add(txtPlaca);
        listaCampoDeTexto.add(txtMarca);
        listaCampoDeTexto.add(txtModelo);
        listaCampoDeTexto.add(txtColor);
        listaCampoDeTexto.add(txtTipo);
        listaCampoDeTexto.add(txtFecha);
    }

    private void propiedadesDeCampo() {

        for (JTextField campoActual : listaCampoDeTexto) {
            campoActual.setBorder(BorderFactory.createEtchedBorder(Color.GRAY, null));
            campoActual.setEditable(false);
        }
    }

    public static void rellenarCamposConDatosDeTabla() {
        BaseDatos base = new BaseDatos();
        ArrayList listaLineasDeTabla = base.obtenerDatosEnLineaEspecifica(getLineaProvinienteDeTabla());
        System.out.println(getLineaProvinienteDeTabla());
        JTextField campoActual;
        String datoDeLaLineaObtenido;

        for (int i = 0; i < listaLineasDeTabla.size(); i++) {
            campoActual = listaCampoDeTexto.get(i);
            datoDeLaLineaObtenido = String.valueOf(listaLineasDeTabla.get(i));
            campoActual.setText(datoDeLaLineaObtenido);
            campoActual.setFocusable(false);
        }

        //btnGuardar.setEnabled(false);
        //EditarPuedeFuncionar = true;
        //campoDuenoPuedeFuncionar = false;
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }

    public static String getLineaProvinienteDeTabla() {
        return lineaProvinienteDeTabla;
    }

    public static void setLineaProvinienteDeTabla(String aLineaProvinienteDeTabla) {
        lineaProvinienteDeTabla = aLineaProvinienteDeTabla;
    }

    private boolean validarQueVehiculoNoEstaYaEstacionado(String lineaActual) {
        ArrayList<String> listaTodosEstacionamiento = baseDatos.obtenerTodosLosDatos("bdEstacionamiento.txt");
        ArrayList<String> listaEstacionamientoEspecifico;
        ArrayList<String> lista = baseDatos.obtenerDatosEnLineaEspecifica(lineaActual);

        String id = lista.get(0);
        String dueno = lista.get(1);
        String placa = lista.get(2);

        for (int i = 0; i < listaTodosEstacionamiento.size(); i++) {

            listaEstacionamientoEspecifico = baseDatos.obtenerDatosEnLineaEspecifica(listaTodosEstacionamiento.get(i));

            String idObtenido = listaEstacionamientoEspecifico.get(0);
            String duenoObtenido = listaEstacionamientoEspecifico.get(1);
            String placaObtenido = listaEstacionamientoEspecifico.get(2);

            if (dueno.equals(duenoObtenido) && placa.equals(placaObtenido)) {
                etiquetaError.setText("YA ESTA EN ESTACIONADO EN PUESTO " + idObtenido);
                return true;
            }
        }
        return false;
    }

    private void insercionDatosEntrada() {
        String lineaDeDatos = "";

        for (JTextField campoActual : listaCampoDeTexto) {
            lineaDeDatos += campoActual.getText() + "|";
        }

        String id = VentanaPrincipal.numeroEstacionamiento;

        lineaDeDatos = id + "|" + lineaDeDatos;

        if (!validarQueVehiculoNoEstaYaEstacionado(lineaDeDatos)) {
            baseDatos.insertarDatos(lineaDeDatos, "bdEntradas.txt", null);
            entradaEstacionamiento();

            borrarCamposTexto();
            setLookAndFeel();
            this.dispose();
        }

    }

    private void entradaEstacionamiento() {
        String lineaNueva = "";

        for (JTextField campoActual : listaCampoDeTexto) {
            lineaNueva += campoActual.getText() + "|";
        }

        String tipoVehiculo = (String) baseDatos.obtenerDatosEnLineaEspecifica(lineaNueva).get(5);
        if (tipoVehiculo.equals("NORMAL")) {

            lineaNueva = VentanaPrincipal.numeroEstacionamiento + "|" + lineaNueva;
            System.out.println(lineaNueva);
            String lineaParaEditar = VentanaPrincipal.numeroEstacionamiento + "|*|*|*|*|*|*|*|";
            System.out.println(lineaParaEditar);
            baseDatos.editarArchivo("bdEstacionamiento.txt", lineaParaEditar, lineaNueva);

        } else if (tipoVehiculo.equals("PESADO")) {

            int idAnterior = Integer.parseInt(VentanaPrincipal.numeroEstacionamiento) - 1;
            String lineaParaEditarAnterior = idAnterior + "|*|*|*|*|*|*|*|";
            String lineaNuevaAnterior = idAnterior + "|" + lineaNueva;

            int idDespues = Integer.parseInt(VentanaPrincipal.numeroEstacionamiento) + 1;
            String lineaParaEditarDespues = idDespues + "|*|*|*|*|*|*|*|";
            String lineaNuevaDespues = idDespues + "|" + lineaNueva;

            String lineaParaEditar = VentanaPrincipal.numeroEstacionamiento + "|*|*|*|*|*|*|*|";
            lineaNueva = VentanaPrincipal.numeroEstacionamiento + "|" + lineaNueva;

            if (baseDatos.obtenerTodosLosDatos("bdEstacionamiento.txt").contains(lineaParaEditarAnterior) && baseDatos.obtenerTodosLosDatos("bdEstacionamiento.txt").contains(lineaParaEditar)) {

                baseDatos.editarArchivo("bdEstacionamiento.txt", lineaParaEditarAnterior, lineaNuevaAnterior);
                baseDatos.editarArchivo("bdEstacionamiento.txt", lineaParaEditar, lineaNueva);
                System.out.println("Paso anterio y se rompio");
            } else if (baseDatos.obtenerTodosLosDatos("bdEstacionamiento.txt").contains(lineaParaEditar) && baseDatos.obtenerTodosLosDatos("bdEstacionamiento.txt").contains(lineaParaEditarDespues)) {

                baseDatos.editarArchivo("bdEstacionamiento.txt", lineaParaEditar, lineaNueva);
                baseDatos.editarArchivo("bdEstacionamiento.txt", lineaParaEditarDespues, lineaNuevaDespues);
                System.out.println("paso depues se me fue");
            } else {
                aviso aviso = new aviso(null, true, "NO PUEDES ESTACIONARTE EN ESTA POSICION");

                aviso = new aviso(null, true, "NO PUEDES ESTACIONARTE EN ESTA POSICION");
                aviso.setLocationRelativeTo(this);
                aviso.setVisible(true);
            }

        }
    }

    public void borrarCamposTexto() {
        for (JTextField campoActual : listaCampoDeTexto) {
            campoActual.setText(null);
        }
    }

}
