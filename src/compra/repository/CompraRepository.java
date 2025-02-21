package compra.repository;

import compra.model.CadastroCalçado;

public interface CompraRepository {
	
	
	//crud da conta
	public void cadastrar(CadastroCalçado compra);
	public void listarcalcados();
	public void buscarCalcado(int numero);
	public void atualizar (CadastroCalçado compra);
	public void deletar(int numero);

	
	
	
	/*
	 * // Métodos Bancários
		public void sacar(int numero, float valor);
		public void depositar(int numero, float valor);
		public void transferir(int numeroOrigem, int numeroDestino, float valor);
		
	}
	 */
	

}
