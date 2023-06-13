/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistence;

import com.mycompany.models.Usuario;
import static com.mycompany.persistence.Dao.getEm;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author matheus ribeiro
 * @author danilo silva
 */
public class DaoUsuario extends Dao{

    public static List buscarUsuario(Usuario usuario) {
        String sql="select u from usuario u where 1=1 ";
        if(!usuario.getLogin().isEmpty())
            sql+="and  u.login like :login";
        /*if(!usuario.getSenha().isEmpty())
            sql+="and  u.senha like :senha";*/
        if(usuario.getFuncionario() != null)
            sql+="and  u.funcionario like :funcionario";
        
        
        Query query = getEm().createQuery(sql);
         if(!usuario.getLogin().isEmpty())
             query.setParameter("login", usuario.getLogin());
         /*if(!usuario.getSenha().isEmpty())
             query.setParameter("senha", usuario.getSenha());*/
         if(usuario.getFuncionario() != null)
             query.setParameter("funcionario", usuario.getFuncionario());
             
         
         return query.getResultList();
    }

    private  DaoUsuario() {
    }   
    public static List<Usuario> getUsuarios(){
        return SingletonDao.getInstance().getEm().createQuery("Select o from Usuario o").getResultList();
    }
    
}
