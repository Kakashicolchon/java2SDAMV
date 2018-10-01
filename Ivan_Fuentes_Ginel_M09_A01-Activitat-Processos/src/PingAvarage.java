import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class PingAvarage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// ProcessBuilder per procès ping windows mitjana
		
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
		
		String linia;
		int numeroLiniesError = 0;
		int numeroLiniesOk = 0;
		boolean i = true;
		String[] parts;
		Scanner sc = new Scanner(p.getInputStream());
		//Evitem la primera línea
		//sc.nextLine();
		
		while (sc.hasNext() && i) {
			
			linia = sc.nextLine();
			if (linia.contains("=") && linia.contains("ms") && numeroLiniesOk <= 20 ) {
				parts = linia.split(" ");
				String a = parts[4];
				a = a.substring(7,a.length()-2);
				System.out.println(a);
				numeroLiniesOk++;
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
					System.out.println("Ping finalitzat.");
				}
			}
			else if (linia.startsWith("La solicitud de ping")) {
				System.out.println("Hi ha hagut un error, aquesta web no existeix.");
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

	}

}
