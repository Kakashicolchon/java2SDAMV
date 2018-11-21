public class ThreadCalculXafogor implements Runnable {

	DadesCalculXafogor dades;
	int fila;


	public ThreadCalculXafogor(DadesCalculXafogor d, int f) {
		dades = d;
		fila = f;
	}

	public Double calcularIndexXafogor(Double t, Double h) {
		Double ix;
		ix = (t + (5.0/9.0) * ( 6.122 *( h/100 )* Math.pow(10, ( (7.5 * t)/(237.7 + t) ) ) - 10));		
		return ix ;

	}

	@Override
	public void run() {
		dades = new DadesCalculXafogor();

		for (int j = 0; j < dades.humitats.length; j++) {
			calcularIndexXafogor(dades.temperatures[fila][j], dades.humitats[fila][j]);
		}



		//bucle de 500.000 voltees
		//dades.indexsXafogor[fila][xx] = calcularIndexXafogor(dades.temperatures[xx][xx], dades.humitats[xx][xx])


	}

}
