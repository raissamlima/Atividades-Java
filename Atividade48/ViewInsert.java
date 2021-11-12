package Atividade48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ViewInsert {

    public static void main(String[] args) {
        try {
            // SQL Injection
            String nome = "Eletro');delete from pessoas; INSERT INTO pessoas(nome)values('teste";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres",
                    "123456");
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO pessoas(nome)values(?)",
                    Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);

            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.println(id);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
