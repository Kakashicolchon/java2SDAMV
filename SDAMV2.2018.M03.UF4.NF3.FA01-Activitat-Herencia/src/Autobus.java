
public class Autobus extends Vehicle{
	// Atributs amb el nombre d'eixos i l'alçada.
	int numEixos;
	int alçada;
	
	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 * @param numEixos
	 * @param alçada
	 */
	public Autobus(String marca, String model, String matricula, int nombreOcupants, int slots, float pesTotal,
			int numEixos, int alçada) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		this.numEixos = numEixos;
		this.alçada = alçada;
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
	//Mètodes
	@Override	
	public float calcularPreuBitllet() {
		System.out.println("Autobús: ");
		float resultat = (PBEV * getSlots()) + (PBOV * getNombreOcupants()) + (PBTV * getPesTotal());
		return resultat;
	}
	//ToString
	@Override
	public String toString() {
		return "Autobus\nnumEixos = " + numEixos + ", alçada = " + alçada + ", PBEV = " + PBEV + ", PBOV = " + PBOV + ", PBTV = "
				+ PBTV + ", PBMP = " + PBMP + "\n";
	}
	
	
}
