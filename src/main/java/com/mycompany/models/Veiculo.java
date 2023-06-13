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
public class Veiculo extends EntidadesVirtuais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 10)
    private String ano;
    
    @Column(length = 10)
    private String placa;
    
    @Column(length = 100)
    private String modeloVeiculo;
    
    @ManyToOne
    private Cliente clientes;
    
    @OneToMany(mappedBy = "veiculos")
    private List<Atendimento> atendimento;
    
    /*@ManyToOne
    private Atendimento atendimento;*/

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public List<Atendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(List<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }

    @Override
    public String toString() {
        return modeloVeiculo;
                }

   @Override
    public String[] getTitulos() {
        return  new String[]{"Modelo","id", "Ano", "Placa", "Responsável"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getModeloVeiculo(),getId(), getAno(), getPlaca(), getClientes()};
    }

    @Override
    public String[] getfilter() {
        return new String[]{"modeloVeiculo"};
    }
    
    
    
    
}
