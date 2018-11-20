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
	/**
	 * Constructor sense paràmetres
	 */
	public GZipCompression() {
		super();

	}
	/**
	 * Mètode que s'encarrega de comprobar que el path donat d'origen existeix, és un directori i té permissos de lectura
	 * @param pathOriginString és un paràmetre de tipus String que conté el path del directori d'origen.
	 * @return Retorna el path (amb les correccions adients si s'ha donat el cas).
	 */
	public String comprobarPathIn (String pathOriginString) {
		boolean i = true;
		boolean a = true;
		Scanner s = new Scanner(System.in);
		Path pathOrigin = null;
		//Bucle on comprobem el path i tornem a preguntar en cas de que no estigui bé
		while (i) {
			pathOrigin = Paths.get(pathOriginString);
			//Comprobem si existeix
			if(!Files.exists(pathOrigin)) {
				System.out.println("El directori no existeix.");
				System.out.print("Torna a introduïr el path: ");
				pathOriginString = s.nextLine();

			}
			//Comprobem si és un directori
			else if (!Files.isDirectory(pathOrigin)) {
				System.out.println("El path proporcionat no acaba en un directori");
				System.out.print("Torna a introduïr el path: ");
				pathOriginString = s.nextLine();

			}
			//Comprobem si tenim permissos d'escriptura
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

	/**
	 * Mètode que s'encarrega de comprobar que el path donat de destí existeix, és un directori i té permissos d'escriptura.
	 * En cas de que no existeixi el crea, en els altres 2 casos torna a preguntar el path a l'usuari
	 * @param pathDestinyString és un paràmetre de tipus String que conté el path del directori de destí.
	 * @return Retorna el path (amb les correccions adients si s'ha donat el cas).
	 */
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
	/**
	 * Mètode que s'encarrega de recorre recursivament el path d'origen i diferenciar entre directoris i altres tipus de fitxer per 
	 * comprimir-los com diu l'enunciat i crear un arxiu de text que guardi el nom dels directoris que va trobant.
	 * @param pathOriginString és un paràmetre de tipus String que conté el path del directori d'origen.
	 * @param pathDestinyString és un paràmetre de tipus String que conté el path del directori de destí.
	 */
	public void Compression (String pathOriginString , String pathDestinyString) {
		//Creem txt per poder guardar el nom dels directoris 

		//Abrir carpeta 
		try {
			Files.walk(Paths.get(pathOriginString)).forEach(ruta-> {
				if (Files.isRegularFile(ruta)) {
					//System.out.println(ruta);
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
						//close
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
					//Crida al mètode escriureFitxers.
					escriureFitxers(pathDestiny, pathOrigin, ruta);
				}
			});
		} catch (IOException e1) {
			System.out.println("Error inesperat.");
		}


	}
	/**
	 * Mètode que s'encarrega de crear un fitxer .txt on guardarem el nom dels diferents directoris que ens anem trobant.
	 * @param rutaDestiny és un paràmetre de tipus Path que conté el path del directori de destí.
	 * @param rutaOrigin és un paràmetre de tipus Path que conté el path del directori d'origen.
	 * @param ruta és un paràmetre de tipus Path que poseeix la mateixa direcció que rutaOrigen pero amb el directori X seleccionat
	 */
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
