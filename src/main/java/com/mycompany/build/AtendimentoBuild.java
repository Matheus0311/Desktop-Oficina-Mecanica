/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Atendimento;
import com.mycompany.models.Cliente;
import com.mycompany.models.Funcionario;
import com.mycompany.models.Veiculo;
import com.mycompany.models.ItemVenda;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class AtendimentoBuild {
    public String descricao;
    public String valor;
    public Cliente cliente;
    public Funcionario funcionario;
    public Veiculo veiculo;
    public ItemVenda itemvenda;

    public AtendimentoBuild() {
    }

    public AtendimentoBuild(String descricao, String valor, Cliente cliente, Funcionario funcionario, Veiculo veiculo, ItemVenda itenvenda) {
        this.descricao = descricao;
        this.valor = valor;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
        this.itemvenda = itemvenda;
    }
    
    public AtendimentoBuild valide() throws Exception{
        if(descricao.isBlank()||descricao.isEmpty())
            throw new Exception("Descrição Vazia");
        if(valor == null)
            throw new Exception("Valor Vazio");
        if(cliente == null)
           throw new Exception("Cliente está vazio");
        if(funcionario == null)
            throw new Exception("Funcionário está vazio");
        if(veiculo == null)
           throw new Exception("Veiculo está vazio");
        if(itemvenda == null)
            throw new Exception("Item Venda está vazio");
        
        return this;
    }
    
    public Atendimento build() throws Exception{
        valide();
        Atendimento a = new Atendimento();
        a.setDescricao(descricao);
        a.setValor(valor);
        a.setClientes(cliente);
        a.setFuncionarios(funcionario);
        a.setVeiculos(veiculo);
        a.setItensvendas(itemvenda);
        return a;
    }
}

