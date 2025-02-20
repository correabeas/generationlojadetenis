package compra.controller;

import compra.repository.CompraRepository;
import compra.repository.Criar;

public class ContaController implements CompraRepository {

	@Override
	public void cadastrar(Criar calçado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarcalcados() {
		for (var conta: listaCompras) {
			compra.visualizar();
		}
		
	}

	@Override
	public void buscarCalcado(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

}
