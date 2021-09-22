package Modelo;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Kevin Martínez
 */
public class Conexion {
    public Connection conexionBD;
    public final String db = "de_empresa";
    public final String urlConnexion = String.format("jdbc:mysql://localhost:3306/%s",db );
    public final String usuario = "usr_empresa";
    public final String contraseña = "Empres@123";
    public final String jdbc = "com.mysql.cj.jdbc.Driver";
    public void abrir_conexion(){
        
        try{
            Class.forName(jdbc);
            conexionBD = DriverManager.getConnection(urlConnexion,usuario,contraseña);
 
           
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            System.out.println("Error: " + ex.getMessage());
                
           }
    }
    
    public void cerrar_conexion(){
        try{
            conexionBD.close();
        }catch(SQLException ex){
            System.out.println("Error..." +ex.getMessage());
        }
    }
}
