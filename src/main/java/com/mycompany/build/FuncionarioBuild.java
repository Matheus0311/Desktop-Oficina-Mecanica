/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Funcionario;
import com.mycompany.models.Endereco;
import com.mycompany.models.Usuario;
import com.mycompany.models.Cargo;
import java.util.Date;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class FuncionarioBuild {
    public String nome;
    public String dataNascimento;
    public String telefone;
    public String email;
    public String CPF;
    public Endereco endereco;
    public Usuario usuario;
    public Cargo cargo;

    public FuncionarioBuild() {
    }

    public FuncionarioBuild(String nome, String data, String telefone, String email, String CPF, Endereco endereco, Usuario usuario, Cargo cargo) {
        this.nome = nome;
        this.dataNascimento=data;
        this.telefone = telefone;
        this.email = email;
        this.CPF = CPF;
        this.endereco = endereco;
        this.usuario = usuario;
        this.cargo = cargo;
        
    }
    
    public FuncionarioBuild valide() throws Exception{
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
           throw new Exception("Endereço está vazio");
        if(usuario == null)
            throw new Exception("Usuário está vazio");
        if(cargo == null)
            throw new Exception("Cargo está vazio");
        
        return this;
    }
    
    public Funcionario build() throws Exception{
        valide();
        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setDataNascimento(new Date(dataNascimento));
        f.setTelefone(telefone);
        f.setEmail(email);
        f.setCpf(CPF);
        f.setEndereco(endereco);
        f.setUsuario(usuario);
        f.setCargo(cargo);
        return f;
    }
}

