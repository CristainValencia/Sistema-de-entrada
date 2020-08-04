package modulos;

import javax.swing.*;
import java.io.File;

import static javax.swing.JFileChooser.APPROVE_OPTION;


public class File_data {

    private final String path_barra = File.separator;
    private static String nombre_ficheroex;


    private File fichero_ex;


    public File_data() {

        fichero_ex = null;
        nombre_ficheroex = "";
    }


    public JFileChooser FSelectorLocal() {

        JFileChooser file_selector = new JFileChooser();
        file_selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);


        int selector_jbutton = file_selector.showOpenDialog(null);

        switch (selector_jbutton) {

            case APPROVE_OPTION:
                break;

            default:
                break;


        }
    }


    public void file_ex() {

    }
}
