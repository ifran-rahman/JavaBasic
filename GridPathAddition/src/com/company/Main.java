package com.company;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter desired grid dimension:");
        int p = s.nextInt();
        int q = s.nextInt();

        System.out.println("Please enter the desired input");
        int a[][]=new int[p][q] ;
        int b[][] = new int[p][q];
        int x;
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                x=s.nextInt();
                a[i][j]=x;
                b[i][j]=x;
            }

        }


        for (int i = 1; i < p; i++) {

            for (int j = 0; j < q; j++) {

                if (j > 0 && j < q - 1) {
                    a[i][j] += max(a[i - 1][j],
                            max(a[i - 1][j - 1],
                                    a[i - 1][j + 1]));

                }else if (j > 0) {
                    a[i][j] += max(a[i - 1][j],
                            a[i - 1][j - 1]);


                }else if (j < q - 1) {
                    a[i][j] += max(a[i - 1][j],
                            a[i - 1][j + 1]);

                }

            }

        }

        for (int i = 1; i < p; i++) {

            for (int j = 0; j < q; j++) {

                if (j > 0 && j < q - 1) {

                    b[i][j] += min(b[i - 1][j],
                            min(b[i - 1][j - 1],
                                    b[i - 1][j + 1]));
                }else if (j > 0) {

                    b[i][j] += min(b[i - 1][j],
                            b[i - 1][j - 1]);


                }else if (j < q - 1) {

                    b[i][j] += min(b[i - 1][j],
                            b[i - 1][j + 1]);
                }

            }

        }

        int max = 0;

        for (int k = 0; k < q; k++) {
            if (a[p - 1][k] > max) {
                max = a[p - 1][k];
            }

        }
        System.out.println("Highest:"+max);

        int min = 500;

        for (int k = 0; k < q; k++) {

            if (b[p - 1][k] < min) {
                min = b[p - 1][k];
            }

        }
        System.out.println("Lowest:"+min);

    }


}