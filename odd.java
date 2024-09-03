import java.util.Scanner;

class A{

	int num;
     void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
    }

     void check() {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        a.input();
        a.check();
    }
}
