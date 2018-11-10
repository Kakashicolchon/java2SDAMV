
public class Threads {

	public static void main(String[] args) {
		Thread th;
		MostraMissatge mm;
		
		mm = new MostraMissatge();
		th = new Thread(mm);
		th.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("S'està executant el main().");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
