/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Veiculo;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoVeiculo extends Dao{

    public static List buscarVeiculo(Veiculo veiculo) {
        String sql="select v from veiculo v where 1=1 ";
        if(!veiculo.getAno().equals(0))
            sql+="and  v.ano like :ano";
        if(!veiculo.getModeloVeiculo().isEmpty())
            sql+="and  v.modelo like :modelo";
        if(!veiculo.getPlaca().isEmpty())
            sql+="and  v.placa like :modelo";
        
        
        Query query = getEm().createQuery(sql);
        if(!veiculo.getAno().equals(0))
            query.setParameter("ano", veiculo.getAno());
         if(!veiculo.getModeloVeiculo().isEmpty())
             query.setParameter("modelo", veiculo.getModeloVeiculo());
         if(!veiculo.getPlaca().isEmpty())
             query.setParameter("placa", veiculo.getPlaca());
         
         
         
         return query.getResultList();
    }

    private  DaoVeiculo() {
    }   
    public static List<Veiculo> getVeiculos(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Veiculo o").getResultList();
    }
    
}
