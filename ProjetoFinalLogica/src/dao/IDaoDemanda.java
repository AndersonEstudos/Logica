/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Demanda;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public interface IDaoDemanda {
   
	//@ public model instance Object[] listdemandas;
	
	/*@ public invariant (\forall int i; i >= 0 && i < listdemandas.length - 1; listdemandas[i] != null);
	  @*/
		
	/*@ requires demanda != null;
	  @ requires false == (\exists int i; 0 <= i && i < listdemandas.length; listdemandas[i] == demanda);
	  @ ensures (\exists int i; 0 <= i && i < listdemandas.length; listdemandas[i] == demanda);
	  @ ensures_redundantly (\forall int i; i >= 0 && i < \old(listdemandas.length) - 1; 
	  @   (\exists int j; j >= 0 && j < listdemandas.length - 1; \old(listdemandas[i]) == listdemandas[j]));
	  @*/
	public void adicionarDemanda(Demanda demanda);
    public void removerDemanda(Demanda demanda);
    public void atualizarDemanda(Demanda demanda);
    
    /*@ requires id >= 0;
      @ ensures \result == null || \result.getIdDemanda() == id;
      @*/
    public /*@ pure nullable @*/  Demanda pegarDemanda(long id);
    public ArrayList<Demanda> listarDemandas();

    
}
