class box
{
	int height,weight,depth,side;
	box(int x,int y,int z)
	{
		height=x;
		weight=y;
		depth=z;
	}
	box(int a)
	{
		side=a;
	}
	int volume(){
		return height*weight*depth;
	}
	int volume1()
	{
		return side*side*side;
	}
}
class constructor
{
public static void main(String args[])
{
	box b=new box(10,20,30);
	box b1=new box(3);
	System.out.println("Volume of rectangular box : "+b.volume());
	System.out.println("Volume of cube : "+b1.volume1());
}
}