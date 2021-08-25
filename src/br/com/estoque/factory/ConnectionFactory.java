package br.com.estoque.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/estoque";

    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    }
    public static void main(String[] args) throws Exception{
        Connection conn = createConnectionToMySQL();
        if(conn != null){
            System.out.println("Conexão feita com sucesso");
            conn.close();
        }
    }
}
