package OPP;

public class cachorroClass extends animalClass {
	
	private Boolean correr;
	
	public cachorroClass(String nome, String idade, Boolean emitirSom, Boolean correr) {
		
		super(nome, idade, emitirSom);
		this.correr = correr;
	}

	public Boolean getCorrer() {
		return correr;
	}

	public void setCorrer(Boolean correr) {
		this.correr = correr;
	}
	
	public void info() {
		System.out.println("---------LISTA DE CARACTERISTICAS DOS ANIMAIS--------------");
		System.out.println("\nNome do animal:" + getNome()+ "\nIdade:" + getIdade() +"\nEmiti som? "+ getEmitirSom() + "\nEle consegue correr?" +correr);
	}
	
}
