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
public interface GUICliente {
	
	/*@ requires usuario != null ;
	  @*/
    public void cadastrarPedido(Usuario usuario);
    
    /*@ requires usuario != null ;
	  @*/
    public void listarPedidos(Usuario usuario);
    public void listarDemandas();
}
