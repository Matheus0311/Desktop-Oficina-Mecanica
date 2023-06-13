/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Estado;
import com.mycompany.models.Endereco;
import com.mycompany.models.Cidade;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class CidadeBuild {
    public String nome;
    public Estado estado;
    public Endereco endereco;
    
    public CidadeBuild(){
    }
    
    public CidadeBuild(String nome, Estado estado, Endereco endereco){
        this.nome = nome;
        this.estado = estado;
        this.endereco = endereco;
    }
    
    public CidadeBuild valide() throws Exception{
        if(nome.isBlank()||nome.isEmpty())
            throw new Exception("Nome Vazio");
        if(estado == null)
            throw new Exception("Estado está vazio");
        if(endereco == null)
            throw new Exception("Endereço está vazio");
        
        return this;
    }
    public Cidade build() throws Exception{
        valide();
        Cidade cid = new Cidade();
        cid.setNome(nome);
        cid.setEstado(estado);
        cid.setEnderecos((List<Endereco>) endereco);
        
        return cid;
    }

}
