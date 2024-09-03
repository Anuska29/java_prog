class A {
    void display(int num) {
        System.out.println("Instance method with int parameter: " + num);
    }
    static void show(int num) {
        System.out.println("Static method with int parameter: " + num);
    }
}

class Main {
    public static void main(String[] args) {
        A o = new A();
        o.display(42);
        A.show(123);
    }
}
