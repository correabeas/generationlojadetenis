package compra.model;

public class LançamentoCalçado extends CadastroCalçado{
	
	private int lancamento;
	
	
	

	public LançamentoCalçado() {
		
	}

	public LançamentoCalçado(String cor, String tipo, String material, int numeração, int lancamento) {
		super(cor, tipo, material, numeração);
		this.lancamento = lancamento;
	}

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
	
	
@Override 
public void visualizar() {
	super.visualizar();
	System.out.println("O ano de lançamento do calçado é: " + lancamento);
	

}
}
