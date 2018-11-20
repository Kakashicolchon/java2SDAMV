import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.GZIPOutputStream;

public class GZipCompression {
	
	public GZipCompression() {
		super();

	}

	public String comprobarPathIn (String pathOriginString) {
		boolean i = true;
		boolean a = true;
		Scanner s = new Scanner(System.in);
		Path pathOrigin = null;

		while (i) {
			pathOrigin = Paths.get(pathOriginString);

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
			}
		}
		return pathOriginString;


	}


	public String comprobarPathOut (String pathDestinyString) {
		boolean i = true;
		Scanner s = new Scanner(System.in);


		while (i) {

			Path pathDestiny = Paths.get(pathDestinyString);
			//System.out.print(pathOrigin);

			if(!Files.exists(pathDestiny)) {
				//TODO Quieres crear una carpeta o prefieres volver a introducir path?
				System.out.println("El directori no existeix.");
				//Crear directorio
				File folder = new File(pathDestinyString);
				folder.mkdir();
				//pathDestiny = Paths.get(pathDestinyString);
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

			}
		}
		return pathDestinyString;

	}

	public void Compression (String pathOriginString , String pathDestinyString) {
		//Creem txt per poder guardar el nom dels directoris 

		//Abrir carpeta 
		try {
			Files.walk(Paths.get(pathOriginString)).forEach(ruta-> {
				if (Files.isRegularFile(ruta)) {

					System.out.println(ruta);

					String rutaString = ruta.toString();


					try {
						FileInputStream fis = new FileInputStream(rutaString);
						//path de destino archivo 
						FileOutputStream fos = new FileOutputStream(pathDestinyString + "/" + ruta.getFileName() + ".gz");
						GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
						byte[] buffer = new byte[1024];
						int len;
						while((len=fis.read(buffer)) != -1){
							gzipOS.write(buffer, 0, len);
						}
						//close resources
						gzipOS.close();
						fos.close();
						fis.close();
					} catch (IOException e) {
						System.out.println("Error inesperat.");
					}

				}
				else if (Files.isDirectory(ruta)) {
					Path pathDestiny = Paths.get(pathDestinyString);
					Path pathOrigin = Paths.get(pathOriginString);
					escriureFitxers(pathDestiny, pathOrigin, ruta);
				}
			});
		} catch (IOException e1) {
			System.out.println("Error inesperat.");
		}


	}
	public void escriureFitxers(Path rutaDestiny, Path rutaOrigin, Path ruta) {
		String rutaDirectoris = rutaDestiny + "/directoris.txt";
		File archivo = new File(rutaDirectoris);
		BufferedWriter bw = null;

		if(archivo.exists()) {
			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(ruta.getFileName().toString());
			} catch (IOException e) {
				System.out.println("Error inesperat.");
			}

		} else {
			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write(ruta.getFileName().toString());
			} catch (IOException e) {
				System.out.println("Error inesperat.");
			}

		}
		try {
			bw.close();
		} catch (IOException e) {
			System.out.println("Error inesperat.");
		}

	}



}
