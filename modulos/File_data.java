package modulos;

import javax.swing.*;
import java.io.File;
import java.io.File.*;

public class File_data {

    private final String path_barra = File.separator;
    private File fichero_ex;
    private static String nombre_ficheroex;
    public File_data() {

        fichero_ex = null;
        nombre_ficheroex = "";
    }

    public JFileChooser FSelectorLocal(){

        JFileChooser file_selector = new JFileChooser();
        file_selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

    }

}
