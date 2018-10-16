
public class Autobus extends Vehicle{
	// Atributs amb el nombre d'eixos i l'al�ada.
	int numEixos;
	int al�ada;
	
	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 * @param numEixos
	 * @param al�ada
	 */
	public Autobus(String marca, String model, String matricula, int nombreOcupants, int slots, float pesTotal,
			int numEixos, int al�ada) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		this.numEixos = numEixos;
		this.al�ada = al�ada;
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
	//M�todes
	@Override	
	public float calcularPreuBitllet() {
		System.out.println("Autob�s: ");
		float resultat = (PBEV * getSlots()) + (PBOV * getNombreOcupants()) + (PBTV * getPesTotal());
		return resultat;
	}
	//ToString
	@Override
	public String toString() {
		return "Autobus\nnumEixos = " + numEixos + ", al�ada = " + al�ada + ", PBEV = " + PBEV + ", PBOV = " + PBOV + ", PBTV = "
				+ PBTV + ", PBMP = " + PBMP + "\n";
	}
	
	
}
