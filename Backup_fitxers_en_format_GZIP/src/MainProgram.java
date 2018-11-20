import java.util.Scanner;

public class MainProgram extends GZipCompression{

	public static void main(String[] args) {
		
		//Creem un objecte de tipus GZipCompression que es on guardem totes les classes d'aquesta activitat i un Scanner
		GZipCompression GZip = new GZipCompression();
		Scanner s = new Scanner(System.in);
		
		//Demanem el path a l'usuari del directori d'origen.
		System.out.print("Proporciona el Path del directori que vols comprimir: ");
		String pathOriginString = s.nextLine();
		
		//Assignem el path i el comprovem amb el mètode comprobarPathIn
		pathOriginString = GZip.comprobarPathIn(pathOriginString);

		//Demanem el path a l'usuari del directori de destí
		System.out.print("Proporciona el Path on es guardarà el GZIP: ");
		String pathDestinyString = s.nextLine();
		
		//Assignem el path i el comprovem amb el mètode comprobarPathOut
		pathDestinyString = GZip.comprobarPathOut(pathDestinyString);
		//Tanquem l'Scanner
		s.close();
		//Finalment fem el procés de compressió amb el mètode Compression.
		GZip.Compression(pathOriginString, pathDestinyString);

	}

}
