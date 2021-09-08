package byteBank;

public class testeReferencias {

	public static void main(String[] args) {
		Conta conta = new Conta(12,1,"Conta1");
		conta.saldo = 300;
		System.out.println(conta.saldo);
		
		Conta conta1 = conta;
		System.out.println(conta1.saldo);
		
		System.out.println(conta1 == conta);
		
		conta1 = new Conta(1,2,"Conta2");
		System.out.println(conta1 == conta);
	}

}
