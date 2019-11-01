package basic;

import com.sun.jdi.ThreadReference;

class TestSleepMethod1 extends Thread{

   public void run()
   {
       for(int i=1;i<5;i++)
       {
           try {
               Thread.sleep(500);
           }catch (InterruptedException e)
           {
               System.out.println(e);
           }
           System.out.println(i);
       }
   }

}

public class Main {

    public static void main(String[] args) {
	TestSleepMethod1 t=new TestSleepMethod1();
	t.start();
    }
}
