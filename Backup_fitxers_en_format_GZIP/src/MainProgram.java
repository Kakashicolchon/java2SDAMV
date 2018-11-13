import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainProgram extends ComprovarDirectoris{

	public static void main(String[] args) {
		//Demanem el path a l'usuari del directori d'origen

		Scanner s = new Scanner(System.in);
		System.out.print("Proporciona el Path del directori que vols comprimir: ");
		String pathOriginString = s.nextLine();
		
		ComprovarDirectoris cDOrigin = new ComprovarDirectoris();
		cDOrigin.comprobarPathIn(pathOriginString);
		
		System.out.print("Proporciona el Path del directori que vols comprimir: ");
		String pathDestinyString = s.nextLine();
		
		ComprovarDirectoris cDDestiny = new ComprovarDirectoris();
		cDDestiny.comprobarPathOut(pathDestinyString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		boolean i = true;
		while (i) {
			System.out.print("Proporciona el Path del directori que vols comprimir: ");
			String pathOriginString = s.nextLine();
			Path pathOrigin = Paths.get(pathOriginString);
			//System.out.print(pathOrigin);

			if(!Files.exists(pathOrigin)) {
				System.out.println("L’arxiu/directori no existeix.");
			}
			else if(!Files.isReadable(pathOrigin)) {
				System.out.println("No te permisos de lectura a aquest directori.");
			}
			else if (!Files.isDirectory(pathOrigin)) {
				System.out.println("El path proporcionat no acaba en un directori");
			}
			else {
				i = false;
			}
		}
		//Tronem a posar la i a true per poder tornar-la a fer servir(de la mateixa manera)
		i = true;

		//Demanem el path a l'usuari del directori de destí
		*/
		s.close();

	}

}
