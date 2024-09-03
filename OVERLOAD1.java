class cricketer
{
	void play(){
	System.out.println("Cricketer name VIRAT");
	}
	int play(int x){
	System.out.println("Age : "+x);
	return x;
	}
	void play(double y){
	System.out.println("Jersey no : "+y);
	}
	void play(float x){
	System.out.println("No of matches : "+x);
	}
	void play(String x){
	System.out.println("Daughter name : "+x);
	}
}
class overload{
	public static void main(String args[]){
		cricketer a=new cricketer();
		a.play();
		a.play(35);
		a.play(18);
		a.play(100);
		a.play("VIRUSKA");
		}
	}