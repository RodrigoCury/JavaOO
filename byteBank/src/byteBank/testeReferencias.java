package byteBank;

public class testeReferencias {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Cliente 1", "","");
		Cliente cliente2 = new Cliente("Cliente 2", "","");
		
		Conta conta = new Conta(12,1, cliente1);
		conta.saldo = 300;
		System.out.println(conta.saldo);
		
		Conta conta1 = conta;
		System.out.println(conta1.saldo);
		
		System.out.println(conta1 == conta);
		
		conta1 = new Conta(1,2, cliente2);
		System.out.println(conta1 == conta);
	}

}
