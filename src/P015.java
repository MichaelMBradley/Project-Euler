//Lattice paths
public class P015 {
	public static void main(String[] args) {
		double[][] pasc = new double[41][41];

		for(int j = 0; j < 41; j++) { //Initializes 'triangle'
			pasc[j][0] = 1;
			for(int k = 1; k < 41; k++) {
				pasc[j][k] = 0;
			}
		}

		for(int j = 1; j < 41; j++) { //Fills out Pascal's triangle
			for(int k = 1; k <= j; k++) {
				pasc[j][k] = pasc[j-1][k-1] + pasc[j-1][k];
			}
		}
		System.out.print(pasc[40][20]); //Finds value equivalent to then end of a 20x20 grid
	}
}
//137846528820