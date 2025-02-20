package compra;

import java.util.Scanner;
import compra.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
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
			System.out.println("            1 - Criar tênis                          ");
			System.out.println("            2 - Listar todos os tênis                ");
			System.out.println("            3 - Buscar tênis  por número             ");
			System.out.println("            4 - Atualizar dados do tênis             ");
			System.out.println("            5 - Excluir tênis                        ");
			System.out.println("            6 - Nossas Lojas                         ");
			System.out.println("            7 - Pagamentos                           ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
	   
			
			opcao = leia.nextInt();
			
			if(opcao == 8) {
				System.out.println("A Adidas agradece pela sua preferência! Volte Sempre!");
			    sobre();
			    leia.close();
			    System.exit(0);			
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar tênis  ");

				break;
			case 2:
				System.out.println("Listar todos os tênis ");

				break;
			case 3:
				System.out.println("Buscar tênis  por número");

				break;
			case 4:
				System.out.println("Atualizar dados do tênis");

				break;
			case 5:
				System.out.println("Excluir tênis");

				break;
			case 6:
				System.out.println("Nossas Lojas");

				break;
			case 7:
				System.out.println("Pagamentos");

				break;
			default:
				System.out.println("Opção Inválida!");
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
	}

