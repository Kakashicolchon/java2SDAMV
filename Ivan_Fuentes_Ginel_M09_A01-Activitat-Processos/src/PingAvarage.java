import java.io.IOException;
import java.util.Scanner;
public class PingAvarage {

	public static void main(String[] args) throws IOException, InterruptedException {
		//----------------------------DECLARATION----------------------------------
		
		//Creem una variable pb de tipus ProcessBuilder
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
		boolean n = true;
		
		//Creem les variables encarregades del maneig de la linia que ens torna l'aplicació
		String linia;
		String[] parts;
		Scanner sc = new Scanner(p.getInputStream());
		
		//Creem una variable per emmagatzemar els valors de temps en "ms", una altre per operar
		// i dues més que controlaràn els valors d'encerts i errors que volguem, segons 
		// l'enunciat, 20 encerts per acabar el programa, i 5 que he establert jo.
		int[] temps = new int[20];
		float mitjaTemps = 0;
		int encertsDesitjats = 20;
		int errorsDesitjats = 5;
		float percentatgeError; //acabar porcentaje
		
		//----------------------------------EXECUTION-------------------------------------
		
		//Creem un bucle on farem el tractament als strings.
		while (sc.hasNext() && i) {
			//Inicialitzem la variable linia per tenir la referencia.
			linia = sc.nextLine();
			//En aquest condicional controlem la linea que ens dona el ping per agafar només les linies
			//adequades independentment de l'idioma o el sistema operatiu.
			//El procediment es fa amb un split.
			if (linia.contains("=") && linia.contains("ms") && numeroLiniesOk <= encertsDesitjats ) {
				parts = linia.split(" ");
				String a = parts[4];
				a = a.substring(7,a.length()-2);
				System.out.println(a);
				numeroLiniesOk++;
				temps[numeroLiniesOk-1] = Integer.parseInt(a);
				//Avisem a l'usuari que el procès de ping ha finalitzat.
				if (numeroLiniesOk == encertsDesitjats) {
					i = !i;
					System.out.println("Ping finalitzat.");
				}
			}
			
			//En aquest condicional controlem quan el host existeix pero no retorna en el temps esperat.
			//Aquest control només es fa depent de l'idioma, en aquest cas espanyol, no he sapigut com
			//fer-ho sense dependre de l'idioma.
			else if (linia.startsWith("Tiempo de espera") && numeroLiniesError <= errorsDesitjats) {
				System.out.println("Temps d'espera esgotat per aquesta sol·licitud.");
				numeroLiniesError++;
				//Quan els errors han arribat al número màxim, imprimim per pantalla, i fem que el numero 
				//de linies de error sigui els encerts desitjats per fer el càlcul de la mitjana més senzill.
				//Ja que, en aquest cas, l'error serà del 100% sempre.
				if (numeroLiniesError == errorsDesitjats) {
					i = !i;
					System.out.println("--------------------------------");
					System.out.println("Ping finalitzat, no s'ha aconseguit una connexió estable.");
					numeroLiniesError = encertsDesitjats;
					n = false;
				}
				
			}
			// Com el cas anterior, aquest també depen de l'idioma, es controla quan el host no existeix en
			//el DNS, i directament dona el missatge de la consola de windows traduit al català.
			else if (linia.startsWith("La solicitud de ping")) {
				System.out.println("Hi ha hagut un error, aquesta web no existeix o no tens connexió a internet.");
				numeroLiniesError++;
				i = !i;
				System.out.println("Ping finalitzat.");
			}
			// Si no ens interessa la linea, passa a la següent
			else {
				sc.nextLine();
				
			}
			
		}	
		//Aquí, un cop acabat el while, destruim el procès i tanquem els scanners.
		p.destroy();
		sc.close();
		scURL.close();
		//Aqui calculem la mitja per 2 camins, si ha encertat i hi poden o no haber errors,
		// i si no ha aconseguit una connexió estable.
		if (numeroLiniesOk == encertsDesitjats || n == false) {
			
			if (numeroLiniesOk == 0) {
				mitjaTemps = 0;
			}
			else {
				for (int j = 0; j < temps.length; j++) {
					mitjaTemps = mitjaTemps + temps[j];
					
				}
				//Calculem la mitjana
				mitjaTemps = mitjaTemps/numeroLiniesOk;
			}
			//Calculem el percentatge de error.
			percentatgeError = ((numeroLiniesError * 100)/encertsDesitjats);
			
			//Imprimim per pantalla la informació càlculada anteriorment.
			System.out.println("--------------------------------");
			System.out.println("Mitjana: " + mitjaTemps + "ms.");
			if (mitjaTemps == 0) {
				numeroLiniesError = 5;
			}
			System.out.println("El nombre d'errors ha sigut de : " + numeroLiniesError + ", i representen un " + percentatgeError + "% d'error.");
			System.out.println("--------------------------------");
			System.out.println("Programa Finalitzat.");
		}
		else {
			System.out.println("Programa Finalitzat.");
		}

	}

}
