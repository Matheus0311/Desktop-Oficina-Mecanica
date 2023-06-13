/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class SingletonDao {
      private final EntityManagerFactory emf;
    private final EntityManager em;
    private final EntityTransaction etx;
    private static SingletonDao dao;
    
    private SingletonDao() {
        emf = Persistence.createEntityManagerFactory("com.mycompany.mecanica_Mecanica_jar_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        etx = em.getTransaction();
    }
    public static SingletonDao getInstance(){
        if(dao==null)
            dao=new SingletonDao();
        return dao;
    }
    public EntityManager getEm() {
        return em;
    }
    public EntityTransaction getTx() {
        return etx;
    }

}

