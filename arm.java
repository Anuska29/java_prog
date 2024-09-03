import java.util.*;

class A {
    int n;

    void initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
    }

    void check() {
        int originalNumber = n;
        int remainder, result = 0, digits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = n;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        A x = new A();
        x.initial();
        x.check();
    }
}
