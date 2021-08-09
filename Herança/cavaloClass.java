package OPP;

public class cavaloClass extends animalClass {
	
	private Boolean correr;
	private String porte;
	
	cavaloClass(String nome, String idade, Boolean emitirSom, Boolean correr, String porte){
		super(nome, idade, emitirSom);
		this.correr = correr;
		this.porte = porte;
	}

	public Boolean getCorrer() {
		return correr;
	}

	public void setCorrer(Boolean correr) {
		this.correr = correr;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void info() {
		System.out.println("---------LISTA DE CARACTERISTICAS DOS ANIMAIS--------------");
		System.out.println("\nNome do animal:" + getNome()+ "\nIdade:" + getIdade() +"\nEmiti som? "+ getEmitirSom() + "\nEle consegue correr? " +correr +"\nQual porte do animal:"+ porte);

	}
}
