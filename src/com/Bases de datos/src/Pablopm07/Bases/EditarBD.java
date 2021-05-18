package Pablopm07.Bases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditarBD {

    public static void añadirProducto(Producto producto, Connection conexion) {
        try {
            PreparedStatement st = conexion.prepareStatement("insert into Almacen (nombre, precio, cantidad) values (?,?,?);");
            st.setString(1, producto.getNombre());
            st.setFloat(2, producto.getPrecio());
            st.setInt(3, producto.getCantidad());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static String eliminarProducto(String codigo, Connection conexion) {
        int rowCount;

        try {
            PreparedStatement st = conexion.prepareStatement("delete from Almacen where codigo = ?;");
            st.setInt(1, Integer.parseInt(codigo));
            rowCount = st.executeUpdate();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return "Ha habido un error";

        }
        if (rowCount == 1) {
            return "El producto se ha eliminado corectamente";
        } else {
            return "El producto no esta en la tabla";
        }
    }

    public static ArrayList<Producto> consultarTabla(Connection conexion) {
        ArrayList<Producto> listaResultados = new ArrayList();

        try {
            PreparedStatement st = conexion.prepareStatement("select * from Almacen;");
            ResultSet resultado = st.executeQuery();

            while (resultado.next()) {
                Producto Dmp = new Producto(resultado.getString("nombre"), resultado.getFloat("precio"), resultado.getInt("cantidad"), resultado.getInt("codigo"));
                listaResultados.add(Dmp);
            }
            return listaResultados;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public static void actualizarProducto(Producto producto, Connection conexion) {
        try {
            PreparedStatement st = conexion.prepareStatement("UPDATE Almacen SET nombre = ?, precio = ?, cantidad = ? WHERE codigo = ?;");
            st.setString(1, producto.getNombre());
            st.setFloat(2, producto.getPrecio());
            st.setInt(3, producto.getCantidad());
            st.setInt(4, producto.getCodigo());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    
    public static Producto seleccionarProducto(String codigo, Connection conexion){
       
        Producto Dmp = null;

        try {
            PreparedStatement st = conexion.prepareStatement("select * from Almacen where codigo = ?;");
            st.setInt(1,Integer.parseInt(codigo)); 
            ResultSet resultado = st.executeQuery();
            Dmp = new Producto(resultado.getString("nombre"), resultado.getFloat("precio"), resultado.getInt("cantidad"), resultado.getInt("codigo"));
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Dmp;
    }

}
