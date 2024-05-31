import java.util.Scanner;

public class LeapYearChecker {
    private int year;

    public LeapYearChecker(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int inputYear = scanner.nextInt();
        scanner.close();

        LeapYearChecker yearChecker = new LeapYearChecker(inputYear);

        if (yearChecker.isLeapYear()) {
            System.out.println(inputYear + " is a leap year.");
        } else {
            System.out.println(inputYear + " is not a leap year.");
        }
    }
}