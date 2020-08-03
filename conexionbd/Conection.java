package conexionbd;

import java.sql.*;

public class Conection {

    private boolean banderabd;
    public Conection() throws SQLException {

        try {

            connBD();

            banderabd = true;

        } catch (SQLException e){
            System.err.println(e.getMessage() + "Error en la conexión BASE");

            banderabd = false;
        }

        if(banderabd == true){

            System.out.println("¡La entrada de la base de datos BASE, tuvo exito!");

        } else {
            connBD().close();
        }
    }

    public static Connection connBD() throws SQLException{

        Connection cnnSQL = DriverManager.getConnection("jdbc:mysql://localhost/bd_BASE"
                ,"Cristian"
                ,"12345678910121314151617");
        return cnnSQL;
    }
}
