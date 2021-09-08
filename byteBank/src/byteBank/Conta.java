package byteBank;

public class Conta {
	private double saldo = 0;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public boolean sacar(double valorASerSacado) {
		if (valorASerSacado <= this.saldo && valorASerSacado > 0.0) {
			this.saldo -= valorASerSacado;
			return true;
		}
		return false;
	}

	public void depositar(double valorADepositar) {
		if (valorADepositar > 0) {
			this.saldo += valorADepositar;
		}
	}

	public void meMostra() {
		System.out.println("Agência: " + this.agencia);
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}

	public boolean transfere(double valorATransferir, Conta contaRecebedora) {
		if (valorATransferir <= this.saldo && valorATransferir > 0.0) {
			this.saldo -= valorATransferir;
			contaRecebedora.saldo += valorATransferir;
			return true;
		}
		return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}
}
