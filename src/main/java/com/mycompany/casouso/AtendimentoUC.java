/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.AtendimentoBuild;
import com.mycompany.models.Atendimento;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoAtendimento;
import com.mycompany.virtuais.UC;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class AtendimentoUC extends UC{
    public void salvarAtendimento(AtendimentoBuild atendimentoBuild) throws Exception{
        
        DaoAtendimento.save(atendimentoBuild.build());
        
    }
    public void removerAtendimento(AtendimentoBuild atendimentoBuild) throws Exception{
        DaoAtendimento.remove(atendimentoBuild.build());      
    }
    public void buscarAtendimento(AtendimentoBuild atendimentoBuild) throws Exception{
        
        DaoAtendimento.buscarAtendimento(atendimentoBuild.build());  
    }
    
    public void salvar(Atendimento c) throws Exception{
        Dao.save(c);
    }
     public void remover(Atendimento c) throws Exception{
        Dao.remove(c);
    }
    public List<Atendimento> buscarAtendimento(){
        
        return Dao.findAll(Atendimento.class,"");
        
    }
    
}
