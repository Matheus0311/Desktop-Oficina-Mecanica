/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public abstract class Dao {
    private static Dao dao;
    
    
    
    protected static EntityManager getEm() {
        return SingletonDao.getInstance().getEm();
    }
    private static EntityTransaction getTx() {
        return SingletonDao.getInstance().getTx();
    }

    public static Object save(Object o) throws PersistenceException{
       Object salvo=null;
      
        getTx().begin();
        salvo = getEm().merge(o);
        getTx().commit();
      
       return salvo;
    }

    public static void remove(Object o) {
    EntityManager em = SingletonDao.getInstance().getEm();
    EntityTransaction etx = SingletonDao.getInstance().getTx();

        getTx().begin();
        getEm().remove(o);
        getTx().commit();
    }
    
    public static List findAll(Class o,String where) {
        return getEm().createQuery("select o from "+o.getSimpleName()+
                " o where 1=1 "+where).getResultList();
    }
    public static List findByID(Class c,Integer id) {
        return getEm().createQuery("select o from "+c.getSimpleName()+
                " o where id=:id ").setParameter("id", id).getResultList();
    }

}

