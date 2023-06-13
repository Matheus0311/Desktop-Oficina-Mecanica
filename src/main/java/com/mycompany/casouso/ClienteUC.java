/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.ClienteBuild;
import com.mycompany.models.Cliente;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoCliente;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class ClienteUC {
    /*public void salvarCliente(ClienteBuild clienteBuild) throws Exception{
        
        DaoCliente.save(clienteBuild.build());
        
    }
    public void removerCliente(ClienteBuild clienteBuild) throws Exception{
        DaoCliente.remove(clienteBuild.build());      
    }
    public void buscarCliente(ClienteBuild clienteBuild) throws Exception{
        
        DaoCliente.buscarCliente(clienteBuild.build());  
    }*/
    public void salvar(Cliente c) throws Exception{
        Dao.save(c);
    }
     public void remover(Cliente c) throws Exception{
        Dao.remove(c);
    }
    public List<Cliente> buscarCliente(){
        
        return Dao.findAll(Cliente.class,"");
        
    }
    
}
