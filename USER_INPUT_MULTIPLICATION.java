import java.util.Scanner;

public class USER_INPUT_MULTIPLICATION {

         public static void main(String []args) {
		 
		 Scanner A = new Scanner(System.in);
		 
		 System.out.print(" Enter the first number : ");
		 int a = A.nextInt();
		 
		 System.out.print(" Enter the second number : ");
		 int b = A.nextInt();
		 
		 int multiplication = a*b;
		 System.out.print(" The multiplication of these two numbers is :");
		 System.out.print(multiplication);
		 }
   }