class sg
{
int maths,eng,chem,java,dsa;
sg(int m, int e, int c, int j, int d)
{
maths=m;
eng=e;
chem=c;
java=j;
dsa=d;
}
void display()
{
System.out.println("maths : "+maths);
System.out.println("english : "+eng);
System.out.println("chemistry : "+chem);
System.out.println("java : "+java);
System.out.println(" dsa: "+dsa);
}
}
class nss1 extends sg{
int nss;
int nss1(int m, int e, int c, int j, int d, int n)
{
super(m,e,c,j,d,n);
nss=n;
}
void display()
{
super.display();
System.out.println(" nss: "+nss);
}
}
class marks
{
public static void main(String arg[])
{nss1 r=new nss1(60,70,80,90,95,99);
r.display();
}
}