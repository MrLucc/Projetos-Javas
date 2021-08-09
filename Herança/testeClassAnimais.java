package OPP;

public class testeClassAnimais {
	public static void main(String[] args) {
		
		cachorroClass cachorro = new cachorroClass("Bob","35",true,true);
		cavaloClass cavalo = new cavaloClass("Ryu","27",true,true,"Poney");
		preguicaClass preguica = new preguicaClass("Lontra","100",false,true);
		
		cachorro.info();
		cavalo.info();
		preguica.info();
		
		
	}

}
