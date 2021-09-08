package byteBank;

public class criaConta {

	public static void main(String[] args) {
		Conta contaRodrigo = new Conta(146, 1, "Rodrigo");
		contaRodrigo.depositar(200);
		
		Conta contaLuigi = new Conta(146, 2, "Luigi");		
		
		contaRodrigo.transfere(200, contaLuigi);
		
		contaRodrigo.meMostra();
		contaLuigi.meMostra();
	}

}
