/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.FuncionarioBuild;
import com.mycompany.models.Funcionario;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoFuncionario;
import java.util.List;


/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class FuncionarioUC {
   /* public void salvarFuncionario(FuncionarioBuild funcionarioBuild) throws Exception{ 
        DaoFuncionario.save(funcionarioBuild.build());
    }
    public void removerFuncionario(FuncionarioBuild funcionarioBuild) throws Exception{
        DaoFuncionario.remove(funcionarioBuild.build());      
    }
    public void buscarFuncionario(FuncionarioBuild funcionarioBuild) throws Exception{
        
        DaoFuncionario.buscarFuncionario(funcionarioBuild.build());  
    }*/
    public void salvar(Funcionario c) throws Exception{
        Dao.save(c);
    }
     public void remover(Funcionario c) throws Exception{
        Dao.remove(c);
    }
    public List<Funcionario> buscarFuncionario(){
        
        return Dao.findAll(Funcionario.class,"");
        
    }
    
}
