import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ComprovarDirectoris {

	public ComprovarDirectoris() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void comprobarPathIn (String pathOriginString) {
		boolean i = true;
		Scanner s = new Scanner(System.in);
		while (i) {

			Path pathOrigin = Paths.get(pathOriginString);
			//System.out.print(pathOrigin);

			if(!Files.exists(pathOrigin)) {
				System.out.println("El directori no existeix.");
				System.out.print("Torna a introduïr el path: ");
				pathOriginString = s.nextLine();
			}
			else if (!Files.isDirectory(pathOrigin)) {
				System.out.println("El path proporcionat no acaba en un directori");
				System.out.print("Torna a introduïr el path: ");
				pathOriginString = s.nextLine();
				
			}
			else if(!Files.isReadable(pathOrigin)) {
				System.out.println("No te permisos de lectura a aquest directori.");
				System.out.print("Torna a introduïr el path: ");
				pathOriginString = s.nextLine();
			}
			else {
				i = false;
				//s.close();
			}
		}

		
	}
	
	
	public void comprobarPathOut (String pathDestinyString) {
		boolean i = true;
		Scanner s = new Scanner(System.in);
		
		
		while (i) {

			Path pathDestiny = Paths.get(pathDestinyString);
			//System.out.print(pathOrigin);

			if(!Files.exists(pathDestiny)) {
				System.out.println("El directori no existeix.");
				//Crear directorio
				File folder = new File(pathDestinyString);
				folder.mkdir();
				System.out.println("Creat existosament.");
				
			}
			else if (!Files.isDirectory(pathDestiny)) {
				System.out.println("El path proporcionat no acaba en un directori");
				System.out.print("Torna a introduïr el path: ");
				pathDestinyString = s.nextLine();
				
			}
			else if(!Files.isWritable(pathDestiny)) {
				System.out.println("No te permisos d'escriptura en aquest directori.");
				System.out.print("Torna a introduïr el path: ");
				pathDestinyString = s.nextLine();
			}
			else {
				i = false;
				//s.close();
			}
		}
		
	}

}
