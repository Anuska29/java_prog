class A {
    void arm(int a) {
        int r, res = 0, n = 0;
        int num = a;
        while (num != 0) {
            num /= 10;
            ++n;
        }
        num = a;
        while (num != 0) {
            r = num % 10;
            int temp = 1;
            for (int i = 0; i < n; i++) {
                temp *= r;
            }
            res += temp;
            num /= 10;
        }
        if (res == a) {
            System.out.println(a + " is an Armstrong number");
        } else {
            System.out.println(a + " is not an Armstrong number");
        }
    }

    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one command-line argument.");
            return;
        }
        A x = new A();
        x.arm(Integer.parseInt(args[0]));
    }
}
