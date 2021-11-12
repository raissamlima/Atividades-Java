package Atividade48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ViewUpdate {

    // CORRETO

    public static void main(String[] args) {
        try {
            String nome = "Jojo";
            int id = 11;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres",
                    "123456");

            String sql = "UPDATE pessoas SET nome=? WHERE id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

            prepStatement.execute();

            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
