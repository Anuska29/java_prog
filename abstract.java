abstract class figure
{
double dim1, dim2;
figure(double a, double b)
{
dim1=a;
dim2=b;
}
abstract double area();
}
class rectangle extends figure{
rectangle(double a, double b)
{
super(a,b);
}
double area()
{
return dim1*dim2;
}
}
class circle extends figure{
circle (double a,double b){
super(a,b);
}
double area()
{
return(3.14*dim1*dim1);
}
}
class abstractmethod
{
public static void main(String arg[])
{
figure f;
rectangle r= new rectangle(5,8);
circle c= new circle(8,0);
f=r;
System.out.println("area of rectangle: " +f.area());
f=c;
System.out.println("area of circle: " +f.area());
}
}