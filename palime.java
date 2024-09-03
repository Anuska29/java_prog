import java.util.Scanner;

class A {
    int l, u;

    A(int l, int u) {
        this.l = l;
        this.u = u;
    }

    void demo() {
        int count = 0;
        for (int i = l; i <= u; i++) {
            int ori = i;
            int rev = 0;

            int temp = ori;
            while (temp != 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            if (ori == rev) {
                System.out.println(ori);
                count++;
            }
        }

        System.out.println(" " + count);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();

        A obj = new A(l, u);
        obj.demo();
    }
}
