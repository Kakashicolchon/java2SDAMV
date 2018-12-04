
public class ThreadCalculSuperiors40 implements Runnable {
	//Declarem un objecte de tipus DadesCalculXafogor de nom dades, i un altre que controli la fila a la que estem, de tipus int
	DadesCalculXafogor dades;
	int fila;
	//Constructor de ThreadCalculSuperiors40
	public ThreadCalculSuperiors40(DadesCalculXafogor d, int f) {
		dades = d;
		fila = f;
	}
	
	//Mètode run que per cada columna va sumant 1 a una taula que guarda els cops per minut que cada estació
	//ha detectat l'índex de xafogor per sobre de 40 i una altre que guarda quants cops per estació a cada minut
	//ha registrat un index de xafogor superior de 40.
	@Override
	public void run() {
		for (int j = 0; j < DadesCalculXafogor.NUM_MOSTRES; j++) {
			 if (dades.indexsXafogor[fila][j] > 40) {
				 dades.quantsPerEstacio[fila] ++;
				 incrementarQuantsPerMinut(j);
				 
			}
			 
		}

	}
	// Mètode que serveix per sincronitzar els threads.
	public void incrementarQuantsPerMinut (int j) {
		synchronized (this) {
			dades.quantsPerMinut[j]++;
		}
	}

}
