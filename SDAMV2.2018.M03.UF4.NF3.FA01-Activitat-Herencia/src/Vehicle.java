
public class Vehicle {

	//Classe principal d'on ...
	//Atributs
	private String marca;//Atribut que indica la marca del vehicle
	private String model;//Atribut que indica el model del vehicle
	private String matricula;//Atribut que indica la matrícula del vehicle
	private int nombreOcupants;//Atribut que indica el nombre d'ocupants del vehicle
	private int slots;//Atribut que indica la capacitat del vehicle
	private float pesTotal;//Atribut que indica el pes total del vehicle amb la càrrega inclosa si s'escau
	public final float PBEV = 25.0f;//Atribut que indica el preu base per l'espai del vehícle.
	public final float PBOV = 7.0f;
	public final float PBTV = 10.0f;
	public final float PBMP = 35.0f;

	/**
	 * Constructor per defecte amb paràmetres
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 */
	public Vehicle(String marca, String model, String matricula, int nombreOcupants, int slots,
			float pesTotal) {
		super();
		this.marca = marca;
		this.model = model;
		this.matricula = matricula;
		this.nombreOcupants = nombreOcupants;
		this.slots = slots;
		this.pesTotal = pesTotal;
	}
	/**
	 * @param pBEV
	 */
	//Setters Getters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNombreOcupants() {
		return nombreOcupants;
	}
	public void setNombreOcupants(int nombreOcupants) {
		this.nombreOcupants = nombreOcupants;
	}
	public int getSlots() {
		return slots;
	}
	public void setSlots(int slots) {
		this.slots = slots;
	}
	public float getPesTotal() {
		return pesTotal;
	}
	public void setPesTotal(float pesTotal) {
		this.pesTotal = pesTotal;
	}

	// Mètodes.


	public float calcularPreuBitllet() {
		System.out.println("Vehicle: ");
		return PBEV * slots;
	}
	//float a = calcularPreuBitllet(123123, 2);










}
