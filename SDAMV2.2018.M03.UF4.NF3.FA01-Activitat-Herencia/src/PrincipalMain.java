import java.util.Scanner;

public class PrincipalMain {

	public static void main(String[] args) {
		MercaderiesPerilloses z;
		Turisme t;
		z = new MercaderiesPerilloses("Ford", "asdasd", "asdasd", 1, 12, 54, 2, 2, "tipusMercaderia", 2);
		//System.out.println(z.suputa());
		
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Marca: ");
		t.setMarca(s.nextLine());
		System.out.print("Model: ");
		t.setModel(s.nextLine());
		System.out.print("Matrícula: ");
		t.setModel(s.nextLine());
		System.out.print("int nombreOcupants: ");
		t.setNombreOcupants(s.nextInt());
		System.out.print("int slots: ");
		t.setSlots(s.nextInt());
		System.out.print("float pesTotal: ");
		t.setPesTotal(s.nextInt());
		System.out.print("boolean rem: ");
		t.setRemCar(s.nextBoolean());
		
		//t = new Turisme("FORD", "Eagle", "0369B", 1, 2,  3, true);
		t = new Turisme(t.getMarca(), t.getModel(), t.getMatricula(), t.getNombreOcupants(), t.getSlots(),  t.getPesTotal(), t.isRemCar());
		System.out.println(t.calcularPreuBitllet());
		s.close();
	}

}
