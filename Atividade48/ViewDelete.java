package Atividade48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewDelete {

    // CORRETO

    public static void main(String[] args) {
        try {
            int idDeletado = 11;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres",
                    "123456");

            String sql = "DELETE FROM pessoas WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);

            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
