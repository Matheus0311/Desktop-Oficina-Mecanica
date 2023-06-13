/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casouso;

import com.mycompany.build.ProdutoBuild;
import com.mycompany.models.Produto;
import com.mycompany.persistence.Dao;
import com.mycompany.persistence.DaoProduto;
import java.util.List;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */

public class ProdutoUC {
    /*public void salvarProduto(ProdutoBuild produtoBuild) throws Exception{
        
        DaoProduto.save(produtoBuild.build());
        
    }
    public void removerProduto(ProdutoBuild produtoBuild) throws Exception{
        DaoProduto.remove(produtoBuild.build());      
    }
    public void buscarProduto(ProdutoBuild produtoBuild) throws Exception{
        DaoProduto.buscarProduto(produtoBuild.build());
    }*/
    public void salvar(Produto c) throws Exception{
        Dao.save(c);
    }
     public void remover(Produto c) throws Exception{
        Dao.remove(c);
    }
    public List<Produto> buscarCargo(){
        
        return Dao.findAll(Produto.class,"");
        
    }
    
}
