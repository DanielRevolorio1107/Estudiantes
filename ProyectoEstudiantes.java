
package proyectoestudiantes;
  import java.sql.*;
public class ProyectoEstudiantes {


    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/estudiantes"; // Reemplaza con tu URL de conexión
        String usuario = "root"; // Reemplaza con tu usuario de conexión
        String contraseña = "daniuwu11"; // Reemplaza con tu contraseña de conexión
        
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            
            String carnet = "20210001";
            String nombre = "Juan";
            int edad = 20;
            
            String sql = "INSERT INTO estudiante (carnet, nombre, edad) VALUES (?, ?, ?)";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, carnet);
            statement.setString(2, nombre);
            statement.setInt(3, edad);
            
            statement.executeUpdate();
            
            System.out.println("Registro insertado correctamente");
            
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            e.printStackTrace();
        }
    }
}

