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
public class Cidade extends EntidadesVirtuais implements Serializable  {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 50)
    private String nome;
    
    /*@ManyToOne
    private Cidade cidade;*/
    
    /*@OneToMany(mappedBy = "cidade")
    private List<Cidade> cidades;*/
    
    @ManyToOne
    private Estado estado;
    
    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecos;

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
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
     public List<Endereco> getEnderecos() {
        return enderecos;
    }
    
     public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
     
    @Override
    public String toString() {
        return nome;
                }

   @Override
    public String[] getTitulos() {
        return  new String[]{"Nome","Estado", "id"};
    }

    @Override
    public Object[] getDados() {
        return new Object[]{getNome(),getEstado(),getId()};
    }

    @Override
    public String[] getfilter() {
        return new String[]{"nome"};
    }
}
