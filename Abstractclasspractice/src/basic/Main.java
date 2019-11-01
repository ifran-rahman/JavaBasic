package basic;

abstract class Base{
    int x=3;
    public Base()
    {
        x+=2;
        System.out.println("From base class"+calculate());
    }
    abstract int calculate();
    abstract int calculate(int i);
}
class supera extends Base{
    int n=1;
    public supera()
    {
        System.out.println("From supera class"+calculate());
    }

    @Override
    int calculate() {
        return n;
    }

    @Override
    int calculate(int j) {
        return calculate()+j;
    }

}
public class Main extends supera{
    Main()
    {
        n+=3;
    }
    int calculate()
    {
        return n+6;
    }

    public static void main(String[] args) {
	    Main m=new Main();
        System.out.println("sffsd");
        System.out.println(m.calculate());
    }
}
