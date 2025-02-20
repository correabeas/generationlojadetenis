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
			System.out.println("            1 - Calçados                             ");
			System.out.println("            2 - Masculino                            ");
			System.out.println("            3 - Feminino                             ");
			System.out.println("            4 - Minha Conta                          ");
			System.out.println("            5 - Status do Pedido                     ");
			System.out.println("            6 - Nossas Lojas                         ");
			System.out.println("            7 - Carrinho de Compras                  ");
			System.out.println("            8 - Pagamentos                           ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
	   
			
			opcao = leia.nextInt();
			
			if(opcao ==9) {
				System.out.println("A Adidas agradece pela sua preferência! Volte Sempre!");
			    sobre();
			    leia.close();
			    System.exit(0);			
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Calçados");

				break;
			case 2:
				System.out.println("Masculino");

				break;
			case 3:
				System.out.println("Feminino");

				break;
			case 4:
				System.out.println("Minha Conta");

				break;
			case 5:
				System.out.println("Status do Pedido");

				break;
			case 6:
				System.out.println("Nossas Lojas");

				break;
			case 7:
				System.out.println("Carrinho de Compras ");

				break;
			case 8:
				System.out.println("Pagamentos ");

				break;
			default:
				System.out.println("Sair");
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

