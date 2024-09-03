import java.util.*;
class A
{
int a, b;
A(int a, int b){
this.a=a;
this.b=b;
}

void cal()
{
System.out.println("before swap\n a:"+a+"b:"+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("after swap\n a: "+a+"b:"+b);
}
}
class test
{
public static void main(String args[]){
int a,b;
Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
A x=new A(a,b);
x.cal();
}
}

