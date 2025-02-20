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
		//var compra = buscarCalcado(numeração);
		//if (compra != null) {
		//	listaCompra.set(listaCompra.indexOf(buscaCompra, compra);
			//compra.visualizar();
		}
		
	//}

	@Override
	public void atualizar(CadastroCalçado compra) {
		var buscarCompra = buscarNaCollection(compra);
		
	}

	private Object buscarNaCollection(CadastroCalçado compra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(int numero) {
		//var compra = CadastroCalçado(numero);
		
		//if (compra !=null)
		
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}


    
      public CadastroCalçado buscarNaCollection(int numeração) {
     
    	for(var compra: listaCompra);
    	if(compra.getNumeração() == numeração) {
    		return compra;
    		
    	}
    
  return null;
    }
    }

	


