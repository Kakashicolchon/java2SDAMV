
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

}
