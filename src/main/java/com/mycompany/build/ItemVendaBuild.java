/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.ItemVenda;
import com.mycompany.models.Atendimento;
import com.mycompany.models.Produto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class ItemVendaBuild {
    public Double valorProduto;
    public Double valorDesconto;
    public Float quantidade;
    public Double totalItem;
    public Atendimento atendimento;
    public Produto produto;

    public ItemVendaBuild() {
    }

    public ItemVendaBuild(Double valorProduto, Double valorDesconto, Float quantidade, Double totalItem, Atendimento atendimento, Produto produto ) {
        this.valorProduto = valorProduto;
        this.valorDesconto = valorDesconto;
        this.quantidade = quantidade;
        this.totalItem = totalItem;
        this.atendimento = atendimento;
        this.produto = produto;
        
    }
    
    public ItemVendaBuild valide() throws Exception{
        if(valorProduto == null)
            throw new Exception("valor Vazio");
        if(quantidade == null)
            throw new Exception("Quantidade Vazia");
        if(totalItem == null)
            throw new Exception("Total Item Vazio");
        if(atendimento == null)
            throw new Exception("Atendimento Vazio");
        if(produto == null)
            throw new Exception("Produto Vazio");
        
        return this;
    }
    
    public ItemVenda build() throws Exception{
        valide();
        ItemVenda i = new ItemVenda();
        i.setValorProduto(valorProduto);
        i.setValorDesconto(valorDesconto);
        i.setQuantidade(quantidade);
        i.setTotalItem(totalItem);
        i.setAtendimento((List<Atendimento>) atendimento);
        i.setProduto(produto);
        
        return i;
    }
}

