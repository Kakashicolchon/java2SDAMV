
public class Autobús extends Vehicle{
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
	private Autobús(String marca, String model, String matricula, String nombreOcupants, String slots, String pesTotal,
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
	
}
