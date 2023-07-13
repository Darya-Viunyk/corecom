import java.util.Scanner;

public class CountingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hi " + name + ", how high do you want to count?");

        // Get the count limit from the user
        System.out.print("Enter the count limit: ");
        int countLimit = scanner.nextInt();

        // Output numbers from 1 up to the count limit
        for (int i = 1; i <= countLimit; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}