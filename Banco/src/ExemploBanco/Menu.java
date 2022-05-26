package ExemploBanco;

public class Menu {
	public static void main (String [] args) {
		
		Conta conta1 = new Conta ();
		conta1.setDono("Mayara Alves de Oliveira");
		conta1.setNumConta(5654562);
		conta1.abriConta("CC");
		
		Conta conta2 = new Conta ();
		conta2.setDono("Igor Luna Almeida");
		conta2.setNumConta(5644893);
		conta2.abriConta("CP");
		
		conta1.depositar(100);
		conta2.depositar(200);
		
		conta1.sacar(45);
		conta2.sacar(68);
		
		conta1.mensalidade(0);
		conta2.mensalidade(0);
		
		
		conta1.extratoConta();
		conta2.extratoConta();
	}
}
