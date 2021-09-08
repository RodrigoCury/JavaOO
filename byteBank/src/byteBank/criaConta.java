package byteBank;

public class criaConta {

	public static void main(String[] args){
		
		try {
			Conta contaRodrigo = new Conta(61, 1, new Cliente("Rodrigo", "111.222.333-44", "Programador"));
			contaRodrigo.depositar(200);
						
			Conta contaLuigi = new Conta(96, 2, new Cliente("Luigi", "111.222.333-44", "Programador"));		
			
			contaRodrigo.transfere(200, contaLuigi);
			
			contaRodrigo.meMostra();
			contaLuigi.meMostra();	
			
			System.out.println(Conta.getTotalDeContas());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
