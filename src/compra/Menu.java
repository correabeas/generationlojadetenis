package compra;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import compra.model.CadastroCalçado;
import compra.util.Cores;
import compra.model.LançamentoCalçado;

public class Menu {

	public static void main(String[] args) {
		
		
		//teste da classe compra
		
		//teste classe 

		LançamentoCalçado tenis1 = new LançamentoCalçado("azul", "casual", "couro",38, 2022);
		tenis1.visualizar();
		
		Scanner leia = new Scanner(System.in);
	    int opcao;
	    
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

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os calçados: ");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar calçado por cor: ");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do calçado:");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Excluir calçado: ");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Nossas Lojas: ");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Pagamentos: ");

				break;
			default:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Opção Inválida!");
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
	
	

