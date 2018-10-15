
public class Motocicletes extends Vehicle{

	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 */
	public Motocicletes(String marca, String model, String matricula, int nombreOcupants, int slots,
			float pesTotal) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		// TODO Auto-generated constructor stub
	}
	//Mètodes
	@Override
	public float calcularPreuBitllet() {
		System.out.println("Motocicleta: ");
		return PBEV * getSlots();
	}
	

}
