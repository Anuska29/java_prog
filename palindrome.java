import java.util.*;
class A{
boolean pal(String str)
{
int i,j;
j=str.length()-1;
for(i=0;i<=j;i++;j--)
{
if(str.charAt(i)!=str.charAt(j))
{
break;
}}
if(i<=j)
{
return true;
}
else
{
return false;
}}}
class demo
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter any string:");
str=sc.nextLine();
A a=new A();
if(a.pali(str))
{
System.out.println("Palindrome");
}
else
{
System.out.println("not Palindrome");
}
}}
