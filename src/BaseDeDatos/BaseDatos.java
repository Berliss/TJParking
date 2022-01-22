/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author berli
 */
public class BaseDatos {

    static File Carpeta;
    private String usuarioPorDefecto = "admin|admin|Administrador|Berlis Rodriguez|";
    private String tarifaPredeterminada;
    private FileWriter fileWriter;
    private ArrayList<String> listaBd = new ArrayList();
    private String nombreCarpeta = File.separator + "BD" + File.separator;
    private FileReader fileReader;
    private BufferedReader bufferReader;

    public BaseDatos() {

    }

    public void inicializarBaseDatos() {

        Carpeta = new File(new File("").getAbsoluteFile() + nombreCarpeta);

        listaBd.add(File.separator + "bdClientes.txt");
        listaBd.add(File.separator + "bdVehiculos.txt");
        listaBd.add(File.separator + "bdUsuario.txt");
        listaBd.add(File.separator + "bdConfiguraciones.txt");
        listaBd.add(File.separator + "bdEntradas.txt");
        listaBd.add(File.separator + "bdSalidas.txt");
        listaBd.add(File.separator + "bdEstacionamiento.txt");

        if (!Carpeta.exists()) {
            Carpeta.mkdir();
            inicializarArchivos();
        } else {
            inicializarArchivos();
        }
    }

    public void inicializarArchivos() {

        for (int i = 0; i < listaBd.size(); i++) {
            File archivo = new File(new File("").getAbsoluteFile() + nombreCarpeta + File.separator + listaBd.get(i));
            if (!archivo.exists()) {

                try {
                    archivo.createNewFile();
                    if (archivo.getName().equals("bdUsuario.txt")) {

                        insertarDatos(usuarioPorDefecto, "bdUsuario.txt", null);
                    }

                    if (archivo.getName().equals("bdEstacionamiento.txt")) {
                        String lineaestatusEstacionamiento = "";
                        for (int j = 1; j < 51; j++) {
                            lineaestatusEstacionamiento = j + "|*|*|*|*|*|*|*|";
                            insertarDatos(lineaestatusEstacionamiento, "bdEstacionamiento.txt", null);
                        }
                    }

                    if (archivo.getName().equals("bdConfiguraciones.txt")) {
                        tarifaPredeterminada = "50|";
                        insertarDatos(tarifaPredeterminada, "bdConfiguraciones.txt", null);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public ArrayList obtenerTodosLosDatos(String bdDeseada) {

        ArrayList<String> listaUsuarios = new ArrayList();

        try {
            fileReader = new FileReader(new File("").getAbsoluteFile() + nombreCarpeta + File.separator + bdDeseada);
            bufferReader = new BufferedReader(fileReader);

            String lineaActual;

            while ((lineaActual = bufferReader.readLine()) != null) {
                listaUsuarios.add(lineaActual);
            }

            fileReader.close();
            bufferReader.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return listaUsuarios;
    }

    public ArrayList obtenerDatosEnLineaEspecifica(String linea) {

        ArrayList<String> lista = new ArrayList();
        String stringActual = "";
        char[] caracteres = linea.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == '|') {

                lista.add(stringActual);
                stringActual = "";

            } else {
                stringActual += String.valueOf(caracteres[i]);
            }
        }
        return lista;
    }

    public void insertarDatos(String linea, String bdDeseada, JComboBox combo) {

        try {

            FileWriter Fr = new FileWriter(new File("").getAbsoluteFile() + nombreCarpeta + File.separator + bdDeseada, true);
            BufferedWriter buffer = new BufferedWriter(Fr);
            fileReader = new FileReader(new File("").getAbsoluteFile() + nombreCarpeta + File.separator + bdDeseada);
            bufferReader = new BufferedReader(fileReader);

            if (combo != null) {
                linea += String.valueOf(combo.getSelectedItem()) + "|";
            }

            buffer.write(linea);
            buffer.newLine();
            buffer.flush();

            Fr.close();
            buffer.close();
            bufferReader.close();
            fileReader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminarLineaDeArchivo(String bdDeseada, String lineaAEliminar) {
        try {

            String rutaACarpeta = new File("").getAbsoluteFile() + nombreCarpeta + File.separator;
            File ArchivoViejo = new File(rutaACarpeta + bdDeseada);
            File ArchivoNuevo = new File(rutaACarpeta + "bdNueva.txt");
            ArchivoNuevo.createNewFile();

            if (ArchivoViejo.exists()) {

                BufferedReader Lector = new BufferedReader(new FileReader(ArchivoViejo));
                String linea;

                while ((linea = Lector.readLine()) != null) {
                    if (linea.equalsIgnoreCase(lineaAEliminar)) {
                        //si no hago nada la linea se elimina
                    } else {
                        insertarDatos(linea, ArchivoNuevo.getName(), null);
                    }
                }

                Lector.close();

                //Aqui renombramos el archivo nuevo con el nombre del antiguo y luego borramos el antiguo.
                ArchivoViejo.renameTo(ArchivoNuevo);
                BorrarFichero(ArchivoViejo);
                ArchivoNuevo.renameTo(new File(rutaACarpeta + bdDeseada));
                ///////////////////////////////////////////////////////////////////////////////////////////

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void editarArchivo(String bdDeseada, String lineaAEditar, String lineaNueva) {
        try {

            String rutaACarpeta = new File("").getAbsoluteFile() + nombreCarpeta + File.separator;
            File ArchivoViejo = new File(rutaACarpeta + bdDeseada);
            File ArchivoNuevo = new File(rutaACarpeta + "bdNueva.txt");
            ArchivoNuevo.createNewFile();

            if (ArchivoViejo.exists()) {

                BufferedReader Lector = new BufferedReader(new FileReader(ArchivoViejo));
                String linea;

                while ((linea = Lector.readLine()) != null) {
                    if (linea.equalsIgnoreCase(lineaAEditar)) {
                        insertarDatos(lineaNueva, ArchivoNuevo.getName(), null);

                    } else {
                        insertarDatos(linea, ArchivoNuevo.getName(), null);
                    }
                }

                Lector.close();

                //Aqui renombramos el archivo nuevo con el nombre del antiguo y luego borramos el antiguo.
                ArchivoViejo.renameTo(ArchivoNuevo);
                BorrarFichero(ArchivoViejo);
                ArchivoNuevo.renameTo(new File(rutaACarpeta + bdDeseada));
                ///////////////////////////////////////////////////////////////////////////////////////////

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //este ya funciona
    public void BorrarFichero(File archivo) {
        try {
            if (archivo.exists()) {
                archivo.delete();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
