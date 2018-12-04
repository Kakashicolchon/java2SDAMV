public class ThreadCalculXafogor implements Runnable {
	// Declarem un objecte de tipus de ThreadCalculXafogor i  la fila.
	DadesCalculXafogor dades;
	int fila;

	// Constructor.
	public ThreadCalculXafogor(DadesCalculXafogor d, int f) {
		dades = d;
		fila = f;
	}
	// Mètode que calcula i retorna l'índex de xafogor.
	public Double calcularIndexXafogor(Double t, Double h) {
		Double ix;
		ix = (t + (5.0/9.0) * ( 6.122 *( h/100 )* Math.pow(10, ( (7.5 * t)/(237.7 + t) ) ) - 10));		
		return ix ;

	}
	// Mètode run que per cada columna executa el metode calcularIndexXafogor i el guarda a la taula indexsXafogor.
	@Override
	public void run() {

		for (int j = 0; j < DadesCalculXafogor.NUM_MOSTRES; j++) {
			dades.indexsXafogor[fila][j]=calcularIndexXafogor(dades.temperatures[fila][j], dades.humitats[fila][j]);

		}
	}

}
