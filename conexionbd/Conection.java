package conexionbd; // Paquete principal - path: C:\Users\javier1\IdeaProjects\Sistema\src\conexionbd

import java.sql.*; // Bibloteca SQL

public class Conection { // Clase principal de conexion

    private boolean banderabd; // Baandera
    public Conection() throws SQLException { // Constructor BASE

        try { // Intenta canalizar código con falla

            connBD();

            banderabd = true; // Bandera - Entrada

        } catch (SQLException e){
            System.err.println(e.getMessage() + "Error en la conexión BASE"); // Mensaje si el código falla

            banderabd = false; // Bandera - Salida
        }
        //Codición de verificación
        if(banderabd == true){
            // Mensaje - Entrada
            System.out.println("¡La entrada de la base de datos BASE, tuvo exito!");

        } else {
            // Accion de - Salida
            connBD().close();
        }
    }
    // Método para la conexión
    public static Connection connBD() throws SQLException{
        // Objeto SQL
        Connection cnnSQL = DriverManager.getConnection("jdbc:mysql://localhost/bd_BASE"
                ,"Cristian"
                ,"12345678910121314151617");
        return cnnSQL; // Retorno 
    }
}
