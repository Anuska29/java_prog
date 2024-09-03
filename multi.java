class dada
{
int money;
String name,loc;
dada(int m)
{
money=m;
}
void getdata1(String n, String l)
{
name=n;
loc=l;
}
void display1()
{
System.out.println("grandparent name= "+name);
System.out.println("grandparent location= "+loc);
System.out.println("grandparent money= "+money);
}
}
class papa extends dada{
double property;
String name1,loc1;
papa(int m)
{
super(m);
}
void getdata2(String n1, String l1)
{
name1= n1;
loc1=l1;
}
double calculate1()
{
property = 0.4*money;
System.out.println("parent amount= "+property);
return property;
}
void display2()
{
System.out.println("parent name= "+name1);
System.out.println("parent location= "+loc1);
}
}
class son extends papa{
String name2, loc2;
son(int m)
{
super(m);
}
void getdata3( String n2, String l2)
{
name2=n2;
loc2=l2;
}
double calculate2()
{
double property1=0.40*property;
System.out.println("son amount= "+property1);
return property1;
}
void display3()
{
System.out.println("son name= "+name2);
System.out.println("son location= "+loc2);
}
}
class multi
{
public static void main(String arg[])
{
son s= new son(500000);
s.getdata1("ram ","bihar ");
s.display1();
s.getdata2("sham "," delhi");
s.display2();
s.getdata3("jadu ","kolkata ");
s.display3();
s.calculate1();
s.calculate2();
}
}