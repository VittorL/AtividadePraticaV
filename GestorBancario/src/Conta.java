import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {
	public int codigo;
	public int numero;
	public double saldo = 0;	
	static List<Conta> contaLista = new ArrayList<Conta>();
	Scanner s = new Scanner(System.in);
	
	MenuInicial menu = new MenuInicial();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void cadastrarConta() {
		
		System.out.println("Digite o número da conta do cliente: ");
		this.setNumero(s.nextInt());
				
		contaLista.add(this);
		menu.Menus();	
	}
	
	public void depositar() {
		System.out.println("Digite o número da conta que deseja depositar: ");
		int idDepositar = new Scanner(System.in).nextInt();
		 
		 
		for (int i = 0; i < contaLista.size(); i++) {
			if(contaLista.get(i).numero == idDepositar) {	
				
				System.out.println("Digite o valor deseja depositar: ");
				double valor = new Scanner(System.in).nextDouble();
				
				if (valor != -1) {
					double saldoResult = contaLista.get(i).saldo + valor;
					contaLista.get(i).setSaldo(saldoResult);
				} else {
					
					System.out.println("Não efetuado!");				
				}
				
				
			}
		}
		menu.Menus();
	}	
	
	public boolean sacar() {
		System.out.println("Digite o número da conta que deseja Sacar: ");
		int idSacar = new Scanner(System.in).nextInt();
		 
		 
		for (int i = 0; i < contaLista.size(); i++) {
			if(contaLista.get(i).numero == idSacar) {	
				System.out.println("Digite o valor deseja Sacar: ");
				double valor = new Scanner(System.in).nextDouble();
				
				if (valor > contaLista.get(i).saldo) {
					System.out.println("Nao ha saldo suficiente");
					menu.Menus();
				} else {
					double saldoResult = contaLista.get(i).saldo - valor;
					contaLista.get(i).setSaldo(saldoResult);
					menu.Menus();
				}
				
				
			}
		}
		
		return false;
	}
	
	public void verificaSaldo() {
		System.out.println("Digite o número da conta que deseja verificar Saldo: ");
		int idSaldo = new Scanner(System.in).nextInt();
		for (int i = 0; i < contaLista.size(); i++) {
			if(contaLista.get(i).numero == idSaldo) {	
				System.out.println("verificar Saldo: "+contaLista.get(i).saldo);
			}
		}
		menu.Menus();
	}
	
	public static void Consulta() {
				
		for (Conta c: contaLista) {
			int id = c.codigo;
			int numConta = c.numero;
			int saldo = (int) c.saldo;
			System.out.println("Registro: "+id+" | Número da Conta: "+numConta+ " | Saldo: " +saldo);
			}
		MenuInicial men = new MenuInicial();
		men.Menus();
	}
}
