
public class LlibreRepetitException extends Exception {
	
	private Llibre llibreErroni;
	public LlibreRepetitException(String m) {
		super(m);
	}
	public Llibre getLlibreErroni() {
		return llibreErroni;
	}
	public void setLlibreErroni(Llibre llibre) {
		this.llibreErroni = llibre;
	}

}
