class interest
{ 
double f = 78d;

    int calculate() {
        double c = ((f-32)/9)*5d;
        return 0;
    }

}
class simple
{
    public static void main(String[] args) {
        {
            interest i= new interest();
            System.out.println("The temperature in Ferenhite is :"+i.calculate());
    }
    }
}
