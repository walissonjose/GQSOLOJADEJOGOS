
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Produto;


public class ProdutoDAO 
{
    
    public void cadastrarProduto(Produto p)
    {
        String sql = "insert into tb_produtos (prod_nome, prod_categoria, prod_marca, prod_fornecedor,"
                + " prod_quantidade, prod_preco_unitario) "
                + " values(?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = Conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCategoria());
            stmt.setString(3, p.getMarca());
            stmt.setString(4, p.getFornecedor());
            stmt.setInt(5, p.getQuantidade());
            stmt.setDouble(6, p.getPreco());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso");
            
            
        }catch(SQLException e)
        {
            System.out.println("Erro na insercao dos dados: "+e);
        }
    }
}
