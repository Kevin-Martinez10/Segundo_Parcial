package Modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;
/**
 *
 * @author Kevin Martínez
 */
public class Producto {
    private String producto,descripcion,precio_costo,precio_venta;
    private int existencia;
    private Conexion cn;
    
    public Producto(){}

    public Producto(int existencia, String producto, String descripcion, String precio_costo, String precio_venta) {
        this.existencia = existencia;
        this.producto = producto;
        this.descripcion = descripcion;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
    }
    
        
    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(String precio_costo) {
        this.precio_costo = precio_costo;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }
    public void agregar(){}
    public void modificar(){}
    public void mostrar(){}
    public void eliminar(){}
    
}
