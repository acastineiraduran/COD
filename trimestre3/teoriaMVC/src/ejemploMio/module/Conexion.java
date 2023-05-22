package ejemploMio.module;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Teoria_MVC?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PSW = "123456";

    Connection con;

    public Conexion(){
        try {
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PSW);
        } catch(Exception ex){
            System.out.println("** ERROR: Problema con conexion **");
            ex.printStackTrace();
        }
    }

    public Connection getCon(){
        return con;
    }

}
