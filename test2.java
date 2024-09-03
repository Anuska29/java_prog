import java.util.*;

class A {
    int lower, upper;

    A(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    void cal() {
        int i, j, c = 0;

        System.out.println("Prime numbers between " + lower + " and " + upper + ":");

        for (i = lower; i <= upper; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i / 2 && i != 1) {
                System.out.println(i);
                c++;
            }
        }

        System.out.println("Total prime numbers: " + c);
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();
        A x = new A(lower, upper);
        x.cal();
    }
}
