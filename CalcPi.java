// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
			int N = Integer.parseInt(args[0]);
			double pi = 1.0;
			int denominator = 3;
			for (int i = 1; i < N; i ++) {
				if (i % 2 == 0) {
					pi += (1.0 / denominator);
				}
				else {
					pi -= (1.0 / denominator);
				}
				denominator += 2;
			}
			pi *= 4;
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + pi);
	}
}