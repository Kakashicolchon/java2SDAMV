import java.io.Serializable;

public class LlibreRepetitException extends Exception implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
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
