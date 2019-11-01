package Assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x=sc.nextInt();

        for(int n=1;n<x;n++)
        {
            if (n == 1) {
                System.out.println(n + " is not a prime number");
            }else
            {
                int count=0;
                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0) {
                        System.out.println(n + " is a not a prime number");
                        break;
                    }
                    count++;
                }
                if(count==n-2)
                {
                    System.out.println(n+" is a prime number");
                }
            }

        }
    }
}
