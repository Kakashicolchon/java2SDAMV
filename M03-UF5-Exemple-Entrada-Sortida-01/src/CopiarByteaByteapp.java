import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarByteaByteapp {

	public static void main(String[] args) {
		FileInputStream in = null;
		File entrada  = new File ("C:/Users/Kakashicolchon/Desktop/putonsio.txt");
		File sortida = new File ("C:/Users/Kakashicolchon/Desktop/putonsio2.txt");
		BufferedInputStream bis; 
		BufferedOutputStream bos;
		FileOutputStream out = null;
		int byte0;
		try {
			in  = new FileInputStream(entrada);
			bis = new BufferedInputStream(in);
			out = new FileOutputStream(sortida);
			bos = new BufferedOutputStream(out);
			//Llegim byte a byte de l'encadenament d'entrada i ho escribim talqual sobre la sortida
			//per tant fem una copia exacte.
			byte0 = bis.read();
			while (byte0 != -1) {
				bos.write(byte0);
				byte0 = bis.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("L'arxiu d'entrada no existeix.");
		} catch (IOException e) {
			System.out.println("Error en la lectura de l'arxiu d'entrada.");
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				System.out.println("Error tancant arxius.");
			}
		}

	}

}
