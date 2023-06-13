/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.ItemVendaBuild;
import com.mycompany.models.ItemVenda;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoItemVenda;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class ItemVendaUC {
    /*public void salvarItemVenda(ItemVendaBuild itemvendaBuild) throws Exception{
        DaoItemVenda.save(itemvendaBuild.build());
    }
    public void removerItemVenda(ItemVendaBuild itemvendaBuild) throws Exception{
        DaoItemVenda.remove(itemvendaBuild.build());      
    }
    public void buscarItemVenda(ItemVendaBuild itemvendaBuild) throws Exception{
        DaoItemVenda.buscarItemVenda(itemvendaBuild.build());
    }*/
    public void salvar(ItemVenda c) throws Exception{
        Dao.save(c);
    }
     public void remover(ItemVenda c) throws Exception{
        Dao.remove(c);
    }
    public List<ItemVenda> buscarItemVenda(){
        
        return Dao.findAll(ItemVenda.class,"");
        
    }
    
}
