
public class Turisme extends Vehicle{
	// Variable per comprobar si porta remolc o caravana.
	boolean RemCar;

	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 * @param remCar
	 */
	public Turisme(String marca, String model, String matricula, int nombreOcupants, int slots, float pesTotal,
			boolean remCar) {
		super(marca, model, matricula, nombreOcupants, slots, pesTotal);
		RemCar = remCar;
	}
	//Getters Setters
	public boolean isRemCar() {
		return RemCar;
	}

	public void setRemCar(boolean remCar) {
		RemCar = remCar;
	}
	// Mètodes
	@Override
	public float calcularPreuBitllet() {
		System.out.println("Turisme: ");
		float resultat = (PBEV * getSlots()) + (PBOV * getNombreOcupants());
		return resultat;
	}
	
}
