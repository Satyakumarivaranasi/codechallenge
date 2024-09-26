 package javafirstpack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Input {

	public static void main(String[] args) {
		// Using try-with-resources to auto-close InputStreamReader and BufferedReader
		try (InputStreamReader i = new InputStreamReader(System.in);
			 BufferedReader b = new BufferedReader(i)) {
			 
			// Reading input from user
			System.out.println("Enter your name: ");
			String s = b.readLine();
			
			// Displaying the output
			System.out.println("Hello " + s + ", how are you?");
			
		} catch (IOException e) {
			// Handling IOException
			e.printStackTrace();
		}
	}
}
