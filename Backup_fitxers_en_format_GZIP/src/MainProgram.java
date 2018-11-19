import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainProgram extends GZipCompression{

	public static void main(String[] args) {
		//Demanem el path a l'usuari del directori d'origen i creem un objecte de tipus GZipCompression,
		//on tenim els mètodes
		GZipCompression GZip = new GZipCompression();
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Proporciona el Path del directori que vols comprimir: ");
		String pathOriginString = s.nextLine();
		
		//Assignem el path comprovant-lo
		pathOriginString = GZip.comprobarPathIn(pathOriginString);
		//TODO esto con el Output
		
		System.out.print("Proporciona el Path on es guardarà el GZIP: ");
		String pathDestinyString = s.nextLine();
		
		//Assignem el path comprovant-lo
		pathDestinyString = GZip.comprobarPathOut(pathDestinyString);
		//Tanquem l'Scanner
		s.close();
		
		GZip.Compression(pathOriginString, pathDestinyString);

	}

}
