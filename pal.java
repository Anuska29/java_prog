import java.util.Scanner;

class A {
    int num;
    A(int num) {
        this.num = num;
    }
    void isPalindrome() {
        int ori = num;
        int rev = 0;

        while (ori > 0) {
            int digit = ori % 10;
            rev = rev * 10 + digit;
            ori /= 10;
        }

        if (num == rev) {
            System.out.println(num + " palindrome number.");
        } else {
            System.out.println(num + " not");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        A obj = new A(num);
        obj.isPalindrome();
        scanner.close();
    }
}
