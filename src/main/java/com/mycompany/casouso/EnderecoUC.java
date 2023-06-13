/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.EnderecoBuild;
import com.mycompany.models.Endereco;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoEndereco;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class EnderecoUC {
    /*public void salvarEndereco(EnderecoBuild enderecoBuild) throws Exception{
        
        DaoEndereco.save(enderecoBuild.build());
        
    }
    public void removerEndereco(EnderecoBuild enderecoBuild) throws Exception{
        DaoEndereco.remove(enderecoBuild.build());      
    }
    public void buscarEndereco(EnderecoBuild enderecoBuild) throws Exception{
        
        DaoEndereco.buscarEndereco(enderecoBuild.build());  
    }*/
    public void salvar(Endereco c) throws Exception{
        Dao.save(c);
    }
     public void remover(Endereco c) throws Exception{
        Dao.remove(c);
    }
    public List<Endereco> buscarEndereco(){
        
        return Dao.findAll(Endereco.class,"");
        
    }
}
