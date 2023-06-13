/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Cargo;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoCargo extends Dao{

    public static List buscarCargo(Cargo cargo) {
        String sql="select c from cargo c where 1=1 ";
        if(!cargo.getNome().isEmpty())
            sql+="and  f.nome like :nome";
        
        Query query = getEm().createQuery(sql);
         if(!cargo.getNome().isEmpty())
             query.setParameter("nome", cargo.getNome());
         
         return query.getResultList();
    }

    public DaoCargo() {
    }   
    public static List<Cargo> getCargos(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Cargo o").getResultList();
    }
    
}
