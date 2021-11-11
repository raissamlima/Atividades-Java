package Atividade46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View4 {

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
            String sql = "DELETE FROM pessoas WHERE id > 12";
            statement.execute(sql);
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
