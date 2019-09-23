package fizzbuzz;

public class fizzbuzz {
	public static void main(String[] args) {
		int fizz = 3;
		int buzz = 4;
		int obergrenze = 200;

		for (int i = 1; i <= obergrenze; i++) {
			System.out.print(i + ": ");
			boolean a = true;
			if ((i % fizz) == 0) {
				System.out.print("fizz");
				a = false;
			}
			if ((i % buzz) == 0) {
				System.out.print("buzz");
				a = false;
			}
			if (a) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
