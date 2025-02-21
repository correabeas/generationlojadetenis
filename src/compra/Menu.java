package compra;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import compra.controller.CompraController;
import compra.model.CadastroCalçado;
import compra.util.Cores;
import compra.model.LançamentoCalçado;

public class Menu {

	public static void main(String[] args) {
		
		
	    CompraController compra = new CompraController();

		LançamentoCalçado tenis1 = new LançamentoCalçado("azul", "casual", "couro",38, 4584781, 2022);
		tenis1.visualizar();
		
		Scanner leia = new Scanner(System.in);
	    int opcao;
	    int codigo;
	    String tipo;
	    String material;
	    String cor;
	    
	    while(true) {
	    	System.out.println(Cores.TEXT_WHITE+ Cores.ANSI_BLACK_BACKGROUND +
	    			"*****************************************************");
	    	System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("        \\\\     ADIDAS 4 LISTRAS     \\\\               ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar calçado                        ");
			System.out.println("            2 - Listar todos os calçado              ");
			System.out.println("            3 - Buscar calçado por cor               ");
			System.out.println("            4 - Atualizar dados do calçado           ");
			System.out.println("            5 - Excluir tênis                        ");
			System.out.println("            6 - Nossas Lojas                         ");
			System.out.println("            7 - Pagamentos                           ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
	   
			
			try {
				opcao = leia.nextInt();
				
			}catch(InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if(opcao == 8) {
				System.out.println("A Adidas agradece pela sua preferência! Volte Sempre!");
			    sobre();
			    leia.close();
			    System.exit(0);			
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar calçado: ");
				System.out.println("Digite o tipo do calçado: ");
				tipo = leia.nextLine();
				System.out.println("Digite o material do calçado: ");
				leia.skip("R?");
				material = leia.nextLine();
				 keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os calçados: ");
                compra.listarcalcados();
                keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar calçado por cor: ");
				 keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do calçado:");
                System.out.println("Digite o código do calçado:" );
                opcao = leia.nextInt();
                var buscarCompra = compra.buscarNaCollection(opcao);
                if (buscarCompra != null) {
                	
                }
                keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Excluir calçado: ");
                System.out.println("Digite o código do calçado: ");
                codigo = leia.nextInt();
                keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Nossas Lojas: ");
				 
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Pagamentos: ");
				
				 keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Opção Inválida!");
				 keyPress();
				break;
	    
	    }

	}

}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Beatriz Corrêa");
		System.out.println("Adidas Brasil - adidas@brasil.com.br");
		System.out.println("github.com/correabeas");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
		
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione Enter para Continuar...");
			System.in.read();
		
	}catch (IOException e) {
		System.out.println("Você pressionou uma tecla diferente de ENTER");
	}
	}
}
	
	

