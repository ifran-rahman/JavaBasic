package fd;

import java.util.Scanner;

public class Main {

    public static int sum=0;

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        System.out.println(series(number+1));
    }
    public static int series(int n)
    {
        if(n>=2){
            sum=sum+ ((n+(n*n))*(n+(n*n)))+ series(n-1);
            return sum;
        }else
        {
            return 0;
        }

    }
}
