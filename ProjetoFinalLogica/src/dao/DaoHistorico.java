/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Historico;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoHistorico implements IDaoHistorico{

    static /*@ spec_public nullable @*/ DaoHistorico daoHistorico = null;
    private /*@ spec_public nullable @*/ Set<Historico> historicos; //@ in listhistoricos;
  
  /*@ private represents listhistoricos <- historicos.toArray();
    @*/
  
  /*@ assignable daoHistorico;
	@ ensures \result != null && daoHistorico != null;
 	@*/
    public static DaoHistorico getInstance() {
        if(daoHistorico == null){
            daoHistorico = new DaoHistorico();
        }
        return daoHistorico;
    }
  
  /*@ assignable historicos;
	@ ensures historicos != null;
	@*/
    public DaoHistorico() {
        historicos = new HashSet<>();
    }
    
    
        
    @Override
    public void adicionarHistorico(Historico historico) {
        historicos.add(historico);
    }

    @Override
    public void removerHistorico(Historico historico) {
        Iterator<Historico> it = historicos.iterator();
		while(it.hasNext()) {
			Historico h = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(h.getIdHistorico() == historico.getIdHistorico()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public /*@ pure @*/ArrayList<Historico> pegarHistorico(long idDemanda) {
        Iterator<Historico> it = historicos.iterator();
        ArrayList<Historico> resultList = new ArrayList<>();
		while(it.hasNext()) {
			Historico h = it.next();
			
			if(h.getIdDemanda() == (idDemanda)) {
				resultList.add(it.next());
			}
		}
		
		return resultList;
    }
    
}
