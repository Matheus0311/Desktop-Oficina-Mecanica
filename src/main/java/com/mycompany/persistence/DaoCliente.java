/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Cliente;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoCliente extends Dao{

    public static List buscarCliente(Cliente cliente) {
        String sql="select c from cliente c where 1=1 ";
        if(!cliente.getNome().isEmpty())
            sql+="and  c.nome like :nome";
        
        Query query = getEm().createQuery(sql);
         if(!cliente.getNome().isEmpty())
             query.setParameter("nome", cliente.getNome());
         
         return query.getResultList();
    }

    private  DaoCliente() {
    }   
    public static List<Cliente> getClientes(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Cliente o").getResultList();
    }
    
}
