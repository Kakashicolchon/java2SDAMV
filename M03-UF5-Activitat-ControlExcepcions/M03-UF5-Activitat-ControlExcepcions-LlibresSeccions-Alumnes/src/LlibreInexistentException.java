import java.io.Serializable;

public class LlibreInexistentException extends Exception implements Serializable{

	
	private static final long serialVersionUID = 1L;

	public LlibreInexistentException(String m) {
		super(m);
	}

	
}
