/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.UsuarioInvalidoException;



/**
 *
 * @author hiarl
 */
public class UsuarioPadrao extends Usuario{
    
    private /*@ spec_public @*/ boolean administrador;

    
    /*@
    @	ensures this.administrador == administrador;
    @*/
    public UsuarioPadrao(boolean administrador, String nome, String endereco, String telefone, String login, String senha) {
        super(nome, endereco, telefone, login, senha);
        this.administrador = administrador;
    }
    
    public /*@ pure @*/ boolean validar() throws UsuarioInvalidoException{
        return true;
    }

    /**
     * @return the administrador
     */
    public /*@ pure @*/ boolean isAdministrador() {
        return administrador;
    }

    /*@
    @			assignable this.administrador;
    @ 			ensures this.administrador == administrador;
    @*/
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}
