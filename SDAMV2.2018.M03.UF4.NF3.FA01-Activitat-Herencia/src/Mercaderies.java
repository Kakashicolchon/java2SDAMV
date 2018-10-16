
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
	
	
	public Mercaderies(String marca, String model, String matricula, int nombreOcupants, int slots,
			float pesTotal, int numEixos, int alçada, String tipusMercaderia) {
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
	//Mètodes
	@Override
	public float calcularPreuBitllet() {
		System.out.println("Mercaderies: ");
		float resultat = (PBEV * getSlots()) + (PBTV * getPesTotal());
		return resultat;
	}
	//ToString
	@Override
	public String toString() {
		return "Mercaderies\nnumEixos = " + numEixos + ", alçada = " + alçada + ", tipusMercaderia = " + tipusMercaderia
				+ ", PBEV = " + PBEV + ", PBOV = " + PBOV + ", PBTV = " + PBTV + ", PBMP = " + PBMP + "\n";
	}
	

}
