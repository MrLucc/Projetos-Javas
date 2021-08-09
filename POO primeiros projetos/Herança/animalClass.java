package OPP;

public class animalClass {

	private String nome;
	private String idade;
	private Boolean emitirSom;
	
	
	public animalClass(String nome, String idade, Boolean emitirSom) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public Boolean getEmitirSom() {
		return emitirSom;
	}


	public void setEmitirSom(Boolean emitirSom) {
		this.emitirSom = emitirSom;
	}
	
	
	
}
