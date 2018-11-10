
public class SumadorApp {

	public static void main(String[] args) throws InterruptedException {
		Comptador c; 
		IncrementaComptador ic1,ic2;
		Thread t1,t2;
		
		c = new Comptador();
		
		ic1 = new IncrementaComptador(c);
		ic2 = new IncrementaComptador(c);
		
		t1 = new Thread(ic1);
		t2 = new Thread(ic2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.getValor());
		
		
		
	}

}
