/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.EstadoBuild;
import com.mycompany.models.Estado;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoEstado;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class EstadoUC {
    /*public void salvarEstado(EstadoBuild estadoBuild) throws Exception{
        DaoEstado.save(estadoBuild.build());
    }
    public void removerEstado(EstadoBuild estadoBuild) throws Exception{
        DaoEstado.remove(estadoBuild.build());      
    }
    public void buscarEstado(EstadoBuild estadoBuild) throws Exception{
        
        DaoEstado.buscarEstado(estadoBuild.build());  
    }*/
    public void salvar(Estado c) throws Exception{
        Dao.save(c);
    }
     public void remover(Estado c) throws Exception{
        Dao.remove(c);
    }
    public List<Estado> buscarEstado(){
        
        return Dao.findAll(Estado.class,"");
        
    }
}
