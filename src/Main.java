import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		
		Cliente cliente = new Cliente(null, null);
		 
		Scanner scan = new Scanner(System.in);

		System.out.println("DIGITE O NOME DO TITULAR: ");
		cliente.setNome(scan.next());
		
		
		System.out.println("\nDIGITE A CIDADE: ");
		cliente.setCidade(scan.next());
		
		
		Conta cc = new ContaCorrente(cliente);
		
		Conta poupanca = new ContaPoupanca(cliente);

		
		System.out.println("DIGITE O VALOR DE DEPOSITO EM CONTA CORRENTE");
		cc.depositar(scan.nextDouble());
						
		System.out.println("\nDIGITE O VALOR DE TRANSFERENCIA DA CONTA CORRENTE");
		cc.transferir(scan.nextDouble(), poupanca);
		
		
		System.out.println("\nDIGITE O VALOR DE SAQUE DA CONTA POUPANÇA");
		poupanca.sacar(scan.nextDouble());
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
