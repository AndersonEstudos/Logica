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
    
    public void adicionarUsuario(UsuarioPadrao usuario);
    public void removerUsuario(UsuarioPadrao usuario);
    public void atualizarUsuario(UsuarioPadrao usuario);
    
    /*@ requires id >= 0;
      @ ensures \result == null || \result.getId() == id;
      @*/
    public /*@ nullable @*/ UsuarioPadrao pegarUsuario(long id);
    public ArrayList<UsuarioPadrao> listarUsuarios();
   
    /*@ requires login != null && login.length() > 0;
      @ ensures \result == null || \result.getLogin().equals(login);
      @*/
    public /*@ nullable @*/ UsuarioPadrao pegarUsuario(String login);

         
}
