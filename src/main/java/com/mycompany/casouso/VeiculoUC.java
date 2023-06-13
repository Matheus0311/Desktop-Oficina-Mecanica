/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.VeiculoBuild;
import com.mycompany.models.Veiculo;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoVeiculo;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class VeiculoUC {
    /*public void salvarVeiculo(VeiculoBuild veiculoBuild) throws Exception{
        DaoVeiculo.save(veiculoBuild.build());
    }
    public void removerVeiculo(VeiculoBuild veiculoBuild) throws Exception{
        DaoVeiculo.remove(veiculoBuild.build());      
    }
    public void buscarVeiculo(VeiculoBuild veiculoBuild) throws Exception{
        DaoVeiculo.buscarVeiculo(veiculoBuild.build());  
    }*/
    public void salvar(Veiculo c) throws Exception{
        Dao.save(c);
    }
     public void remover(Veiculo c) throws Exception{
        Dao.remove(c);
    }
    public List<Veiculo> buscarVeiculo(){
        
        return Dao.findAll(Veiculo.class,"");
        
    }
    
}
