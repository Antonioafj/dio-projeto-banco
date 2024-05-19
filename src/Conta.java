import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}


	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		// TODO Auto-generated method stub	
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		// TODO Auto-generated method stub
		
	}
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
		
	}
	    
		LocalDateTime agora = LocalDateTime.now();
		
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String data = formatterData.format(agora);

		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String hora = formatterHora.format(agora);
	
	
	protected void imprimirDados() {
		System.out.println(data);
		System.out.println("HORA: " + hora);
		System.out.println(String.format("Cidade: %s ",this.cliente.getCidade()));		// TODO Auto-generated method stub// TODO Auto-generated method stub
		System.out.println(String.format("Agencia: %s ", this.agencia));		// TODO Auto-generated method stub
		System.out.println(String.format("Numero: %d ", this.numero));		// TODO Auto-generated method stub
		System.out.println(String.format("Saldo: %.2f ", this.saldo));
		System.out.println(String.format("Titular: %s ", this.cliente.getNome()));

		

	}


	
}
