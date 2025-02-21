package compra.model;

public abstract class CadastroCalçado {
	
	
	
	
	
	
	
	private String cor;
	private String tipo;
	private String material;
	private int numeração;
	private int codigo;
	
	
	public CadastroCalçado() {
		
	}

	public CadastroCalçado(String cor, String tipo, String material, int numeração, int codigo) {


		this.cor = cor;
		this.tipo = tipo;
		this.material = material;
		this.numeração = numeração;
		this.codigo = codigo;
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumeração() {
		return numeração;
	}

	public void setNumeração(int numeração) {
		this.numeração = numeração;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean buscar(String cor) {
		System.out.println();
		if(this.getCor() != "azul, rosa, preto, branco, verde") {
			System.out.println("Escolha sua cor:");
			return false;
		}
		this.setCor(this.getCor() + cor); {
		    return true;
	  }
	}

	public void visualizar() {
		 System.out.println("*****************************************************");
	     System.out.println("                    Dados da compra                  ");
	     System.out.println("*****************************************************");
	     System.out.println("Número do calçado: " + this.numeração);
	     System.out.println("Cor do calçado: " + this.cor);
	     System.out.println("Tipo do calçado: " + this.tipo);
	     System.out.println("Material do calçado: " + this.material);
	     System.out.println("Código do calçado:" +this.codigo);
	    
	  }
	}
	
	



	
	
	
	

