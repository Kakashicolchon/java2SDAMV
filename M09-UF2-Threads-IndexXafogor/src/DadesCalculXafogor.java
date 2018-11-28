import java.util.Random;

/**
 * Classe que implementa les estructures de dades necessàries per tal de poder realitzar
 * el càlcul de l'índex de xafogor de diverses estacions meteorològiques, prenent un cert
 * nombre de mostres de temperatura i humitat relativa.
 * 
 * @author Jordi Gual i Purtí
 *
 */
public class DadesCalculXafogor {
	
	public static final int NUM_MOSTRES = 525960;
	public static final int NUM_ESTACIONS = 10;
	
	public double[][] temperatures;
	public double[][] humitats;
	public double[][] indexsXafogor;
	public int[] quantsPerEstacio;
	public int[] quantsPerMinut;

	/**
	 * Constructor de la classe que inicialitza les matrius de dades amb valors a l'atzar i
	 * prepara les taules on cal guardar els resultats dels càlculs.
	 */
	public DadesCalculXafogor() {
		
		// Inicialitzem les taules necessaries per als càlculs.
		temperatures = new double[NUM_ESTACIONS][NUM_MOSTRES];
		humitats = new double[NUM_ESTACIONS][NUM_MOSTRES];
		indexsXafogor = new double[NUM_ESTACIONS][NUM_MOSTRES];
		quantsPerEstacio = new int[NUM_ESTACIONS];
		quantsPerMinut = new int[NUM_MOSTRES];
		
		// Carreguem valors d'exemple (triats a l'atzar) a la taula de temperatures i humitats.
		System.out.println("Inicialitzant temperatures...");
		inicialitzaTemperatures();
		System.out.println("Temperatures inicialitzades.");
		
		System.out.println("Inicialitzant humitats...");
		inicialitzaHumitats();
		System.out.println("Humitats inicialitzades.");
		
		// Inicialitzem a 0 les taules quantsPerEstacio i quantsPerMinut.
		System.out.println("Inicialitzant taules de comptadors de xafogors superiors a 40 graus...");
		inicialitzaQuants();
		System.out.println("Taules de comptadors inicialitzades.");
	}
	
	/**
	 * Mètode que inicalitza la taula de temperatures, donant valors compresos entre els
	 * -20 graus centígrads i els +40 graus.
	 */
	private void inicialitzaTemperatures() {
		Random r = new Random(System.currentTimeMillis());
		
		for(int f=0; f < temperatures.length; f++) {
			for(int c=0; c < temperatures[0].length; c++) {
				temperatures[f][c] = -20.0 + ((double)r.nextInt(600))/10.0;
			}
		}
	}
	
	/**
	 * Mètode que inicialitza la taula d'humitats relatives, donant valors compresos entre
	 * 0 i 100 (ja que es tracta d'un percentatge).
	 */
	public void inicialitzaHumitats() {
		Random r = new Random(System.currentTimeMillis());
		
		for(int f=0; f < humitats.length; f++) {
			for(int c=0; c < humitats[0].length; c++) {
				humitats[f][c] = ((double)r.nextInt(1000))/10.0;
			}
		}
	}
	
	/** Mètode que inicialitza a 0 les dues taules on caldrà comptabilitzar el nombre de valors
	 *  calculats d'índexs de xafogor superiors a 40 graus.
	 */
	public void inicialitzaQuants() {
		
		for(int i=0; i < quantsPerEstacio.length; i++) {
			quantsPerEstacio[i] = 0;
		}
		
		for(int i=0; i < quantsPerMinut.length; i++) {
			quantsPerMinut[i] = 0;
		}
	}
}
