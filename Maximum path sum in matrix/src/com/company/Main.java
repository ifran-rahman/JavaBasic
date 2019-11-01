package com.company;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {

        int mat[][] = { {31, 100, 65, 12, 18 },
                {10, 13, 47, 157, 6},
                {100, 113, 174, 11, 33},
                {88, 124, 41, 20, 140},
                {99, 32, 111, 41, 20 }
        };
        int minimum[][]=new int[5][5];

       int N=5,M=5;

        int res = 0;
        int resm;

        for (int i = 1; i < N; i++) {

            for (int j = 0; j < M; j++) {

                if (j > 0 && j < M - 1) {
                    mat[i][j] += max(mat[i - 1][j],
                            max(mat[i - 1][j - 1],
                                    mat[i - 1][j + 1]));
                    minimum[i][j] += min(mat[i - 1][j],
                            min(mat[i - 1][j - 1],
                                    mat[i - 1][j + 1]));

                } else if (j > 0) {
                    mat[i][j] += min(mat[i - 1][j],
                            mat[i - 1][j - 1]);
                    minimum[i][j] += min(mat[i - 1][j],
                            mat[i - 1][j - 1]);

                }else if (j < M - 1) {
                    mat[i][j] += max(mat[i - 1][j],
                            mat[i - 1][j + 1]);

                    mat[i][j] += max(mat[i - 1][j],
                            mat[i - 1][j + 1]);
                }

                res = max(mat[i][j], res);
                resm=0;
            }
        }
        System.out.println(res);


    }
}