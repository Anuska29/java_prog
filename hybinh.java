class fourwheeler{
	String hi,wt;
	fourwheeler(String h, String w)
	{
		hi=h;
		wt=w;
		}
	}
	class pub extends fourwheeler
	{
		String ticket;
		pub( String h, String w,String t)
		{
			super(h,w);
			ticket=t;
			}
		}
	class pvt extends fourwheeler
	{
		String petrolprice;
		pvt(String h, String w, String pp)
		{
			super(h,w);
			petrolprice=pp;
			}
		}
	class bus extends pub
	{
		String duration;
		bus(String h,String w, String t,String d)
		{
			super(h,w,t);
			duration =d;
			}
		void display1(){
		System.out.println("Height of bus : "+hi);
		System.out.println("Weight of bus : "+wt);
		System.out.println("Ticket fare of bus : "+ticket);
		System.out.println("Duration of the journey : "+duration);
		}
		}
	class minibus extends pub{
	String source,destination;
	minibus(String h,String w,String t,String s,String ds)
	{
		super(h,w,t);
		source=s;
		destination=ds;
		}
		void display2(){
		System.out.println("height pf minibus: "+hi);
		System.out.println("Weight of minibus: "+wt);
		System.out.println("Ticket fare of minibus: "+ticket);
		System.out.println("Source of minibus : "+source);
		System.out.println("Destination of minibus: "+destination);
		}
		}
	class tata extends pvt{
	String color;
	tata(String h,String w,String pp,String co)
	{
		super(h,w,pp);
		color=co;
		}
		void display3(){
		System.out.println("Height : "+hi);
		System.out.println("weight : "+wt);
		System.out.println("petrolprice : "+petrolprice);
		System.out.println("color : "+color);
		}
	}
	class maruti extends pvt{
	String mileage;
	maruti(String h,String w,String pp,String m)
	{
		super(h,w,pp);
		mileage=m;
		}
	}
	class swift extends maruti{
	String manufacturingdate;
	swift(String h,String w,String pp,String m,String mfd)
	{
		super(h,w,m,pp);
		manufacturingdate=mfd;
		}
		void display4(){
		System.out.println("heoght : "+hi);
		System.out.println("weight: "+wt);
		System.out.println("petrolprice: "+petrolprice);
		System.out.println("mileage: "+mileage);
		System.out.println("manufacturingdate: "+manufacturingdate);
		}
	}
	class desire extends maruti{
	String gears;
	desire(String h,String w,String pp,String m,String g){
	super(h,w,pp,m);
	gears=g;
	}
	void display5(){System.out.println("heoght : "+hi);
		System.out.println("weight: "+wt);
		System.out.println("petrolprice: "+petrolprice);
		System.out.println("mileage: "+mileage);
		System.out.println("gears: "+gears);
		}
	}
class hybrinh{
	public static void main(String args[]){
	bus b=new bus("2m","2tn","15","35 min");
	minibus x=new minibus("2m","1.5tn","15","Belgharia","Howrah");
	tata y=new tata("5ft","1tn","110","Black");
	swift z=new swift("5ft","1tn","110","45km","12/2/23");
	desire p=new desire("5ft","1tn","110","50km","3/9/22");
	
	b.display1();
	x.display2();
	y.display3();
	z.display4();
	p.display5();
	}
	}
		