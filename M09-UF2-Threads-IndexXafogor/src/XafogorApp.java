
public class XafogorApp {


	public static void main(String[] args) {
		ThreadCalculXafogor[] threadICX = null;
		DadesCalculXafogor dcx = new DadesCalculXafogor();
		
		
		for (int i = 0; i < DadesCalculXafogor.NUM_ESTACIONS; i++) {
			threadICX[i] = new ThreadCalculXafogor(dcx, i);
		}
	}

}
