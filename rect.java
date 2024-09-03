import java.util.Scanner;

class A {
    double length, width;

    A() {}
    A(double length, double width)
    {
        this.length = length; this.width = width;
        }
    A(double length)
     { this.length = length;
      }
    A(int width)
    {
        this.width = width; }
        A(A copy) {
        this.length = copy.length;
        this.width = copy.width;
    }

    double cal()
    {
        return length * width; }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("length:");
        double length = sc.nextDouble();

        System.out.println("width:");
        double width = sc.nextDouble();
        A a1 = new A();
        A a2 = new A(length, width);
        A a3 = new A(a2);

        System.out.println("default constructor: " + a1.cal());
        System.out.println("parameterized: " + a2.cal());
        System.out.println("copy: " + a3.cal());

    }
}
