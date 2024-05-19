
public class Cliente {

	private String nome;
	private String cidade;


	public Cliente(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}




	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
