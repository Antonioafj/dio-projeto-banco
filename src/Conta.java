
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
	protected void imprimirDados() {
		System.out.println(String.format("Titular: %s ", this.cliente.getNome()));		// TODO Auto-generated method stub
		System.out.println(String.format("Agencia: %s ", this.agencia));		// TODO Auto-generated method stub
		System.out.println(String.format("Numero: %d ", this.numero));		// TODO Auto-generated method stub
		System.out.println(String.format("Saldo: %.2f ", this.saldo));
	}


	
}
