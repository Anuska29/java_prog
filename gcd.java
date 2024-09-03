import java.util.Scanner;

class A {
    static int num1;
    static int num2;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();
    }

   int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

class Main {
    public static void main(String[] args) {
         A obj = new A();
        int gcd = obj.GCD(A.num1, A.num2);
        System.out.println(" result " + A.num1 + " and " + A.num2 + " is: " + gcd);
    }
}
