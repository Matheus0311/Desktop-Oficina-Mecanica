/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.CidadeBuild;
import com.mycompany.models.Cidade;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoCidade;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class CidadeUC {
      /*public void salvarCidade(CidadeBuild cidadeBuild) throws Exception{
        DaoCidade.save(cidadeBuild.build());
    }
    public void removerCidade(CidadeBuild cidadeBuild) throws Exception{
        DaoCidade.remove(cidadeBuild.build());      
    }
    public void buscarCidade(CidadeBuild cidadeBuild) throws Exception{
        
        DaoCidade.buscarCidade(cidadeBuild.build());  
    }*/
    public void salvar(Cidade c) throws Exception{
        Dao.save(c);
    }
     public void remover(Cidade c) throws Exception{
        Dao.remove(c);
    }
    public List<Cidade> buscarCidade(){
        
        return Dao.findAll(Cidade.class,"");
        
    }
}
