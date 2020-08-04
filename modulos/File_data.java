package modulos;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

import static javax.swing.JFileChooser.APPROVE_OPTION;


public class File_data {

    private final String path_barra = File.separator;
    private static String nombre_ficheroex;
    private String extensionesManueal0;
    private String extensionesManueal1;
    private boolean bandera;

    private File fichero_ex;


    public File_data() {

        fichero_ex = null;
        nombre_ficheroex = "";
        extensionesManueal0 = "";
        extensionesManueal1 = "";
    }


    public void FSelectorLocal() {

        String default1 = "";

        int elecionCantidadExten = JOptionPane.showOptionDialog(null, "Cantidad de extensiones: ", "Mensaje del sistema / Manual"
                , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"1 ex", "2 ex"}, this);

        if (elecionCantidadExten == JOptionPane.OK_OPTION) {

            extensionesManueal0 = JOptionPane.showInputDialog(null, "Por favor escribe la extensión 1 manual:",
                    "Mensaje del sistema / Manual", JOptionPane.QUESTION_MESSAGE);
            default1 = "*." + extensionesManueal0;
            bandera = true;
        } else {
            extensionesManueal0 = JOptionPane.showInputDialog(null, "Por favor escribe la extensión 1 manual:",
                    "Mensaje del sistema / Manual", JOptionPane.QUESTION_MESSAGE);

            extensionesManueal1 = JOptionPane.showInputDialog(null, "Por favor escribe la extensión 2 manual:",
                    "Mensaje del sistema / Manual", JOptionPane.QUESTION_MESSAGE);
            bandera = false;

        }

        if (bandera == true) {


            JFileChooser file_selector = new JFileChooser();
            file_selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            FileNameExtensionFilter fileExtensiónRepositorio = new FileNameExtensionFilter(default1, extensionesManueal0);
            file_selector.setFileFilter(fileExtensiónRepositorio);

            int selector_jbutton = file_selector.showOpenDialog(null);

            switch (selector_jbutton) {

                case APPROVE_OPTION:
                    break;

                default:
                    break;
            }

        } else {

            JFileChooser file_selector = new JFileChooser();
            file_selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            FileNameExtensionFilter fileExtensiónRepositorio = new FileNameExtensionFilter(extensionesManueal0, extensionesManueal1);
            file_selector.setFileFilter(fileExtensiónRepositorio);

        }

    }


    public void file_ex() {

    }
}
