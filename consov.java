class box{
	int height,weight,depth,side;
	box(int x,int y,int z){
	height=x;
	weight=y;
	depth=z;
	}
	box(int a){
	side=a;
	height=weight=depth=side;
	}
	int volume(){
	return height*weight*depth;
	}
}
	class consov{
	public static void main(String arfs[]){
	box b1=new box(10,20,30);
	box b2=new box(10);
	System.out.println("Volume of rectangular box: "+b1.volume());
	System.out.println("Volume of cube box: "+b2.volume());
	}
}
	