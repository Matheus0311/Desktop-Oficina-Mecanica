/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import com.mycompany.virtuais.EntidadesVirtuais;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
@Entity
public class Cargo extends EntidadesVirtuais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 50)
    String nome;
    
    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    @Override
    public String toString() {
        return nome;
                }

   @Override
    public String[] getTitulos() {
        return  new String[]{"Nome","id"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome(),getId()};
    }

    @Override
    public String[] getfilter() {
        return new String[]{"nome"};
    }

    
    
}
