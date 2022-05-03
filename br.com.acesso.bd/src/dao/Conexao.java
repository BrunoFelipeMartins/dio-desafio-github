package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
        private final String user = "postgres";
        private final String password = "Fazer#2016";
        private static Conexao instance;
        public Connection conn;

    private Conexao(){
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the postgreSQL server successfully.");            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static Conexao getInstance(){
        if(instance == null){
            instance = new Conexao();
        }
        return instance;
        }

    
}
