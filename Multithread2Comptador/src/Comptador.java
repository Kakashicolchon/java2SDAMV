
public class Comptador {
	private long valor;
	public Comptador() {
		valor = 0;
	}
	//Syncronized impide que cualquier otro thread pueda acceder a cualquier otro mètodo syncronized
	
	public synchronized void incrementar() {
		
		valor = valor + 1;
		
	}
	
	public synchronized long getValor() {
		return valor;
	}

}
