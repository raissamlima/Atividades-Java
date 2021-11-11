package Atividade46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View {

    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5433;
            String dataBase = "postgres";
            String user = "postgres";
            String pwd = "123456";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, dataBase,
                    user, pwd);

            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM pessoas");
            ResultSet result = statement.getResultSet();

            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                System.out.printf("%d - %s %s\n", id, nome, sobrenome);
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
        }
    }
}
