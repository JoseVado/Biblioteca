package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String db = "library";
    private static final String url = "jdbc:mysql://localhost/"+db+"";
    
    public Conexion(){
        conn = null;
        try{
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, user, pass);
            
            // Conexion?
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}
