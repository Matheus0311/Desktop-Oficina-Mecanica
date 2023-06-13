/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.virtuais;

import java.util.List;
import com.mycompany.persistence.Dao;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class UC {
    public static List getAll(Class c,String where){
        return Dao.findAll(c, where);
    }

    public static void salvar(EntidadesVirtuais dados) {
        Dao.save(dados);
    }
    public static void remover(EntidadesVirtuais dados) {
        Dao.remove(dados);
    }
}
