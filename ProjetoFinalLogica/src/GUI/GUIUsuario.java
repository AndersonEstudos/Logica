/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import domain.Usuario;

/**
 *
 * @author Thiago
 */
public interface GUIUsuario {
    public void cadastrarCliente();
    public void removerCliente();
    public void listarCliente();
    public void analisarPedido(Usuario usuario);
    
}
