import java.util.Scanner;

public class PerfectNumberChecker {

    // Method to check if a number is a perfect number
    static boolean isPerfect(int num) {
        int sum = 0;

        // Find divisors and sum them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // If sum of divisors equals the number, it is a perfect number
        return sum == num;
    }

    // Main driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is perfect and print the result
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
