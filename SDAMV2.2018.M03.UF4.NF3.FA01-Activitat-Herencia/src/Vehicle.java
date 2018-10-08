
public class Vehicle {
	/**
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 */
	private Vehicle(String marca, String model, String matricula, String nombreOcupants, String slots,
			String pesTotal) {
		super();
		this.marca = marca;
		this.model = model;
		this.matricula = matricula;
		this.nombreOcupants = nombreOcupants;
		this.slots = slots;
		this.pesTotal = pesTotal;
	}
	
	//Classe principal d'on ...
	private String marca;//Atribut que indica la marca del vehicle
    private String model;//Atribut que indica el model del vehicle
    private String matricula;//Atribut que indica la matrícula del vehicle
    private String nombreOcupants;//Atribut que indica el nombre d'ocupants del vehicle
    private String slots;//Atribut que indica la capacitat del vehicle
    private String pesTotal;//Atribut que indica el pes total del vehicle amb la càrrega inclosa si s'escau
    
	// que tal
	

}
