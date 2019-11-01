
public class Main implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is walking...");
    }

    public static void main(String[] args) {

        Runnable r =new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1");
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2");
            }
        };

        Thread t=new Thread(r);
        Thread t2=new Thread(r2);

        t.start();
        t2.start();

    }
}
