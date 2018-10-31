import java.util.Vector;

/**
 * Classe que permet representar el concepte de secci� tem�tica d'una biblioteca.
 * 
 * @author Jordi Gual i Purt�
 *
 */
public class Seccio {
	private String nom;
	private String codiCDU;
	private Vector<Llibre> llibres;

	/**
	 * Constructor que permet crear objectes de tipus Seccio amb un valor inicial per a tots els seus atributs
	 * @param n Valor inicial per a l'atribut nom.
	 * @param c Valor inicial per a l'atribut codiCDU.
	 * @throws IllegalArgumentException En cas que algun dels valors inicials dels atributs no compleixi els requisits
	 * establerts en cadascun dels setter corresponents.
	 */
	public Seccio(String n, String c) {
		try {
			setNom(n);
			setCodiCDU(c);
			llibres = new Vector<Llibre>();
		} catch (IllegalArgumentException e) {
			System.out.println("--> Algun dels valors inicials no compleix els requisits.");


		}

	}

	/**
	 * Getter de l'atribut nom.
	 * @return Valor actual de l'atribut nom.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter de l'atribut nom.
	 * @param n Nou valor per a l'atribut nom.
	 * @throws IllegalArgumentException En cas que el valor que li passem sigui null o cadena buida.
	 */
	public void setNom(String n) {

		if (n.equals(null) || n.equals("")) {

			throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
		}
		else {
			nom = n;
		}
	}

	/**
	 * Getter de l'atribut codiCDU
	 * @return the codiCDU Valor actual de l'atribut codiCDU.
	 */
	public String getCodiCDU() {
		return codiCDU;
	}

	/**
	 * Setter de l'atribut codi CDU.
	 * @param c Nou valor per a l'atribut codiCDU.
	 * @throws IllegalArgumentException En cas que el valor que li passem sigui null o cadena buida.
	 */
	public void setCodiCDU(String c) {

		if (c.equals(null) || c.equals("")) {

			throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
		}
		else {
			codiCDU = c;
		}
	}

	/**
	 * M�tode que permet afegir un nou llibre a una secci�.
	 * @param l Refer�ncia a l'objecte llibre que volem afegir a la secci�.
	 * @throws LlibreRepetitException En cas que ja existeixi un llibre donat d'alta a la secci� amb
	 * el mateix ISBN que el nou llibre que volem afegir.
	 * @throws IllegalArgumentException En cas que passem una refer�ncia que valgui null.
	 */
	public void addLlibre (Llibre l){

		try {

			if (posicioLlibre(l.getIsbn()) == -1) {

				llibres.add(l);
			}

			else if (l.equals(null)) {

				throw new IllegalArgumentException("--> El valor no pot ser nul");
			}
			else {
				//Si no �s el mateix(ha analitzat tots els ISBNs que hi ha dins el vector), llavors:
				throw new LlibreRepetitException("--> Llibre repetit");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("--> Arguments no v�lids.");
			System.out.println("");
		} catch (LlibreRepetitException e) {
			System.out.println("--> El llibre que ha intentat afegir ja existeix. ISBN duplicat: " + l.getIsbn() + ".");
			System.out.println("");
		}

	}


	/**
	 * M�tode que permet eliminar un llibre d'una secci� donant-ne el ISBN
	 * @param i ISBN del llibre que volem eliminar de la secci�.
	 * @throws LlibreInexistentException En cas que l'ISBN donat no correspongui a cap dels llibres de la secci�.
	 * @throws IllegalArgumentException En cas que passem un valor null o cadena buida com a ISBN del llibre a eliminar.
	 */
	public void removeLlibre(String i) {
		try {
			int pos;
			pos = posicioLlibre(i);

			if (pos == -1) {
				throw new LlibreInexistentException("--> El llibre que intentes eliminar no existeix");
			}

			else if (i.equals(null) || i.equals("")) {

				throw new IllegalArgumentException("--> El valor no pot ser nul o cadena buida");
			}
			else {
				//Si no �s el mateix(ha analitzat tots els ISBNs que hi ha dins el vector), llavors:
				llibres.remove(pos);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("--> Arguments no v�lids.");
			System.out.println("");
		} catch (LlibreInexistentException e) {
			System.out.println("--> El llibre que ha intentat eliminar no existeix. No es troba l'ISBN: " + i + ".");
			System.out.println("");
		}
	}


	/**
	 * M�tode que ens comprova si a la secci� hi tenim un llibre amb un ISBN determinat i,
	 * en cas afirmatiu, ens diu en quina posici� del vector de llibres es troba.
	 * @param i ISBN del llibre que volem comprovar si existeix.
	 * @return Posici� on es troba el llibre dins del vector (si existeix), o -1 en cas que
	 * no existeixi cap llibre amb l'ISBN donat dins la secci�.
	 */
	private int posicioLlibre(String i) {
		boolean trobat = false;
		int pos = 0;
		int resultat =  -1;

		// Recorrem el vector de llibres comprovant per cadascun d'ells si el seu ISBN �s
		// igual que el que ens donen. En cas afirmatiu, posarem la variable trobat a true
		// i pararem el bucle.
		while (pos < llibres.size() && !trobat) {
			trobat = llibres.get(pos).getIsbn().equals(i);
			pos++;
		}

		// Si hav�em trobat un llibre amb l'ISBN donat, retornarem la posici� on l'hem trobat.
		// En cas contrari, es retornar� -1 ja que no modificarem el valor inicial de la
		// variable resultat.
		if (trobat) {
			resultat = pos - 1;
		}

		return resultat;
	}

	/**
	 * M�tode que mostra per consola les dades de tots els llibres d'una secci�.
	 */
	public void printLlibres() {

		if (llibres.size() > 0) {
			System.out.printf("%-40s%-15s%-30s%-15s%10s%10s%n", "T�tol", "ISBN", "Autor", "Editorial", "P�gines", "Any Ed.");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------");
			for (int pos = 0; pos < llibres.size(); pos++) {
				System.out.printf("%-40s%-15s%-30s%-15s%10d%10d%n", 
						llibres.get(pos).getTitol(),
						llibres.get(pos).getIsbn(),
						llibres.get(pos).getAutor(),
						llibres.get(pos).getEditorial(),
						llibres.get(pos).getNumPagines(),
						llibres.get(pos).getAnyEdicio());
			}
		}
		else {
			System.out.println("No hi ha llibres per mostrar en la secci� " + nom + ".");
		}
	}



}
