// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int steps = 1;
		boolean firstIteration = true;
		if (mode.equals("v")) {
			for (int i = 1; i <= N; i++) {
				int j = i;
				System.out.print(i + " ");
				while (j != 1 || firstIteration == true) {
					if (j % 2 ==0) {
						j /= 2;
						System.out.print(j + " ");
					}
					else {
						j = (j * 3) + 1;
						System.out.print(j + " ");
					}
					steps += 1;
					firstIteration = false;
				}
				System.out.println("(" + steps + ")");
				steps = 1;
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
		else {
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		}
	}
}
