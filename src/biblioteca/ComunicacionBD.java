package biblioteca;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ComunicacionBD {
    
    
    public static String[][] datosBD(String tabla)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas(tabla);
        
        ResultSet counter = stm.executeQuery("SELECT COUNT(*) AS contar FROM `"+ tabla +"`");
        counter.next();
        int count = counter.getInt("contar");
        counter.close();

        String list[][] = new String[count][datosBD.length];
        
        ResultSet re = stm.executeQuery("SELECT * FROM `"+ tabla +"`");
        for(int i = 0; i < count; i++){
            re.next();
            for(int columna = 0; columna < datosBD.length; columna++){
                list[i][columna] = re.getString(datosBD[columna]);
            }
        }
        re.close();
        stm.close();
        
        return list;
    }
    public static String[][] datosBD(String tabla, String columna,String comparar)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas(tabla);
        
        ResultSet counter = stm.executeQuery("SELECT COUNT(*) AS contar FROM `"+ tabla +"`  WHERE "+ columna +" LIKE '%"+comparar+"%'");
        counter.next();
        int count = counter.getInt("contar");
        counter.close();

        String list[][] = new String[count][datosBD.length];
        
        ResultSet re = stm.executeQuery("SELECT * FROM `"+ tabla +"`  WHERE "+ columna +" LIKE '%"+comparar+"%'");
        for(int i = 0; i < count; i++){
            re.next();
            for(int c = 0; c < datosBD.length; c++){
                list[i][c] = re.getString(datosBD[c]);
            }
        }
        re.close();
        stm.close();
        
        return list;
    }
    
    public static String[] verPrestamoBD(String libro, String usuario)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas("prestamos");
        String[] datosMulta = nombreColumnas("multas");
        ResultSet prestamo = stm.executeQuery("SELECT * FROM prestamos p " +
                                                "INNER JOIN multas m " +
                                                "	ON p.date_out >= m.fecha_cambio " +
                                                "WHERE p.usuario = "+ usuario +" AND p.libro = "+ libro +" " +
                                                "ORDER BY m.id DESC " +
                                                "LIMIT 1");
        
        String list[] = new String[datosBD.length+datosMulta.length+1];
        
        prestamo.next();
        for(int c = 0; c < list.length-1; c++){
            list[c] = prestamo.getString(   (c<datosBD.length
                                            ?datosBD[c]
                                            :datosMulta[c%datosBD.length]) );  
        }
        prestamo.close();
        
        ResultSet multa = stm.executeQuery("SELECT * FROM prestamos WHERE date_return - CURDATE() < 0 AND `usuario` = "+usuario+" AND `libro` = "+libro+" LIMIT 1 ");
        list[list.length-1] = (multa.next()?"1":"0");
        
        multa.close();
        
        stm.close();
        
        return list;
    }
    
    public static String[][] verMultasBD() throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas("prestamos");
        
        ResultSet counter = stm.executeQuery("SELECT COUNT(*) AS contar FROM prestamos WHERE date_return - CURDATE() < 0");
        counter.next();
        int count = counter.getInt("contar");
        counter.close();

        String list[][] = new String[count][datosBD.length];
        
        ResultSet re = stm.executeQuery("SELECT * FROM prestamos WHERE date_return - CURDATE() < 0");
        for(int i = 0; i < count; i++){
            re.next();
            for(int c = 0; c < datosBD.length; c++){
                list[i][c] = re.getString(datosBD[c]);
            }
        }
        re.close();
        stm.close();
        
        return list;
    }
    
    public static void eliminarBD(String tabla, String id)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        stm.executeUpdate("DELETE FROM `"+tabla+"` WHERE `id` = '"+id+"' LIMIT 1");
        stm.close();
        
    }
    
    public static void subirBD(String tabla, String[] datos)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String[] datosBD = nombreColumnas(tabla);
        String columnas = "";
        for(int i=1; i<datosBD.length-1; i++){
            columnas += "`"+ datosBD[i] +"`,";
        }
        columnas += "`"+ datosBD[datosBD.length-1] +"`";
        
        String datosSubir = "";
        for(int i=0; i<datos.length-1; i++){
            datosSubir += "'"+ datos[i] +"',";
        }
        datosSubir += "'"+ datos[datos.length-1] +"'";
        
        stm.executeUpdate("INSERT INTO `"+ tabla
                 +"` ("+ columnas +") VALUES ("+ datosSubir +");");
        stm.close();
    }
    public static void actualizarBD(String tabla, String[] datos, String id)throws SQLException{
        Conexion conn = new Conexion();
        Connection reg = conn.getConnection();
        Statement stm = reg.createStatement();
        
        String res = "";
        
        String[] datosBD = nombreColumnas(tabla);
        for(int i=1; i<datosBD.length-1; i++){
            res += "`"+ datosBD[i] + "` = '" + datos[i-1] +"', ";
        }
        res += "`"+ datosBD[datosBD.length-1] + "` = '" + datos[datos.length-1] +"' ";
        
        stm.executeUpdate("UPDATE "+ tabla +" SET " + res + " WHERE `id` = '" + id + "';");
        stm.close();
    }
    
    public static String[] nombreColumnas(String nombre){
        switch(nombre){
            case "libros":
                return new String [] {
                    "id", "isbn", "nombre", "autor", "categorias", "cantidad",
                    "disponible", "descripcion","fecha_de_ingreso"} ; 
            case "usuarios":
                return new String []{
                    "id", "curp", "nombre_completo", "domicilio", "tel", 
                    "correo_electronico"
                };
            case "empleados":
                return new String []{
                  "id", "curp", "nombre_completo", "fecha_nacimiento",
                    "fecha_ingreso"
                };
            case "prestamos":
                return new String[]{
                    "id", "usuario","libro","date_out","date_return","days","days_cost"
                };
            case "multas":
                return new String[]{
                    "id","fecha_cambio","precio_por_dia"
                };
            default:
                return new String[1];
        }
    }
    
    
  
    


}
