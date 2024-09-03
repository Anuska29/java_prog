import java.util.*;
class A
{
int a;
 A(int a)
 {
 this.a=a;
 }
 void cal()
 {
 System.out.println("square: "+a*a);
 System.out.println("cube: "+a*a*a);
 }
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
 int num=sc.nextInt();
 A x= new A(num);
 x.cal();
 }
}
