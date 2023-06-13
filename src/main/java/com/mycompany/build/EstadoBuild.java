/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Cidade;
import com.mycompany.models.Estado;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class EstadoBuild {
    public String nome;
    public String uf;
    public Cidade cidade;
    
    public EstadoBuild(){
    }
    
    public EstadoBuild(String nome, String uf, Cidade cidade){
        this.nome = nome;
        this.uf = uf;
        this.cidade = cidade;
    }
    
    public EstadoBuild valide() throws Exception{
        if(nome.isBlank()||nome.isEmpty())
            throw new Exception("Nome Vazio");
        if(uf.isBlank()||uf.isEmpty())
            throw new Exception("Nome Vazio");
        if(cidade == null)
           throw new Exception("Cidade está vazia");
        
        return this;
    }
    public Estado build() throws Exception{
        valide();
        Estado es = new Estado();
        es.setNome(nome);
        es.setUf(uf);
        es.setCidades((List<Cidade>) cidade);
        
        return es;
    }
}
