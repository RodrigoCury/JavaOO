package byteBank;

public class criaConta {

	public static void main(String[] args){
		
		try {
			System.out.println(Conta.totalDeContas);
			
			Conta contaRodrigo = new Conta(61, 1, new Cliente("Rodrigo", "111.222.333-44", "Programador"));
			contaRodrigo.depositar(200);
			
			System.out.println(Conta.totalDeContas);
			
			Conta contaLuigi = new Conta(96, 2, new Cliente("Luigi", "111.222.333-44", "Programador"));		
			
			System.out.println(Conta.totalDeContas);
			
			contaRodrigo.transfere(200, contaLuigi);
			
			contaRodrigo.meMostra();
			contaLuigi.meMostra();	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
