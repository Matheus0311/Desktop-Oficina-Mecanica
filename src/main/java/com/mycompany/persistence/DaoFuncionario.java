/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Funcionario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoFuncionario extends Dao{

    public static List buscarFuncionario(Funcionario funcionario) {
        String sql="select f from funcionario f where 1=1 ";
        if(!funcionario.getNome().isEmpty())
            sql+="and  f.nome like :nome";
        if(funcionario.getUsuario()!=null)
             sql+="and  f.usuario.id = :idUsuario";
        
        Query query = getEm().createQuery(sql);
         if(!funcionario.getNome().isEmpty())
             query.setParameter("nome", funcionario.getNome());
         if(funcionario.getUsuario()!=null)
             query.setParameter("idUsuario", funcionario.getUsuario().getId());
         
         return query.getResultList();
    }

    private  DaoFuncionario() {
    }   
    public static List<Funcionario> getFuncionarios(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Funcionario o").getResultList();
    }
    
}
