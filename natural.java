import java.util.Scanner;

public class Main {
    // Recursive function to calculate the sum of first n natural numbers
    int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    // Recursive function to calculate the product of first n natural numbers
    int product(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * product(n - 1);
        }
    }

    public static void main(String[] args) {
        Main obj = new Main(); // Create an instance of the class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate sum and product using non-static methods
        int sum_result = obj.sum(n);
        int product_result = obj.product(n);

        // Print the results
        System.out.println("Sum of first " + n + " natural numbers: " + sum_result);
        System.out.println("Product of first " + n + " natural numbers: " + product_result);
    }
}
