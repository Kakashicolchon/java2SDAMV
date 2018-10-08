
public class Mercaderies extends Vehicle{
	int numEixos;
	int al�ada;
	String tipusMercaderia;
	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 * @param numEixos
	 * @param al�ada
	 * @param tipusMercaderia
	 */
	
	
	public Mercaderies(String marca, String model, String matricula, String nombreOcupants, String slots,
			String pesTotal, int numEixos, int al�ada, String tipusMercaderia) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		this.numEixos = numEixos;
		this.al�ada = al�ada;
		this.tipusMercaderia = tipusMercaderia;
	}
	//Getters Setters
	public int getNumEixos() {
		return numEixos;
	}
	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}
	public int getAl�ada() {
		return al�ada;
	}
	public void setAl�ada(int al�ada) {
		this.al�ada = al�ada;
	}
	public String getTipusMercaderia() {
		return tipusMercaderia;
	}
	public void setTipusMercaderia(String tipusMercaderia) {
		this.tipusMercaderia = tipusMercaderia;
	}

}
