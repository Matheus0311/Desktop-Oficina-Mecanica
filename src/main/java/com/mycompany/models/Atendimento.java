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
public class Atendimento extends EntidadesVirtuais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 300)
    private String descricao;
   
    private String valor;
    
    @ManyToOne
    private Cliente clientes;
    
    @ManyToOne
    private Funcionario funcionarios;
    
    @ManyToOne
    private Veiculo veiculos;
    
    @ManyToOne
    private ItemVenda itensvendas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Veiculo getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo veiculos) {
        this.veiculos = veiculos;
    }
    
    public ItemVenda getItensvendas() {
        return itensvendas;
    }

    public void setItensvendas(ItemVenda itensvendas) {
        this.itensvendas = itensvendas;
    }

    @Override
    public String toString() {
        return descricao;
                }

   @Override
    public String[] getTitulos() {
        return  new String[]{"Descrição","id", "Veículo", "Cliente", "Funcionário", "Preço"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getDescricao(),getId(), getVeiculos(),getClientes(), getFuncionarios(), getValor()};
    }

    @Override
    public String[] getfilter() {
        return new String[]{"descricao"};
    }
    
    
    
}
