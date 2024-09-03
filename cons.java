// A class to demonstrate constructor overloading
class Student {
  // Instance variables of the class
  int id;
  String name;
  double cgpa;

  // Default constructor
  Student() {
    id = 0;
    name = "";
    cgpa = 0.0;
  }

  // Parameterized constructor with two parameters
  Student(int i, String n) {
    id = i;
    name = n;
    cgpa = 0.0;
  }

  // Parameterized constructor with three parameters
  Student(int i, String n, double c) {
    id = i;
    name = n;
    cgpa = c;
  }

  // Copy constructor
  Student(Student s) {
    id = s.id;
    name = s.name;
    cgpa = s.cgpa;
  }

  // A method to display the student details
  void display() {
    System.out.println("Student id: " + id);
    System.out.println("Student name: " + name);
    System.out.println("Student cgpa: " + cgpa);
  }
}

// A class to test the constructor overloading
public class Test {
  public static void main(String[] args) {
    // Creating objects using different constructors
    Student s1 = new Student();
    Student s2 = new Student(101, "Alice");
    Student s3 = new Student(102, "Bob", 9.5);
    Student s4 = new Student(s3); // Copying s3

    // Displaying the student details
    System.out.println("Student 1 details:");
    s1.display();
    System.out.println("Student 2 details:");
    s2.display();
    System.out.println("Student 3 details:");
    s3.display();
    System.out.println("Student 4 details:");
    s4.display();
  }
}
