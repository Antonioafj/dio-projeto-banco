
public class Main {
	
	public static void main(String[] args) {
		
		Cliente antonio = new Cliente();
		 
		antonio.setNome("antonio");
		
		
		Conta cc = new ContaCorrente(antonio);
		
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(antonio);
		
		cc.transferir(100, poupanca);
		
		poupanca.transferir(10, cc);
		
		cc.imprimirExtrato();
		
		
		
		poupanca.sacar(48);
		
		poupanca.imprimirExtrato();
	}

}
