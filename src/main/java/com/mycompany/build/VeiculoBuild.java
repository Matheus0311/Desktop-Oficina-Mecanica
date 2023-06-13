/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Veiculo;
import com.mycompany.models.Atendimento;
import com.mycompany.models.Cliente;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class VeiculoBuild {
    public String ano;
    public String numeroPlaca;
    public String modelo;
    public Atendimento atendimento;
    public Cliente cliente;

    public VeiculoBuild() {
    }

    public VeiculoBuild(String ano, String numeroPlaca, String modelo, Atendimento atendimento, Cliente cliente) {
        this.ano = ano;
        this.numeroPlaca=numeroPlaca;
        this.modelo = modelo;
        this.atendimento = atendimento;
        this.cliente = cliente;
    }
    
    public VeiculoBuild valide() throws Exception{
        if(ano.isBlank() || ano.isEmpty())
            throw new Exception("Ano Vazio");
        if(numeroPlaca.isBlank()||numeroPlaca.isEmpty())
            throw new Exception("Número da Placa Vazio");
        if(modelo.isBlank()||modelo.isEmpty())
            throw new Exception("Modelo Vazio");
        if(atendimento == null)
            throw new Exception("Atendimento Vazio");
        if(cliente == null)
            throw new Exception("Cliente Vazio");
        
        return this;
    }
    
    public Veiculo build() throws Exception{
        valide();
        Veiculo v = new Veiculo();
        v.setAno(ano);
        v.setPlaca(numeroPlaca);
        v.setModeloVeiculo(modelo);
        v.setAtendimento((List<Atendimento>) atendimento);
        v.setClientes(cliente);
                
        return v;
    }
}

