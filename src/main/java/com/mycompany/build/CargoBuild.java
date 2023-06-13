/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Cargo;
import com.mycompany.models.Funcionario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class CargoBuild {
    public String nome;
    private List<Funcionario> funcionarios;
    

    public CargoBuild() {
    }

    public CargoBuild(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }
    
    public CargoBuild valide() throws Exception{
        if(nome.isBlank()||nome.isEmpty())
            throw new Exception("Nome Vazio");
        if(funcionarios == null){
            throw new Exception("Sem funcionários!");
        }
        
        return this;
    }
    
    
    public Cargo build() throws Exception{
        valide();
        Cargo cargo = new Cargo();
        cargo.setNome(nome);
        cargo.setFuncionarios(funcionarios);
        
        return cargo;
    }
}

