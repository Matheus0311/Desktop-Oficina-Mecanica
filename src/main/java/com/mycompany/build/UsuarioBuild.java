/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.build;

import com.mycompany.models.Usuario;
import com.mycompany.models.Funcionario;


/**
 *
 * @author ribei
 */
public class UsuarioBuild {
    public String login;
    public String senha;
    public Funcionario funcionario;
    
    public UsuarioBuild() {
    }
    
    public UsuarioBuild(String login, String senha, Funcionario funcionario) {
        this.login = login;
        this.senha = senha;
        this.funcionario = funcionario;
    
    }
    
    public UsuarioBuild valide() throws Exception{
        if(login.isBlank()||login.isEmpty())
            throw new Exception("Login Vazio");
        if(senha.isBlank()||senha.isEmpty())
            throw new Exception("Senha Vazia");
        if(funcionario == null)
            throw new Exception("Funcionário Vazio");
       
        return this;
    }
    
    public Usuario build() throws Exception{
        valide();
        Usuario u = new Usuario();
        u.setLogin(login);
        u.setSenha(senha);
        u.setFuncionario(funcionario);
        
        return u;
    }
    
}



