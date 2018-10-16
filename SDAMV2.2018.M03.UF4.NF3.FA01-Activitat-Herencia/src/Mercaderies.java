
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
	
	
	public Mercaderies(String marca, String model, String matricula, int nombreOcupants, int slots,
			float pesTotal, int numEixos, int al�ada, String tipusMercaderia) {
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
	//M�todes
	@Override
	public float calcularPreuBitllet() {
		System.out.println("Mercaderies: ");
		float resultat = (PBEV * getSlots()) + (PBTV * getPesTotal());
		return resultat;
	}
	//ToString
	@Override
	public String toString() {
		return "Mercaderies\nnumEixos = " + numEixos + ", al�ada = " + al�ada + ", tipusMercaderia = " + tipusMercaderia
				+ ", PBEV = " + PBEV + ", PBOV = " + PBOV + ", PBTV = " + PBTV + ", PBMP = " + PBMP + "\n";
	}
	

}
