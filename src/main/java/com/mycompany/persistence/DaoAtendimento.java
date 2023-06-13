/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Atendimento;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoAtendimento extends Dao{

    public static List buscarAtendimento(Atendimento atendimento) {
        String sql="select a from atendimento a where 1=1 ";
        if(!atendimento.getDescricao().isEmpty())
            sql+="and  a.descricao like :descricao";
        if(atendimento.getClientes()!= null)
            sql+="and  e.cliente like :cliente";
        if(atendimento.getFuncionarios()!= null)
            sql+="and  e.funcionario like :funcionario";
        
        Query query = getEm().createQuery(sql);
         if(!atendimento.getDescricao().isEmpty())
             query.setParameter("descricao", atendimento.getDescricao());
         if(atendimento.getClientes() != null)
             query.setParameter("cliente", atendimento.getClientes());
         if(atendimento.getFuncionarios() != null)
             query.setParameter("funcionario", atendimento.getFuncionarios());
         
         return query.getResultList();
    }

    private  DaoAtendimento() {
    }   
    public static List<Atendimento> getAtendimentos(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Atendimento o").getResultList();
    }
    
}
