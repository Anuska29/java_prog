class gc{
int maths,physics,dsa,numerical,hsmc;
gc(int m,int p,int d,int n,int h){
maths=m;
physics=p;
dsa=d;
numerical=n;
hsmc=h;
}
void display()
{
System.out.println("marks in maths : "+maths);
System.out.println("marks in physics : "+physics);
System.out.println("marks in dsa : "+dsa);
System.out.println("marks in numerical: "+numerical);
System.out.println("marks in hsmc : "+hsmc);
}
}
class nss1 extends gc{
int nss;
nss1(int m,int p,int d,int n,int h,int ns){
super(m,p,d,n,h);
nss=ns;
}
void display(){
super.display();
System.out.print("nss marks is : "+nss);
}
}
class marks{
public static void main (String args[])
{
nss1 r=new nss1(60,70,80,90,50,68);
r.display();
}
}