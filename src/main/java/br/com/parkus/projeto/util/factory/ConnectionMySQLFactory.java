package br.com.parkus.projeto.util.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQLFactory {

    // USERNAME mysql
    private static final String USERNAME = "root";

    // PASSWORD mysql
    private static final String PASSWORD = "mysql";

    // DATABASE_URL: endereco, porta e nome do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/parkus_king";
    /**
     * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
     * @param username
     * @param senha
     * @return uma conexão com o banco de dados
     * @throws Exception
     */
    public static Connection conexaoMySQL() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        //Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void desconectarMySQL(Connection connection) throws SQLException {
        if(connection != null) connection.close();
        else throw new SQLException();

        return;
    }
}
