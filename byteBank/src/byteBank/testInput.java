package byteBank;

import java.util.Scanner;

public class testInput {
	public static void main(String[] args) throws Exception {
		// Enter data using Scanner
		Scanner input = new Scanner(System.in);

		
		String nome = input.nextLine(); 
		int agencia = input.nextInt();
		int numero = input.nextInt();
		double primeiroDeposito = input.nextDouble();
		
		Cliente cliente = new Cliente(nome, "","");
		
		input.close();
		
		Conta conta = new Conta(agencia, numero, cliente);
		
		conta.meMostra();
		
		conta.depositar(primeiroDeposito);
		
		conta.meMostra();		
	}
}
