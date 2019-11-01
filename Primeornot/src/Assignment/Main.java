package Assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println(n + " is a prime number");
        } else if (n == 1) {
            System.out.println(n + " is not a prime number");
        }
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
