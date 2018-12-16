/**
 * @author Toni Prieto Vera
 * @author Ivan Fuentes Ginel
 * @version 1.0
 */
public class Televisio implements Comparable<Televisio> {
	public int numPulgadas;//Integer
	public String marca;
	/**
	 * Constructor de la classe element
	 */
	public Televisio(int numPulgadas, String marca) {
		setNumPulgadas(numPulgadas);
		setMarca(marca);
	}
	/* ------------------Getters Setters--------------------- */

	/**
	 * @return the numPulgadas
	 */
	public Integer getNumPulgadas() {
		return numPulgadas;
	}

	/**
	 * @param numPulgadas the numPulgadas to set
	 */
	public void setNumPulgadas(Integer numPulgadas) {
		this.numPulgadas = numPulgadas;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/* ----------------------Methods-------------------------- */
	/**
	 * @param el És un parametre de tipus Object
	 * @return retorna un boleà "resultat
	 */
	@Override
	
	public boolean equals(Object el) {
		boolean resultat = false;
		
		if (el instanceof Televisio) {
			
			resultat = (compareTo((Televisio)el)==0);
		}
		
		return resultat;
	}

	/**
	 * @param o És un paràmetre de tipus element
	 * @return resultat Retorna un valor de tipus int
	 */
	@Override
	public int compareTo(Televisio o) {
		int resultat = 0;
		if (numPulgadas > o.getNumPulgadas()) {
			resultat = 1;
		}
		else if (numPulgadas < o.getNumPulgadas()) {
			resultat = -1;
		}
		return resultat;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|Televisio pulgadas: " + getNumPulgadas() + " MARCA: " + getMarca();
	}
}
