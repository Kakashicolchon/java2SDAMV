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
		
		
		System.out.print("Proporciona el Path on es guardarà el GZIP: ");
		String pathDestinyString = s.nextLine();
		
		
		ComprovarDirectoris cDDestiny = new ComprovarDirectoris();
		cDDestiny.comprobarPathOut(pathDestinyString);
		
		s.close();

	}

}
