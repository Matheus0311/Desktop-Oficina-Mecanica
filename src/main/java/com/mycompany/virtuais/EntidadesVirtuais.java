/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.virtuais;


/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public abstract class EntidadesVirtuais {
    public abstract String[] getTitulos();
    public abstract Object[] getDados();
    public String[]  getfilter(){
        return new String[]{"nome"};
    }

}
