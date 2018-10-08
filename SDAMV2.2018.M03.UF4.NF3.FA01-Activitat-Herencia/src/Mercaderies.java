
public class Mercaderies extends Vehicle{
	int numEixos;
	int alçada;
	String tipusMercaderia;
	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 * @param numEixos
	 * @param alçada
	 * @param tipusMercaderia
	 */
	
	
	public Mercaderies(String marca, String model, String matricula, String nombreOcupants, String slots,
			String pesTotal, int numEixos, int alçada, String tipusMercaderia) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		this.numEixos = numEixos;
		this.alçada = alçada;
		this.tipusMercaderia = tipusMercaderia;
	}
	//Getters Setters
	public int getNumEixos() {
		return numEixos;
	}
	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}
	public int getAlçada() {
		return alçada;
	}
	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}
	public String getTipusMercaderia() {
		return tipusMercaderia;
	}
	public void setTipusMercaderia(String tipusMercaderia) {
		this.tipusMercaderia = tipusMercaderia;
	}

}
