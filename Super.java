class SuperClass {
    SuperClass() {
        System.out.println("Constructor of SuperClass");
    }

    void display() {
        System.out.println("Method of SuperClass");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        super();
        System.out.println("Constructor of SubClass");
    }

    void display2() {
        System.out.println("Method of SubClass");
    }

    void display3() {
        display();
        super.display();
    }
}

public class Super {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display2();
        obj.display3();
    }
}
