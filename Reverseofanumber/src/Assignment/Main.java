package Assignment;

import java.util.Scanner;


public class Main{

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to get reverse of it");
        int n=sc.nextInt(),lastdigit=0,reverse=0;

        while (n>0)
        {
            lastdigit=n%10;
            n/=10;
            reverse=(reverse*10)+lastdigit;
        }
        System.out.println(reverse);



    }
}