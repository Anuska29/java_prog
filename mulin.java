interface print
{
    void pr();
}
interface print2
{
    void pr2();
}
class A implements print, print2
{
    public void pr()
    {
        System.out.println("annie");
    }
    public void pr2()
    {
        System.out.println("anuska");
    }
    public static void main(String args[])
    {
        A obj=new A();
        obj.pr();
        obj.pr2();
    }
}
