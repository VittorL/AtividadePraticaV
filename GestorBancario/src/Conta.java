import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conta {
	public int numero;
	public double saldo = 0;
	public int codigo;
	List<Conta> contaLista = new ArrayList<Conta>();
	Scanner s = new Scanner(System.in);

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
}
