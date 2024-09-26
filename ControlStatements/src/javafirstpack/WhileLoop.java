package javafirstpack;

public class WhileLoop {

    public static void main(String[] args) {
        int sum = 0;  // Variable to store the sum
        int i = 1;    // Start the counter from 1

        // while loop that runs while i is less than or equal to 10
        while (i <= 10) {
            sum += i; // Add the value of i to sum
            i++;      // Increment the counter
        }

        // Print the result
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
