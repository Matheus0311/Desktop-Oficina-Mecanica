/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Endereco;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoEndereco extends Dao {
    public static List buscarEndereco(Endereco endereco) {
        String sql="select e from endereco e where 1=1 ";
        if(!endereco.getNome().isEmpty())
            sql+="and  e.nome like :nome";
        if(!endereco.getRua().isEmpty())
            sql+="and  e.rua like :rua";
        if(!endereco.getNumero().isEmpty())
            sql+="and  e.numero like :numero";
        if(!endereco.getBairro().isEmpty())
            sql+="and  e.bairro like :bairro";
        if(!endereco.getCep().isEmpty())
            sql+="and  e.cep like :cep";
        if(endereco.getCidade() != null)
            sql+="and  e.cidade like :cidade";
        if(endereco.getClientes()!= null)
            sql+="and  e.cliente like :cliente";
        if(endereco.getFuncionarios()!= null)
            sql+="and  e.funcionario like :funcionario";
        
        
        Query query = getEm().createQuery(sql);
         if(!endereco.getRua().isEmpty())
             query.setParameter("rua", endereco.getRua());
         if(!endereco.getNumero().isEmpty())
             query.setParameter("numero", endereco.getNumero());
         if(!endereco.getBairro().isEmpty())
             query.setParameter("bairro", endereco.getBairro());
         if(!endereco.getCep().isEmpty())
             query.setParameter("cep", endereco.getCep());
         if(endereco.getCidade() != null)
             query.setParameter("cidade", endereco.getCidade());
         if(endereco.getClientes() != null)
             query.setParameter("cliente", endereco.getClientes());
         if(endereco.getFuncionarios() != null)
             query.setParameter("funcionario", endereco.getFuncionarios());
         
         return query.getResultList();
    }
    
    private DaoEndereco() {
    }   
    public static List<Endereco> getEnderecos(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Endereco o").getResultList();
    }
}
