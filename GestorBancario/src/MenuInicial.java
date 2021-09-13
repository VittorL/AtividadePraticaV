import java.util.Scanner;
public class MenuInicial {
	
	public void Menus() {
		
		Scanner s = new Scanner(System.in);
		
	
		System.out
		.println("\n\nGestor Bancario");
		System.out.println("\n                  ============================");
		System.out.println("                  |1 - Criar Conta Corrente |");
		System.out.println("                  |2 - Realizar Depósito    |");
		System.out.println("                  |3 - Realizar Saque       |");
		System.out.println("                  |4 - Consultar Saldo	    |");
		System.out.println("                  |5 - Contas Cadastradas   |");
		System.out.println("                  |0 - Sair                 |");
		System.out.println("                  ============================\n");

	
		System.out.print("Opção ->");
		int opcao = s.nextInt();
	
		System.out.print("\n");
			
		switch (opcao) {
		case 1:
			System.out.println("Realizar Cadastro: ");
			System.out.print("\n");
			new Conta().cadastrarConta();
			break;
		case 2:
			new Conta().depositar();				                 
		case 3:
			new Conta().sacar();			
			break;
		case 4:
			new Conta().verificaSaldo();
			break;
		case 5:
			new Conta().Consulta();
			break;
		case 0:
			MenuInicial men = new MenuInicial();
			men.Menus();		
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
			}
		
	}
}
