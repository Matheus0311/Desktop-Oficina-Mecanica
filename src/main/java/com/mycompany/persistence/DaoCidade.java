/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Cidade;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoCidade extends Dao {
    public static List buscarCidade(Cidade cidade) {
        String sql="select cid from cidade cid where 1=1 ";
        if(!cidade.getNome().isEmpty())
            sql+="and  cid.nome like :nome";
        if(cidade.getEstado()!= null)
            sql+="and  cid.estado like :estado";
        if(cidade.getEnderecos()!= null)
            sql+="and  cid.endereco like :endereco";
        
        
        
        Query query = getEm().createQuery(sql);
         if(!cidade.getNome().isEmpty())
             query.setParameter("Nome", cidade.getNome());
         
         if(cidade.getEstado() != null)
             query.setParameter("estado", cidade.getEstado());
         if(cidade.getEnderecos() != null)
             query.setParameter("endereco", cidade.getEnderecos());
         
         return query.getResultList();
    }
    
    private DaoCidade() {
    }   
    public static List<Cidade> getCidades(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Cidade o").getResultList();
    }
}
