/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.UsuarioPadrao;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoUsuarioPadrao {
	
	//@ public model instance Object[] listusers;
	
	/*@ public invariant (\forall int i; i >= 0 && i < listusers.length - 1; listusers[i] != null);
	  @*/
		
	/*@ requires usuario != null;
	  @ requires false == (\exists int i; 0 <= i && i < listusers.length; listusers[i].equals(usuario));
	  @ ensures (\exists int i; 0 <= i && i < listusers.length; listusers[i].equals(usuario));
	  @ ensures_redundantly (\forall int i; i >= 0 && i < \old(listusers.length) - 1; 
	  @   (\exists int j; j >= 0 && j < listusers.length - 1; \old(listusers[i]).equals(listusers[j])));
	  @*/
    public void adicionarUsuario(UsuarioPadrao usuario);
    
    /*@ requires usuario != null;
      @ ensures (\forall int i; i >=0 && i < listusers.length; ((UsuarioPadrao)listusers[i]).getId() != usuario.getId());
      @*/
    public void removerUsuario(UsuarioPadrao usuario);
    public void atualizarUsuario(UsuarioPadrao usuario);
    
    /*@ requires id >= 0;
      @ ensures \result == null || \result.getId() == id;
      @*/
    public /*@ pure nullable @*/ UsuarioPadrao pegarUsuario(long id);
    public ArrayList<UsuarioPadrao> listarUsuarios();
   
    /*@ requires login != null && login.length() > 0;
      @ ensures \result == null || \result.getLogin().equals(login);
      @*/
    public /*@ pure nullable @*/ UsuarioPadrao pegarUsuario(String login);

         
}
