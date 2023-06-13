/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Produto;
import com.mycompany.models.ItemVenda;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class ProdutoBuild {
    public String nome;
    public String valor;
    public String quantidade;
    public ItemVenda itemvenda;

    public ProdutoBuild() {
    }

    public ProdutoBuild(String nome, String valor, String quantidade, ItemVenda itemvenda) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.itemvenda = itemvenda;
        
    }
    
    public ProdutoBuild valide() throws Exception{
        if(nome.isBlank()||nome.isEmpty())
            throw new Exception("Nome Vazio");
        if(valor.isBlank()||valor.isEmpty())
            throw new Exception("valor Vazio");
        if(quantidade.isBlank()||valor.isEmpty())
            throw new Exception("Quantidade Vazia");
        //if(itemvenda.isBlank()||valor.isEmpty());
           // throw new Exception("Item Venda Vazio");
        
        return this;
    }
    
    public Produto build() throws Exception{
        valide();
        Produto p = new Produto();
        p.setNome(nome);
        p.setValorVenda(valor);
        p.setQuantidadeEstoque(quantidade);
        p.setItemVendas((List<ItemVenda>) itemvenda);
        return p;
    }
}

