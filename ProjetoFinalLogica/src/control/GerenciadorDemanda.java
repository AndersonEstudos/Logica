/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoDemanda;
import dao.IDaoDemanda;
import domain.Demanda;
import excecao.DemandaInvalidoException;
import excecao.PedidoInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorDemanda {

	private IDaoDemanda daoDemanda;

	public GerenciadorDemanda() {
		daoDemanda = DaoDemanda.getInstance();
	}
	/*@ requires demanda != null;
	  @*/
	public void cadastrarDemanda(Demanda demanda) throws PedidoInvalidoException, DemandaInvalidoException {
		if (validarDemanda(demanda) && demanda.validar()) {
			this.daoDemanda.adicionarDemanda(demanda);
		} else
			throw new DemandaInvalidoException("Demanda não cadastrada, verifique seus dados");
	}

	public void removerDemanda(Demanda demanda) {
		this.daoDemanda.removerDemanda(demanda);
	}

	public void atualizarDemanda(Demanda demanda) {
		this.daoDemanda.atualizarDemanda(demanda);
	}

	public ArrayList<Demanda> listarDemandas() {
		return this.daoDemanda.listarDemandas();
	}

	public Demanda getDemanda(Long id) {
		return this.daoDemanda.pegarDemanda(id);
	}
	  
  /*@      private normal_behavior
    @              requires demanda.getDescricao().length()  > 0;
    @		       requires demanda.getNome().length() > 0;
    @              requires demanda.getPreco() > 0;
    @	           requires daoDemanda.pegarDemanda(demanda.getIdDemanda()) == null;
    @              ensures \result == true;
    @ also
    @      private exceptional_behavior
    @			   requires demanda.getDescricao().length() == 0  || 
    @                       demanda.getNome().length() == 0  || 
    @                       demanda.getPreco() <= 0  ||
    @						daoDemanda.pegarDemanda(demanda.getIdDemanda()) != null; 	
	@              signals_only PedidoInvalidoException;
    @*/
	private /*@ pure @*/ boolean validarDemanda(Demanda demanda) throws PedidoInvalidoException {
		if (demanda.getDescricao().equals("")) {
			throw new PedidoInvalidoException("Descrição vazia.");
		} else if (demanda.getNome().equals("")) {
			throw new PedidoInvalidoException("Nome vazio.");

		} else if (demanda.getPreco() < 0) {
			throw new PedidoInvalidoException("Valor invalido");

		} else if (this.daoDemanda.pegarDemanda(demanda.getIdDemanda()) != null) {
			throw new PedidoInvalidoException("Demanda já cadastrado");
		}
		return true;
	}
}
