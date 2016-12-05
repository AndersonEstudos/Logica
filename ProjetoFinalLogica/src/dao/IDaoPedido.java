/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Pedido;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoPedido {
   
	//@ public model instance Object[] listpedidos;
	
	/*@ public invariant (\forall int i; i >= 0 && i < listpedidos.length - 1; listpedidos[i] != null);
	  @*/
		
	/*@ requires demanda != null;
	  @ requires false == (\exists int i; 0 <= i && i < listpedidos.length; listpedidos[i] == demanda);
	  @ ensures (\exists int i; 0 <= i && i < listpedidos.length; listpedidos[i] == demanda);
	  @ ensures_redundantly (\forall int i; i >= 0 && i < \old(listpedidos.length) - 1; 
	  @   (\exists int j; j >= 0 && j < listpedidos.length - 1; \old(listpedidos[i]) == listpedidos[j]));
	  @*/	
	public void adicionarPedido(Pedido demanda);
    public void removerPedido(Pedido demanda);
    public void atualizarPedido(Pedido demanda);
    
    /*@ requires id >= 0;
      @ ensures \result == null || \result.getIdServico() == id;
      @*/
    public/*@ pure nullable @*/Pedido pegarPedido(long id);
    public ArrayList<Pedido> listarPedidosUsuario(long usuario);
    public ArrayList<Pedido> listarPedidos();
}
