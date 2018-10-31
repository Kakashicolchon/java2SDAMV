
public class BibliotecaApp {

	public static void main(String[] args) {
		
		//Creem el llibre
		Llibre llibreExemple = new Llibre("TitolExemple", "978-3-16-148410-0", "AutorExemple", "EditorialExemple", 178, 2017);
		Llibre llibreExemple2 = new Llibre("TitolExemple2", "978-3-16-148410-1", "AutorExemple", "EditorialExemple", 178, 2017);
		Llibre llibreExemple2Duplicat = new Llibre("TitolExemple2", "978-3-16-148410-1", "AutorExemple", "EditorialExemple", 178, 2017);
		//Creem la secció
		Seccio seccioExemple = new Seccio("NomExemple", "23113215456ASD");

		//Posem el llibre a la secció
		seccioExemple.addLlibre(llibreExemple);
		seccioExemple.addLlibre(llibreExemple2);
		seccioExemple.addLlibre(llibreExemple2Duplicat);
		//Aqui hem generat un llibre amb el mateix ISBN.


		//Printejem els llibres de la seccio en concret "seccioExemple".
		seccioExemple.printLlibres();
		System.out.println("");

		//Provem el remove (Amb un llibre que no existeix)
		seccioExemple.removeLlibre("978-3-16-148410-2");
		//Aqui hem intentat treure un llibre amb un ISBN que no existeix.
		
		seccioExemple.removeLlibre("978-3-16-148410-0");
		//Treiem un llibre per comprovar que el mètode segueix funcionant.
		seccioExemple.printLlibres();
		
		//Tornem a imprimir els llibres per veure el resultat

	}

}
