/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.ItemVenda;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoItemVenda extends Dao{

    public static List buscarItemVenda(ItemVenda itemvenda) {
        String sql="select i from itemvenda i where 1=1 ";
        if(itemvenda.getValorProduto() != null)
            sql+="and  i.valorproduto like :valorproduto";
        if(itemvenda.getProduto() != null)
            sql+="and  i.produto like :produto";
        if(itemvenda.getAtendimento()!= null)
            sql+="and  i.atendimento like :atendimento";
        
        Query query = getEm().createQuery(sql);
        if(!itemvenda.getValorProduto().equals(0))
            query.setParameter("Valor produto", itemvenda.getValorProduto());
        /*if(!itemvenda.getValorDesconto().equals(0))
           query.setParameter("Valor Desconto", itemvenda.getValorDesconto());
        if(!itemvenda.getQuantidade().equals(0))
           query.setParameter("Quantidade", itemvenda.getQuantidade());
        if(!itemvenda.getTotalItem().equals(0))
           query.setParameter("Total Item", itemvenda.getTotalItem());*/
        if(itemvenda.getAtendimento() != null)
            query.setParameter("Atendimento", itemvenda.getAtendimento());
        if(itemvenda.getProduto()!= null)
            query.setParameter("Produto", itemvenda.getProduto());
        
         return query.getResultList();
    }

    private  DaoItemVenda() {
    }   
    public static List<ItemVenda> getItensVendas(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from ItemVenda o").getResultList();
    }
    
}
