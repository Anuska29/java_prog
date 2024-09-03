import java.util.Scanner;

class A {
    int st, en;

    A(int st, int en) {
        this.st = st;
        this.en = en;
    }

    void Pali() {
        System.out.println("Palindrome numbers within " + st + " to " + en + ":");
        for (int num = st; num <= en; num++) {
            check(num);
        }
        System.out.println();
    }

    void check(int number) {
        int ori = number;
        int rev = 0;

        while (number > 0) {
            int digit = number % 10;
            rev= rev * 10 + digit;
            number /= 10;
        }

        if (ori == rev) {
            System.out.print(ori+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int st = sc.nextInt();
        System.out.print("Enter the end range: ");
        int en = sc.nextInt();
        A objA = new A(st, en);
        objA.Pali();
    }
}
