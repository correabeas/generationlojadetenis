package compra.repository;

import compra.model.CadastroCalçado;

public interface CompraRepository {
	
	
	//crud da conta
	public void cadastrar(CadastroCalçado compra);
	public void listarcalcados();
	public void buscarCalcado(int numero);
	public void atualizar (CadastroCalçado compra);
	public void deletar(int numero);
	
	
	
	//metodo estoque calcado
	//public void 
	

}
