import java.util.Iterator;

public class IncrementaComptador implements Runnable{
	private Comptador comptador;
	public IncrementaComptador(Comptador c) {
		comptador = c;
	}
	public void run() {
		for (long i = 0; i < 1000000; i++) {
			comptador.incrementar();
		}
	}
}
