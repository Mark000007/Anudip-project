import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number and bit position from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the bit position to check (0-based indexing): ");
        int n = scanner.nextInt();

        // Shifting 1 to the left by n positions to create a mask
        int mask = 1 << n;

        // Using bitwise AND to check if the nth bit is set or not
        if ((num & mask) != 0) {
            System.out.printf("The %dth bit of %d is set (1).\n", n, num);
        } else {
            System.out.printf("The %dth bit of %d is not set (0).\n", n, num);
        }

        scanner.close();
    }
}