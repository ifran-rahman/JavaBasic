public class Main {

    public static void main(String args[])
    {
        in a1=new in();
        a1.Methodtwo();
    }
}
interface interfaceone{
    int a=5;
    abstract void MethodOne();
}
interface interfacetwo{
    int b=7  ;
    double c=1.5;
    abstract void Methodtwo();
}
class in implements interfaceone,interfacetwo{

    @Override
    public void MethodOne() {
        System.out.println(a);
    }

    @Override
    public void Methodtwo() {
        System.out.println(b);
    }
}