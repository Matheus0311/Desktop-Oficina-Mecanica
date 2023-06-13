/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.CargoBuild;
import com.mycompany.models.Cargo;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoCargo;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class CargoUC {
    /*public void salvarCargo(CargoBuild cargoBuild) throws Exception{
        
        DaoCargo.save(cargoBuild.build());
        
    }
    public void removerCargo(CargoBuild cargoBuild) throws Exception{
        DaoCargo.remove(cargoBuild.build());      
    }
    public void buscarCargo(CargoBuild cargoBuild) throws Exception{
        
        DaoCargo.buscarCargo(cargoBuild.build());  
    }*/
    public void salvar(Cargo c) throws Exception{
        Dao.save(c);
    }
     public void remover(Cargo c) throws Exception{
        Dao.remove(c);
    }
    public List<Cargo> buscarCargo(){
        
        return Dao.findAll(Cargo.class,"");
        
    }
    
}
