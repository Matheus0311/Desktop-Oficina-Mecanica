/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.virtuais;

import javax.swing.JPanel;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public abstract class PainelCadastros extends JPanel{
    private String titulo="Cadastro";
    public abstract EntidadesVirtuais getDados();
    public abstract void setDados(EntidadesVirtuais ev); 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    
}
