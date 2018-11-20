import java.util.Scanner;

public class MainProgram extends GZipCompression{

	public static void main(String[] args) {
		
		//Creem un objecte de tipus GZipCompression que es on guardem totes les classes d'aquesta activitat i un Scanner
		GZipCompression GZip = new GZipCompression();
		Scanner s = new Scanner(System.in);
		
		//Demanem el path a l'usuari del directori d'origen.
		System.out.print("Proporciona el Path del directori que vols comprimir: ");
		String pathOriginString = s.nextLine();
		
		//Assignem el path i el comprovem amb el m�tode comprobarPathIn
		pathOriginString = GZip.comprobarPathIn(pathOriginString);

		//Demanem el path a l'usuari del directori de dest�
		System.out.print("Proporciona el Path on es guardar� el GZIP: ");
		String pathDestinyString = s.nextLine();
		
		//Assignem el path i el comprovem amb el m�tode comprobarPathOut
		pathDestinyString = GZip.comprobarPathOut(pathDestinyString);
		//Tanquem l'Scanner
		s.close();
		//Finalment fem el proc�s de compressi� amb el m�tode Compression.
		GZip.Compression(pathOriginString, pathDestinyString);

	}

}
