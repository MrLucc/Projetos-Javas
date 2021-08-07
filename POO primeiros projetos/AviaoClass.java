package OPP;

public class AviaoClass {
	
	private String modelo;
	private String asas;
	private String voa;
	private String papel;

	public AviaoClass(String modelo, String asas, String voa, String papel) {
		this.modelo = modelo;
		this.asas = asas;
		this.voa = voa;
		this.papel = papel;
	}

	public void infoAviao() {
		System.out.println("Modelo do avi„o: "+modelo+"\nTem asas?: "+asas+"\nEle voa?: "+voa+"\n… de papel?: "+papel);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAsas() {
		return asas;
	}

	public void setAsas(String asas) {
		this.asas = asas;
	}

	public String getMotor() {
		return voa;
	}

	public void setMotor(String motor) {
		this.voa = motor;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}
	
	
	
}
