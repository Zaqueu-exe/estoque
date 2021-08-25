package br.com.estoque.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.mysql.cj.PreparedQuery;

import br.com.estoque.factory.ConnectionFactory;
import br.com.estoque.model.Produtos;

public class EstoqueDAO {
    
    public void save(Produtos produto){
        String sql = "INSERT INTO produtos(nome, quantidade, preco, insercao_data, update_datA) VALUES(?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, produto.getNome());
            pstm.setInt(2, produto.getQuantidade());
            pstm.setDouble(3, produto.getPreco());
            pstm.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
            pstm.setDate(5, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
            pstm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
                if(pstm != null){
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
