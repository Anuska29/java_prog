class cricket{
	void play(){
		System.out.println("Name : Dhoni");
	}
	int play(int x){
		System.out.println("Age : "+x);
		return x;
	}
	void play(double x){
		System.out.println("Team rank: "+x);
	}
	void play(float x){
		System.out.println("Jersey no : "+x);
	}
	void play(String x){
		System.out.println("Wife name: "+x);
	}
}
class overload{
	public static void main (String arg[]){
		cricket c=new cricket();
		c.play();
		c.play(34);
		c.play(1.0);
		c.play(7.0f);
		c.play("Shakshi");
	}}