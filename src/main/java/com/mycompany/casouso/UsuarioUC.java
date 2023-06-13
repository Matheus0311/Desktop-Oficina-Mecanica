/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.UsuarioBuild;
import com.mycompany.models.Usuario;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoUsuario;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class UsuarioUC {
    public void salvarUsuario(UsuarioBuild usuarioBuild) throws Exception{
        
        DaoUsuario.save(usuarioBuild.build());
        
    }
    public void removerUsuario(UsuarioBuild usuarioBuild) throws Exception{
        DaoUsuario.remove(usuarioBuild.build());      
    }
    public void buscarUsuario(UsuarioBuild usuarioBuild) throws Exception{
        
        DaoUsuario.buscarUsuario(usuarioBuild.build());  
    }
    /*public void salvar(Usuario c) throws Exception{
        Dao.save(c);
    }
     public void remover(Usuario c) throws Exception{
        Dao.remove(c);
    }
    public List<Usuario> buscarUsuario(){
        
        return Dao.findAll(Usuario.class,"");
        
    }*/
    
}
