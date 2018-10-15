
public class MercaderiesPerilloses extends Mercaderies{
	// Variable de nivell de perillositat (del 1 al 5).
	int nivellPerillositat;

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
	 * @param nivellPerillositat
	 */
	public MercaderiesPerilloses(String marca, String model, String matricula, int nombreOcupants, int slots,
			float pesTotal, int numEixos, int al�ada, String tipusMercaderia, int nivellPerillositat) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal, numEixos, al�ada, tipusMercaderia);
		this.nivellPerillositat = nivellPerillositat;
	}
	//Getters Setters
	public int getNivellPerillositat() {
		return nivellPerillositat;
	}

	public void setNivellPerillositat(int nivellPerillositat) {
		this.nivellPerillositat = nivellPerillositat;
	}
	//M�todes
	@Override
	public float calcularPreuBitllet() {
		System.out.println("Mercaderies Perilloses: ");
		float resultat = (PBEV * getSlots()) + (PBTV * getPesTotal()) + (PBMP * getNivellPerillositat());
		return resultat;
	}


}
