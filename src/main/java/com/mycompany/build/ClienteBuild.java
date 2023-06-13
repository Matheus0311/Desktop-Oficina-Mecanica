/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Cliente;
import com.mycompany.models.Endereco;
import com.mycompany.models.Atendimento;
import com.mycompany.models.Veiculo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class ClienteBuild {
    public String nome;
    public String dataNascimento;
    public String telefone;
    public String email;
    public String CPF;
    public Endereco endereco;
    public Atendimento atendimento;
    public Veiculo veiculo;

    public ClienteBuild() {
    }

    public ClienteBuild(String nome, String data, String telefone, String email, String CPF, Endereco endereco, Atendimento atendimento, Veiculo veiculo) {
        this.nome = nome;
        this.dataNascimento=data;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.endereco = endereco;
        this.atendimento= atendimento;
        this.veiculo = veiculo;
        
    }
    
    public ClienteBuild valide() throws Exception{
        if(nome.isBlank()||nome.isEmpty())
            throw new Exception("Nome Vazio");
        if(dataNascimento==null || dataNascimento.isBlank()){
            try{
                new Date(dataNascimento);
            }catch(Exception e){
                throw new Exception("Data Invalida");
            }
        }
        if(email.isBlank()||email.isEmpty())
            throw new Exception("Email Vazio");
        if(CPF.isBlank()||CPF.isEmpty())
            throw new Exception("CPF Vazio");
        if(endereco == null)
           throw new Exception("Endereco está vazio");
        if(atendimento == null)
           throw new Exception("Atendimento está vazio");
        if(veiculo == null)
           throw new Exception("Veículo está vazio");
        
        return this;
    }
    
    public Cliente build() throws Exception{
        valide();
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setDataNascimento(new Date(dataNascimento));
        c.setTelefone(telefone);
        c.setEmail(email);
        c.setCpf(CPF);
        c.setEndereco(endereco);
        c.setAtendimento((List<Atendimento>) atendimento);
        c.setVeiculos((List<Veiculo>) veiculo);
        return c;
    }
}

