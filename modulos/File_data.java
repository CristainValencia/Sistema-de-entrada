package modulos;

import javax.swing.*;
import java.io.File;


public class File_data {

    private final String path_barra = File.separator;
    private static String nombre_ficheroex;


    private File fichero_ex;


    public File_data() {

        fichero_ex = null;
        nombre_ficheroex = "";
    }


    public JFileChooser FSelectorLocal(){

        JFileChooser file_selector = new JFileChooser();s
        file_selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);


        int selector_jbutton = file_selector.showOpenDialog(null);
    }

    
    public void file_ex(){
        
    }
}
