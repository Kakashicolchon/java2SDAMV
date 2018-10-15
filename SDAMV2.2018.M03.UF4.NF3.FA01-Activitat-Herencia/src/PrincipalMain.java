

public class PrincipalMain {

	public static void main(String[] args) {
		
		/*
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
		t = new Turisme(t.getMarca(), t.getModel(), t.getMatricula(), t.getNombreOcupants(), t.getSlots(),  t.getPesTotal(), t.isRemCar());
		*/
		//Declarem les variables de cada tipus de vehícle
		Turisme turisme;
		Autobus autobus;
		Mercaderies mercaderies;
		MercaderiesPerilloses mercaderiesPerilloses;
		Motocicletes motocicletes;
		//Fem una instància per cada tipus de vehícle.
		turisme = new Turisme("Mitsubishi", "Lancer Evo X", "1523 JTJ", 1, 2,  3, true);
		autobus = new Autobus("Sagalés", "Model 1", "1523 JTJ", 50 , 3, 12, 0, 3);
		mercaderies = new Mercaderies("Nissan", "Ebro -L-35", "1523 JTJ", 2, 2, 1.5f, 1, 3, "Legos");
		mercaderiesPerilloses = new MercaderiesPerilloses("Ford", "asdasd", "asdasd", 1, 12, 54, 2, 2, "tipusMercaderia", 2);
		motocicletes = new Motocicletes ("Ducati", "Panigale V4S", "1523 JTJ", 1, 1, 0.175f);
		
		System.out.println(turisme.calcularPreuBitllet() + " €");
		System.out.println(autobus.calcularPreuBitllet() + " €");
		System.out.println(mercaderies.calcularPreuBitllet() + " €");
		System.out.println(mercaderiesPerilloses.calcularPreuBitllet() + " €");
		System.out.println(motocicletes.calcularPreuBitllet() + " €");
		
	}

}
