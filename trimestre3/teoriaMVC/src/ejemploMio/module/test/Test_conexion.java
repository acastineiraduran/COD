package ejemploMio.module.test;

import ejemploMio.module.Conexion;

import java.sql.*;

public class Test_conexion {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    //DefaultTableMOdel modelo;
    int id;

    public static void main(String[] args) {
        String nombre = "Raul";
        String correo = "raul@gmail.com";
        String telefono = "1234";
        Test_conexion tc = new Test_conexion();

        tc.agregar(nombre, correo, telefono);

    }

    public void agregar(String nombre, String correo, String telefono){
        String sql = "INSERT INTO persona (nombres, correos, telefonos) VALUES('" + nombre + "','" + correo + "','" + telefono + "')";
        try {
            cn = con.getCon();
            System.out.println("*1*");
            st = cn.createStatement();
            System.out.println("*2*");
            st.executeUpdate(sql);
            System.out.println("*3*");
        } catch (Exception ex){
            System.out.println("** ERROR: intendando agregar **");
            ex.printStackTrace();
        }
    }
}
