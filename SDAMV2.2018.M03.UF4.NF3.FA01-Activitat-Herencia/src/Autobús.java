
public class Autob�s extends Vehicle{
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
	private Autob�s(String marca, String model, String matricula, String nombreOcupants, String slots, String pesTotal,
			int numEixos, int al�ada) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		this.numEixos = numEixos;
		this.al�ada = al�ada;
	}
	
}
