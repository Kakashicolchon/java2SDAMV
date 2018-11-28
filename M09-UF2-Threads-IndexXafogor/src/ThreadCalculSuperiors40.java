
public class ThreadCalculSuperiors40 implements Runnable {

	DadesCalculXafogor dades;
	int fila;
	public ThreadCalculSuperiors40(DadesCalculXafogor d, int f) {
		dades = d;
		fila = f;
	}

	@Override
	public void run() {
		for (int j = 0; j < DadesCalculXafogor.NUM_MOSTRES; j++) {
			 if (dades.indexsXafogor[fila][j] > 40) {
				 dades.quantsPerEstacio[fila] ++;
			}
			 
		}

	}

}
