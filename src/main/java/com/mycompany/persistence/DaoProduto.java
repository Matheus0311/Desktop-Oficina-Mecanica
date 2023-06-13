/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Produto;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoProduto extends Dao{

    public static List buscarProduto(Produto produto) {
        String sql="select p from produto p where 1=1 ";
        if(!produto.getNome().isEmpty())
            sql+="and  p.nome like :nome";
        if(!produto.getValorVenda().equals(0))
            sql+="and  p.ValorVenda like :ValorVenda";
        if(!produto.getQuantidadeEstoque().equals(0))
            sql+="and  p.QuantidadeEstoque like :QuantidadeEstoque";
        
        Query query = getEm().createQuery(sql);
        if(!produto.getNome().isEmpty())
             query.setParameter("nome", produto.getNome());
        if(!produto.getValorVenda().equals(0))
            query.setParameter("Valor", produto.getValorVenda());
         if(!produto.getQuantidadeEstoque().equals(0))
            query.setParameter("Quantidade", produto.getQuantidadeEstoque());
         
         return query.getResultList();
    }

    private  DaoProduto() {
    }   
    public static List<Produto> getProdutos(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Produto o").getResultList();
    }
    
}
