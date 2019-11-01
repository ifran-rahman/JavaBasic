public class Main {

    public static void main(String[] args) {
        Stack mystack1 = new Stack();

        for(int i=0; i<10; i++)
        {
            mystack1.push(i);
        }
        mystack1.pop();
        mystack1.pop();
        mystack1.pop();

        mystack1.printo();
        System.out.println(mystack1);
    }
}
