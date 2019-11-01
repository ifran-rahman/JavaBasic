package Assignment;

import java.util.Scanner;

import java.lang.*;


public class Main{

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nuber to see if Armstrong number or not");
        int n= sc.nextInt(),lastdigit=0,sum=0;

        int x=n;
        while (n>0)
        {
            lastdigit=n%10;
            n/=10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
        }
        if(x==sum)
        {
            System.out.println(x+" is a Armstrong number");
        }else
        {
            System.out.println(x+" is not a Armstrong number");
        }




    }
}