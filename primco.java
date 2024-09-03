import java.util.*;
class A
{
int lower, upper;
A(int lower, upper)
{
this.lower=lower;
this.upper=upper;}
void cal()
{
int n,i,lower,upper,j,c=0;
System.out.println("enter lower and upper:"+lower+upper);
for(i=lower;i<=upper;i++)
{
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
break;
}
}
if(j>i/2 && i!1)
{
System.out.println("%d\n",i);
c++;
}
}
System.out.println("%d\n",c);
}
class test
{
public static void main(String args[])
Scanner sc=new Scanner(System.in)
int lower=sc.nextInt();
int upper=sc.nextInt();
A x=new A(lower,upper);
x.cal();
}}
