package conexionbd;

import java.sql.*;

public class Conection {


    public Conection() {

        try {

            connBD();
        } catch (SQLException e){


        }
    }

    public static Connection connBD() throws SQLException{

        Connection cnnSQL = DriverManager.getConnection("jdbc:mysql://localhost/bd_BASE"
                ,"Cristian"
                ,"12345678910121314151617");
        return cnnSQL;
    }
}
