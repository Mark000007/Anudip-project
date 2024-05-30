import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Using ternary operator to find the maximum
        double maximum = (num1 > num2) ? num1 : num2;

        // Display the maximum
        System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + maximum);

        scanner.close();
    }
}