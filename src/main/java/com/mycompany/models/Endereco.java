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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
@Entity
public class Endereco extends EntidadesVirtuais implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 100)
    private String nome;
    
    @Column(length = 100)
    private String rua;
    
    @Column(length = 100)
    private String numero;
    
    @Column(length = 100)
    private String bairro;
    
    @Column(length = 18)
    private String cep;
    
    @ManyToOne
    private Cidade cidade;
    
    @ManyToOne
    private Estado estado;
    
    @OneToMany(mappedBy = "endereco")
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "endereco")
    private List<Funcionario> funcionarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
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
        return  new String[]{"nome","id", "Cidade", "Estado", "CEP", "Bairro", "Rua"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome(),getId(), getCidade(), getEstado(), getCep(), getBairro(), getRua()};
    }

    @Override
    public String[] getfilter() {
        return new String[]{"nome"};
    }
    
}