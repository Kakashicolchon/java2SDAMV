/**
 * Classe que permet representar el concepte de llibre.
 * 
 * @author Jordi Gual i Purt�
 *
 */
public class Llibre {
	private String titol;
	private String isbn;
	private String autor;
	private String editorial;
	private int numPagines;
	private int anyEdicio;

	/**
	 * Constructor que permet crear objectes de tipus Llibre donant un valor inicial a tots els seus atributs.
	 * @param t Valor inicial per a l'atribut titol.
	 * @param i Valor inicial per a l'atribut isbn.
	 * @param a Valor inicial per a l'atribut autor.
	 * @param e Valor inicial per a l'atribut editorial.
	 * @param np Valor inicial per a l'atribut numPagines.
	 * @param ae Valor inicial per a l'atribut anyEdicio.
	 * @throws IllegalArgumentException En cas que algun dels valors inicials dels atributs no compleixi els requisits
	 * establerts en cadascun dels setter corresponents.
	 */
	public Llibre(String t, String i, String a, String e, int np, int ae) {
		try {
			setTitol(t);
			setIsbn(i);
			setAutor(a);
			setEditorial(e);
			setNumPagines(np);
			setAnyEdicio(ae);
		} catch (IllegalArgumentException e1) {
			System.out.println("--> Algun dels valors inicials no compleix els requisits.");
			
		}
	}


	/**
	 * Getter de l'atribut titol.
	 * @return Valor actual de l'atribut titol.
	 */
	public String getTitol() {
		return titol;
	}


	/**
	 * Setter de l'atribut titol.
	 * @param t Nou valor per a l'atribut titol.
	 * @throws IllegalArgumentException En cas que el valor que donem valgui null o cadena buida.
	 */
	public void setTitol(String t) {
		if (t.equals(null) || t.equals("")) {

			throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
		}
		else {
			this.titol = t;
		}

	}


	/**
	 * Getter de l'atribut isbn.
	 * @return Valor actual de l'atribut isbn.
	 */
	public String getIsbn() {
		return isbn;
	}


	/**
	 * Setter de l'atribut isbn.
	 * @param i Nou valor per a l'atribut isbn.
	 * @throws IllegalArgumentException En cas que el valor que donem valgui null o cadena buida.
	 */
	public void setIsbn(String i) {

		if (i.equals(null) || i.equals("")) {

			throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
		}
		else {
			this.isbn = i;
		}
	}


	/**
	 * Getter de l'atribut autor.
	 * @return Valor actual de l'atribut autor.
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * Setter de l'atribut autor.
	 * @param a Nou valor per a l'atribut autor.
	 * @throws IllegalArgumentException En cas que el valor que donem valgui null o cadena buida.
	 */
	public void setAutor(String a) {
		
		if (a.equals(null) || a.equals("")) {

			throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
		}
		else {
			this.autor = a;
		}
	}


	/**
	 * Getter de l'atribut editorial.
	 * @return Valor actual de l'atribut editorial.
	 */
	public String getEditorial() {
		return editorial;
	}


	/**
	 * Setter de l'atribut editorial.
	 * @param e Nou valor per a l'atribut editorial.
	 * @throws IllegalArgumentException En cas que el valor que donem valgui null o cadena buida.
	 */
	public void setEditorial(String e) {
		
		if (e.equals(null) || e.equals("")) {

			throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
		}
		else {
			this.editorial = e;
		}
	}


	/**
	 * Getter de l'atribut numPagines.
	 * @return Valor actual de l'atribut numPagines.
	 */
	public int getNumPagines() {
		return numPagines;
	}


	/**
	 * Setter de l'atribut numPagines
	 * @param n Nou valor per a l'atribut numPagines.
	 * @throws IllegalArgumentException En cas que el valor sigui menor que 1.
	 */
	public void setNumPagines(int n) {
		
		if (n < 1) {

			throw new IllegalArgumentException("--> El valor no pot ser menor que 1.");
		}
		else {
			this.numPagines = n;
		}
	}


	/**
	 * Getter de l'atribut anyEdicio.
	 * @return Valor actual de l'atribut anyEdicio.
	 */
	public int getAnyEdicio() {
		return anyEdicio;
	}


	/**
	 * Setter de l'atribut anyEdicio.
	 * @param a Nou valor per a l'atribut anyEdicio.
	 * @throws IllegalArgumentException En cas que el valor sigui menor que -3300 (segons la viquip�dia,
	 * l'escriptura va n�ixer pels volts del 3300 aC).
	 */
	public void setAnyEdicio(int a) {
		
		if (a < (-3300)) {

			throw new IllegalArgumentException("--> El valor no pot ser menor a -33000.");
		}
		else {
			this.anyEdicio = a;
		}
	}
}
