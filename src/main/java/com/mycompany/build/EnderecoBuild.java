/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Cidade;
import com.mycompany.models.Funcionario;
import com.mycompany.models.Cliente;
import com.mycompany.models.Endereco;
import com.mycompany.models.Estado;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class EnderecoBuild {
    public String nome;
    public String rua;
    public String numero;
    public String bairro;
    public String CEP;
    public Cidade cidade;
    public Cliente cliente;
    public Estado estado;
    public Funcionario funcionario;
    
    public EnderecoBuild(){
    }
    
    public EnderecoBuild( String nome, String rua, String numero, String bairro, String CEP, Cidade cidade, Estado estado, Cliente cliente, Funcionario funcionario){
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    
    public EnderecoBuild valide() throws Exception{
        if(nome.isBlank()||nome.isEmpty())
            throw new Exception("Nome do Endereço Vazio");
        if(rua.isBlank()||rua.isEmpty())
            throw new Exception("Rua Vazia");
        if(numero.isBlank()||numero.isEmpty())
            throw new Exception("Número Vazio");
        if(bairro.isBlank()||bairro.isEmpty())
            throw new Exception("Bairro está vazio");
        if(cidade == null)
            throw new Exception("Cidade está vazia");
        if(estado == null)
            throw new Exception("Estado está vazio");
        if(cliente == null)
           throw new Exception("Cliente está vazio");
        if(funcionario == null)
            throw new Exception("Funcionário está vazia");
        
        return this;
    }
    
    public Endereco build() throws Exception{
        valide();
        Endereco e = new Endereco();
        e.setNome(nome);
        e.setRua(rua);
        e.setNumero(numero);
        e.setBairro(bairro);
        e.setCep(CEP);
        e.setCidade(cidade);
        e.setEstado(estado);
        e.setClientes((List<Cliente>) cliente);
        e.setFuncionarios((List<Funcionario>) funcionario);
        
        return e;
    }

}