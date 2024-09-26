package javafirstpack;

public class JumpStatements {

	public static void main(String[] args) {
		int n = 90;

		// Using if condition with break statement
		if (n == 10) {
			System.out.println("n is 10");
		} else {
			System.out.println("n is not 10");
		}

		int i = 0;
		while (i <= 10) {
			// If i is 5, skip the current iteration
			if (i == 5) {
				i++;
				continue; // Jump to the next iteration when i is 5
			}

			// Print i
			System.out.println(i);

			// If i reaches 8, break the loop
			if (i == 8) {
				break; // Exit the loop when i is 8
			}

			i++;
		}
	}
}
