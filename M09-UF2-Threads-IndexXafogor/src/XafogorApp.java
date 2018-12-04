
public class XafogorApp{


	public static void main(String[] args) throws InterruptedException {
		ThreadCalculXafogor[] threadICX = new ThreadCalculXafogor[DadesCalculXafogor.NUM_ESTACIONS];
		Thread[] thx = new Thread[DadesCalculXafogor.NUM_ESTACIONS];
		ThreadCalculSuperiors40[] threadEstacions = new ThreadCalculSuperiors40[DadesCalculXafogor.NUM_ESTACIONS];
		Thread[] thS40 = new Thread[DadesCalculXafogor.NUM_ESTACIONS];
		DadesCalculXafogor dcx = new DadesCalculXafogor();

		//Thread calculIndex taula 2 dimensions
		for (int i = 0; i < DadesCalculXafogor.NUM_ESTACIONS; i++) {
			threadICX[i] = new ThreadCalculXafogor(dcx, i);
			thx[i] = new Thread(threadICX[i]);
			thx[i].start();
		}
		//Thread calcul>40 taula unidimensional
		for (int i = 0; i < DadesCalculXafogor.NUM_ESTACIONS; i++) {
			threadEstacions[i] = new ThreadCalculSuperiors40(dcx, i);
			thS40[i] = new Thread(threadEstacions[i]);
			thS40[i].start();
			thS40[i].join();

		}



		for (int i = 0; i < DadesCalculXafogor.NUM_ESTACIONS; i++) {
			System.out.println(dcx.quantsPerEstacio[i]);
			System.out.println("nº estacions > 40 = " + dcx.quantsPerMinut[i]);
			//for (int j = 0; j < dcx.humitats.length; j++) {
			//System.out.println(dcx.indexsXafogor[i][j]);

			//}
		}
	}

}
