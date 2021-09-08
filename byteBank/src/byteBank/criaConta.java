package byteBank;

public class criaConta {

	public static void main(String[] args) {
		
		Cliente rodrigo = new Cliente("Rodrigo", "111.222.333-44", "Programador");
		Cliente luigi = new Cliente("Luigi", "111.222.333-44", "Programador");
		
		Conta contaRodrigo = new Conta(146, 1, rodrigo);
		contaRodrigo.depositar(200);
		
		Conta contaLuigi = new Conta(146, 2, luigi);		
		
		contaRodrigo.transfere(200, contaLuigi);
		
		contaRodrigo.meMostra();
		contaLuigi.meMostra();
	}

}
