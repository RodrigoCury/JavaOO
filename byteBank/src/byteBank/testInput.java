package byteBank;

import java.util.Scanner;

public class testInput {
	public static void main(String[] args) {
		// Enter data using Scanner
		Scanner input = new Scanner(System.in);

		
		String titular = input.nextLine(); 
		int agencia = input.nextInt();
		int numero = input.nextInt();
		double primeiroDeposito = input.nextDouble();
		
		input.close();
		
		Conta conta = new Conta(agencia, numero, titular);
		
		conta.meMostra();
		
		conta.depositar(primeiroDeposito);
		
		conta.meMostra();		
	}
}
