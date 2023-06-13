/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Estado;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoEstado extends Dao{
    public static List buscarEstado(Estado estado) {
        String sql="select es from estado es where 1=1 ";
        if(!estado.getNome().isEmpty())
            sql+="and  es.nome like :nome";
        if(!estado.getUf().isEmpty())
            sql+="and  es.uf like :uf";
        if(estado.getCidades() != null)
            sql+="and  es.cidade like :cidade";
        
        Query query = getEm().createQuery(sql);
         if(!estado.getNome().isEmpty())
             query.setParameter("nome", estado.getNome());
         if(!estado.getUf().isEmpty())
             query.setParameter("UF", estado.getUf());
         if(estado.getCidades() != null)
             query.setParameter("cidade", estado.getCidades());
         
         
         return query.getResultList();
    }
    
    private DaoEstado() {
    }   
    
    public static List<Estado> getEstados(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Estado o").getResultList();
    }
}
