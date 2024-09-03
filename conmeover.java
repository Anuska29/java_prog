class Overloading{
   Overloading() {
        System.out.println("Default Constructor");
    }
Overloading(int x) {
        System.out.println("Parameterized Constructor with int: " + x);
    }

    void display() {
        System.out.println("Method without parameters");
    }
    void display(int x) {
        System.out.println("Method with int parameter: " + x);
    }

public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(10);
        o1.display();
        o2.display(20);

    }
}
