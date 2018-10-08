
public class Vehicle {
	/**
	 * Constructor per defecte amb paràmetres
	 * @param marca
	 * @param model
	 * @param matricula
	 * @param nombreOcupants
	 * @param slots
	 * @param pesTotal
	 */
	public Vehicle(String marca, String model, String matricula, String nombreOcupants, String slots,
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
	//Atributs
	private String marca;//Atribut que indica la marca del vehicle
    private String model;//Atribut que indica el model del vehicle
    private String matricula;//Atribut que indica la matrícula del vehicle
    private String nombreOcupants;//Atribut que indica el nombre d'ocupants del vehicle
    private String slots;//Atribut que indica la capacitat del vehicle
    private String pesTotal;//Atribut que indica el pes total del vehicle amb la càrrega inclosa si s'escau
	
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
	public String getNombreOcupants() {
		return nombreOcupants;
	}
	public void setNombreOcupants(String nombreOcupants) {
		this.nombreOcupants = nombreOcupants;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	public String getPesTotal() {
		return pesTotal;
	}
	public void setPesTotal(String pesTotal) {
		this.pesTotal = pesTotal;
	}
    
	// que tal
	

}
