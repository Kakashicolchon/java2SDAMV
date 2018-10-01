import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class PingAvarage {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//creem una variable pb de tipus ProcessBuilder
		ProcessBuilder pb;
		//Fem un procès amb nom pb
		Process p;
		
		//Declarem una variable per que que l'usuari introdueixi la url
		String url = null;
		//Creem un Scanner per l'usuari
		Scanner scURL = new Scanner(System.in);
		System.out.print("Introdueïx una URL: ");
		url = scURL.nextLine();
		
		//Fem que el procès obri la consola i executi la comanda ping i l'iniciem.
		pb = new ProcessBuilder("cmd", "/C", "ping -t " + url);
		p = pb.start();
		
		//Creem i inicialitzem les variables comptador i la variable encarregada de fer sortir del bucle
		int numeroLiniesError = 0;
		int numeroLiniesOk = 0;
		boolean i = true;
		
		//Creem les variables encarregades del maneig de la linia que ens torna l'aplicació
		String linia;
		String[] parts;
		Scanner sc = new Scanner(p.getInputStream());
		
		//Creem una variable per emmagatzemar els valors de temps en "ms" i una altre per operar
		int[] temps = new int[20];
		float mitjaTemps = 0;
		
		//Creem un bucle on farem el tractament als strings.
		while (sc.hasNext() && i) {
			//Inicialitzem la variable linia per tenir la referencia.
			linia = sc.nextLine();
			if (linia.contains("=") && linia.contains("ms") && numeroLiniesOk <= 20 ) {
				parts = linia.split(" ");
				String a = parts[4];
				a = a.substring(7,a.length()-2);
				System.out.println(a);
				numeroLiniesOk++;
				temps[numeroLiniesOk] = Integer.parseInt(a);//Comprobar si el cambio se hace bien
				if (numeroLiniesOk == 20) {
					i = !i;
					System.out.println("Ping finalitzat.");
				}
			}
			
			else if (linia.startsWith("Tiempo de espera") && numeroLiniesError <= 5) {
				System.out.println(linia);
				numeroLiniesError++;
				if (numeroLiniesError == 5) {
					i = !i;
					System.out.println("Ping finalitzat, no s'ha aconseguit una connexió estable.");
				}
			}
			else if (linia.startsWith("La solicitud de ping")) {
				System.out.println("Hi ha hagut un error, aquesta web no existeix o no tens connexió a internet.");
				numeroLiniesError++;
				i = !i;
				System.out.println("Ping finalitzat.");
			}
			
			else {
				sc.nextLine();
				
			}
			
		}	
		
		//controlar cuantas haré si no hay conexión
		//p.waitFor();
		p.destroy();
		sc.close();
		if (numeroLiniesOk == 20) {
			//Fer mitja
			for (int j = 0; j < temps.length; j++) {
				mitjaTemps = mitjaTemps + temps[j];
			}
			mitjaTemps = mitjaTemps/2;
			System.out.println("La mitjana del temps són: " + mitjaTemps + "ms.");
			System.out.println("Programa Finalitzat.");
		}
		else {
			System.out.println("Programa Finalitzat.");
		}

	}

}
