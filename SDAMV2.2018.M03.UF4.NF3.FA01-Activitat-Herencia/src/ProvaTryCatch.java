import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaTryCatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int edat;
		boolean error = true;
		while (error) {
			try {
				//Preguntem l'edat a l'usuari.
				System.out.print("Introdueix la teva edat: ");
				edat = s.nextInt();
				//Controlem que l'enter sigui positiu:
				if (edat >= 0) {
					//Missatge final
					System.out.println("Molt bé, tens " + edat + " anys.");
					error = false;
					
				}
				else {
					System.out.println("L'edat ha de ser un valor positiu.");
				}

			}
			catch (InputMismatchException ime) {
				System.out.println("T'has equivocat. L'edat ha de ser un nombre enter.");
				s.nextLine();
			}
		}

		s.close();


	}

}
