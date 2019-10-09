/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cadu
 */
public class Conexao {
    
    private static Connection conexao = null;
    
    public Conexao(){
        this.CriarConexao();
    }

    public static Connection getConexao() {
        return conexao;
    }
    
    public void CriarConexao()
    {
        String url = "jdbc:mysql://localhost/db_loja_de_jogos";
        String usuario = "root";
        String senha = "";
        
        try {
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro na conexao com o banco: " + ex);
        }
    }
    
}
