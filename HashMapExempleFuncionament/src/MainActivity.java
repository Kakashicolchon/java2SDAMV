/**
 * Imports
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
/**
 * @author Toni Prieto Vera
 * @author Ivan Fuentes Ginel
 * @version 1.0
 */
public class MainActivity {

	public static void main(String[] args) {
		
		/* Declarem un HashMap HashMap */
		HashMap<Integer, Televisio> hmap = new HashMap<Integer, Televisio>();
		Televisio tv1 = new Televisio(42, "Matías Queroso");
		//TV2 no existeix per que li passem un null al hashmap.
		Televisio tv3 = new Televisio(50, "Paca Garte");
		Televisio tv4 = new Televisio(60, "Ana Bohueles --> Valor que es borrarà");
		Televisio tv5 = new Televisio(100, "Ester Riotipo");

		/* Afegim elements */
		hmap.put(null, null); //No es veurà
		hmap.put(null, tv1);
		hmap.put(2, null);
		hmap.put(7, tv3);
		hmap.put(49, tv4);
		hmap.put(3, tv5); // Aquest és el valor que borrarem
		hmap.put(3, tv5);//Index duplicat, substitueix a l'anterior. 

		/* --------------RECORREGUTS--------------------*/
		System.out.println("--------------------RECORREGUTS--------------------\n");
		/* Ensenyem el contingut recorrent amb un ITERATOR*/
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("ITERATOR - Key: "+ mentry.getKey() + " | Value = " + mentry.getValue() + "\n");
			//System.out.println(mentry.getValue());
		}
		
		System.out.println("");
		/* Ensenyem el contigut recorrent amb un FOREACH */
		for (Entry<Integer, Televisio> entry : hmap.entrySet()) {
			System.out.println("FOREACH - Key: " + entry.getKey() + ", Value = " + entry.getValue());
		}
		System.out.println();

		/* Ensenyem el contingut recorrent amb Lambda Expressions */
		hmap.forEach((k,v)->System.out.println("LAMBDA EXPRESSION - Key: " + k + " Value = " + v));


		System.out.println("\n--------------------COMPROBACIONS--------------------\n");
		/* -----Comprobacions d'agafar i eliminar un valor--------- */
		/* Agafem valors basats en la Key*/
		Televisio value = hmap.get(2);
		System.out.println("El valor de la key 2 és: " + value + "\n");

		/* Borrem valors basats en la Key*/
		hmap.remove(3);
		System.out.println("Key i Value després de borrar el valor de la key 3: \n");
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.print("Key: "+mentry2.getKey() + " | Value: ");
			System.out.println(mentry2.getValue());
		}

	}
}
