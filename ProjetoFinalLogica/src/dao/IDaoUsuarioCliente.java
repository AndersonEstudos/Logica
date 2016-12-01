/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.UsuarioCliente;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoUsuarioCliente {

    public void adicionarCliente(UsuarioCliente usuario);
    public void removerCliente(UsuarioCliente usuario);
    public void atualizarCliente(UsuarioCliente usuario);
    
    /*@ requires id >= 0;
    @ ensures \result == null || \result.getId() == id;
    @*/
    public  /*@ nullable @*/ UsuarioCliente pegarCliente(long id);    
    /*@ requires login != null && login.length() > 0;
    @ ensures \result == null || \result.getLogin().equals(login);
    @*/
    public  /*@ nullable @*/ UsuarioCliente pegarCliente(String login);
    public ArrayList<UsuarioCliente> listarCliente();


}
