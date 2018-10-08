
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
	 * @param alçada
	 * @param tipusMercaderia
	 * @param nivellPerillositat
	 */
	public MercaderiesPerilloses(String marca, String model, String matricula, String nombreOcupants, String slots,
			String pesTotal, int numEixos, int alçada, String tipusMercaderia, int nivellPerillositat) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal, numEixos, alçada, tipusMercaderia);
		this.nivellPerillositat = nivellPerillositat;
	}


}
