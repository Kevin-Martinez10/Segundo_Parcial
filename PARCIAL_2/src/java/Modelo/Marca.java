package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;
/**
 *
 * @author Kevin Martínez
 */
public class Marca extends Producto {
    
    private int id_marca;
    private String marca;
    private Conexion cn;

    public Marca() {
    }

    public Marca(String marca, int id_marca, int existencia, String producto, String descripcion, String precio_costo, String precio_venta) {
        super(existencia, producto, descripcion, precio_costo, precio_venta);
        this.marca = marca;
        this.id_marca = id_marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id_marca;
    }

    public void setId(int id) {
        this.id_marca = id;
    }
    
    public HashMap drop_marca(){
        HashMap<String,String> drop = new HashMap();
        try{
            cn = new Conexion();
            String query = "SELECT id_marca as id,marca FROM PARCIAL_2.marcas;";
            cn.abrir_conexion();
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
            while(consulta.next()){
                drop.put(consulta.getString("id"), consulta.getString("marca"));
            }
            cn.cerrar_conexion();
        }catch(SQLException ex){
           System.out.println(ex.getMessage());
        }
        return drop;
    }
    
    @Override
    public void agregar(){
        try{
            PreparedStatement parametro;
            cn = new Conexion();
            String query="INSERT INTO `PARCIAL_2`.`prouctos`(`id_producto`,`producto`,`id_marca`,`descripcion`,`precio_costo`,`precio_venta`,`existencia`) VALUES (?,?,?,?,?,?,?);";
            cn.abrir_conexion();
            parametro = (PreparedStatement)cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getProducto());
            parametro.setInt(2, getId());
            parametro.setString(3, getDescripcion());
            parametro.setString(4, getPrecio_costo());
            parametro.setString(5, getPrecio_venta());
            parametro.setInt(6, getExistencia());
            parametro.executeUpdate();
            cn.cerrar_conexion();
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
