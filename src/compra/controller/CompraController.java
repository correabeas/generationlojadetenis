package compra.controller;

import java.util.ArrayList;

import compra.model.CadastroCalçado;
import compra.repository.CompraRepository;

public class CompraController implements CompraRepository {

	private ArrayList<CadastroCalçado> listaCompra = new ArrayList<CadastroCalçado>();
	int numeração = 0;
	
	@Override
	public void cadastrar(CadastroCalçado compra) {
		listaCompra.add(compra);
		System.out.println("O calçado :" + compra + " foi cadastrado com sucesso!");
	}
	@Override
	public void listarcalcados() {
		for(var compra: listaCompra) {
			compra.visualizar();
		}
	}	
	@Override
	public void buscarCalcado(int numeração) {
		var compra = buscarNaCollection(numeração);
		if (compra != null) {
		compra.visualizar();
		}	
	}
	@Override
	public void atualizar(CadastroCalçado compra) {
		var buscarCompra = buscarNaCollection(compra.getCodigo());
		if (buscarCompra != null) {
	    listaCompra.set(listaCompra.indexOf(compra), compra);
		}
	}

	public CadastroCalçado buscarNaCollection(int numero) {
		for (var compra: listaCompra) {
	    if(compra.getCodigo() == numero) {
	    return compra;	
	    }
		}
		return null;
	}

	@Override
	public void deletar(int numero) {
		var compra = buscarNaCollection(numero);
		if (compra !=null) {
	 }
  }	
}


	


