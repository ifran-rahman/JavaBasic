package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lastdigit,count=0,n;
        int number = 932;
        int x=number;
        while(number!=0){
            number = number / 10;
            count++;
        }

        int ar[]=new int[count];
        for(int i=0;i<count;i++)
        {
            lastdigit = x % 10;
            x = x / 10;
            ar[i]=lastdigit;

        }

        for(int i=count-1;i>=0;i--)
        {
            n=ar[i];
            switch (n) {

                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("fiv e");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
                default:
                    System.out.println("no number");
                    break;

            }
        }


    }
}

