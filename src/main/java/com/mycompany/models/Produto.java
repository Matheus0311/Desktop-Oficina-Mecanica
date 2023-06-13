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
public class Produto extends EntidadesVirtuais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 100)
    private String nome;
    
    @Column(length = 100)
    private String valorVenda;
    
    @Column(length = 100)
    private String quantidadeEstoque;
    
    @OneToMany(mappedBy = "produto")
    private List<ItemVenda> itemVendas;
    
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

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public List<ItemVenda> getItemVendas() {
        return itemVendas;
    }

    public void setItemVendas(List<ItemVenda> itemVendas) {
        this.itemVendas = itemVendas;
    }
@Override
    public String toString() {
        return nome;
                }

   @Override
    public String[] getTitulos() {
        return  new String[]{"Nome","id", "Valor de Venda", "Quantidade no Estoque"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome(),getId(), getValorVenda(), getQuantidadeEstoque()};
    }

    @Override
    public String[] getfilter() {
        return new String[]{"nome"};
    }


    
    
}
